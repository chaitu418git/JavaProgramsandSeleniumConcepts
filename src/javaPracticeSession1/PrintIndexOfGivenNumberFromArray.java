package javaPracticeSession1;

public class PrintIndexOfGivenNumberFromArray {

public static void main(String []args)
{
	 int a[]= {1,2,3,4};
	 for(int i=0;i<a.length;i++)
	 {
		 if(a[i]==4)
		 {
			 System.out.println("index of 4 is: "+ i);
			 break;
		 }
	 }
}
}
