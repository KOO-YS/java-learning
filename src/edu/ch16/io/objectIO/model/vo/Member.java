package edu.ch16.io.objectIO.model.vo;

import java.io.Serializable;

public class Member implements Serializable {
	
	
	/**
	  직렬화 & 역직렬화 과정에서 시리얼아이디가 없다면 
	 * 기존에 있던 객체를 변경하였을 때 에러 -> 
	 * 시리얼아이디를 추가하고 객체를 변경했을때는 아이디값을 통해 변경내용을 객체에 저장
	 */
	private static final long serialVersionUID = 1L;
	private String userId;
	private String userPwd;
	private String userName;
	private String email;
	private int age;
	private char gender;
	private int num;
	
	public Member() {}

	public Member(String userId, String userPwd, String userName, String email, int age, char gender) {
		super();
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		this.email = email;
		this.age = age;
		this.gender = gender;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "Member [userId=" + userId + ", userPwd=" + userPwd + ", userName=" + userName + ", email=" + email
				+ ", age=" + age + ", gender=" + gender + ", num=" + num + "]";
	}
	
	
}
