package com.shital.ecommerce.userservice.models;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class JWTResponse {

    private String jwtToken;
    private String username;
}
