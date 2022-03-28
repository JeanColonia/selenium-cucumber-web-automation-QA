package bdd.web.steps;

import bdd.web.page.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginStep {
    WebDriver driver;
    public LoginStep(WebDriver driver){
        this.driver = driver;
    }

    private LoginPage loginPage(){
        return new LoginPage(this.driver);
    }

    public void ingresarCredenciales(String email, String pass) {
        loginPage().typeUser(email);
        if(pass==null){
            pass="";
        }
        loginPage().typePass(pass);
        loginPage().clickLogin();

    }
    public String getError() {
        return loginPage().getError();
    }
}
