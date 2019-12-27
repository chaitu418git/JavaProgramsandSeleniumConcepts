package testPack;

public class RemoveDupFromString {
public static void main(String args[])
{
	String s="aabbccddh";
	String s1="";
	for (int i=0;i<s.length();i++)
	{
		if(!s1.contains(String.valueOf(s.charAt(i))))
				{
			s1=s1+s.charAt(i);
				}
	}
	System.out.println(s1);
	
}
}
