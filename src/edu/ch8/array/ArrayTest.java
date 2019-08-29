package edu.ch8.array;

public class ArrayTest {
	public static void main(String[] args) {
		ArrayTest at = new ArrayTest();
		at.shallowCopy();
		at.deepCopy();
	}

	/* 얕은 복사 : 주소값만 가져와 참조변수에 저장 
	 *  -> 하나의 객체를 두 변수가 참조하는 상황 	*/
	public void shallowCopy() {
		System.out.println("*** 얕은 복사 ***");
		int[] orgArr = {1,2,3,4,5};
		int[] copyArr = orgArr;		// 주소 복사
		
		String str ="";
		for(int i=0; i<orgArr.length; i++) {
			if(i != orgArr.length-1) {
				str += orgArr[i]+", ";
			} else {
				str += orgArr[i];
			}
			
		}
		//System.out.println(Arrays.toString(orgArr));
		System.out.println("1. orgArr: "+str);
		
		str="";
		for(int i=0; i<copyArr.length; i++) {
			if(i!=copyArr.length-1) {
				str += copyArr[i]+", ";
			}else {
				str += copyArr[i];
			}
		}
		System.out.println("2. copyArr: "+str);
		
		// 원본배열의 0번째 인덱스를 99로 변경 -> 복사배열도 변경될까? 같이 된다
		System.out.println("\n*** 원본배열 인덱스 수정 ***\n");
		orgArr[0] =99;
		
		str ="";
		for(int i=0; i<orgArr.length; i++) {
			if(i != orgArr.length-1) {
				str += orgArr[i]+", ";
			} else {
				str += orgArr[i];
			}
			
		}
		System.out.println("1. orgArr: "+str);
		
		str="";
		for(int i=0; i<copyArr.length; i++) {
			if(i!=copyArr.length-1) {
				str += copyArr[i]+", ";
			}else {
				str += copyArr[i];
			}
		}
		System.out.println("2. copyArr: "+str);
		
		System.out.println("\n*** 얕은 복사 해쉬코드 비교 ***\n");
		System.out.println("orgArr Hashcode :" +orgArr.hashCode());
		System.out.println("copyArr Hashcode :" +copyArr.hashCode());
	}
	
	/* 깊은 복사 : 동일한 크기의 배열 하나 생성하고 값을 복사 
	 * ->새로운 배열 객체 하나 생성 */
	public void deepCopy() {
		System.out.println("*** 깊은 복사 ***");
		int[] orgArr = {1,2,3,4,5};
		int[] copyArr = new int[5];
		for(int i=0; i<orgArr.length; i++) {
			copyArr[i] = orgArr[i];
		}
		
		String str ="";
		for(int i=0; i<orgArr.length; i++) {
			if(i!=orgArr.length-1) {
				str += orgArr[i]+", ";
			}else {
				str += orgArr[i];
			}
		}
		System.out.println("1. orgArr: "+str);
				
		str="";
		for(int i=0; i<copyArr.length; i++) {
			if(i != copyArr.length-1) {
				str += copyArr[i]+", ";
			}else {
				str += copyArr[i];
			}
		}
		System.out.println("2. copyArr: "+str);
		
		// 원본배열의 0번째 인덱스를 99로 변경 -> 복사배열도 변경될까?
		System.out.println("\n*** 원본배열 인덱스 수정 ***\n");
		orgArr[0] =99;
		
		str ="";
		for(int i=0; i<orgArr.length; i++) {
			if(i!=orgArr.length-1) {
				str += orgArr[i]+", ";
			}else {
				str += orgArr[i];
			}
		}
		System.out.println("1. orgArr: "+str);
				
		str="";
		for(int i=0; i<copyArr.length; i++) {
			if(i != copyArr.length-1) {
				str += copyArr[i]+", ";
			}else {
				str += copyArr[i];
			}
		}
		System.out.println("2. copyArr: "+str);
		
		System.out.println("\n*** 깊은 복사 해쉬코드 비교 ***\n");
		System.out.println("orgArr Hashcode :" +orgArr.hashCode());
		System.out.println("copyArr Hashcode :" +copyArr.hashCode());
		
	}
}
