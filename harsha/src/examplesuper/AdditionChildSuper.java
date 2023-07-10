package examplesuper;

class AdditionChildSuper extends AdditionSuperExample {
	
	public AdditionChildSuper(int num1,int num2)
	{
	super(num1,num2);
	
	}
	
	public void divisible()
	 {  
		//addition();
		if(sum%10==0)
		{
			System.out.println("Divisible");
		}
		else
		{
			System.out.println("Not divisible");
		}
		
	}
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
    AdditionChildSuper obj= new AdditionChildSuper(10,20);
    int sum= obj.addition();
    obj.divisible();
	}

}
