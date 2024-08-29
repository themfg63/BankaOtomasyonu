package com.TheMFG.BankaOtomasyonu.dto;

import lombok.*;

import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserAccountDetailsDto {
    private UserDto user;
    private List<AccountDto> accounts;
}
