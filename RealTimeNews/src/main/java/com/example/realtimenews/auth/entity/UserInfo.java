package com.example.realtimenews.auth.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Userinfo")
@Getter
@Setter
public class UserInfo {
	@Id
	@GeneratedValue
	private int seq;

	@Column(unique = true)
	@NotBlank
	private String userId;
	@NotBlank
	private String password;
	@NotBlank
	private String username;

	public UserInfo(){
	}

	@Builder
	public UserInfo(@NotBlank String userId, @NotBlank String password, @NotBlank String username){
		this.userId = userId;
		this.password = password;
		this.username = username;
	}

}
