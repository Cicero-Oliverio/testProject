package pages;

import org.openqa.selenium.WebDriver;
import suport.BasePage;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver navegador) {
        super(navegador);
    }

    public LoginFormPage login(){

        return new LoginFormPage(navegador);

    }

}
