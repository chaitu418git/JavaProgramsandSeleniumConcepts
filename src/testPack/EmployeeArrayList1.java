package testPack;

import java.util.ArrayList;

public class EmployeeArrayList1 {

	public static void main(String[] args) {
		Employee e1=new Employee("chaitu", 25, "Admin");
		Employee e2=new Employee("ravi", 26, "Dev");
		Employee e3=new Employee("test", 26, "QA");
		ArrayList<Employee> al=new ArrayList<Employee>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		System.out.println(al);
		for(int i=0;i<al.size();i++)
		{
			Employee emp=al.get(i);
			System.out.println(emp.name+" "+emp.age+" "+emp.dept);
//			System.out.println(emp.age);
//			System.out.println(emp.dept);
		}
	}

}
