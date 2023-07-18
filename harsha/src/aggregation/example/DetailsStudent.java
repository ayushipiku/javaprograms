package aggregation.example;

public class DetailsStudent {

	public static void main(String[] args) {
		
		StudentExample objStd=new StudentExample();
		objStd.setName("gayathri");
		objStd.setRollNumber(20);

	StudentAddress m=new StudentAddress("gopivilas",110,objStd);
	m.print();
	}
	
	
	
	 
	
	
	

}
