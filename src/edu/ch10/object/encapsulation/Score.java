package edu.ch10.object.encapsulation;

public class Score {
//	필드
	private String name ="Kim";
	private int kor = 93;
	private int eng = 82;
	private int mat = 74;
	
//	생성자
	
@Override
	public String toString() {
		return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + "]";
	}
	//	메소드
//	1. 총합을 구하는 메서드
	public void sum() {
		int sum = kor + eng + mat;
		System.out.println("총합 : "+sum);
	} 
//	2. 평균을 구하는 메서드
	public void avg() {
		int sum = kor + eng + mat;
		System.out.println("평균 : "+sum/3);
	}
//	3. 제일 높은 점수를 받은 과목을 찾는 메소드
	public void max() {
		 if (kor >= eng && kor >= mat) {
	            System.out.println("가장 높은과목 : 국어 \n점수 : "+kor);
	        } else if (eng >= kor && eng >= mat) {
	            System.out.println("가장 높은과목 : 영어 \n점수 : "+eng);
	        } else {
	            System.out.println("가장 높은과목 : 수학 \n점수 : "+mat);
	        }
	}
//	4. 제일 낮은 점수를 받은 과목을 찾는 메소드
	public void min() {
		if (kor <= eng && kor <= mat) {
			System.out.println("가장 낮은과목 : 국어 \n점수 : "+kor);
        } else if (eng <= kor && eng <= mat) {
        	System.out.println("가장 낮은과목 : 영어 \n점수 : "+eng);
        } else {
        	System.out.println("가장 낮은과목 : 수학 \n점수 : "+eng);
        }
	}
//	5. 평균점수를 확인하고 등급을 메기는 메소드
	public void grade() {
		int sum = kor + eng + mat;
		double avg = sum/3;
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
		System.out.println("등급은 "+grade+"이다.");
	}
//	6. 필드값을 확인할 수있는 prn메소드
	public void prn () {
		System.out.println(name+"의 점수\n국어 :"+kor+"\n영어 : "+eng+"\n수학 : "+mat);
	}
}
