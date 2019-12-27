package javaPracticeSession1;

import java.util.HashMap;
import java.util.Map.Entry;

public class MapEx1 {

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.Employee(12, "ravi","QA");
		Employee e2=new Employee();
		e2.Employee(13, "raja","Dev");
		HashMap<Integer, Employee> hm=new HashMap<Integer, Employee>();
		hm.put(1, e1);
		hm.put(2, e2);
		for(Entry<Integer, Employee> e: hm.entrySet())
          { 
	    Integer Key = e.getKey();
	    Employee emp = e.getValue();
	    System.out.println(emp.rollno);
	    System.out.println(emp.name);
	    System.out.println(emp.dept);
           }

	}

}
