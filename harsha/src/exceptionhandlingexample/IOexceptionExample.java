package exceptionhandlingexample;

import java.io.IOException;

public class IOexceptionExample {
	int a,b,result;
	public void division(int x,int y) throws Exception
	{
		a=x;
		b=y;
		result=a+b;
		System.out.println("answer is:"+result);
		if(result>10)
			throw new ArithmeticException();
		else
			throw new IOException();
	}
	public void display() 
	{ 
		try
		{
			division(10,2);
		}
		catch(ArithmeticException e)
		{
			System.out.println("arithmetic exception found");
		}
		catch(IOException s) 
		{
			System.out.println("IO Exception");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally
		{
			System.out.println("finally block executed");
		}
	}
	

	public static void main(String[] args)
	{
		IOexceptionExample  obj=new IOexceptionExample ();
		obj.display();



	}

}
