package com.zurum.authclient.dto;

import lombok.Data;

@Data
public class PasswordRequestDto {

    private String email;
    private String oldPassword;
    private String newPassword;
}
