package com.TheMFG.BankaOtomasyonu.repository;

import com.TheMFG.BankaOtomasyonu.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account,String> {
    Optional<Account> findByUserId(String userId);
}
