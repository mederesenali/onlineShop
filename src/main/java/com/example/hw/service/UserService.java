package com.example.hw.service;

import com.example.hw.exception.CustomerAlreadyRegisteredException;
import com.example.hw.exception.CustomerNotFoundException;
import com.example.hw.model.User;
import com.example.hw.model.UserRegisterForm;
import com.example.hw.repository.UserRepository;
import com.example.hw.repository.UserResponseDTO;
import lombok.AllArgsConstructor;
import lombok.var;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository repository;
 //   private final PasswordEncoder encoder;

    public UserResponseDTO register(UserRegisterForm form) {
        if (repository.existsByEmail(form.getEmail())) {
            throw new CustomerAlreadyRegisteredException();
        }

        var user = User.builder()
                .email(form.getEmail())
                .fullname(form.getName())
             //   .password(encoder.encode(form.getPassword()))
                .build();

        repository.save(user);

        return UserResponseDTO.from(user);
    }

    public UserResponseDTO getByEmail(String email) {
        var user = repository.findByEmail(email)
                .orElseThrow(CustomerNotFoundException::new);

        return UserResponseDTO.from(user);
    }

}
