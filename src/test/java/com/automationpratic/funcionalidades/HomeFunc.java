package com.automationpratic.funcionalidades;

import com.automationpratic.pages.HomePage;
import com.automationpratice.communs.DriverFactory;
import com.automationpratice.enums.Web;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomeFunc  {

    HomePage homePage = new HomePage();
    Actions action2 = new Actions(DriverFactory.getInstance().getCurrentDriver());

    public String getNomeUsuario() {
        return DriverFactory.getInstance().getCurrentDriver().findElement(homePage.getNomeUsuario()).getText();
    }

    public void entrarTelaHome() {
        DriverFactory.getInstance().getCurrentDriver().get("http://automationpractice.com/index.php");

    }

    public void adicionarAoCarrinho() {
        Actions action = new Actions(DriverFactory.getInstance().getCurrentDriver());
        action.moveToElement(DriverFactory.getInstance().getCurrentDriver().findElement(homePage.getImagem())).perform();
        DriverFactory.getInstance().getCurrentDriver().findElement(homePage.getClicarBotaoCarrinho()).click();
        DriverFactory.getInstance().getCurrentDriver().findElement(homePage.getFecharJanela()).click();

    }


    public boolean visulizarLogo() {
        return DriverFactory.getInstance().getCurrentDriver().findElement(homePage.getVisualizarLogo()).isDisplayed();

    }

    public void visualizarProduto() {

        action2.moveToElement(DriverFactory.getInstance().getCurrentDriver().findElement(homePage.getVisualizarCarrinho())).perform();

    }

    public boolean obterprodutoCarrinho() {
        return DriverFactory.getInstance().getCurrentDriver().findElement(homePage.getVisualizarProduto()).isDisplayed();

    }


}
