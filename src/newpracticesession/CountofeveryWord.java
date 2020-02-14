package newpracticesession;

public class CountofeveryWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="this is core java";
String[] words = s.split(" ");
for(int i=0;i<words.length;i++)
{
	String s1="";
	String word=words[i];
	for(int j=0;j<word.length();j++)
	{
		s1=s1+word.charAt(j);
		
	}
	System.out.println(s1+" "+s1.length());
}
	}

}
