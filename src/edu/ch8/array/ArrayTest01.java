package edu.ch8.array;

import java.util.Scanner;

public class ArrayTest01 {
	public void testArray() {
		// 배열을 사용하는 이유
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int num4 = 40;
		int num5 = 50;
		
		int sum = 0;
		
		sum += num1;
		sum += num2;
		sum += num3;
		sum += num4;
		sum += num5;
		// 번거롭다.
		
		// 선언 및 할당
		int[] arr = new int[5];
		
		// 초기화
		// arr[index] = data;
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		// 코드 작성에는 에러가 발생하지 않지만 실행시키면  java.lang.ArrayIndexOutOfBoundsException 에러 발생
		// arr[5] = 60; -> 범위 초과
		
		// 값 대입 -> for 이용
		for(int i=0; i<arr.length; i++) {
			arr[i] = (i+1)*10;
		}
		
		// 확인
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		sum =0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("sum :: "+sum);
		
	}
	public void testArray2() {
		// 배열 사용법
		// 1. 배열 선언 : int arr[];
		// 2. 할당 : arr= new int[3];
		// 3. 초기화 : arr[0]=10;
		
		// 선언
		int iarr[];
		double darr[];
		
		// 할당
		// new 연산자를 통해서 heap영역에 공간을 할당
		// 할당된 공간의 주소값을 iarr에 대입한다
		// 주소값을 레퍼런스 변수에 저장시키고 참조하여 사용, 참조 자료형이라고 한다.
		iarr = new int[3];
		darr = new double[5];
		
		//선언 & 할당 동시에
		int[] iArr = new int[5];
		char cArr[] = new char[3];
		int[] iArr2 = new int[5];	// 같은 자료형에 같은 할당공간을 가졌어도 주소값은 다르지!
		
		// 주소값 출력
		System.out.println("iArr :"+iArr);
		System.out.println("cArr :"+cArr);
		System.out.println("iArr2 :"+iArr2);
				
		// hashcode : 주소값? ->  두 객체가 같은 객체인지 확인
		System.out.println("iArr의 hachcode :"+iArr.hashCode());
		System.out.println("cArr의 hachcode :"+cArr.hashCode());
		
		// 배열의 길이를 알수있는 기능 -> length vs length()
		// length -> 필드(변수), final(상수)
		// length() -> 메소드 , ex) str.length()
		String test = "testtest";
		
		System.out.println("iArr의 길이 : "+iArr.length);
		System.out.println("cArr의 길이 : "+cArr.length);
		System.out.println("test의 길이 : "+test.length());
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("배열 크기 입력:");
		int size = input.nextInt();
		int arr[] = new int[size];
		
		System.out.println("======================");
		// 한번 지정한 배열의 크기는 변경이 불가능 하다
		System.out.println("수정 전 arr의 hashcode : "+arr.hashCode());
		System.out.println("수정 전 arr의 길이 : "+arr.length);
		
		arr = new int[30];
		
		System.out.println("수정 후 arr의 hashcode : "+arr.hashCode());
		System.out.println("수정 후 arr의 길이 : "+arr.length);
		
		
//		for(int i=0; i<arr.length; i++) {
//			System.out.print("arr["+i+"] 값 입력:");
//			arr[i] = input.nextInt();
//		}
//		for(int i=0; i<arr.length; i++) {
//			System.out.println("arr["+i+"] : "+arr[i]);
//		}
		
		// 한번 할당된 배열은 지울 수 없다.
		// 변수를 null로 변경
		// 시간이 지나면 heap의 old영역으로 이동 후, 가비지 컬렉터가 삭제시킨다.
		arr = null;
		
//		System.out.println("삭제 후 arr[]의 길이: "+arr.length); ->java.lang.NullPointerException 에러 발생
	}
	public void testArray3() {
		// 기본적으로 배열을 할당하면 JVM이 지정한 값으로 초기화 시킨다.
		// heap영역은 값이 없는 공간이 존재할 수 없다.
		
		int[] iArr = new int[5];
		for(int i=0; i<iArr.length; i++) {
			System.out.println("iArr["+i+"]의 값 : "+iArr[i]);	// 0으로 초기화 되어있다.
		}
		
		
		// jvm이 정한 초기값 제외하고 초기화하고 싶을때,
		//int[] iArr2 = {1,2,3,4,5};
		
		// 블럭을 사용하여 초기화 가능
		int[] iArr2 = new int[] {1,2,3,4,5};
		System.out.println("iArr2의 길이: "+iArr2.length); 
		
		String[] sArr = {"apple", "banana", "grape", "orange"};
		
		for(int i=0; i<4; i++) {
			System.out.println(sArr[i]);
		}
	}
}
