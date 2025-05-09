package org.example.sportshop.controller;

import org.example.sportshop.entity.Order;
import org.example.sportshop.entity.Product;
import org.example.sportshop.entity.ShoppingCart;
import org.example.sportshop.service.OrderService;
import org.example.sportshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("cart")
public class CartController {

    @Autowired
    private ProductService productService;

    @Autowired
    private OrderService orderService;

    @ModelAttribute("cart")
    public ShoppingCart shoppingCart() {
        return new ShoppingCart();
    }

    @PostMapping("/cart/add")
    public String addToCart(@RequestParam("productId") Integer productId,
                            @RequestParam("quantity") int quantity,
                            @ModelAttribute("cart") ShoppingCart cart) {
        Product product = productService.getProductById(productId);
        if (product != null) {
            cart.addItem(product, quantity);
        }
        return "redirect:/cart";
    }

    @GetMapping("/cart")
    public String showCart(@ModelAttribute("cart") ShoppingCart cart, Model model) {
        model.addAttribute("cartItems", cart.getItems());
        model.addAttribute("total", cart.getTotal());
        return "cart/index";
    }

    @PostMapping("/cart/checkout")
    public String checkout(@ModelAttribute("cart") ShoppingCart cart,
                           @RequestParam("userId") Integer userId,
                           Model model) {
        if (cart.getItems().isEmpty()) {
            return "redirect:/cart";
        }
        Order order = orderService.createOrder(cart, userId);
        cart.clear();
        model.addAttribute("order", order);
        return "redirect:/products?categoryId=1";
    }

    @PostMapping("/cart/remove")
    public String removeFromCart(@RequestParam("productId") Integer productId,
                                 @ModelAttribute("cart") ShoppingCart cart) {
        cart.removeItem(productId);
        return "redirect:/cart";
    }

}
