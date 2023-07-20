package exceptionhandlingexample;

public class ExceptionThrowExample {
	
	public void calculation(int n1,int n2)
	
	{
		try{
		    int result;
			result=n1+n2;
			System.out.println("RESULT IS:"+result);
			if(result>=50)
			{
				throw new ArithmeticException();
				
			}
		
	}
		catch(ArithmeticException e)
		{
			System.out.println("ADDITION NOT POSSIBLE");
		}
		finally
		{
			System.out.println("FINALLY BLOCK EXECUTED");
		}
		System.out.println("end");
		
	}
	

	public static void main(String[] args) {
		ExceptionThrowExample  obj=new ExceptionThrowExample ();
		obj.calculation(100,25);
		
		

	}

}
