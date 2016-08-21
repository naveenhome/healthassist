package tests;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import healthassist.Prescription;
import healthassist.PrescriptionBLL;
import junit.framework.TestCase;

public class CucumberSteps extends TestCase {
	Prescription prescription; 
	@Given("^user enter patient as \"([^\"]*)\" doctor as \"([^\"]*)\" visited on \"([^\"]*)\" at \"([^\"]*)\" and file name \"([^\"]*)\" for \"([^\"]*)\"$")
	public void user_enter_patient_as_doctor_as_visited_on_at_and_file_name_for(String patient, String doctor, String visitDate, String visitTime, String fileName, String reason) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		prescription = new Prescription();
		prescription.setPatient(patient);
		prescription.setDoctor(doctor);
		prescription.setVisitDate(visitDate);
		prescription.setVitisTime(visitTime);
		prescription.setFileName(fileName);
		prescription.setReason(reason);
		
	}

	@When("^click on \"([^\"]*)\"$")
	public void click_on(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Then("^message get displayed \"([^\"]*)\"$")
	public void message_get_displayed(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		PrescriptionBLL obj = new PrescriptionBLL();
		assertEquals(arg1, obj.savePrescription(prescription));
	}

	@Then("^Also display \"([^\"]*)\" button$")
	public void also_display_button(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	}

}
