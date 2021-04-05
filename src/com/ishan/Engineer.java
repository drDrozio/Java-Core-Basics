package com.ishan;

import com.ishan.test.student;

public class Engineer extends student
{
	public void acc()
	{
		//Accessing pubic variable - 
		System.out.println(rollno);
		//Accessing protected variable through inheritance
		marks=marks+10;
		System.out.println(marks);
		//Accessing default variable through inheritance
		//System.out.println(grade); //grade is hidden. Therefore error
		
	}
}
