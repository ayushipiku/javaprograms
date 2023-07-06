package multilevel.inheritance;

public class Child2 extends Child1 {
	public void view()
	{
		System.out.println("world");
		System.out.println("my name is:"+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child2 obj= new Child2();
		obj.print();
		obj.display("ayushi");
		obj.view();
		

		
	}

}
