package com.example.hw.model;

import lombok.AllArgsConstructor;
import lombok.var;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerService {

    private final CustomerRepository repository;
    private final PasswordEncoder encoder;

    public CustomerDto register(Customer customer) {
        if (repository.existsByEmail(customer.getEmail())) {
            throw new CustomerAlreadyRegisteredException();
        }

        var user = Customer.builder()
                .email(customer.getEmail())
                .fullName(customer.getFullName())
                .password(encoder.encode(customer.getPassword()))
                .build();

        repository.save(user);

        return CustomerDto.from(user);

    }

    public CustomerDto getByEmail(String email) {
        var user = repository.findByEmail(email)
                .orElseThrow(CustomerNotFoundException::new);

        return CustomerDto.from(user);
    }

}
