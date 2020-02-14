package newpracticesession;

public class RepeatedLettersCountFromStraing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="Hyderabad";
String s1="";
int count=1;
for(int i=0;i<s.length();i++)
{
for(int j=i+1;j<s.length();j++)
{
	if(s.charAt(i)==s.charAt(j))
	{
		count++;
	}
	
}
System.out.println(s.charAt(i)+" "+count);
	}

}
}