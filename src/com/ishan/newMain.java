package com.ishan;

import com.ishan.test.student;

public class newMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s=new student();
		//Accessing public variable (different package)
		s.rollno=s.rollno+10;
		System.out.println(s.rollno);
	}

}
