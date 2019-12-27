package testPack;

public class PrintDigitsFromString {
public static void main(String[] args)
{
	String s="abgd5376bvn1s";
	String digits="";
	int sum=0;
	for(int i=0;i<s.length();i++)
	{
		if(Character.isDigit(s.charAt(i)))
		{
			digits=digits+s.charAt(i);
			sum=sum+Integer.parseInt(String.valueOf(s.charAt(i)));
			
		}
	}
	System.out.println(digits);
	System.out.println(sum);
}
}
