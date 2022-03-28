package bdd.web.page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;
    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(className="login")
    private WebElement SignInButton;

    @FindBy(css = "span.title")
    private WebElement productTitle;


    public String getValueTitle(){
        return productTitle.getText();
    }
    public void SignIn() {SignInButton.click();}

}
