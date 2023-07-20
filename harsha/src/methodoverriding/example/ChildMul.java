

package methodoverriding.example;


public class ChildMul extends ParentSum {
	public void opeartion(int num1,float num2)
	{
		float res;
		res=num1*num2;
		System.out.println("Product is "+res);
	}
	public void display()
	{
		print();
		super.opeartion(50, 60);
		
		System.out.println("Child class method");
		
	}
	

	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		/*ParentSum obj = new ParentSum();
//		float res = obj.opeartion(10, 15.5f);
//		System.out.println(res);
//		ChildMul obj1=new ChildMul();
//		System.out.println(obj1.opeartion(100, 200));*/
//		ChildMul  obj=new ChildMul();
//		obj.opeartion(10, 50);
//		obj.display();
//		
//		
//		
//	
//
//	}

}
