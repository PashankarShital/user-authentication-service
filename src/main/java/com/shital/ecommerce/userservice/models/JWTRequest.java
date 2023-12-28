package com.shital.ecommerce.userservice.models;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class JWTRequest {

    private String email;
    private String password;
}
