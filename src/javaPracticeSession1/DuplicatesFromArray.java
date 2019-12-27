package javaPracticeSession1;

public class DuplicatesFromArray {

	public static void main(String[] args) {
		
int[] a1= {123,143,456,123,456,789};
for(int i=0;i<a1.length;i++)
{
	for(int j=1;j<a1.length;j++)
	{
		if(a1[i]==a1[j]&&(i!=j))
		{
			System.out.println(a1[j]);
		}
	}
}
	}

}
