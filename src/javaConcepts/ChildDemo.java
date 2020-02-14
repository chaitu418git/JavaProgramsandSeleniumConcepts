package javaConcepts;



public class ChildDemo extends ParentDemo{
	String name="child";
	public ChildDemo()
	{
		super();
		System.out.println("child class construcotr");
		
	}
	public void getStringData()
	{
		System.out.println(name);
		System.out.println(super.name);
	}
public void getData() {
	
	System.out.println("child class method");
	super.getData();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChildDemo cd=new ChildDemo();
cd.getStringData();
cd.getData();
	}

}
