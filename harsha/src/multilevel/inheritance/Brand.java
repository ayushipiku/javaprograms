package multilevel.inheritance;

 public class Brand extends Vehicle {
   

	public Brand(String brand) {
	super(brand);
	
	}

	int numOfWheels;

    public void wheel(int numOfWheels)
    {
        
        this.numOfWheels = numOfWheels;
        System.out.println("Number of Wheels: " + numOfWheels);
    }

    
}

