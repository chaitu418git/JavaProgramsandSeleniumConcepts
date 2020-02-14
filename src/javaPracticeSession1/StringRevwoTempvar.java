package javaPracticeSession1;

public class StringRevwoTempvar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="abcd";
for(int i=s.length()-1;i>=0;i--)
{
	s=s+s.charAt(i);
}
s=s.substring(s.length()/2,s.length());
System.out.println(s);
	}

}
