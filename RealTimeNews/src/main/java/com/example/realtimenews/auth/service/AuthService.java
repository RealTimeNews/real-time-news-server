package com.example.realtimenews.auth.service;

import com.example.realtimenews.auth.dto.LoginRequestDto;
import com.example.realtimenews.auth.dto.LoginResponseDto;
import com.example.realtimenews.auth.dto.SignUpRequestDto;
import com.example.realtimenews.auth.dto.SignUpResponseDto;

public interface AuthService {
	public LoginResponseDto loginUser(LoginRequestDto loginRequestDto) throws Exception;
	public SignUpResponseDto signUpUser(SignUpRequestDto signUpRequestDto) throws Exception;
}
