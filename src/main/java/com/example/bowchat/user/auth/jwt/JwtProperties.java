package com.example.bowchat.user.auth.jwt;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Component
public class JwtProperties {

    @Value("${jwt.secret}")
    private String secretKey;

    private final long accessTokenExpiration = 1000 * 60 * 60 * 5; // 5시간
    private final long refreshTokenExpiration = 1000 * 60 * 60 * 24 * 14; // 14일
}
