package javaPrograms;

public class ArmstrongNumber {

	public static void isArmstrongNumber(int num)
	{
		int r;
		int cube = 0;
		int t;
		t=num;
		while (num>0)
		{
			r=num%10;
			num=num/10;
			cube=cube+(r*r*r);
		}
		if(t==cube)
		{
			System.out.println("is armstrong number");
		}
		else
		{
			System.out.println("is not armstrong number");
		}
	}
	public static void main(String[] args)
	{
		isArmstrongNumber(153);
	}
	
}
