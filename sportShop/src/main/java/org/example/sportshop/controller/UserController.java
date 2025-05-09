package org.example.sportshop.controller;

import org.example.sportshop.entity.User;
import org.example.sportshop.service.OrderService;
import org.example.sportshop.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.security.Principal;

@Controller
public class UserController {

    private final UserService userService;
    private final OrderService orderService;

    public UserController(UserService userService, OrderService orderService) {
        this.userService = userService;
        this.orderService = orderService;
    }

    @GetMapping("/profile")
    public String showProfile(Model model, Principal principal) {
        String username = principal.getName();
        User user = userService.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("User not found"));
        model.addAttribute("user", user);
        model.addAttribute("orders", orderService.findOrdersByUser(user));
        return "profile/index";
    }

    @GetMapping("/profile/edit")
    public String editProfile(Model model, Principal principal) {
        String username = principal.getName();
        User user = userService.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("User not found"));
        model.addAttribute("userForm", user);
        return "profile/edit/index";
    }

    @PostMapping("/profile/edit")
    public String updateProfile(User userForm, Principal principal) {
        String username = principal.getName();
        User userFromDb = userService.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("User not found"));
        userFromDb.setFullName(userForm.getFullName());
        userFromDb.setCity(userForm.getCity());
        userFromDb.setCountry(userForm.getCountry());
        userFromDb.setPhone(userForm.getPhone());
        userFromDb.setEmail(userForm.getEmail());
        userService.updateUser(userFromDb);
        return "redirect:/profile";
    }
}
