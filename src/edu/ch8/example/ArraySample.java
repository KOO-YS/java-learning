package edu.ch8.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraySample {
	Scanner input = new Scanner(System.in);

	public void test1() {
		int[] arr = new int[10];
		// Math 함수 사용
		// int rand = (int)(Math.random()*100)+1;
		
		Random num = new Random();
		
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			arr[i] = num.nextInt(101);
			sum += arr[i];
		}
		System.out.println("Array 	: "+Arrays.toString(arr));
		System.out.println("Sum 	: "+sum);
	}
	
	public void test2() {
		int[] arr = new int[10];
		
		Random num = new Random();
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = num.nextInt(101);
		}
		
		int min =arr[0], max =arr[0];
		for(int i=0; i<arr.length; i++) {
			if(min>arr[i]){
				min = arr[i];
			}
			if(max<arr[i]) {
				max = arr[i];
			}
			
		}
		System.out.println("Array 	: "+Arrays.toString(arr));
		System.out.println("Min	: "+min);
		System.out.println("Max	: "+max);
		
	}
	public void test3() {
		byte[] arr = new byte[10];
		
		Random num = new Random();
		num.nextBytes(arr);
		/*
		 * nextBytes() :
		 * 랜덤한 바이트를 반환하는 것이 아니고, 
		 * 바이트 배열(byte[])을 랜덤하게 채움 
		 */
		System.out.println("Array 	: "+Arrays.toString(arr));
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				sum += arr[i];
			}
		}
		System.out.println("Sum 	: "+sum);
	}
	public void test4() {
		System.out.print("문자열 입력 : ");
		String str = input.nextLine();
		int sum = 0;
		for(int i=0; i<str.length();i++) {
			//str.substring(beginIndex, endIndex)
			sum += Integer.parseInt(str.substring(i, i+1));
		}
		System.out.println("Sum 	: "+sum);
	}
	public void test5() {
		System.out.print("문자열 입력 : ");
		String str = input.nextLine();
		int sum = 0;
		for(int i=0; i<str.length();i++) {
			sum += (str.charAt(i)-'0');		// char type '0' = 48
		}
		System.out.println("Sum 	: "+sum);
	}
	
}
