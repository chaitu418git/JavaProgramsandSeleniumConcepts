package javaPracticeSession1;

public class Checkfact {

	public static void isFact(int num)
	{
		int i=2;
		while(num>1)
		{
			if(num%i==0)
			{
				num=num/i;
			}
			else
			{
				break;
			}
			i=i+1;
		}
		if(num>1)
		{
			System.out.println("not a fact of any muner");
		}
		else
		{
			System.out.println(i-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
isFact(120);
	}

}
