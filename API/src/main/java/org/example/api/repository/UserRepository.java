package org.example.api.repository;

import org.example.api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsernameAndPhoneAndEmail(String username, String phone, String email);
}
