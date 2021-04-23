package StepDefns;

import com.pages.LoginPage;
import com.qa.factory.DriverFactory;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class LoginPageSteps {

    private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());

    @Given("the user launches URL")
    public void the_user_launches_url() {

     //   DriverFactory.getDriver().get();
        loginPage.launchURL();
    }



    @Then("the user verifies orange HRM Loginpage")
    public void the_user_verifies_orange_hrm_loginpage() {
       String title = loginPage.getLoginPageTitle();
        Assert.assertTrue(title.contains("OrangeHRM"));
    }
    @When("the user enters username in username field")
    public void the_user_enters_username_in_username_field() {
        loginPage.enterUsername("Admin");

    }
    @Then("the user enters password in password field")
    public void the_user_enters_password_in_password_field() {
        loginPage.enterPassword("admin123");
    }
    @Then("the user clicks on submit button")
    public void the_user_clicks_on_submit_button() {
        loginPage.clickLogin();
    }

}
