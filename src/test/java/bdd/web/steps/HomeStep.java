package bdd.web.steps;

import bdd.web.page.HomePage;
import org.openqa.selenium.WebDriver;

public class HomeStep {
    private WebDriver driver;

    public HomeStep(WebDriver driver) {
        this.driver = driver;
    }

    private HomePage homePage() {
        return new HomePage(this.driver);
    }

    public String getValueTitle(){
        return homePage().getValueTitle();
    }

    public void clickSignIn() {  homePage().SignIn(); }
}
