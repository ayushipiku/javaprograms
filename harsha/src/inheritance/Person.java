package inheritance;

public class Person extends CompanySalary {
	int id;
	String name;
	public void display(int num,String nam)
	{
		id=num;
		name=nam;
		//print();
		System.out.println("company name:"+cmpName);
		System.out.println("employee id:"+id);
		System.out.println("employee name:"+name);
		
	}

	public static void main(String[] args) {
		Person obj=new Person();
		obj.print("obsqura");
		obj.display(20,"gayathri");
		// TODO Auto-generated method stub

	}

}
