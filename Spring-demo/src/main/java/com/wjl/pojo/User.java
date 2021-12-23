package com.wjl.pojo;

public class User {
	private String username;
	private String passWord;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", passWord=" + passWord + ", getUsername()=" + getUsername()
				+ ", getPassWord()=" + getPassWord() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	public User(String username, String passWord) {
		super();
		this.username = username;
		this.passWord = passWord;
	}
	public User() {
		super();
	}
	
}
