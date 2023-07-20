package multilevel.inheritance;

public class Alto extends Brand {
	
	    int numOfSeats;
	    String colour;

	    public Alto(String brand, int numOfWheels, String colour, int numOfSeats) {
		super(brand);
		this.numOfSeats = numOfSeats;
		this.colour=colour;
	    System.out.println("Number of Seats: " + numOfSeats);
		System.out.println("Colour: " + colour);
																    }

	   
	

    public static void main(String[] args) {
    	 Alto obj = new  Alto("Maruti", 4,"Red",4);
    	           
        obj.wheel(4);  
           
    }
}