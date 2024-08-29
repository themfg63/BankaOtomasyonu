package com.TheMFG.BankaOtomasyonu.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BeneficiaryAddRequest {
    private String accountId;
    private String email;

    @NotBlank(message = "Id Boş bırakılamaz")
    private String accountOwnerId;
}
