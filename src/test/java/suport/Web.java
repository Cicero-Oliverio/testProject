package suport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.LocalFileDetector;

import java.util.concurrent.TimeUnit;

public class Web {

    public static WebDriver createChrome(){

        // Abrindo o navegador
        System.setProperty("webdriver.chrome.driver","/home/cicero-oliverio/Downloads/chromedriver_linux64/chromedriver");
        WebDriver navegador = navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navegador.manage().window().maximize();


        // Navegando para a página do Taskit!
        navegador.get("https://www.quintoandar.com.br/");

        return navegador;

    }

}
