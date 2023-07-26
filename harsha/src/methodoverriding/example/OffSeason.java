package methodoverriding.example;

import java.util.Scanner;

public class OffSeason extends OnSeason {
	int total;
	float discount;
	public void discount()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the total amt");
		int total=sc.nextInt();
		discount=.15f*total;
		System.out.println(" Off Season Discounted amt is:"+discount);
		
		
				
	}

	public static void main(String[] args) {
		OnSeason obj;
		obj=new OnSeason();
		obj.discount();
		obj=new OffSeason();
		obj.discount();
		
		// TODO Auto-generated method stub
		

	}

}
