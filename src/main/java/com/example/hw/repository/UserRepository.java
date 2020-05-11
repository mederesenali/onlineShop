package com.example.hw.repository;

import com.example.hw.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User,Integer> {

    boolean existsByEmail(String email);

    Optional<User> findByEmail(String email);
}
