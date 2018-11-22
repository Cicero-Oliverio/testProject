package tests;

import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import pages.CorrecaoManualPage;
import pages.CorrecaoManualForm;
import pages.LoginPage;
import suport.Web;

@RunWith(DataDrivenTestRunner.class)
@DataLoader(filePaths = "login.csv")
public class loginTests {

    private WebDriver navegador;

    @Before
    public void setUp(){
        navegador = Web.createChrome();
    }

    @Test
    public void testloginSucess(
            @Param(name="login")String login,
            @Param(name="senha")String senha

    ) throws InterruptedException {
       new LoginPage(navegador)
               .login()
               .fazerLoginSucess(login,senha);

       //Thread.sleep(2000);
       //navegador.get("https://hmg-free-webadmin.ns2online.com.br/stock/cost-update/");
        //Thread.sleep(2000);
        //WebElement upload = navegador.findElement(By.xpath("//div/div[3]/div[2]/div/div/div[2]/div/span/div/span/div/button/span"));
        //((RemoteWebElement) upload ).setFileDetector(new LocalFileDetector());
        //upload.sendKeys("/home/cicerooliverio/IdeaProjects/testes-Admin/template.csv");
        //navegador.findElement(By.id("submit")).click();

        navegador.get("https://hmg-free-webadmin.ns2online.com.br/stock/cost-update/");
        WebElement upload = navegador.findElement(By.xpath("//div/div[3]/div[2]/div/div/div[2]/div/span/div/span/input"));
        upload.sendKeys("/home/cicerooliverio/Downloads/template.csv");
        navegador.findElement(By.xpath("//div/div[3]/div[2]/div/div/div[2]/div/span/div/span/div/button")).click();
        //navegador.findElement(By.tagName("img"));
        //Assert.assertEquals("81uHN9LeOLL._SY355_.jpg (image/jpeg)", navegador.findElement(By.tagName("p")).getText());

    }

    @Test
    public void loginQuintoAndar(){
        navegador.get("https://www.quintoandar.com.br/");

        navegador.findElement(By.xpath("//span[contains(text(),'Entrar')]"));



        navegador.findElement(By.cssSelector("input[name=\"ddi\"]")).sendKeys("+55");
        navegador.findElement(By.cssSelector("input[name=\"ddd\"]")).sendKeys("11");
        navegador.findElement(By.cssSelector("input[name=\"phone\"]")).sendKeys("975697393");

    }








    @After
    public void tearDown(){
        navegador.quit();
    }

}