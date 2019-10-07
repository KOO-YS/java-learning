package edu.ch17.collection.map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

public class TestProperties {
	public static void main(String[] args) {
		new TestProperties().testProperties2();
	}
	public void testProperties() {
		// 설정 파일의 값을 읽어서 애플리케이션에 적용할 때 사용
		Properties prop = new Properties();
		prop.setProperty("driver", "oracle.jdbc.driver.oracleDriver");
		prop.setProperty("url", "jdbc.oracle.thin:@127.0.0.1:1521:xe");
		prop.setProperty("user", "student");
		prop.setProperty("password", "student");
		
		System.out.println(prop);
		
		try {
			prop.store(new FileOutputStream("driver.dat"), "jdbc driver");
			prop.store(new FileWriter("driver.txt"), "jdbc driver");
			// XML 파일로 저장
			prop.storeToXML(new FileOutputStream("driver.xml"), "jdbc driver");
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void testProperties2() {
		// 파일로부터 읽어와서 Properties에 기록
		Properties prop = new Properties();
		try {
//			prop.load(new FileInputStream("drive.dat"));
			prop.loadFromXML(new FileInputStream("driver.xml"));
			System.out.println("driver : "+prop.get("driver"));
			System.out.println("url : "+prop.get("url"));
			System.out.println("user : "+prop.get("user"));
			System.out.println("password : "+prop.get("password"));
			
		} catch (InvalidPropertiesFormatException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
