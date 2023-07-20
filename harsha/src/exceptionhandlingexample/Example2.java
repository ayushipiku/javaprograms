package exceptionhandlingexample;

import java.io.IOException;

public class Example2 {
	int result;
	int[]arr=new int[5];
public void calculation(int n1,int n2) throws IOException
	
	{
	        result=n1+n2;
			System.out.println("RESULT IS:"+result);
			
			
			for(int i=0;i<=arr.length;i++)
			{
				arr[i]=i+1;
				System.out.println("arr[i]");
			}
			if(result>=50)
				
				throw new ArithmeticException();
				
			else
				throw new IOException();
			
			
				
	}
	
    public void display() throws IOexception, IOException
    {
	calculation(15,25);
	System.out.println("result is:"+result);
	}

	

	public static void main(String[] args) throws IOexception, IOException {
		Example2 obj=new Example2 ();
		try
		{
		obj.display();
		}
		catch(ArithmeticException m)
		{
			System.out.println("result>=50");
		}
		catch(ArrayIndexOutOfBoundsException n)
		{
			System.out.println("array size is 5");
		}
		
		

	}

}


	


