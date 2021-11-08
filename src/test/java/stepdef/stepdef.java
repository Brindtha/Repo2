package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class stepdef {
	WebDriver driver;

	@Given("the user launches the amazon URL")
	public void the_user_launches_the_amazon_url() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(
				"https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		driver.manage().window().maximize();
	}

	@When("the user enters username {string}")
	public void the_user_enters_username(String username) {
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.id("continue")).click();

	}

	@When("the user enters password {string}")
	public void the_user_enters_password(String password) {
		driver.findElement(By.name("password")).sendKeys(password);
	}

	@When("the user clicks signIn button")
	public void the_user_clicks_sign_in_button() {
		driver.findElement(By.id("signInSubmit")).click();
	}

	@Then("the user verifies titile & url of the page.")
	public void the_user_verifies_titile_url_of_the_page() {

		if (driver.getTitle().equals("") && driver.getCurrentUrl().equals(driver)) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
	}

}
