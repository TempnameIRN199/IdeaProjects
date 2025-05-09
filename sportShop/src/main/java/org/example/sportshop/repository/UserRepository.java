package org.example.sportshop.repository;

import org.example.sportshop.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findById(Integer id);
    Optional<User> findByUsername(String username);
    Optional<User> findByEmail(String email);
    Optional<User> findByPhone(String phone);

    @Query("select u from User u")
    List<User> findAllQuery();

    @Query("select u from User u where u.username = ?1")
    Optional<User> findByUsernameQuery(String username);
}