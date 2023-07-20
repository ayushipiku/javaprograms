package exampleinterface;

public class InterfaceClass implements Sample3 {
	int n;
	public int display1()
	{
		System.out.println("interface method");
		return 0;
	}
	public void print(int b)
	{
		b+=MIN;
		System.out.println("interface method 1:"+b);
	}
	public void display()
	{
		System.out.println("interface method 2");
	}
	public void display2()
	{
		int c=MAX-5;
		System.out.println("interface 3:"+c);
	}


public static void main(String[]args)
{
	InterfaceClass obj=new InterfaceClass();
	obj.display();
	obj.display1();
	obj.print(20);
	obj.display2();
			
}
}
