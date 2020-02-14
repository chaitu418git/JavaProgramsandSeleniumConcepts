package javaPracticeSession1;

import java.util.Date;


public class SimpleDateFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Date d=new Date();
System.out.println(d.toString());
java.text.SimpleDateFormat sdf=new java.text.SimpleDateFormat("M/dd/yyyy");
java.text.SimpleDateFormat sdf1=new java.text.SimpleDateFormat("M/dd/yyyy h:mm:ss");
System.out.println(sdf.format(d));
System.out.println(sdf1.format(d));
	}

}
