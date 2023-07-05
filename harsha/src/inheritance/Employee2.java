package inheritance;

public class Employee2 extends Employee1 {
	float total;
	public void totalSalary()
	   {
		 total=basicpay+hra-pf-reduction+bonus;
	   }
	public void salarySlip()
	 {  System.out.println("salary slip5");
	    System.out.println("basic pay is:"+basicpay);
	    System.out.println("basic deduction is:"+reduction);
		System.out.println("basic bonus is:"+bonus);
		System.out.println("hra is:"+hra); 
		System.out.println("pf is:"+pf);
		System.out.println("total salary is:"+total);
	 }

	public static void main(String[] args) {
		Employee2 obj=new Employee2();
		obj.getDetails();
		obj.calculation();
		obj.totalSalary();
		obj.salarySlip();
		// TODO Auto-generated method stub

	}

}
