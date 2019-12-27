package testPack;

public class ArmStrongNumber {
public static void isArmstrongNumber(int num)
{
	int r=0;
	int cube=0;
	int t=num;
	while(num>0)
	{
		r=num%10;
		num=num/10;
		cube=cube+(r*r*r);
	}
	if(t==cube)
	{
		System.out.println("Armstrong");
	}
	else
	{
		System.out.println("not armstrong");
	}
}
public static void main(String[] args)
{
	isArmstrongNumber(153);
}
}
