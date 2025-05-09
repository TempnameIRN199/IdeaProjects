package org.example.sportshop.controller;

import org.example.sportshop.entity.Category;
import org.example.sportshop.entity.Product;
import org.example.sportshop.entity.User;
import org.example.sportshop.repository.UserRepository;
import org.example.sportshop.service.CategoryService;
import org.example.sportshop.service.ProductService;
import org.example.sportshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@PreAuthorize("hasRole('ADMIN')")
@RequestMapping("/admin")
public class AdminController {

    private final UserService userService;
    private final ProductService productService;
    private final CategoryService categoryService;
    private final UserRepository userRepository;

    @Autowired
    public AdminController(UserService userService, ProductService productService, CategoryService categoryService, UserRepository userRepository) {
        this.userService = userService;
        this.productService = productService;
        this.categoryService = categoryService;
        this.userRepository = userRepository;
    }

    @GetMapping("")
    public String adminIndex() {
        return "admin/index";
    }

    @GetMapping("/products")
    public String getProducts(Model model) {
        List<Product> products = productService.getAllProducts();
        model.addAttribute("products", products);
        return "admin/product/index";
    }

    @GetMapping("/products/new")
    public String createProductForm(Model model) {
        model.addAttribute("product", new Product());
        model.addAttribute("categories", categoryService.findAllCategories());
        return "admin/product/create/index";
    }

    @PostMapping("/products")
    public String saveProduct(@ModelAttribute("product") Product product) {
        Category category = categoryService.getCategoryById(product.getCategory().getId());
        product.setCategory(category);

        productService.saveProduct(product);
        return "redirect:/admin/products";
    }


    @GetMapping("/products/edit/{id}")
    public String editProductForm(@PathVariable Integer id, Model model) {
        Product product = productService.getProductById(id);
        model.addAttribute("product", product);
        model.addAttribute("categories", categoryService.findAllCategories());
        return "admin/product/edit/index";
    }

    @PostMapping("/products/{id}")
    public String updateProduct(@PathVariable Integer id, @ModelAttribute("product") Product product) {
        Product existingProduct = productService.getProductById(id);

        existingProduct.setName(product.getName());
        existingProduct.setDescription(product.getDescription());
        existingProduct.setBrand(product.getBrand());
        existingProduct.setPrice(product.getPrice());
        existingProduct.setSize(product.getSize());
        existingProduct.setColor(product.getColor());
        existingProduct.setQuantity(product.getQuantity());
        existingProduct.setStock(product.getStock());
        existingProduct.setImageUrl(product.getImageUrl());

        Category category = categoryService.getCategoryById(product.getCategory().getId());
        existingProduct.setCategory(category);

        productService.saveProduct(existingProduct);
        return "redirect:/admin/products";
    }

    @GetMapping("/products/delete/{id}")
    public String deleteProduct(@PathVariable Integer id) {
        productService.deleteProduct(id);
        return "redirect:/admin/products";
    }

    @GetMapping("/categories")
    public String getCategories(Model model) {
        List<Category> categories = categoryService.findAllCategories();
        model.addAttribute("categories", categories);
        return "admin/category/index";
    }

    @GetMapping("/categories/new")
    public String createCategoryForm(Model model) {
        model.addAttribute("category", new Category());
        return "admin/category/create/index";
    }

    @PostMapping("/categories/save")
    public String saveCategory(@ModelAttribute("category") Category category) {
        if (category.getId() != null) {
            categoryService.update(category.getId(), category);
        } else {
            categoryService.save(category);
        }
        return "redirect:/admin/categories";
    }

    // В CategoryController
    @GetMapping("/categories/edit/{id}")
    public String showEditForm(@PathVariable("id") Integer id, Model model) {
        Category category = categoryService.getCategoryById(id);
        model.addAttribute("category", category);
        return "admin/category/edit/index";
    }


    @GetMapping("/categories/delete/{id}")
    public String deleteCategory(@PathVariable("id") Integer id) {
        categoryService.deleteById(id);
        return "redirect:/admin/categories";
    }

    @GetMapping("/users")
    public String showUsers(Model model) {
        List<User> users = userRepository.findAll();
        model.addAttribute("users", users);
        return "admin/user/index";
    }

    @PostMapping("/users/delete")
    public String deleteUser(@RequestParam("id") Integer id) {
        userService.deleteUserById(id);
        return "redirect:/admin/users";
    }
}

