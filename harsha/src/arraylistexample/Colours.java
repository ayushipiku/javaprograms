package arraylistexample;

import java.util.*;

public class Colours {
	
	Scanner sc =new Scanner(System.in);
	List<String> ls=new ArrayList<String>();
	public  void display(){
		

        System.out.println("Colors in the collection: Enter done to finish ");
    
		
		while(sc.hasNext())
		{
			String str = sc.nextLine();
			if(str.equals("done"))
			{
				break;
			}
			else
			ls.add(str);
			
		}
        for (String color : ls) {
        System.out.println(color);
        }
    }
	public void index()
	{
		System.out.println("Size of the ArrayList is "+ls.size());
		System.out.println("Enter the index");
		int i=sc.nextInt();
		
		System.out.println(ls.get(i));
		
		
		
	}
	
	public void remove()
	{
		ls.remove(3);
		System.out.println("Index 3 color removed");
	}
	
	public void search()
	{
		String str;
		System.out.println("Enter the color to be searched");
		str = sc.next();
		if(ls.contains(str))
		{
			System.out.println("Element is present");
		}
		else
		{
			System.out.println("Element is not present");
		}
	}
	
	public static void main(String[] args) {
		Colours obj=new Colours();
		obj.display();
		obj.index();
		obj.remove();
		obj.search();
    }





		

}
		
