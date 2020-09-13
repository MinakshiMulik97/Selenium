package package1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Assign2 
{

	public static void main(String[] args) 
	{
		HashSet<Integer> s=new HashSet<>();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		System.out.println(s);
		
		ArrayList<Integer> a1=new ArrayList<>(s);
		
		for(Object i:a1)
		{
			System.out.println(i);
		}
	}

}
