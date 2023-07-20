package arraylistexample;


import java.util.*;

public class Example1 {
	
	

	public static void main(String[] args) {
		List<String> ls=new ArrayList<String>();
//		ls.add("gayathri");
//		ls.add("harsha");
//		ls.add("reenu");
		
		System.out.println("Enter values. Enter done to finish");
		Scanner sc =new Scanner(System.in);
		

		
		while(sc.hasNext())
		{
			String str = sc.nextLine();
			if(str.equals("done"))
			{
				break;
			}
			ls.add(str);
			
		}
		
		
		System.out.println(ls);
		ls.remove(1);
		System.out.println("list after deletion:"+ls);
		System.out.println("length :"+ls.size());
	
		Collections.sort(ls);
		System.out.println("after sorting:"+ls);
		
		
		for(int i=0;i<ls.size();i++)
		{
			System.out.println(ls.get(i));
		}
		System.out.println(" For each loop");
		for(String m:ls)
		{
			System.out.println(m);
		}
		
		System.out.println(" Print Iterator");
		Iterator<String> it=ls.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("list"+ls);
		

	}

}
