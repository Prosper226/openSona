package com.openclassrooms.api.dtos;


import lombok.Data;

@Data
public class AuthEmployeeDTO {
    private String mail;
    private String password;
}
