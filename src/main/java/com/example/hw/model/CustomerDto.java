package com.example.hw.model;

import lombok.*;

@Data
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Builder(access = AccessLevel.PACKAGE)
public class CustomerDto {

    private int id;
    private String fullName;
    private String email;

    static CustomerDto from(Customer user) {
        return builder()
                .id(user.getId())
                .fullName(user.getFullName())
                .email(user.getEmail())
                .build();
    }
}
