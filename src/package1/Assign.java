package package1;


import java.util.ArrayList;
import java.util.HashSet;

public class Assign 
{

	public static void main(String[] args) 
	{
		ArrayList<String> l = new ArrayList<String>();
		l.add("abc");
		l.add("pqr");
		l.add("xyz");
		l.add("mno");
		System.out.println(l);
		
		HashSet<String> h = new HashSet<String>(l);

		for(Object i:h)
		{
			System.out.println(i);
		}
	}
	
	

}
