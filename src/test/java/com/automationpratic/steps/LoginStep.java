package com.automationpratic.steps;

import com.automationpratic.funcionalidades.LoginFunc;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;

public class LoginStep {
    LoginFunc loginFunc = new LoginFunc();

    @Dado("entrar na tela de login")
    public void estejaTelaLogin(){
        loginFunc.entrarTelaLogin();

    }

    @Quando("inserir os dados cadastrais {string}")
    public void inserirOsDadosCadastrais(String usuario) {
        loginFunc.realizarLogin(usuario);
    }


}
