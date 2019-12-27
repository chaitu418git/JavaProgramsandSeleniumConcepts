package javaPracticeSession1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx {
public static void main(String []args)
{
	Employee em1=new Employee();
	em1.Employee(98,"chaitu","IT");
	Employee em2=new Employee();
	em2.Employee(99,"axchaitu","IIIT");
	ArrayList<Employee>	 al=new ArrayList<Employee>();
	al.add(em1);
	al.add(em2);
	Iterator<Employee> itr=al.iterator();
	while(itr.hasNext())
	{
		Employee emp = itr.next();
		System.out.println(emp.rollno);
		System.out.println(emp.name);
		System.out.println(emp.dept);
	}
}
}
