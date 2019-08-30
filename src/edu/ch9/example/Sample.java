package edu.ch9.example;

import java.util.Scanner;

public class Sample {
	Scanner input = new Scanner(System.in);
	public void prn(int[][] iArr) {
		for(int i=0; i<iArr.length; i++) {
			for(int j=0; j<iArr[i].length; j++) {
				System.out.printf("[%4d]",iArr[i][j]);
			}
			System.out.println();
		}
	}
	public void munjae1() {
		int[][] arr = new int[4][4];
		int[] col = new int[4];		// 특정 열의 합계
		int[] row = new int[4];	// 특정 행의 합계 
		int total = 0;		// 전체 합계
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				
				if((j == arr[i].length-1)&&(i==arr.length-1)) {
					arr[i][j] = total;
				}
				// i행 값들의 합계
				else if(j == arr[i].length-1) {
					arr[i][j] = row[i];
					total += arr[i][j]; 
				// j열 합계
				}else if(i==arr.length-1) {	
					arr[i][j] = col[j];
					total += arr[i][j];
				} else {
					int rand = (int)(Math.random()*100)+1;
					arr[i][j] = rand;
					row[i] += arr[i][j];
					col[j] += arr[i][j]; 
				}
				
			}
		}
		prn(arr);
	}
	public void munjae2() {
		int[][] arr = new int[3][];
		String str = "";
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			System.out.print("arr["+i+"]의 열 갯수: ");
			int num = input.nextInt();
			arr[i] = new int[num];
			int sum =0;
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = (int)(Math.random()*100)+1;
				sum += arr[i][j];
			}
			if(sum%5==0) {
				count ++;
				for(int j=0; j<arr[i].length; j++) {
					str += "arr["+i+"]["+j+"] :"+arr[i][j]+"\n";
				}
			}
		}
		System.out.println("열의 합계가 5의 배수인 행열 갯수: "+count+"\n"+str);
		prn(arr);
	}
	public void munjae3() {
		int[][] arr = new int[5][5];
		boolean flag = true;
		int value =1;
		for(int i=0; i<arr.length; i++) {
			if(flag) {
				for(int j=0; j<arr[i].length; j++) {
					arr[i][j] = value;
					value++;
				}				
			}else {
				for(int j=arr[i].length-1; j>=0; j--) {
					arr[i][j] = value;
					value++;
				}
			}
			flag= !flag;
		}
		prn(arr);
	}
	public void munjae4() {
		int[][] arr = new int[5][5];
		int value2 =0;
		for(int i=0; i<arr.length; i++) {
//			for(int j=0, value=0; j<arr[i].length; j++,value+=5) {
//				arr[i][j]=(i+1)+value;
//			}
			/* 다른 방식 */
			for(int j=0; j<arr[i].length; j++) {
				arr[j][i] = ++value2;
			}
		}
		prn(arr);
	}
}
