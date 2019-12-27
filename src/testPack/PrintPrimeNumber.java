package testPack;

public class PrintPrimeNumber {
//public static boolean isPrime(int num)
//{
//	if(num<=1)
//	{
//		return false;
//	}
//	for(int i=2;i<num;i++)
//	{
//		if(num%i==0)
//		{
//			return false;
//		}
//	}
//	
//	return true;
//	
//}
public static void printPrimeNumbers(int num)
{
	for(int i=2;i<num;i++)
	{
		//if(isPrime(i))
		if(num%i!=0)
		{
			System.out.print(i+" ");
		}
	}
}
public static void main(String[] args)
{
	//System.out.println(isPrime(6));
	printPrimeNumbers(20);
}

}


