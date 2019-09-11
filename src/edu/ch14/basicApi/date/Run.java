package edu.ch14.basicApi.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Run {
	public static void main(String[] args) {
		/*
		 *  1. Date(java.util)	 : 	완성도가 떨어지는 클래스
		 *  						1970년 1월 1일 00:00:00 기준으로 1ms 단위로 계산
		 *  						Date는 년도 +1900 월은 +1
		 *  2.Calendar(java.util) :	필드를 가지고 있다. timezone
		 *  						기본생성자로 생성시에 월만 +1
		 *  3.GregorianCalendar(java.util)	:	
		 *  4. SimpleDateFormat(java.text)	: 날짜와 시간을 원하는 포멧으로 뽑아준다
		 *  5.Formatter 	: 값출력, format을 바탕으로 날짜를 뽑아준다.
		 */
		
		// 1.Date
		Date orgTime = new Date(0L);
		System.out.println(orgTime);
		// Greenwich Mean Time	: 그리니치 세계 기준 시간대
		
		String orgTime2 = new Date(0L).toGMTString();
		System.out.println(orgTime2);
		
		Date today = new Date();
		System.out.println(today);
		
		// 기준시간보다 1초 후
		String orgTime3 = new Date(1000L).toGMTString();
		System.out.println(orgTime3);
		
		// 원하는 패턴으로 뽑기
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");	//	month = M, minute = m
		System.out.println(sdf.format(today));
		
		System.out.println("getTime() : "+ today.getTime());
		System.out.println("getDate() : "+ today.getDate());
		System.out.println("getDay() : "+today.getDay());
		System.out.println("getHours() : "+today.getHours());
		System.out.println("getMonth() : "+today.getMonth());
		System.out.println("getYear() : "+ ((int)(today.getYear())+1900) );
		System.out.println("==================캘린더==================");
		/*
		 * 1. 월만 -1
		 *  
		 *  3. field Number개념 도입
		 */
//		Calendar c = new Calendar();	-> ERROR : 생성자가 protected이므로 새 객체를 만들수 없고 
//		이미 생성된 인스턴스만 빼와야 한다 -> getInstance	 
		Calendar calendar = Calendar.getInstance();
		calendar.set(2019, 9-1, 10);		// field
		int year = calendar.get(1);
		int month = calendar.get(Calendar.MONTH)+1;
		int date = calendar.get(Calendar.DATE);
		int hour = calendar.get(Calendar.HOUR);
		int minute = calendar.get(Calendar.MINUTE);
		int sec = calendar.get(Calendar.SECOND);
		System.out.println("날짜 : "+year+"/"+month+"/"+date+"\n시간 : "+hour+"/"+minute+"/"+sec);

		Calendar cal = (Calendar)calendar.clone(); // -> 클론하면 Object형태로 return
		cal.add(Calendar.YEAR, -9);		// 덧셈뺄셈 가능
		
		System.out.println(cal.getTime());
		
		// timezone
//		for(String name : TimeZone.getAvailableIDs()) {
//			System.out.println(name);
//		}
		TimeZone tz = TimeZone.getTimeZone("Etc/Greenwich");
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyy-MM-dd hh:mm:ss");
		sdf1.setTimeZone(tz);
		System.out.println(sdf1.format(calendar.getTime()));
		
		
		// 그래고리안
		// 윤년
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc.getTime());
		
		System.out.println(gc.get(GregorianCalendar.YEAR));
		System.out.println(gc.get(GregorianCalendar.MONTH)+1);
		System.out.println(gc.get(GregorianCalendar.DATE));
		
		gc.set(2018, 9-1, 18);
		System.out.println(gc.getTime());
	}
}
