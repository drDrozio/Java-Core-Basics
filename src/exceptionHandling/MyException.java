package exceptionHandling;

public class MyException extends Exception 
{
	public MyException(String s)
	{
		super(s); //Send string to Exception class
	}
}
