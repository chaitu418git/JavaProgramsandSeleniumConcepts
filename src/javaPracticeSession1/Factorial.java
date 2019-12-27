package javaPracticeSession1;

public class Factorial {
	public static int fact(int num)
	{
		int fact=1;
		while(num>0)
		{
			fact=fact*num;
			num--;
		}
		return fact;
	}
	public static void main(String args[])
		{
		System.out.println(fact(4)); 
}
	
}