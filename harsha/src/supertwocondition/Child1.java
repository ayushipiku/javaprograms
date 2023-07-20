package supertwocondition;



public class Child1 extends Parent {
	int number;
	public void print(int num)
	{
		
		super.number=num;
		//super.displayParent();
		//number=num;
		
	}
	public void printChild()
	{
		System.out.println("Child class number is:"+number);
		 System.out.println("parent class number is:"+super.number);
		
	}
	
	

	public static void main(String[] args) {
		Child1 obj= new Child1();
		obj.print(20);
		obj.displayParent();
		
		obj.printChild();
		// TODO Auto-generated method stub
		

	}

}