package com.microservice.auth.jwt;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.microservice.auth.models.UserLogin;
import com.microservice.auth.repo.UserDetailsRepo;
import com.microservice.auth.repo.UserLoginRepo;
import com.microservice.auth.serviceimpl.AuthServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtUtills implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private static final long TOKEN_VALIDITY = 1 * 60 * 60;
	@Value("${jwt.secret}")
	private String jwtSecret;

	@Autowired
	private UserDetailsRepo _userDetailsRepo;
	@Autowired
	private UserLoginRepo _userLoginrepo;

	public String generateJwtToken(UserDetails userDetails) {
		Map<String, Object> claims = new HashMap<>();
		UserLogin _userLogin;
		if(userDetails.getUsername().matches("[0-9]+")){
			_userLogin=_userLoginrepo.findUserByMobileNo(userDetails.getUsername());
		}else{
			_userLogin=_userLoginrepo.findUserByEmail(userDetails.getUsername());
		}
		com.microservice.auth.models.UserDetails _userDetails= _userDetailsRepo.findUserDetailsByUserLoginId(_userLogin.getID());

		claims.put("username",userDetails.getUsername());
		claims.put("name",_userDetails.getFIRST_NAME()+" "+_userDetails.getLAST_NAME());
		claims.put("type",_userLogin.getUSER_TYPE());
		claims.put("icon",_userDetails.getPROFILE_PHOTO());
		return Jwts.builder().setClaims(claims)
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + TOKEN_VALIDITY * 1000))
				.signWith(SignatureAlgorithm.HS512, jwtSecret).compact();
	}

	public Boolean validateJwtToken(String token, UserDetails userDetails) {
		String username = getUsernameFromToken(token);
		Claims claims = Jwts.parser().setSigningKey(jwtSecret).parseClaimsJws(token).getBody();
		Boolean isTokenExpired = claims.getExpiration().before(new Date());
		return (username.equals(userDetails.getUsername()) && !isTokenExpired);
	}

	public String getUsernameFromToken(String token) {
		final Claims claims = Jwts.parser().setSigningKey(jwtSecret).parseClaimsJws(token).getBody();
		return claims.get("username").toString();
	}

}
