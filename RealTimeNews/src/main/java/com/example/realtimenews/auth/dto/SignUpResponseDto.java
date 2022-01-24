package com.example.realtimenews.auth.dto;

import javax.validation.constraints.NotBlank;

import lombok.Getter;

@Getter
public class SignUpResponseDto {

	@NotBlank
	private String status;

	@NotBlank
	private String code;

	@NotBlank
	private String message;

	public SignUpResponseDto(String status, String code, String message){
		this.status = status;
		this.code = code;
		this.message = message;
	}
}
