package seleniumPracticePgms;

import com.test.utility.Xls_Reader;

public class DataDrivenTestProvisioningForm {
public static void main(String []args)
{
	Xls_Reader reader=new Xls_Reader("E:\\New Selenium\\MyNewProject\\src\\com\\testData\\ProvisioingFormData.xlsx",0);
    String accountname=reader.getCellData("provisioningdata", "AccountName", 2);
    System.out.println(accountname);
    
}
}
