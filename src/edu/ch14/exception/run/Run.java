package edu.ch14.exception.run;


import edu.ch14.exception.controller.CustomController;
import edu.ch14.exception.controller.RuntimeExceptionPrac;

public class Run {
	public static void main(String[] args) {
		RuntimeExceptionPrac e = new RuntimeExceptionPrac();
//		e.ArithEx();
		e.Exs();
		
		CustomController cc = new CustomController();
		cc.throwEx();
	}
}
