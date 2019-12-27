package testPack;

public class RemoveDuplicatesFromString {
	public static void main(String[]args)
	{
		String s="abbacghdd";
		String s1="";
		for(int i=0;i<s.length();i++)
{
	if(!s1.contains(String.valueOf(s.charAt(i))))
	{
		s1=s1+String.valueOf(s.charAt(i));
	}
}
		System.out.println(s1);
}
}