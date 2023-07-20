package exceptionhandlingexample;

public class Example {
	public void operationDiv(int n1,int n2) throws ArithmeticException,ArrayIndexOutOfBoundsException
	{
		
		int res;
		int[]arr=new int[5];
		try {
			res=n1/n2;
			System.out.println("RESULT:"+res);
			for(int i=0;i<=arr.length;i++)
			{
				arr[i]=i+1;
				System.out.println("arr[i]");
			}
			//System.exit(0); if we give this statement finally will not get executed
			}
		catch(ArithmeticException a)
		{
			System.out.println("division not possible");
		}
	
	    catch(ArrayIndexOutOfBoundsException b)
		{
		   System.out.println("ARRAY SIZE IS ONLY 5");	
		}
	   catch(Exception c)
		{
			System.out.println("EXCEPTION");
		}
		finally
		{
			System.out.println("finally block");
		}
		System.out.println("end");
}
        
	

	public static void main(String[] args) {
		Example obj=new Example();
		obj.operationDiv(100, 0);
		

	}

}
