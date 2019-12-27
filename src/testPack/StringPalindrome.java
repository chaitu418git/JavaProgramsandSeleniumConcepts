package testPack;

public class StringPalindrome {
public static void main(String[]args)
{
	String original="saas";
	String reverse="";
	for(int i=original.length()-1;i>=0;i--)
	{
		reverse=reverse+original.charAt(i);
	}
	System.out.println(reverse);
	if(reverse.equals(reverse))
	{
		System.out.println("plaindroe");
	}
	else
	{
		System.out.println("not palindrome");
	}
}
}
