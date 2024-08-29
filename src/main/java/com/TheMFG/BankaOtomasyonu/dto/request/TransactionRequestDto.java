package com.TheMFG.BankaOtomasyonu.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TransactionRequestDto {
    private String fromAccountId;
    private String toAccountId;
    private double amount;
    private String transferType;
}
