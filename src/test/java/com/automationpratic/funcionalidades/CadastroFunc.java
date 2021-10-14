package com.automationpratic.funcionalidades;

import com.automationpratic.pages.CadastroPage;
import com.automationpratice.communs.DriverFactory;
import com.automationpratice.communs.GeradorDados;
import org.openqa.selenium.support.ui.Select;

public class CadastroFunc  {

    CadastroPage cadastroPage = new CadastroPage();

    public void cadastroPessoal() {
        DriverFactory.getInstance().getCurrentDriver().findElement(cadastroPage.getFirstName()).sendKeys(GeradorDados.getPrimeiroNome());
       DriverFactory.getInstance().getCurrentDriver().findElement(cadastroPage.getLastName()).sendKeys(GeradorDados.getSobrenome());
       DriverFactory.getInstance().getCurrentDriver().findElement(cadastroPage.getSenha()).sendKeys("123456");

    }

    public void cadastroEndereco() {

       DriverFactory.getInstance().getCurrentDriver().findElement(cadastroPage.getEndereco()).sendKeys(GeradorDados.getEndereco());
       DriverFactory.getInstance().getCurrentDriver().findElement(cadastroPage.getCity()).sendKeys("barueri");
        Select select = new Select(DriverFactory.getInstance().getCurrentDriver().findElement(cadastroPage.getState()));
        select.selectByVisibleText("Alabama");
       DriverFactory.getInstance().getCurrentDriver().findElement(cadastroPage.getZip()).sendKeys("12345");
        Select select1 = new Select(DriverFactory.getInstance().getCurrentDriver().findElement(cadastroPage.getCountry()));
        select1.selectByVisibleText("United States");
       DriverFactory.getInstance().getCurrentDriver().findElement(cadastroPage.getNumber()).sendKeys("12345678");
       DriverFactory.getInstance().getCurrentDriver().findElement(cadastroPage.getBotaoCadastro()).click();

    }

    public void preencherDadosUsuario() {
        this.cadastroPessoal();
        this.cadastroEndereco();
    }


}
