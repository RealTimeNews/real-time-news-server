package com.example.realtimenews.auth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.realtimenews.auth.dto.LoginRequestDto;
import com.example.realtimenews.auth.dto.SignUpRequestDto;
import com.example.realtimenews.auth.service.AuthService;

@RestController
@RequestMapping("/user")
public class AuthController {
	private final AuthService authService;

	public AuthController(AuthService authService){
		this.authService = authService;
	}

	@PostMapping("/signup")
	public ResponseEntity signUpUser(@RequestBody SignUpRequestDto signUpRequestDto) throws Exception {
		return ResponseEntity.ok(
			authService.signUpUser(signUpRequestDto)
		);
	}

	@PostMapping("/login")
	public ResponseEntity loginUser(@RequestBody LoginRequestDto loginRequestDto) throws Exception {
		return ResponseEntity.ok(
			authService.loginUser(loginRequestDto)
		);
	}
}
