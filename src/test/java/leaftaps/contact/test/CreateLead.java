package leaftaps.contact.test;

import org.testng.annotations.Test;

import com.wrappers.test.ProjectSpecificWrapper;


public class CreateLead extends ProjectSpecificWrapper {
	
	@Test(dataProvider="fetchData")
	public void creatingLead(String Cname,String Uname,String Lname,String Email,String Mnumber) throws Exception
	{
		//login();
		clickByLink("Leads");
		clickByLink("Create Lead");
		enterById("createLeadForm_companyName",Cname);
		enterById("createLeadForm_firstName", Uname);
		enterById("createLeadForm_lastName", Lname);	
		enterById("createLeadForm_primaryEmail", Email);
		enterById("createLeadForm_primaryPhoneNumber", Mnumber);
		clickByName("submitButton");
		//closeBrowser();
	}

	
}
