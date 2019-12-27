package javaPracticeSession1;

public class PrintingSum {

	public static void main(String[] args) {
		String s="84125631";
		//String s1="";
		for(int i=0;i<s.length();i++)
		{
			//s1=String.valueOf(s.charAt(i));
			for(int j=1;j<s.length();j++)
			{
			if(Integer.parseInt(String.valueOf(s.charAt(i)))+Integer.parseInt(String.valueOf(s.charAt(j)))==9)
						
				{
					System.out.println(s.charAt(i)+"i index :"+i+s.charAt(j)+"and j index :"+j);
				}
			}
		}

	}

}
