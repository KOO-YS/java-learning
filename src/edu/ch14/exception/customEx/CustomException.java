package edu.ch14.exception.customEx;

public class CustomException extends Exception{
	public CustomException() {}
	public CustomException(char ch) {
		super(ch+"는 대문자이므로 오류(예외발생)");
	}
}
