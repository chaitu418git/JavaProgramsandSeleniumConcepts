package javaPracticeSession1;

import javaPrograms.PrimeNumber;

public class ReverseNumber {
	public void revNumber(int num)
	{
		int r=0;
		int sum=0;
		int t=num;
		while(num>0)
		{
			r=(num%10);
			sum=(sum*10)+r;
			num=(num/10);			
		}
		System.out.println("reverse of a num"+sum);
		
	}
	public static void main(String[] args) {
	ReverseNumber rn=new ReverseNumber();
	rn.revNumber(789);
	}
	}

