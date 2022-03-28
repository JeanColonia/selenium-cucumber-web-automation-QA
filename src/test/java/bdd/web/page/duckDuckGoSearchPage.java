package bdd.web.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Util;

public class duckDuckGoSearchPage {

    WebDriver driver;
    public duckDuckGoSearchPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="search_form_input_homepage")
    private WebElement inputText;

    @FindBy(id="search_button_homepage")
    private WebElement searchButton;

    public void typeText(String text) {
        Util.waitThread(2000);
        inputText.sendKeys(text);
    }

    public void clickSearch() {
        searchButton.click();
    }

}
