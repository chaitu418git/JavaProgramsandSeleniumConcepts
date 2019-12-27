package testPack;

import java.util.ArrayList;

public class ArrayListEx {
public static void main(String args[])
{
	ArrayList list=new ArrayList();
	list.add(1);
	list.add(5);
	list.add(2);
	list.add("test");
	list.add(true);
for(int i=0;i<list.size();i++)
{
//	System.out.println(list.get(i));
}

ArrayList list1=new ArrayList();
list1.add("list1");
list1.add(55);
list1.add(true);

ArrayList list2=new ArrayList();
list2.add("list2");
list2.add(99);
list2.add(false);

list1.addAll(list2);
for(int j=0;j<list1.size();j++)
{
System.out.println(list1.get(j));
}
list1.removeAll(list2);
System.out.println("-------------");
for(int j1=0;j1<list1.size();j1++)
{
System.out.println(list1.get(j1));
}


//how to print common elements using array list:
ArrayList list5=new ArrayList();
list5.add(2);
list5.add("test");
list5.add(true);

ArrayList list6=new ArrayList();
list6.add(32);
list6.add("test");
list6.add(false);

list5.retainAll(list6);
System.out.println("retain all");
for(int j2=0;j2<list5.size();j2++)
{
System.out.println(list5.get(j2));
}
}
}
