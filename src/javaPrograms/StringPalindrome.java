package javaPrograms;

public class StringPalindrome {
	public static void main(String[] args)
	{
String s="aba";
String reverse=" ";
for (int i=s.length()-1;i>=0;i--)
{
	reverse=reverse+s.charAt(i);
}
if (reverse==s)
{
	System.out.println("given string is palindrome");
}
else
{
	System.out.println("given string is nor plaindrome");
}
	}
}
