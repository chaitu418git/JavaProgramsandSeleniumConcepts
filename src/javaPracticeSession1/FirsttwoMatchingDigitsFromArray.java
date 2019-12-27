package javaPracticeSession1;

public class FirsttwoMatchingDigitsFromArray {
public static void main(String[]args)
{
	int[] a= {123,456,446,231,556};
	//System.out.println(a[0]);
	//int s=;
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

