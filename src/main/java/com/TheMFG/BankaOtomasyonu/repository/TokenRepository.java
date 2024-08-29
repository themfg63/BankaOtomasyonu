package com.TheMFG.BankaOtomasyonu.repository;

import com.TheMFG.BankaOtomasyonu.entities.Token;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenRepository extends JpaRepository<Token,Integer> {
    Token findByToken(String token);
}
