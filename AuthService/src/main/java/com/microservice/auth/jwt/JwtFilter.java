package com.microservice.auth.jwt;

import java.io.IOException;

import com.microservice.auth.security.UserLoginDetails;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import com.microservice.auth.security.UserLoginDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;


@Component
public class JwtFilter extends OncePerRequestFilter {

	@Autowired
	private JwtUtills jwtUtills;

	@Autowired
	private UserLoginDetailsService _userLoginDetailsService;

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		String auth = request.getHeader("Authorization");
		String token = null;
		String email = null;
		if (auth != null && auth.startsWith("Bearer")) {
			token = auth.substring(6);
			email = jwtUtills.getUsernameFromToken(token);
		}

		if (email != null && SecurityContextHolder.getContext().getAuthentication() == null) {
			UserLoginDetails currentUser = (UserLoginDetails) _userLoginDetailsService.loadUserByUsername(email);

			UsernamePasswordAuthenticationToken userAuthToken = new UsernamePasswordAuthenticationToken(currentUser,
					null, currentUser.getAuthorities());
			userAuthToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
			SecurityContextHolder.getContext().setAuthentication(userAuthToken);
		}

		filterChain.doFilter(request, response);

	}

}
