package testPack;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableEx1 {
public static void main(String[]args)
{
	Hashtable<Integer, String> ht=new Hashtable<Integer, String>();
	ht.put(1, "chaitu");
	ht.put(2, "teju");
	ht.put(3, "king");
	System.out.println(ht);
	Enumeration<String> s = ht.elements();
	while(s.hasMoreElements())
	{
		System.out.println(s.nextElement());
	}
}
}
