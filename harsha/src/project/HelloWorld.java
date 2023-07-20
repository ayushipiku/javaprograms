package project;

public class HelloWorld
{
	public void display(int n)
	{
		int i=1;
		
		while(i<=n)
		{
		System.out.println(i);
		i++;
		}
		
	}
	public void view()
	{
		System.out.println("sample program");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		HelloWorld obj=new HelloWorld();
		
		obj.display(10);
		obj.view();
	}

}
