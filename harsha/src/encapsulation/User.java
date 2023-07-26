package encapsulation;

import java.util.Scanner;

public class User {
	
	Bank obj1,obj2,obj3;
	
	public void setPin()
	{
		obj1 = new Bank();
		obj1.setPin(1001);
		
		obj2= new Bank();
		obj2.setPin(1234);
		
		obj3= new Bank();
		obj3.setPin(1212);
		
	}
	
	public boolean validatePin(int pin)
	{
		
		if(obj1.getPin() == pin)
		{
			return true;
		}
		else if(obj2.getPin() == pin)
		{
			return true;
		}
		else if(obj3.getPin() == pin)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your pin");
		int pin = sc.nextInt();
		
		User obj = new User();
		obj.setPin();
		boolean b = obj.validatePin(pin);
		if(b==true)
		{
			System.out.println("Your PIN is valid");
		}
		else
		{
			System.out.println("Your PIN is invalid");
		}
		
		
	}

}
