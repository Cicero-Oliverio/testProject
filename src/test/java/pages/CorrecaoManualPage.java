package pages;

import org.openqa.selenium.WebDriver;
import suport.BasePage;

public class CorrecaoManualPage extends BasePage {
    public CorrecaoManualPage(WebDriver navegador) {
        super(navegador);
    }

    public CorrecaoManualPage clicarBotaoEstoque(){

        return new CorrecaoManualPage(navegador);

    }


}
