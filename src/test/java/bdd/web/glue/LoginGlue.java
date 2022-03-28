package bdd.web.glue;

import bdd.web.steps.HomeStep;
import bdd.web.steps.LoginStep;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.Util;

import java.util.concurrent.TimeUnit;

public class LoginGlue {
    private WebDriver driver;
    private LoginStep loginStep;
    private HomeStep homeStep;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:/Users/Usuario/Documents/QA/selenium-cucumber-automatization/src/test/resources/drivers/chromedriver.exe");
        driver= new ChromeDriver();

        loginStep = new LoginStep(driver);
        homeStep=new HomeStep(driver);
    }
    @After
    public void tearsDown(){
        Util.waitThread(2000);
        driver.quit();
    }

    @Dado("que estoy en la plataforma de MyStore")
    public void que_estoy_en_la_plataforma_de_my_store() {
        driver.get("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Cuando("hago click en el boton sign in")
    public void hago_click_en_el_boton_sign_in() {
        homeStep.clickSignIn();
    }

    @Cuando("ingreso las credenciales del usuario")
    public void ingreso_las_credenciales_del_usuario(io.cucumber.datatable.DataTable dataTable) {

        String email = Util.getValueFromDataTable(dataTable, "email");
        String pass = Util.getValueFromDataTable(dataTable, "pass");
        loginStep.ingresarCredenciales(email, pass);
    }

    @Entonces("se debería validar que se muestra el mensaje de error {string}")
    public void se_debería_validar_que_se_muestra_el_mensaje_de_error(String messageError) {
        Assertions.assertEquals(messageError, loginStep.getError());
    }



}
