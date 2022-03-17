package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GoogleStepDef {

WebDriver webDriver=null;

    @Given("browser is open")
    @Deprecated
    public void browser_is_open() {
        System.out.println("Inside Step : Browser is open :D");
        String projectPath=System.getProperty("user.dir");
        System.out.println("********* project path ******** : "+projectPath);
        System.setProperty("webdriver.chrome.driver", "C:/Users/Usuario/Documents/QA/selenium-cucumber-automatization/src/test/resources/drivers/chromedriver.exe");
        webDriver= new ChromeDriver();

        webDriver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        webDriver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);


    }

    @And("user is on google search page")
    public void user_is_on_google_search_page() throws InterruptedException {
        System.out.println("Inside Step : user is on google search page right now");
        webDriver.navigate().to("https://www.google.com/");
        Thread.sleep(2000);
    }

    @When("user enters a text value in search box")
    public void user_enters_a_text_value_in_search_box() throws InterruptedException {
        System.out.println("Inside Step : user enters a text value in search box");
        webDriver.findElement(By.name("q")).sendKeys("youtube");
        Thread.sleep(2000);
    }

    @And("click or hits enter key")
    public void click_or_hits_enter_key() throws InterruptedException {
        System.out.println("Inside Step : user click or hits enter key");
        webDriver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
    }

    @Then("user is navigated to results page")
    public void user_is_navigated_to_results_page() throws InterruptedException {
        System.out.println("Inside Step : user is navigated to the result page");
        webDriver.getPageSource().contains("Youtube");
        Thread.sleep(2000);
        webDriver.close();
        webDriver.quit();

    }
}
