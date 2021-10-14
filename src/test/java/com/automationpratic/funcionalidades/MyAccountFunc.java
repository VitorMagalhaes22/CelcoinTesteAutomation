package com.automationpratic.funcionalidades;

import com.automationpratic.pages.MyAccountPage;
import com.automationpratice.communs.DriverFactory;

public class MyAccountFunc  {

    MyAccountPage myAccountPage = new MyAccountPage();

    public boolean validarCadastro(){

      return DriverFactory.getInstance().getCurrentDriver().findElement(myAccountPage.getNomeMyAccount()).isDisplayed();


    }
}
