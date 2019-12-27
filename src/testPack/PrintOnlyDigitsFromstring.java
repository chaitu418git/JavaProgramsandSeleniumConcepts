package testPack;

public class PrintOnlyDigitsFromstring {
	public static void main(String[] args) {
		String s="786hsdjsh1";
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
