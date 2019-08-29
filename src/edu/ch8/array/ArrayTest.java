package edu.ch8.array;

public class ArrayTest {
	public static void main(String[] args) {
		ArrayTest at = new ArrayTest();
		//at.shallowCopy();
		//at.deepCopy1();
		at.deepCopy3();
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
		
		// 원본배열의 0번째 인덱스를 99로 변경 -> 복사배열도 변경될까? 원본 주소를 참조한 복사배열도 함께 변경
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
	public void deepCopy1() {
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
		
		// 원본배열의 0번째 인덱스를 99로 변경 -> 복사배열도 변경될까? 주소값이 다른 각 객체이기에 복사가 되지않는다 
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
	/* System.arraycopy 이용한 복사 */
	public void deepCopy2() {
		int[] orgArr = new int[] {1,2,3,4,5};
		int[] copyArr = new int[10];
		
		/* 
		 * System.arraycopy(src, srcPos, dest, destPos, length);
		 * src : 원본 배열, srcPos : 복사 시작 위치 
		 * dest : 카피배열, destPos : 붙여넣기 시작위치 
		 * length : 복사될 길이
		 */
		
		System.arraycopy(orgArr, 0, copyArr, 3, orgArr.length);
		String str="";
		for(int i=0; i<orgArr.length; i++) {
			if(i!=orgArr.length-1) {
				str += orgArr[i]+", ";
			}else {
				str += orgArr[i];
			}
		}
		System.out.println("1. orgArr: "+str);
		str ="";
		for(int i=0; i<copyArr.length; i++) {
			if(i != copyArr.length-1) {
				str += copyArr[i]+", ";
			}else {
				str += copyArr[i];
			}
		}
		System.out.println("2. copyArr: "+str);
		
		// 둘은 다른 객체를 가르키고있다
		System.out.println("orgArr Hashcode :" +orgArr.hashCode());
		System.out.println("copyArr Hashcode :" +copyArr.hashCode());
		
		// copyArr 출력
		for(int i=0; i<copyArr.length; i++) {
			System.out.println("copyArr["+i+"] :: "+copyArr[i]);
		}
	}
	/* clone() 을 이용한 복사 */ 
	public void deepCopy3() {
		int[] orgArr = {1,2,3,4,5};
		int[] copyArr = new int[10];
		
		System.out.println("orgArr의 hashcode() : "+orgArr.hashCode());
		System.out.println("copyArr의 hashcode() : "+copyArr.hashCode());
		
		copyArr = orgArr.clone();
		System.out.println("After clone :");
		System.out.println("orgArr의 hashcode() : "+orgArr.hashCode());
		System.out.println("copyArr의 hashcode() : "+copyArr.hashCode());
		
		// 배열값 출력
		String str = "";
		for(int i=0; i<orgArr.length; i++) {
			System.out.println("orgArr["+i+"] : "+orgArr[i]);
			if(i != orgArr.length-1){
				str += orgArr[i]+", ";
			}else {
				str+= orgArr[i];
			}
		}
		System.out.println("1. orgArr: "+str);
		
		str="";
		for(int i=0; i<copyArr.length; i++) {
			System.out.println("copyArr["+i+"] : "+copyArr[i]);
			if(i != copyArr.length-1) {
				str += orgArr[i]+", ";
			}else {
				str += copyArr[i];
			}
		}
		System.out.println("2. copyArr: "+str);
		
		/* clone을 통해 배열을 복사하면 기존 선언해주었던 배열 대신 새로운 크기, 값을 가진 새 배열로 복사된다 */
	}
}
