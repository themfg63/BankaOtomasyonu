package com.TheMFG.BankaOtomasyonu.repository;

import com.TheMFG.BankaOtomasyonu.entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction,String> {
    List<Transaction> findByStatus(String status);
    List<Transaction> findByFromAccountId(String fromAccountId);
}
