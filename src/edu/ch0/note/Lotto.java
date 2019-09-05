package edu.ch0.note;

import java.util.Arrays;
import java.util.Scanner;

/**		
 *	 자동입력, 수동입력을 이용한 LOTTO 번호 맞추기
 */

public class Lotto {
      public static void main(String[] args) {
         
        Lotto l = new Lotto();
         
        /* 메뉴에서 금액 선택 */
         l.menu();
         
         String numList = "";	// 소유한 로또 번호 출력용
         String result = "";	// 결과 출력용

         extra = 5-auto-manual;   // 0으로 채울 값  
         
         // 당첨번호 & 보너스 번호
         win = l.randNum();
         bonus = l.getBonus(win);
//         System.out.println("(((생략)))\n당첨번호 :: "+Arrays.toString(win)+"\n보너스 넘버: "+bonus);
         
         while(auto>0) {         // 자동 
            int[] rArr = l.randNum();
            numList += l.prn(rArr);
            result += l.getScore(rArr, win);
//            System.out.println("(((생략)))\n어레이 :"+Arrays.toString(rArr));
            auto --;
         }
         while(manual>0) {         // 수동
            int[] mArr = l.manualNum();
            numList += l.prn(mArr);
            result += l.getScore(mArr, win);
//             System.out.println("(((생략)))\n어레이 :"+Arrays.toString(mArr));
            manual --;
         }
         while(extra>0) {
            numList += "0 0 0 0 0 0\n";
            result += "꽝입니다\n";
            extra --;
         }
         
         System.out.println("* 소유한 로또 번호 *");
         System.out.println(numList);
         System.out.println("* 당첨 번호 정보 *");
         System.out.println(l.prn(win));
         System.out.println(result);
         
      }

      /* 필드 선언 */
      static int auto;         // 자동 횟수
      static int manual;         // 수동 횟수 
      static int extra;      // 자동,수동을 제외한 남은횟수
      static int bonus;      // 보너스 번호
      static int[] win;      // 로또 당첨 번호
      
      Scanner input = new Scanner(System.in);
      
      /* 메뉴에서 금액 선택 */
      public void menu() {
         System.out.println("** 바로 확인하는 스피트 로또 **");
         System.out.println("**1. 1000원 자동 **");
         System.out.println("**2. 2000원 자동 **");
         System.out.println("**3. 3000원 자동 **");
         System.out.println("**4. 4000원 자동 **");
         System.out.println("**5. 5000원 자동 **");
         System.out.println("**6. 1000원 수동 **");
         System.out.println("**7. 2000원 수동 **");
         System.out.println("**8. 3000원 수동 **");
         System.out.println("**9. 4000원 수동 **");
         System.out.println("**10. 5000원 수동 **");
         System.out.println("**11. 1000원 수동 + 4000원 자동 **");
         System.out.println("**12. 2000원 수동 + 3000원 자동 **");
         System.out.println("**13. 3000원 수동 + 2000원 자동 **");
         System.out.println("**14. 4000원 수동 + 1000원 자동 **");
         System.out.print("번호 선택 : ");
         int num = input.nextInt();
         
         switch(num) {
         case 1: auto = 1; break;
         case 2: auto = 2; break;
         case 3: auto = 3; break;
         case 4: auto = 4; break;
         case 5: auto = 5; break;
         case 6: manual = 1; break;
         case 7: manual = 2; break;
         case 8: manual = 3; break;
         case 9: manual = 4; break;
         case 10: manual = 5; break;
         case 11: auto = 4; manual = 1; break;
         case 12: auto = 3; manual = 2; break;
         case 13: auto = 2; manual = 3; break;
         case 14: auto = 1; manual = 4; break;
         default: 
            System.out.println("*** 범위안의 숫자로 다시 입력해주세요 ***");
            menu();
         }
      }

      /* 배열 문자열로 변환해 출력 */
      public String prn(int[] arr) {
         String array = "";
         for(int i=0; i<arr.length; i++) {
            array += ""+arr[i] +" ";
         }
         return array+"\n";
      }
      
      /* 수동으로 숫자 입력-> 숫자 1~45 제한*/
      public int[] manualNum() {
         int line[] = new int[6];
         for(int i=0; i<line.length; i++) {
            System.out.print((i+1)+"번째 숫자 입력 : ");
            int num = input.nextInt();
            line[i] = num;
        	if(num<1 || num>45) {
              System.out.println("1~45 범위 숫자로 다시 입력해주세요");
              i--;
        	} else {	// 1<= num <= 45
        		for(int j=0; j<i; j++) {
        			if(line[i]==line[j]) {
                      System.out.println("이미 존재하는 값입니다. 다시입력해주세요"); // 중복값 허용 X
                      i--;
        			}
        		}
        	}
         }
         Arrays.sort(line);
         return line;
      }
      
      /* 자동 or 당첨번호 난수 입력 */
      public int[] randNum() {
         int line[] = new int[6];
         for(int i=0; i<line.length; i++) {
            line[i] = (int)(Math.random()*45)+1;
            for(int j=0; j<i; j++) {
               if(line[i]==line[j]) {
                  i--;	// 중복값 허용 X
               }
            }
         }
         Arrays.sort(line);
         return line;
      }
      /* 보너스 숫자 추가 -> 당첨번호 배열에 없는 숫자 1개 */
      public int getBonus(int[] arr) {
         boolean result; 
         do{
        	result = false;		// 배열의 인덱스 중 보너스와 같은 값이 있는지 판별 -> 없다로 초기화
            bonus = (int)(Math.random()*45+1);
            for(int i=0; i<arr.length; i++) {
            	if(arr[i]==bonus) {
            		result = true;	// true 로 바뀌지 않는다면 보너스가 당첨번호 배열 안에 없다는 것
            	}
            }
         }while(result);
         return bonus;
      }
      
      /* 점수 내기 */
      public String getScore(int[] win, int[] arr) {
         int count = 0;
         /*보너스 번호 제외 당첨번호 비교*/
         for(int i=0; i<win.length; i++) {
            for(int j=0; j<arr.length; j++) {
               if(win[i]==arr[j]) {
                  count ++;
               }
            }
         }
//         System.out.println("(((생략)))맞은 갯수:"+count);
         
         /* 보너스 번호와 배열 비교*/
         boolean chkBonus = false;
         for(int i=0; i<arr.length; i++) {
            if(arr[i]==bonus) {
               chkBonus = !chkBonus;
            }
         }
         String msg = "";
         switch(count) {
         case 6:
            msg = "1등 입니다\n당첨금은 60억입니다\n";
            break;
         case 5:
            if(chkBonus) {	// 보너스 점수가 맞으면
               msg = "2등 입니다\n당첨금은 5천만원입니다\n";
            } else {
               msg = "3등 입니다\n당첨금은 100만원입니다\n";
            }
            break;
         case 4:
            msg = "4등 입니다\n당첨금은 5만원입니다\n";
            break;
         case 3:
            msg = "5등 입니다\n당첨금은 5천원입니다\n";
            break;
         case 2: case 1: case 0:	// 2 이하
            msg = "꽝입니다\n";
            break;
         }
         return msg;
      }
}

