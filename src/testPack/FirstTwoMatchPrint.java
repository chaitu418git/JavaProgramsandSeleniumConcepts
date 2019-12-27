package testPack;

public class FirstTwoMatchPrint {
public static void main(String args[])
{
	int a[]= {1234,1123,4567,8876};
	for(int i=0;i<a.length;i++)
	{
	String s1=String.valueOf(a[i]);
	if(s1.charAt(0)==s1.charAt(1))
	{
		System.out.println(a[i]);
	}
	}
}
}
