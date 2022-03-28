package bdd.web.glue;

import bdd.web.page.duckDuckGoSearchPage;
import bdd.web.steps.HomeStep;
import bdd.web.steps.LoginStep;
import bdd.web.steps.duckDuckGoSearchStep;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.Util;

import java.util.concurrent.TimeUnit;

public class duckDuckGoSearchGlue {
    WebDriver driver;

    duckDuckGoSearchStep duckduckGoSearchStep;
    duckDuckGoSearchPage duckduckGoSearchPage;
    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:/Users/Usuario/Documents/QA/selenium-cucumber-automatization/src/test/resources/drivers/chromedriver.exe");
    }
    @After
    public void tearsDown(){
        Util.waitThread(2000);
        driver.quit();
    }

    @Dado("que el usuario se encuentra en la pagina del buscador de duckduckgo")
    public void el_usuario_se_encuentra_en_la_pagina_del_buscador_de_google() {
        driver= new ChromeDriver();
        duckduckGoSearchStep = new duckDuckGoSearchStep(driver);
        duckduckGoSearchPage=new duckDuckGoSearchPage(driver);
        driver.get("https://duckduckgo.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    @Cuando("el usuario ingresa un texto en la caja del buscador")
    public void el_usuario_ingresa_un_texto_en_la_caja_del_buscador() {
        duckduckGoSearchStep.insertTextToSearch("Zapatillas");
    }
    @Cuando("hace click en el boton buscar")
    public void click_or_hits_enter_key_presiona_la_tecla_enter() {
    duckduckGoSearchPage.clickSearch();
    }
    @Entonces("el usuario es conducido hasta la pagina de los resultados de su busqueda")
    public void el_usuario_es_conducido_hasta_la_pagina_de_los_resultados_de_su_busqueda() {
       driver.getPageSource().contains("Zapatillas de Moda para Mujer - El Palacio de Hierro");
      Util.waitThread(5000);

    }

}
