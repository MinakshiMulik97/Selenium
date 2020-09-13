package package1;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class studentSaveDemo 
{
	public static void main(String[] args) throws Exception 
	{
		Student s=new Student();
		s.name = "Minakshi";
		s.dept = "CS";
		s.roll = 1;
		s.per = 63.18;
		
		FileOutputStream fos=new FileOutputStream("sData.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(s);
		oos.close();
		System.out.println("App end");
	}
}
