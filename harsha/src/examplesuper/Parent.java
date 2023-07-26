package examplesuper;

public class Parent {
	int num;
	public void display(String hname)
	{
		System.out.println("House name");
	}
	public Parent(int a)
	{
		num=a;
		System.out.println("Super keyword:"+num);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
