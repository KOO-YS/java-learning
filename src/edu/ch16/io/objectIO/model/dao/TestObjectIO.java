package edu.ch16.io.objectIO.model.dao;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import edu.ch16.io.objectIO.model.vo.Member;

public class TestObjectIO {
	public void fileSave() {
		Member[] mar = {
				new Member("user01","pass01","name","asd@gmail.com",20,'F'),
				new Member("user02","pass02","name","asd@gmail.com",20,'M'),
				new Member("user03","pass03","name","asd@gmail.com",20,'M')
		};
		try (ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream("member.dat"));){
			for(int i=0; i<mar.length; i++) {
				objOut.writeObject(mar[i]);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
