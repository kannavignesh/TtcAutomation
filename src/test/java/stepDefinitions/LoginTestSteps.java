package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class LoginTestSteps {
    public WebDriver driver;
    @Given("The user navigates to {string}")
    public void the_user_navigates_to(String LumaHomePageURL) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver","C\\Users\\vicke\\Downloads\\TccAutomation\\Automation\\drivers\\chromedriver.exe");
        ChromeOptions co = new ChromeOptions();
        co.setBinary("C:\\Users\\vicke\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
        driver = new ChromeDriver(co);
        driver.get("https://www.google.com");
        Thread.sleep(10000);
        System.out.println(driver.getTitle());
    }
    @Given("the user click sign In button")
    public void the_user_click_sign_in_button() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Sucess");
    }
    @And("the user enters valid credentials username {string} and password {string}")
    public void theUserEntersValidCredentialsUsernameAndPassword(String arg0, String arg1) {
        System.out.println("Sucess");
    }
    @When("click signIn button")
    public void click_sign_in_button() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Sucess");
    }
    @Then("The user should login sucessfully.")
    public void the_user_should_login_sucessfully() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Sucess");
    }


    @And("the user enters invalid credentials {string} and {string}")
    public void theUserEntersInvalidCredentialsAnd(String arg0, String arg1, String arg2, String arg3) {
        System.out.println("Sucess");
    }

    @Then("The user should not login and see login error message.")
    public void theUserShouldNotLoginAndSeeLoginErrorMessage() {
        System.out.println("Sucess");
    }

    @Given("the user click Create an Account option")
    public void theUserClickCreateAnAccountOption() {
        System.out.println("Sucess");
    }
    @Given("the user enter details to create user form")
    public void the_user_enter_details_to_create_user_form(List<String> data) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        System.out.println(data.get(0));
        System.out.println(data.get(1));
        System.out.println(data.get(2));
        System.out.println(data.get(3));
        System.out.println(data.get(4));
    }
    @When("the user click create account button")
    public void the_user_click_create_account_button() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Sucess");
    }
    @Then("the user profile should be created")
    public void the_user_profile_should_be_created() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Sucess");
    }

}
