package com.automationpratic.steps;

import com.automationpratic.funcionalidades.CadastroFunc;
import com.automationpratic.funcionalidades.LoginFunc;
import io.cucumber.java.ca.Quan;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;

public class CadastroStep {

    CadastroFunc cadastroFunc = new CadastroFunc();
    LoginFunc loginFunc = new LoginFunc();

    @Quando("preencher o cadastro de um novo usuário")
    public void preencherCadastro() {
        loginFunc.emailValido();
        cadastroFunc.preencherDadosUsuario();

    }
}
