package com.TheMFG.BankaOtomasyonu.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Builder
public class UserDto {
    private String id;

    @NotBlank(message = "Ad Boş Bırakılamaz")
    private String name;

    @NotBlank(message = "Soyad Boş Bırakılamaz")
    private String lastName;

    @Pattern(regexp = "^[0-11]{11}$",message = "T.C. No 11 haneli olmalı")
    @NotBlank(message = "T.C. No Boş Bırakılamaz")
    private String tcNo;

    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$",message = "Geçersiz Email Adresi")
    @NotBlank(message = "Email Adresi Boş Bırakılamaz")
    private String email    ;

    @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-zA-Z])(?=\\S+$).{8,}$",message = "Şifreniz en az 1 sayı ve 1 harf içermeli. En az 8 karakterden oluşmalı")
    @NotBlank(message = "Şifre Boş Bırakılamaz")
    private String password;

    @NotBlank(message = "Hesap Tipi Boş Bırakılamaz")
    private String accountType;

    private Set<PhoneDto> phones;
}
