package com.TheMFG.BankaOtomasyonu.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class LoginDto {
    @Email(message = "Geçersiz Email Adresi")
    @NotBlank(message = "Email Boş Bırakılamaz")
    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$",message = "Geçersiz Email Adresi")
    private String email    ;

    @NotBlank(message = "Şifre Boş Bırakılamaz")
    @Pattern(regexp = "^(?=.[0-9])(?=.*[a-zA-Z])(?=\\S+$).{8,}$",message = "Şifreniz en az 1 sayı ve 1 harf içermeli. En az 8 karakterden oluşmalı")
    private String password;
}
