package leaftaps.lead.test;

import org.testng.annotations.Test;

import com.wrappers.test.ProjectSpecificWrapper;

public class CreateContact extends ProjectSpecificWrapper {
	
	
	@Test
	public void creatingContact() throws Exception
	{
		//login();

		clickByLink("Contacts");
		clickByLink("Create Contact");
		enterById("firstNameField", "Gopinath");
		enterById("lastNameField", "Jayakumar");
		clickByName("submitButton");
		//closeBrowser();
	}
}
