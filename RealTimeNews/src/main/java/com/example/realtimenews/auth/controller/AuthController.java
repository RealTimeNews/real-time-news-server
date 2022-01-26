package com.example.realtimenews.auth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.realtimenews.auth.dto.LoginRequestDto;
import com.example.realtimenews.auth.dto.SignUpRequestDto;
import com.example.realtimenews.auth.dto.SignUpResponseDto;
import com.example.realtimenews.auth.service.AuthService;

@RestController
@RequestMapping("/user")
public class AuthController {
	private final AuthService authService;

	public AuthController(AuthService authService){
		this.authService = authService;
	}

	@PostMapping("/signup")
	public ResponseEntity<SignUpResponseDto> signUpUser(@RequestBody SignUpRequestDto signUpRequestDto) throws Exception {
		authService.signUpUser(signUpRequestDto);
		return ResponseEntity.ok()
			.body(SignUpResponseDto.builder()
				.code("USER_SIGNUP")
				.message("회원가입 완료")
				.build());
	}

	@PostMapping("/login")
	public ResponseEntity loginUser(@RequestBody LoginRequestDto loginRequestDto) throws Exception {
		return ResponseEntity.ok(
			authService.loginUser(loginRequestDto)
		);
	}
}
