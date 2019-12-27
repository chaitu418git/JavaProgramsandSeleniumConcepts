package javaPrograms;

public class PringDuplicatesfromString {

	public static String removeDuplicates(String input){
	    String result = "";
	    for (int i = 0; i < input.length(); i++) {
	        if(!result.contains(String.valueOf(input.charAt(i)))) {
	    	//if(!result.contains(input.charAt(i))) {    
	    	result += String.valueOf(input.charAt(i));
	        }
	    }
	    return result;
	}
	public static void main(String[] args) {

		System.out.println(removeDuplicates("abbaccddg"));
		String s="abhj";
    for(int i=0;i<s.length();i++)
 {
		//System.out.println(String.valueOf(s.charAt(i)));
		System.out.println(s.charAt(i));
		}
	}
}
