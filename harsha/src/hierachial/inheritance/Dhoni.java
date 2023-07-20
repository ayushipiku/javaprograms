package hierachial.inheritance;

public class Dhoni extends Cricket {
	public void displayDhoni()
	{
		System.out.println("Ipl Captain");
	}
	public static void main(String[] args) {
		Dhoni sc=new Dhoni();
		sc.displayDhoni();
		sc.player("Dhoni",38);
		
		// TODO Auto-generated method stub

	}

}
