package methodoverriding.example;

import java.util.Scanner;

public class OnSeason {
	int total;
	float discount;
	public void discount()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the total amt");
		int total=sc.nextInt();
		discount=.040f*total;
		System.out.println("Discounted amt is:"+discount);
		
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
