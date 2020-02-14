package javaConcepts;

public class Son extends InheritanceGrandFather {

	public static void main(String[] args) {
		Son s=new Son();
		s.area();
		s.country();
		s.myage();
		InheritanceGrandFather gf=new InheritanceGrandFather();
		gf.area();
		gf.country();
		//Son s1=new InheritanceGrandFather();
		InheritanceGrandFather gf1=new Son();
		

	}
	public void myage()
	{
		System.out.println("27");
	}

}
