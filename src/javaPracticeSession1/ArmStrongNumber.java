package javaPracticeSession1;

public class ArmStrongNumber {
	public static void isArmstrongNumber(int num)
		{
	int r=0;
	int cube=0;
	int t=num;
	while(num>0)
	{
	r=(num%10);
	num=num/10;
	cube=cube+(r*r*r);
	}
	if(t==cube)
	{
		System.out.println("Given num is Armstrong Number");
	}
	else
	{
		System.out.println("Given num is not Armstrong number");
	}
		}
	public static void main(String[]args)
	{
		ArmStrongNumber amnum=new ArmStrongNumber();
		amnum.isArmstrongNumber(151);
	}
}
