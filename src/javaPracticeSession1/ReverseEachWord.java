package javaPracticeSession1;

public class ReverseEachWord {
public static void main(String[]args)
{
	String word="this is core java";
	String[] s = word.split(" ");
	System.out.println(s.length);
	String reverseString="";
	for(int i=0;i<s.length;i++)
	{
		String s1=s[i];
		System.out.println(s1);
		String reverseWord="";
		for(int j=s1.length()-1;j>=0;j--)
		{
			reverseWord=reverseWord+s1.charAt(j);
		}
		reverseString=reverseString+reverseWord+" ";
	}
	System.out.println(reverseString);
}
}
