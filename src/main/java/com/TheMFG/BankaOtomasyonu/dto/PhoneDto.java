package com.TheMFG.BankaOtomasyonu.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PhoneDto {
    @NotBlank(message = "Telefon Numarası Boş Bırakılamaz")
    private String number;

    private String cityCode;

    private String countryCode;
}
