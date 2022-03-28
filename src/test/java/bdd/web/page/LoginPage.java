package bdd.web.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Util;

public class LoginPage {
    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    //Obtenemos los elementos de la interfaz con @FindBy y sus identificadores únicos.
    @FindBy(id="email")
    private WebElement userInput;
    @FindBy(id="passwd")
    private WebElement passInput;
    @FindBy(id="SubmitLogin")
    private WebElement loginButton;
    @FindBy(xpath="//div[@class='alert alert-danger']/p")
    private WebElement messageError;

    public void typeUser(String email) {
        Util.waitThread(2000);
        userInput.sendKeys(email);
    }

    public void typePass(String pass) {
        passInput.sendKeys(pass);
    }

    public void clickLogin() {
    loginButton.click();
    }
    public String getError(){
        return messageError.getText();
    }
}
