package edu.ch5.example;

public class Student {
	public static void main(String[] args) {
		String name ="test";
		int kr = 100;
		int en = 40;
		int mt =85;
		
		Score sc = new Score();
		double avg = sc.getAvg(kr, en, mt);
		String grade = sc.getGrade(avg);
		System.out.println(avg+"///"+grade);
	}
}
