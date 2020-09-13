package package1;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadDemo 
{
	public static void main(String[] args) 
	{
		FileInputStream fis = null;
		try
		{
			fis = new FileInputStream("eData.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object o = ois.readObject();
			ois.close();
			Employee e=null;
			if (o instanceof Employee)
			{
				e = (Employee)o;
				System.out.println("Name: "+e.name+", Id: "+e.id+", Department: "+e.dept+", Salary: "+e.sal);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
