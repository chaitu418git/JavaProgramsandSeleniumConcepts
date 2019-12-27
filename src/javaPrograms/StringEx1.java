package javaPrograms;

public class StringEx1 {
	public static void main(String[] args) {
		String original="string";
		String reverse="";
		for(int i=original.length()-1;i>=0;i--)
		{
			reverse=reverse+original.charAt(i);
		}
	System.out.println(reverse);
	}
	
}
