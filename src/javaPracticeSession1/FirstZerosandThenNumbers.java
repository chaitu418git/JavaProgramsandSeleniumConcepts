package javaPracticeSession1;

import java.util.Arrays;

public class FirstZerosandThenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] array= {1,0,0,2,3,0};
int counter=array.length-1;
for(int i=array.length-1;i>=0;i--)
{
if(array[i]!=0)
{
	array[counter]=array[i];
	counter--;
}

}
System.out.println(counter);
while(counter>=0)
{
	array[counter]=0;
	counter--;
}
System.out.println(Arrays.toString(array));
	}

}
