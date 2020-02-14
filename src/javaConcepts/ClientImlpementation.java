package javaConcepts;

public class ClientImlpementation implements ClientInterface {
public static void main(String []args)
{
	ClientImlpementation ci=new ClientImlpementation();
	ci.balCheck();
	ci.transferAmount();
	ci.updateBal();
	ci.successMessage();
	ClientInterface cint=new ClientImlpementation();
	cint.transferAmount();
}

@Override
public void transferAmount() {
	System.out.println("transfer amount");
	
}

@Override
public void balCheck() {
	// TODO Auto-generated method stub
	System.out.println("balcheck");
}

@Override
public void updateBal() {
	// TODO Auto-generated method stub
	System.out.println("updtebal");
}
public void successMessage()
{
	System.out.println("success message");
}
}
