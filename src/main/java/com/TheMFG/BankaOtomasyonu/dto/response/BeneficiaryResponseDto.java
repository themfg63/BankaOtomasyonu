package com.TheMFG.BankaOtomasyonu.dto.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
public class BeneficiaryResponseDto {
    private String id;
    private String beneficiaryUserId;
    private String beneficiaryId;
    private String beneficiaryEmail;
    private String accountId;
    private LocalDateTime addedAt;
    private String accountOwnerId;
}
