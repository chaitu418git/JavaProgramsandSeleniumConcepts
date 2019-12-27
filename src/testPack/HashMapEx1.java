package testPack;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapEx1 {

	public static void main(String[] args) {
		Employee e1=new Employee("chaitu", 25, "Admin");
		Employee e2=new Employee("ravi", 26, "Dev");
		Employee e3=new Employee("test", 26, "QA");
		HashMap<Integer, Employee> hm=new HashMap<Integer, Employee>();
		hm.put(1, e1);
		hm.put(2, e2);
		hm.put(3, e3);
	//printing values and keys using for each loop
		for(Entry<Integer, Employee> m:hm.entrySet())
		{
			m.getKey();
			Employee emp=m.getValue();
			System.out.println("Employee "+m.getKey()+"Info");
			System.out.println(emp.name+" "+emp.age+" "+emp.dept);
		}

	}

}
