package javaPrograms;

public class Palindrome {
public static void checkPalindromeNumber(int num)
{
	int r=0;
	int sum=0;
	int t;
	t=num;
	while(num>0)
	{
		r=(num%10);
		sum=(sum*10)+r;
		num=num/10;
	}
	if(t==sum)
	{
		System.out.println("plaindrome");
	}
	else
	{
		System.out.println("not plaindrome");
	}
}
public static void main(String[] args)
{
	checkPalindromeNumber(151);
}
}
