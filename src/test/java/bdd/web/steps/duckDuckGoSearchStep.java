package bdd.web.steps;
import bdd.web.page.duckDuckGoSearchPage;
import org.openqa.selenium.WebDriver;

public class duckDuckGoSearchStep {
    WebDriver driver;
    public duckDuckGoSearchStep(WebDriver driver){
        this.driver = driver;
    }

    private duckDuckGoSearchPage search(){
        return new duckDuckGoSearchPage(this.driver);
    }

    public void insertTextToSearch(String text) {
        search().typeText(text);
        if(text==null){
            text="";
            System.out.println("No se ingresó ningun texto a buscar");
        }

    }

}
