package edu.ch15.exception.controller;

import java.util.Scanner;

public class RuntimeExceptionPrac {
	Scanner input = new Scanner(System.in);
	
	// ArithmeticException
	public void ArithEx() {
		int ran = 0;
		double res = 0.0;
//		System.out.println("나눌 수를 입력(정수) : ");
//		int num = input.nextInt();
		while(true) {
			
//			if(num ==0) {
//				System.out.println("0이 아닌 값을 입력하시오");
//			}else {
//				ran = (int)(Math.random()+10)+1;
//				res = ran/(double)num;
//				System.out.printf("%d / %d = %.2f\n",ran,num,res);
//			}
			try {
				System.out.println("나눌 수를 입력(정수) : ");
				int num = input.nextInt();
				
				ran = (int)(Math.random()+10)+1;
				res = ran/num;
				System.out.printf("%d / %d = %.2f\n",ran,num,res);
			}catch(ArithmeticException e) {
				System.out.println("예외 발생");
				e.printStackTrace();
			}
		}
	}
	public void Exs() {
		// finally 추가
		// ClassCast, ArrayIndexOutOfBounds, NullPointer
		
		// ClassCast 예외
		try {
			Object obj = 'a';
			System.out.println(obj);
//			String str = (String)obj;	//ERROR
//			System.out.println(str);  // ERROR : Exception in thread "main" java.lang.ClassCastException: java.lang.Character cannot be cast to java.lang.String
		} catch(ClassCastException e) {
			System.out.println("ClassCastException :::");
			e.printStackTrace();
		}finally {
			System.out.println("오류발생하던 안하던 출력");
		}
		/* routine 
		 * 1. Exception O  ::: try -> catch -> finally
		 * 2. Exception X  ::: try -> finally
		 * */
		
		
		
		// ArrayIndexOutOfBoundsException
		try {
			
			int[] arr = new int[3];
			arr[0] = 0;
			arr[1] = 1;
			arr[2] = 2;
			
//			arr[3] = 3;		// ERROR
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds :::");
			e.printStackTrace();
		}finally {
			System.out.println("finally");
		}
		
		//NullPoint
		try {
			String str = null;
			System.out.println(str.length()); 	//ERROR
			System.out.println(str);
		} catch(NullPointerException e) {
			System.out.println("NullPointer :::");
		} catch(Exception e) {	
			// 예외의 최상위 클래스 :: 순서를 위로 잡으면 다른 예외 클래스가 필요가 없어서 에러뜬다
			// 모든 에러를 다 잡아내지만 어떤 예외가 발생했는지 모른다
			System.out.println("all Exception");
		}
		
		
		// 여러 예외를 함께 사용할 때
		try {
			
		} catch (NullPointerException | ArrayIndexOutOfBoundsException e1) {
			// 이것 역시 어떤 예외가 발생했는지 알수 없기에 잘 사용하지 않는다
		}
	}
}
