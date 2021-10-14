package com.automationpratic.funcionalidades;

import com.automationpratic.pages.LoginPage;
import com.automationpratice.communs.DriverFactory;
import com.automationpratice.communs.GeradorDados;

public class LoginFunc  {

    LoginPage loginPage = new LoginPage();

    public void entrarTelaLogin() {
        DriverFactory.getInstance().getCurrentDriver().get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

    }

    public void realizarLogin(String usuario){
        DriverFactory.getInstance().getCurrentDriver().findElement(loginPage.getCampoEmail("")).sendKeys(usuario);
        DriverFactory.getInstance().getCurrentDriver().findElement(loginPage.getCampoSenha()).sendKeys("teste123");
        DriverFactory.getInstance().getCurrentDriver().findElement(loginPage.getBotãoSign()).click();

    }

    public void emailValido(){
        DriverFactory.getInstance().getCurrentDriver().findElement(loginPage.getCampoEmailValido()).sendKeys(GeradorDados.getEmail());
        DriverFactory.getInstance().getCurrentDriver().findElement(loginPage.getBotaoCreate()).click();
    }
}
