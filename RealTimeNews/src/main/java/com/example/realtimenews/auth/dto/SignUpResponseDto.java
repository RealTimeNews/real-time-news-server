package com.example.realtimenews.auth.dto;

import javax.validation.constraints.NotBlank;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class SignUpResponseDto {

	@NotBlank
	private String code;

	@NotBlank
	private String message;

	public SignUpResponseDto(String code, String message){
		this.code = code;
		this.message = message;
	}
}
