package javaPracticeSession1;

public class RemoveNumFromString {
public static void main(String []args)
{
	 String s="abcd1234uii1";
	 String s1="";
	 int sum=0;
	 for(int i=0;i<s.length();i++)
	 {
		 if(Character.isDigit(s.charAt(i)))
		 {
			s1=s1+s.charAt(i);
			sum=sum+Integer.parseInt(String.valueOf(s.charAt(i)));
		 }
	 }
	 System.out.println(s1);
	 System.out.println(sum);
	 
}
}
