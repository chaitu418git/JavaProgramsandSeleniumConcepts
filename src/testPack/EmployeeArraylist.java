package testPack;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeArraylist {
	int rollno;
	String name;
	int age;
	public EmployeeArraylist(int rollno,String name,int age)
	{
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}
	public static void main(String args[])

	{
		EmployeeArraylist alist1=new EmployeeArraylist(12,"chaitu",25);
		EmployeeArraylist alist2=new EmployeeArraylist(13,"ravi",25);
		EmployeeArraylist alist3=new EmployeeArraylist(12,"hello",25);
		ArrayList<EmployeeArraylist> list=new ArrayList<EmployeeArraylist>();
		list.add(alist1);
		list.add(alist2);
		list.add(alist3);
		Iterator<EmployeeArraylist> itr = list.iterator();
		while(itr.hasNext())
		{
			EmployeeArraylist emp=itr.next();
			System.out.println(emp.rollno);
			System.out.println(emp.name);
			System.out.println(emp.age);
		}
		
}
}