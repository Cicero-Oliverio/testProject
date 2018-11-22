package tests;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import suport.Web;

public class testeQuintoAndar {

    private WebDriver navegador;

    @Before
    public void setUp(){
        navegador = Web.createChrome();
    }

    @Test
    public void loginQuintoAndar(){

        navegador.get("https://www.quintoandar.com.br/");

        navegador.findElement(By.xpath("//span[contains(text(),'Entrar')]")).click();



        navegador.findElement(By.cssSelector("input[name=\"ddi\"]")).sendKeys("+55");
        navegador.findElement(By.cssSelector("input[name=\"ddd\"]")).sendKeys("11");
        navegador.findElement(By.cssSelector("input[name=\"phone\"]")).sendKeys("975697393");

    }
}
