package javaConcepts;

public class GrandSon extends Son{
	public static void main(String []args)
	{
		GrandSon gs=new GrandSon();
		gs.myage();
		gs.area();
		gs.country();
		Son s1=new GrandSon();
		s1.myage();
		s1.area();
		s1.country();
		InheritanceGrandFather igf=new GrandSon();
		igf.area();
		igf.country();
		
	}

}
