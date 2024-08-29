package com.TheMFG.BankaOtomasyonu.repository;

import com.TheMFG.BankaOtomasyonu.entities.AccountBeneficiary;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountBeneficiaryRepository extends JpaRepository<AccountBeneficiary,String> {
    List<AccountBeneficiary> findByAccountId(String accountId);
    List<AccountBeneficiary> findByAccountOwnerId(String accountOwnerId);
}
