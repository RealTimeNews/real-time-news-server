package com.example.realtimenews.auth.dto;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SignUpRequestDto {
	@NotBlank
	private String userId;
	@NotBlank
	private String password;
	@NotBlank
	private String userName;
}
