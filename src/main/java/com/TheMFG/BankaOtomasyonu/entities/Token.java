package com.TheMFG.BankaOtomasyonu.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tokens")
public class Token {
    @Id
    @GeneratedValue
    @Column(name = "token_id")
    private Integer id;

    @Column(unique = true)
    private String token;

    private LocalDateTime createdAt;
    private LocalDateTime expiredAt;
    private LocalDateTime validatedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;
}
