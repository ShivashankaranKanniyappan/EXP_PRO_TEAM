package stepDefinition;

import io.cucumber.java.en.Then;

public class AHP03_Adactin_Logout extends baseClass_Shiva.BaseClass {

	@Then("Page should be logged out")
	public void page_should_be_logged_out() {
		findElementID("logout").click();
		getCurrentUrl();
	}
}
