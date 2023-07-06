package multilevel.inheritance;

public class Alto extends Car {
	public void displayAlto()
	{
		System.out.println("Alto");
	}
	
	

	public static void main(String[] args) {
		Alto obj=new Alto();
		obj.printVeh();
		obj.viewCar();
		obj.displayAlto();
		
		
		
		// TODO Auto-generated method stub

	}

}
