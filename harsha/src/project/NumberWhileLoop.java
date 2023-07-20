package project;

import java.util.Scanner;

public class NumberWhileLoop {
	
	Scanner sc = new Scanner(System.in);
	public void display()
	{
		int n=sc.nextInt();
		int i=1;
		while(i<=n)
		{
			System.out.println(i);
			i++;
		}
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		NumberWhileLoop obj=new NumberWhileLoop();
		obj.display();
	}

}
