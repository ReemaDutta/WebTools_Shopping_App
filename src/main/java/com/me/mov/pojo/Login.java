package com.me.mov.pojo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "login")
public class Login implements Serializable {
	 private static final long serialVersionUID = -1798070786993154676L;
	@Id
	@Column(name = "username", length = 20)
	private String username;
	@Column(name = "password", length = 20)
	private String password;
	public Login (String username,String password) {
		this.username = username;
		this.password = password;
		
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
