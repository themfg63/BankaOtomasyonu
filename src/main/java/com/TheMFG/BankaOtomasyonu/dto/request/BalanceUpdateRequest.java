package com.TheMFG.BankaOtomasyonu.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BalanceUpdateRequest {
    private String acocuntId;
    private double amount;
}
