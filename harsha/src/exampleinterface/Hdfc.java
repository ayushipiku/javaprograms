package exampleinterface;

public class Hdfc implements RBI {
	
	    
	    public double recurringDeposit(double amt, int duration) {
	    
	   	
	    double totalAmount = amt * (1 + interestRate) * duration;
	    return totalAmount;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hdfc obj=new Hdfc();
		double amt=obj.recurringDeposit(1000.0, 12);
		System.out.println("Total amt is:"+amt);
		
	}

}
