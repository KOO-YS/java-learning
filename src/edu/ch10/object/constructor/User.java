package edu.ch10.object.constructor;

import java.util.Date;

public class User {
	private String userId; 
	private String userPwd;
	private String userName;
	private Date enrollDate;
	
	// 생성자 사용 목적
	// 1. 객체를 생성해주기 위한 목적
	// 2. 매개변수로 받은 값으로 초기화 해주기 위한 목적
	// 규칙 
	// 1. 클래스명과 동일
	// 2. 리턴형이 존재하지 않는다
	
	// 생성자 
	// 1. 기본 생성자 - 필드 초기화 역할은 수행하지 않는다. 객체 인스턴스를 생성할 때, 사용된다
	public User() {}
	// 2. 매개변수 있는 생성자 - 인스턴스 생성 동시에 필드 초기화 목적
	// 오버로딩되어 사용 (같은 이름 다른 매개변수)
	public User(String userId, String userPwd, String userName) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
	}
	public User(String userId, String userPwd, String userName, Date enrollDate) {
//		this.userId = userId;
//		this.userPwd = userPwd;
//		this.userName = userName;
		// 코드 단축
		this(userId, userPwd, userName);	// this() 는 메소드 첫줄에 적는다
		// ERROR : Constructor call must be the first statement in a constructor
		this.enrollDate = enrollDate;		
	}
	// getter, setter
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
	public Date getEnrollDate() {
		return enrollDate;
	}
	public void setEnrollDate(Date enrollDate) {
		this.enrollDate = enrollDate;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userPwd=" + userPwd + ", userName=" + userName + ", enrollDate="
				+ enrollDate + "]";
	}
	
	
}