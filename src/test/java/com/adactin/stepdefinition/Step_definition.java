package com.adactin.stepdefinition;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.adactin.baseclass.Base_Class;
import com.adactin.config.File_Reader_Managr;
import com.adactin.login.Login_file;
import com.adactin.login.Selection;
import com.adactin.runner.Runner;
import com.adactin.singelton_design.Project_Obj_Mngr;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class Step_definition extends Base_Class{
	
	
	public static WebDriver driver = Runner.driver;
	
	//Login_file lf = new Login_file(driver);
	//Selection sl = new Selection(driver); 
	
	Project_Obj_Mngr pom = new Project_Obj_Mngr(driver);
	
	//LoginPage
	@Given("User Launching the Hotel Booking Application")
	public void user_launching_the_hotel_booking_application() throws Throwable {
		//driver.get("https://adactinhotelapp.com/index.php");
		
		//@PROPERTIES
//		String url = File_Reader_Managr.getDataFR().getDataCR().Url();
		String url2 = File_Reader_Managr.getDataCR().Url();
		uRl(url2);
		
		System.out.println("User successfully launched the Application");

	}
	@When("User entering the valid {string} and {string}")
	public void user_entering_the_valid_and(String Username, String Password) {
		//@Scenario_OUTLine & @SingleTON_DESIGN
		
	    sendValues(pom.getInstance().getUsername(), Username);
	    sendValues(pom.getInstance().getPassword(), Password);
	}
	
	@When("User entering the valid Username and Password")
	public void user_entering_the_valid_username_and_password(DataTable datazzs) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		
	//@DATATABLE
	   List<String> row = datazzs.row(1);
	   sendValues(pom.getInstance().getUsername(), row.get(0));
	   sendValues(pom.getInstance().getPassword(), row.get(1));
	   
	    
	}
	@When("User Clicking the Login button")
	public void user_clicking_the_login_button() {
		clicKelement(pom.getInstance().getLogin());
	    
	}
	@Then("User validate the Username and Password then navigates to the Homepage")
	public void user_validate_the_username_and_password_then_navigates_to_the_homepage() {
		assertTrue(driver.getCurrentUrl().endsWith("com/SearchHotel.php"));
		System.out.println("User logged-in the Application ");
	    
	}
	
	//PAGE1
	@When("User selecting the Hotel Location")
	public void user_selecting_the_hotel_location() {
		seLection(pom.getInstance1().getLocation(), "byindex", "5");
	}

	@When("User selecting the Hotel")
	public void user_selecting_the_hotel() {
		seLection(pom.getInstance1().getHotels(), "byindex", "2");
	}

	@When("User selecting the selecting the Room Type")
	public void user_selecting_the_selecting_the_room_type() {
	    seLection(pom.getInstance1().getRoomtype(), "byindex", "4");
	}

	@When("User selecting the Number of Rooms")
	public void user_selecting_the_number_of_rooms() {
	    seLection(pom.getInstance1().getNumberfrooms(),"byindex","1");
	}

	@When("User selecting the Check-in Date")
	public void user_selecting_the_check_in_date() {
	    sendValues(pom.getInstance1().getCheckin(), "22/03/2022");
	}

	@When("User selecting the Check-out Date")
	public void user_selecting_the_check_out_date() {
	   sendValues(pom.getInstance1().getCheckout(), "23/03/2022");
	}

	@When("User selecting the Adults per Room")
	public void user_selecting_the_adults_per_room() {
	    seLection(pom.getInstance1().getAdults(), "byindex", "1");
	}

	@When("User selecting the Children per Room")
	public void user_selecting_the_children_per_room() {
	    seLection(pom.getInstance1().getChildren(), "byindex", "0");
	}

	@When("User clicking the search button")
	public void user_clicking_the_search_button() {
	    clicKelement(pom.getInstance1().getSearch());
	}

	@Then("User Validating the information of room details")
	public void user_validating_the_information_of_room_details() {
	    assertTrue(driver.getCurrentUrl().endsWith("com/SelectHotel.php"));
	    System.out.println("User selected the hotel details successfully");
	}
	
	
	
	
	
	
	
	
   //PAGE2
 
	@When("User goinng to select on the radio button")
	public void user_goinng_to_select_on_the_radio_button() {
		clicKelement(pom.getInstance().getRadio());
	}

	@When("User going to click on the continue button")
	public void user_going_to_click_on_the_continue_button() {
	    clicKelement(pom.getInstance().getContinuenext());
	}

	@Then("User Validating the information of the confirming details")
	public void user_validating_the_information_of_the_confirming_details() {
	    assertTrue(driver.getCurrentUrl().endsWith("com/BookHotel.php"));
	    System.out.println("User Successfully launched to Final Page");
	}
	
	
	//PAGE3
	@When("User going to entering the First Name")
	public void user_going_to_entering_the_first_name() {
	    sendValues(pom.getInstance().getFirstname(), "Sudharsun");
	}

	@When("User going to entering the Last Name")
	public void user_going_to_entering_the_last_name() {
	    sendValues(pom.getInstance().getLastname(), "S");
	}

	@When("User going to entering the Billing Address")
	public void user_going_to_entering_the_billing_address() {
	    sendValues(pom.getInstance().getAddress(), "Newyork,USA");
	}

	@When("User going to entering the Credit Card Number")
	public void user_going_to_entering_the_credit_card_number() {
	    sendValues(pom.getInstance().getCreditcard(),"8654663773656777");
	}

	@When("User going to select the Credit Card types")
	public void user_going_to_select_the_credit_card_types() {
	    seLection(pom.getInstance().getCredittype(), "","VISA");
	}

	@When("User going to select the Expiry Month")
	public void user_going_to_select_the_expiry_month() {
	    seLection(pom.getInstance().getMonth(), "byvalue", "12");
	}

	@When("User going to select the Expiry Year")
	public void user_going_to_select_the_expiry_year() {
	    seLection(pom.getInstance().getYear(), "byindex", "12");
	}

	@When("User going to entering the CVV Number")
	public void user_going_to_entering_the_cvv_number() {
	    sendValues(pom.getInstance().getCvvnumbr(), "373");
	}

	@When("User going to Click the Book Now button")
	public void user_going_to_click_the_book_now_button() {
	    clicKelement(pom.getInstance().getBooknow());
	}

	@Then("User Validating the information of the Booking details")
	public void user_validating_the_information_of_the_booking_details()  {
	    assertTrue(driver.getCurrentUrl().endsWith("com/BookingConfirm.php"));
	    System.out.println("User Booked the Hotel Successfully");
	    
	}
	
	//PAGE4 
	@When("User logouts the Site")
	public void user_logouts_the_site() throws InterruptedException {
		threadsl();
	   clicKelement(pom.getInstance().getLgout());
}

	@Then("User Validating the Logout Functionality")
	public void user_validating_the_logout_functionality() throws IOException {
	   assertTrue(driver.getCurrentUrl().endsWith("com/Logout.php"));
	   screenShot();
	}

	

	}
