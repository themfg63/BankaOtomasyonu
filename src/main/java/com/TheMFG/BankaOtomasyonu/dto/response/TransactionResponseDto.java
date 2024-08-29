package com.TheMFG.BankaOtomasyonu.dto.response;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TransactionResponseDto {
    private String transactionId;
    private String fromAccountId;
    private String toAccountId;
    private String status;
    private String transferType;
    private double amount;
    private LocalDateTime createdAt;
}
