package javaPracticeSession1;

public class CommonElementsFromArray {
public static void main(String []args)
{
int a1[]= {123,345,908,76};
int a2[]= {854,123,76,5623,8954};
for(int i=0;i<a1.length;i++)
{
	for (int j=0;j<a2.length;j++)
	{
		if(a1[i]==a2[j])
		{
			System.out.println(a1[i]);
		}
	}
}

	
	
}
}
