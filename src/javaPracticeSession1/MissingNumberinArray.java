package javaPracticeSession1;

public class MissingNumberinArray {
public static void main(String[]args)
{
	int[]a1= {1,2,4,5,6};
	for(int i=0;i<a1.length;i++)
	{
		for(int j=0;j<a1.length;j++)
		{
		if(a1[1]!=a1[j])
		{
			System.out.println(a1[i]);
		}
	}
}
}
}
