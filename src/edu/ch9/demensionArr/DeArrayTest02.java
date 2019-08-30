package edu.ch9.demensionArr;

public class DeArrayTest02 {
	public void test01() {
		int[][] iArr = new int[8][9];
		for(int i=0; i<iArr.length; i++) {
			System.out.println("====="+(i+2)+"단=====");
			for(int j=0; j<iArr[i].length; j++) {
				iArr[i][j]= ((i+2)*(j+1)); 
				System.out.println(" "+(i+2) + " * "+(j+1)+" = "+((i+2)*(j+1)));
			}
		}
	}
}
