package testPack;

import java.util.Iterator;
import java.util.LinkedList;

import net.bytebuddy.dynamic.scaffold.MethodGraph.Linked;

public class LinkedListEx {
public static void main(String []args)
{
	LinkedList ll=new LinkedList();
	ll.add("hello");
	ll.add(12);
	ll.add(true);
	System.out.println("linked list elements are"+ll);
	ll.addFirst(10);
	ll.addLast("oyo");
	System.out.println("linked list elements are"+ll);
	System.out.println(ll.get(0));
	ll.set(0, "element");
	System.out.println(ll.get(0));
	ll.removeFirst();
	System.out.println(ll);
	ll.removeLast();
	System.out.println(ll);
	ll.remove(1);
	System.out.println(ll);
	
	//printing using for loop
	for(int i=0;i<ll.size();i++)
	{
		System.out.println(ll.get(i));
	}
	
	//for iterator:
	Iterator itr=ll.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
}
}