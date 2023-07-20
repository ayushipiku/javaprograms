package aggregation.example;



public class StudentAddress {
	String houseName;
	int pin;
	StudentExample std;
	public StudentAddress(String name,int pin,StudentExample s)
	{
		 houseName=name;
		 this.pin=pin;
		 std=s;
		
		 
		 
	}
	public void print()
	{
		System.out.println("Name of student is:"+std.getName());
		System.out.println("Roll no of student is:"+std.getRollNumber());
		System.out.println("House name is:"+houseName);
		System.out.println("pin is:"+pin);
	}
	
}








