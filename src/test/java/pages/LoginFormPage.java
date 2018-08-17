package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import suport.BasePage;

public class LoginFormPage extends BasePage {

    public LoginFormPage(WebDriver navegador) {
        super(navegador);
    }

    public LoginFormPage digitarLogin(String login) {

        navegador.findElement(By.id("login.user")).sendKeys(login);
        return this;

    }

    public LoginFormPage digitarSenha(String password) {
        navegador.findElement(By.id("login.password")).sendKeys(password);
        return this;
    }

    public boolean acharBotao() {
        if (navegador.findElement(By.xpath("//button[@type=\"submit\"]")).isEnabled()){
            return true;
        } else {
            return false;
        }
    }

    public LoginFormPage clicarLogin(){
        if(acharBotao()==true){
            navegador.findElement(By.xpath("//button[@type=\"submit\"]")).click();
        }else{
            navegador.quit();
        }
        return this;
    }


    public SecretaPage fazerLoginSucess (String login,String senha){
        digitarLogin(login);
        digitarSenha(senha);
        acharBotao();
        clicarLogin();

        return new SecretaPage(navegador);
    }
}
