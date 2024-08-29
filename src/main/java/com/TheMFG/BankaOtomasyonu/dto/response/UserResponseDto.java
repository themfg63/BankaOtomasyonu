package com.TheMFG.BankaOtomasyonu.dto.response;

import com.TheMFG.BankaOtomasyonu.entities.User;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@RequiredArgsConstructor
public class UserResponseDto {
    private String id;
    private LocalDateTime created;
    private LocalDateTime modified;
    private LocalDateTime lastLogin;
    private String token;
    private boolean isActive;

    public UserResponseDto(String id, LocalDateTime created, LocalDateTime modified, LocalDateTime lastLogin, String token, boolean isActive){
        this.id=id;
        this.created=created;
        this.modified=modified;
        this.lastLogin=lastLogin;
        this.token=token;
        this.isActive=false;
    }

    public UserResponseDto(User user){
        if(user != null){
            this.id=user.getId();
            this.created=user.getCreated();
            this.modified=user.getModified();
            this.lastLogin=user.getLastLogin();
            this.token=user.getToken();
            this.isActive=user.isActive();
        }
    }
}
