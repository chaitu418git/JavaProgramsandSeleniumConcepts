package javaPrograms;

public class StringEx2 {
	public static void main(String[] args) {
		String s="stri1n2g3";
		String digits="";
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			if(Character.isDigit(s.charAt(i)))
			{
				digits=digits+s.charAt(i);
				sum=sum+Integer.parseInt(s.charAt(i) + "");
				//sum=sum+Integer.parseInt(s.charAt(i));	
			}
		}
	System.out.println(digits);
	System.out.println(sum);
	}
}
