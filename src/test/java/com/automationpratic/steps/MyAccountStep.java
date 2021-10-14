package com.automationpratic.steps;

import com.automationpratic.funcionalidades.MyAccountFunc;
import io.cucumber.java.pt.Entao;
import org.junit.Assert;

public class MyAccountStep {

    MyAccountFunc myAccountFunc = new MyAccountFunc();

    @Entao("deve exibir o cadastro realizado com sucesso")
    public void exibirCadastroRealizado(){
        Assert.assertTrue(myAccountFunc.validarCadastro());





    }
}
