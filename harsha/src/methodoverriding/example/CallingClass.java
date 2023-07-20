package methodoverriding.example;

import encapsulation.Example;

public class CallingClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentSum obj;
		
		obj = new ParentSum();
		obj.opeartion(10, 50);
		
		obj = new ChildMul();
		obj.opeartion(10, 50);
		
		Example obj2=new Example();
		obj2.setName("Gayathri");
		
		System.out.println(obj2.getName());
		obj2.setAge(20);
		System.out.println(obj2.getAge());

	}

}
