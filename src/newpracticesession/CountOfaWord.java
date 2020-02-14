package newpracticesession;

public class CountOfaWord {

	public static void main(String[] args) {
		String s="test management test";
		String[] word=s.split(" ");
		int count=0;
		for(int i=0;i<word.length;i++)
		{
			if(word[i].equals("test"))
			{
				count++;
			}
		}
System.out.println(count);
	}

}
