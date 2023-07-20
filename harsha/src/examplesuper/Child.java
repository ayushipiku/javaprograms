package examplesuper;

public class Child extends Parent {
	public void print()
	{
		
		System.out.println("name is:"+num);
		System.out.println("gopivilas");
		
	}
	public Child(int b)
	{
		super(50);
		System.out.println("parent super constructor:"+b);
	}
	

	public static void main(String[] args) {
		Child obj= new Child(20);
		obj.print();
		obj.display("gayathri");
		// TODO Auto-generated method stub
		

	}

}