package com.security.jwt.demo.dtos;

public class SessaoDTO {
	
	private String login;
	private String token;
	
	public SessaoDTO() {
		
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	
	

}
