package edu.ch9.demensionArr;

public class DeArrayTest01 {
	public void test1() {
		/*
		 * 2차원 배열 선언 선언 -> stack 공간에 변수가 생성
		 */
		int[][] iArr1;
		int iArr2[][];
		
		// 할당 -> heap 공간에 배열을 할당
		iArr1 = new int[3][5];
		
		// 
		iArr2 = new int[3][];
		iArr2[0] = new int[5];
		iArr2[1] = new int[5];
		iArr2[2] = new int[5];
		// heap영역에는 빈공간 없다
		// JVM이 지정해둔 초기값으로 초기화된다.
		for(int i=0; i<iArr1.length; i++) {
			for(int j=0; j<iArr1[i].length; j++) {
				//System.out.println("iArr1["+i+"]["+j+"]");
				System.out.print(" "+iArr1[i][j]);
			}
			System.out.println();
		}
	}
	public void testInit() {
		// 배열 선언, 할당 한 뒤에 인덱스로 접근
		int[][] iArr = new int[3][5];
		
//		노가다 초기화
//		iArr[0][0] =1;
//		iArr[0][1] =2;
//		iArr[0][2] =3;
//		iArr[0][3] =4;
//		iArr[0][4] =5;
//		iArr[1][0] =6;
//		iArr[1][1] =7;
//		iArr[1][2] =8;
//		iArr[1][3] =9;
//		iArr[1][4] =10;
//		iArr[2][0] =11;
//		iArr[2][1] =12;
//		iArr[2][2] =13;
//		iArr[2][3] =14;
//		iArr[2][4] =15;
		
		// 노가다 출력
//		for(int i=0; i<iArr.length; i++) {
//			for(int j=0; j<iArr[i].length; j++) {
//				System.out.printf("%3d",iArr[i][j]);
//			}
//			System.out.println();
//		}
		int value =1;
		for(int i=0; i<iArr.length; i++) {
			for(int j=0; j<iArr[i].length; j++) {
				iArr[i][j] = value;
				value ++;
			}
		}
		prn(iArr);
	}
	public void prn(int[][] iArr) {
		for(int i=0; i<iArr.length; i++) {
			for(int j=0; j<iArr[i].length; j++) {
				System.out.printf("%3d",iArr[i][j]);
			}
			System.out.println();
		}
	}
	public void testInit2() {
		// 가변 배열, 자료형이 같은 1차원 배열의 묶음 -> 2차원 배열
		int[][] iArr = new int[3][];
		
		iArr[0] = new int[5];
		iArr[1] = new int[3];
		iArr[2] = new int[10];
		
		int val = 1;
		for(int i=0; i<iArr.length; i++) {
			for(int j=0; j<iArr[i].length; j++) {
				iArr[i][j] = val++;
			}
		}
		
		prn(iArr);
	}
	 public void testInit3() {
//		 int[][] iArr = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
		 int[][] iArr = {{1,2,3},{6,7,8,9,10},{11,12,13}};
		 
		 prn(iArr);
	 }
}
