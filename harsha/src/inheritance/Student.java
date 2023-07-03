package inheritance;

public class Student extends Department {
	public void printStd()
	{
		System.out.println("Student Details");
		System.out.println("Department"+num);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj=new Student();
		obj.displayDetails(100);
		obj.printStd();
		
		//Department s=new Department();
		

	}

}
