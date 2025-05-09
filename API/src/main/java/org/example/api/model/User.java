package org.example.api.model;

import jakarta.persistence.*;
import lombok.*;
import org.example.api.model.enums.Role;

@Data
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    private String fullName;
    private String city;
    private String country;
    private String phone;
    private String email;
    private Role role;
    private String created_at;
}