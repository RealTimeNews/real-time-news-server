package com.example.realtimenews.auth.service.serviceimpl;

import org.springframework.stereotype.Service;

import com.example.realtimenews.auth.dto.LoginRequestDto;
import com.example.realtimenews.auth.dto.LoginResponseDto;
import com.example.realtimenews.auth.dto.SignUpRequestDto;
import com.example.realtimenews.auth.dto.SignUpResponseDto;
import com.example.realtimenews.auth.entity.UserInfo;
import com.example.realtimenews.auth.repository.UserInfoRepository;
import com.example.realtimenews.auth.service.AuthService;

import org.springframework.security.crypto.password.PasswordEncoder;

@Service
public class AuthServiceImpl implements AuthService {

	private final UserInfoRepository userInfoRepository;
	//private final PasswordEncoder passwordEncoder;

	public AuthServiceImpl(UserInfoRepository userInfoRepository){
		//this.passwordEncoder = passwordEncoder;
		this.userInfoRepository = userInfoRepository;
	}

	@Override
	public LoginResponseDto loginUser(LoginRequestDto loginRequestDto) throws Exception {
		return null;
	}

	@Override
	public void signUpUser(SignUpRequestDto signUpRequestDto) throws Exception {
		UserInfo userInfo = UserInfo.builder()
			.userId(signUpRequestDto.getUserId())
			.password(signUpRequestDto.getPassword())
			//.password(passwordEncoder.encode(signUpRequestDto.getPassword()))
			.userName(signUpRequestDto.getUserName())
			.build();
		userInfoRepository.save(userInfo);
	}
}
