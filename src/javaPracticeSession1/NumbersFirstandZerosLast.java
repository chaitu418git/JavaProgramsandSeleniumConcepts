package javaPracticeSession1;

import java.util.Arrays;

public class NumbersFirstandZerosLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] array= {0,2,0,3,0,5};
int counter=0;
for(int i=0;i<array.length;i++)
{
	if(array[i]!=0)
	{
		array[counter]=array[i];
		counter++;
	}
}
System.out.println(counter);
while(array.length>counter)
{
	array[counter]=0;
	counter++;
}
System.out.println(Arrays.toString(array));
	}

}
