package com.bx.servicepassengeruser.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ResourceServerProperties;

import java.util.Date;

public class JwtUtil {

    private static final String secret = "abcdefg";

    public static String createToken(String userid){
        String token = Jwts.builder().setSubject(userid)
                .setExpiration(new Date(System.currentTimeMillis()+5000))
                .signWith(SignatureAlgorithm.HS256, secret)
                .compact();
        return token;
    }

    public static String parseToken(String token){
        Claims claims = Jwts.parser().setSigningKey(secret)
                .parseClaimsJws(token)
                .getBody();
        return claims.getSubject();
    }

    public static void main(String[] args)throws Exception {
        String token = createToken("110245");
        System.out.println(token);
        Thread.sleep(6000);
        String parseToken = parseToken(token);
        System.out.println(parseToken);
    }
}
