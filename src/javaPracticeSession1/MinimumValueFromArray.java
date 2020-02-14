package javaPracticeSession1;

public class MinimumValueFromArray {
	public static void main(String []args)
	{
		
		int abc[][]= {{9,2,3},{4,5,6},{1,4,6}};
		int min =abc[0][0];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(abc[i][j]<min)
					//to print max value
					// if(abc[i][j]>min)
				{
				min=abc[i][j];
			}
		}
			
}
		System.out.println(min);
}
}