package com.TheMFG.BankaOtomasyonu.dto;

import lombok.*;

import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AccountDto {
    private String id;
    private String userId;
    private String accountType;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private double balance;
    private String beneficiaryId;
    private String beneficiaryEmail;
}
