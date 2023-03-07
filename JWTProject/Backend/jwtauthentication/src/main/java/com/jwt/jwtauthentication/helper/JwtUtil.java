package com.jwt.jwtauthentication.helper;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

//methods - for generating tokens
//validate
//isExp
//util class for jwt
@Component
public class JwtUtil
{

       private static final long serialVersionID = -2550185165626007488L;

       public static final long JWT_TOKEN_VALIDITY = 5*60*60;



        private String SECRET = "secret";


        //retrieve username from jwt token
        public String extractUsername(String token) {
            return extractClaim(token, Claims::getSubject);
        }

       //retrieve expiration date from jwt token
        public Date extractExpiration(String token) {
            return extractClaim(token, Claims::getExpiration);
        }

        public <T> T extractClaim(String token, Function<Claims, T> claimsResolver) {
            final Claims claims = extractAllClaims(token);
            return claimsResolver.apply(claims);
        }

       //for retrieving any information from jwt token we will need the secret key
        private Claims extractAllClaims(String token) {
            return Jwts.parser().setSigningKey(SECRET).parseClaimsJws(token).getBody();
        }

        //check if the token has expired
        private Boolean isTokenExpired(String token) {
            return extractExpiration(token).before(new Date());
        }

        //generate token for user
        public String generateToken(UserDetails userDetails) {
            Map<String, Object> claims = new HashMap<>();
            return createToken(claims, userDetails.getUsername());
        }

        //while creating the token
        //1. define claims of the token- like Issuer, Expiration, Subject and Id.
        //2. Sign the JWT using the HS512 algorithm and secret key.
        //3. According to the JWS compact Serialization(https://tools.itef.org.html/draft)
        // Compaction of the JWT to a URL-safe string.
        private String createToken(Map<String, Object> claims, String subject) {

            return Jwts.builder().setClaims(claims).setSubject(subject).setIssuedAt(new Date(System.currentTimeMillis()))
                    .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 10))
                    .signWith(SignatureAlgorithm.HS256, SECRET).compact();
        }


        //Validate token
        public Boolean validateToken(String token, UserDetails userDetails) {
            final String username = extractUsername(token);
            return (username.equals(userDetails.getUsername()) && !isTokenExpired(token));
        }
    }

