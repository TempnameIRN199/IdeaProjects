package org.example.sportshop.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.example.sportshop.entity.Product;
import org.example.sportshop.repository.ProductRepository;
import org.example.sportshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public String home(Model model, HttpServletRequest request) {
        model.addAttribute("currentPath", request.getRequestURI());
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        Collection<? extends GrantedAuthority> authorities = auth.getAuthorities();
        boolean isAdmin = authorities.stream()
                .anyMatch(role -> role.getAuthority().equals("ROLE_ADMIN"));
        model.addAttribute("isAdmin", isAdmin);
        return "redirect:/products?categoryId=1";
    }

    @GetMapping("/products")
    public String products(
            @RequestParam(name = "brand", required = false) String brand,
            @RequestParam(name = "minPrice", required = false) BigDecimal minPrice,
            @RequestParam(name = "maxPrice", required = false) BigDecimal maxPrice,
            @RequestParam(name = "size", required = false) String size,
            @RequestParam(name = "categoryId", required = false) Integer categoryId,
            @RequestParam(name = "color", required = false) String color,
            Model model, HttpServletRequest request) {
        List<Product> products;
        List<String> brands;
        List<String> sizes;
        List<String> colors;
        if (categoryId != null) {
            brands = productService.getBrandsByCategory(categoryId);
            sizes = productService.getSizesByCategory(categoryId);
            colors = productService.getColorByCategory(categoryId);
        } else {
            brands = productService.getAllBrands();
            sizes = productService.getAllSizes();
            colors = productService.getAllDistinctColors(null);
        }
        if (brand != null && !brand.isEmpty()
                && minPrice != null && maxPrice != null
                && size != null && !size.isEmpty()
                && categoryId != null
                && color != null && !color.isEmpty()) {
            products = productService.searchProducts(null, brand, minPrice, maxPrice, categoryId, size, color);
        } else if (brand != null && !brand.isEmpty()
                && minPrice != null && maxPrice != null
                && size != null && !size.isEmpty()
                && categoryId != null) {
            products = productService.getProductByBrandAndPriceBetweenAndSizeAndCategory(brand, minPrice, maxPrice, size, categoryId);
        } else if (brand != null && !brand.isEmpty() && categoryId != null) {
            products = productService.getProductsByBrandAndCategory(brand, categoryId);
        } else if (minPrice != null && maxPrice != null && categoryId != null) {
            products = productService.getProductsByPriceRangeAndCategory(minPrice, maxPrice, categoryId);
        } else if (size != null && !size.isEmpty() && categoryId != null) {
            products = productService.getProductsBySizeAndCategory(size, categoryId);
        } else if (color != null && !color.isEmpty() && categoryId != null) {
            products = productService.searchProducts(null, null, null, null, categoryId, null, color);
        } else if (categoryId != null) {
            products = productService.getProductsByCategoryId(categoryId);
        } else if (brand != null && !brand.isEmpty()) {
            products = productService.getProductsByBrand(brand);
        } else if (minPrice != null && maxPrice != null) {
            products = productService.getProductsByPriceRange(minPrice, maxPrice);
        } else if (size != null && !size.isEmpty()) {
            products = productService.getProductsBySize(size);
        } else if (color != null && !color.isEmpty()) {
            products = productService.searchProducts(null, null, null, null, null, null, color);
        } else {
            products = productService.getAllProducts();
        }
        products.removeIf(product -> productService.getQuantityCount(product.getId()) == 0);
        model.addAttribute("selectedCategoryId", categoryId);
        String queryString = request.getQueryString();
        String currentUrl = request.getRequestURI() + (queryString != null ? "?" + queryString : "");
        model.addAttribute("currentPath", currentUrl);
        model.addAttribute("brands", brands);
        model.addAttribute("sizes", sizes);
        model.addAttribute("colors", colors);
        model.addAttribute("products", products);
        return "products/index";
    }
}
