package javaPrograms;

public class Checkfact {

	public static void isfact(int num)
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
			i+=1;
		}
		if(num>1)
		{
			System.out.println("given number is not factorial of any number");
		}
		else
		{
			System.out.println(i-1+" " +"is factorial of given number");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
isfact(24);
	}

}
