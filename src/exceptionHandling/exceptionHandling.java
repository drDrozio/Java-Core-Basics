package exceptionHandling;

public class exceptionHandling {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
//		//Exception -> RuntimeException -> ArithmeticException
//		try {
//			int a[]=new int[5];
//			System.out.println(a[6]);//
//			int i=69;
//			int j=10;//
//			int k=i/j;
//			System.out.println("k is " + k);
//		}
//		catch(ArithmeticException ae) //Executes when try block throws an error. Exception object is created.
//		{
//			System.out.println("Arithmetic Error");
//		}
//		catch(ArrayIndexOutOfBoundsException aio)
//		{
//			System.out.println("Array Index Out of Bound");
//		}
//		catch(Exception e)
//		{
//			System.out.println("Error");
//		}
//		finally //Executes irrespective of error caught or not
//		{
//			System.out.println("Code Execution Status : Done");
//		}
		
		//User Defined Exception
		int i,j;
		i=0; //
		j=10;
		try 
		{
			int k=i/j;
			if(k==0)
				throw new MyException("because i dont like 0");
			System.out.println(k);
		}
		catch(MyException me)
		{
			System.out.println("Error : " + me.getMessage());
		}

	}

}
