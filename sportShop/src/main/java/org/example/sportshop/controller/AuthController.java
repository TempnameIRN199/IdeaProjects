package org.example.sportshop.controller;

import org.example.sportshop.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthController {
    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login")
    public String login() {
        return "login/index";
    }

    @GetMapping("/register")
    public String register() {
        return "/register/index";
    }

    @PostMapping("/register")
    public String registerUser(@RequestParam String username,
                               @RequestParam String password,
                               @RequestParam String email,
                               @RequestParam String fullName,
                               @RequestParam String city,
                               @RequestParam String country,
                               @RequestParam String phone,
                               Model model) {
        if (userService.findByUsername(username).isPresent()) {
            model.addAttribute("error", "Username already exists!");
            return "/register";
        }
        if (userService.findByEmail(email).isPresent()) {
            model.addAttribute("error", "Email already exists!");
            return "/register";
        }
        if (userService.findByPhone(phone).isPresent()) {
            model.addAttribute("error", "Phone already exists!");
            return "/register";
        }
        userService.registerUser(username, password, email, fullName, city, country, phone);
        return "redirect:/login";
    }
}
