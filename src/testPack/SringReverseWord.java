package testPack;

public class SringReverseWord {
public static void main(String args[])
{
	String s="This is java Program";
	String[]s1=s.split(" ");
	String reverseString="";
	for(int i=0;i<s1.length;i++)
	{
	String s2=s1[i];
	String reverseWord="";
	for(int j=s2.length()-1;j>=0;j--)
	{
		reverseWord=reverseWord+s2.charAt(j)+" ";
	}
	reverseString=reverseString+reverseWord+" ";
	}
	System.out.println(reverseString);
}
}
