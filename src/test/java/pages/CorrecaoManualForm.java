package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import suport.BasePage;

public class CorrecaoManualForm extends BasePage {
    public CorrecaoManualForm(WebDriver navegador) {
        super(navegador);
    }

    public CorrecaoManualForm correcaoManual(){

        navegador.findElement(By.xpath("//span[@class='ns2icon  ns2icon-2Q2Bu']//i[@class='anticon anticon-appstore-o']")).click();

        return new CorrecaoManualForm(navegador);
    }


}


