package edu.ch5.example;

public class Score {
	public double getAvg(int kr, int en, int mt) {
		double avg = (kr + en + mt)/3;
		return avg;
	}
	public String getGrade(double avg) {
		
		String grade;
		if(avg>=90) {
			grade ="A";
		}else if(avg>=80) {
			grade = "B";
		}else if(avg>=70) {
			grade = "C";
		}else if(avg>=60) {
			grade = "D";
		}else {
			grade = "F";
		}
		return grade;
	} 
}
