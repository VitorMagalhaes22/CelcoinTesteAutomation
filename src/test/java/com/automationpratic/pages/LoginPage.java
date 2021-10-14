package com.automationpratic.pages;

import org.openqa.selenium.By;

public class LoginPage {

    By campoEmail= By.id("email");
    By campoSenha= By.id("passwd");
    By botãoSign=By.id("SubmitLogin");
    By campoEmailValido=By.id("email_create");
    By botaoCreate= By.id("SubmitCreate");

    public By getCampoEmail(String usuario) {
        return campoEmail;
    }

    public By getCampoSenha() {
        return campoSenha;
    }

    public By getBotãoSign() {
        return botãoSign;
    }

    public By getCampoEmailValido() {
        return campoEmailValido;
    }

    public By getBotaoCreate() {
        return botaoCreate;
    }


}
