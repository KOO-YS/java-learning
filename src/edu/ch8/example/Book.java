package edu.ch8.example;

import java.util.Arrays;

public class Book {
	public static void main(String[] args) {
		//shuffle();
		//bubble();
		count();
	}
	
	/* 섞기 shuffle */
	public static void shuffle() {
		int[] arr = new int[10];
		
		/* 배열 숫자 0~9로 초기화 */
		for(int i=0; i<arr.length; i++) {
			arr[i] = i;
		}
		/* 인덱스 0과 다른 랜덤인덱스를 바꿔 배열 셔플 */
		for(int i=0; i<arr.length; i++) {
			int rand = (int)(Math.random()*10);		// 0~9
			int temp = arr[0];
			arr[0] = arr[rand];
			arr[rand] = temp;	// 서로 바꾸기
		}
		System.out.println(Arrays.toString(arr));
	}
	
	/* bubble sort 버블 정렬 */
	public static void bubble() {
		int[] arr = new int[10];
		/* 전체 인덱스에 0~9 사이 랜덤값 삽입 */
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10);
		}
		for(int i=0; i<arr.length-1; i++) {	
			boolean changed = false; 	// 변화가 없다면 순차 정렬 되어있다는 뜻
			
			for(int j=0; j<arr.length-i-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					changed = true;
				}
			}
			if(!changed) {	//  변화가 없다면?
				break;
			}
			System.out.println(i+"회차 : "+Arrays.toString(arr));
		}
	}
	public static void count() {
		int[] arr = new int[10];
		int[] cnt = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10);
			System.out.print(arr[i]);
		}
		System.out.println();
		for(int i=0; i<arr.length; i++) {
			cnt[arr[i]]++;
		}
		// 각 인덱스의 숫자가 arr배열에 사용된 횟수
		System.out.println(Arrays.toString(cnt)); 
	}
}
