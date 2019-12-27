package testPack;

public class MatchFirstTwodigits {
public static void main(String[]args)
{

	int[] a={4576,8897,7879,9887,9987,9873};
	for(int i=0;i<a.length;i++)
	{
		String s=String.valueOf(a[i]);
		if(s.charAt(0)==s.charAt(1))
		{
			System.out.println(a[i]);
		}
	}


}
}
