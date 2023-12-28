package com.shital.ecommerce.userservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Set;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ApplicationUser extends BaseModel {

    private String userId;
    private String email;
    private String password;

}
