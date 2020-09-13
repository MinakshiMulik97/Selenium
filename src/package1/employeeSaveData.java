package package1;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class employeeSaveData 
{

	public static void main(String[] args)
	{
		Employee e=new Employee();
		
		e.name = "Minakshi";
		e.id = 101;
		e.dept = "IT";
		e.sal = 50000.20;
		
		FileOutputStream fos;  
		ObjectOutputStream oos;
		try 
		{
			fos = new FileOutputStream("eData.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(e);
			oos.close();
		} 
		catch (Exception e1) 
		{
			e1.printStackTrace();
		}
		
		System.out.println("Done changes");
		System.out.println("GitHub");
	}

}
