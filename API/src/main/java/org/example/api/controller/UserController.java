package org.example.api.controller;

import org.example.api.model.User;
import org.example.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    // Отримання всіх користувачів
    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Створення нового користувача
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    // Пошук користувача за username, phone та email
    @GetMapping("/search")
    public Optional<User> findUser(@RequestParam String username,
                                   @RequestParam String phone,
                                   @RequestParam String email) {
        return userRepository.findByUsernameAndPhoneAndEmail(username, phone, email);
    }
}
