package com.automationpratic.pages;

import org.openqa.selenium.By;

public class CadastroPage {

    By firstName = By.id("customer_firstname");
    By lastName = By.id("customer_lastname");
    By senha = By.id("passwd");
    By endereco = By.id("address1");
    By city = By.id("city");
    By state = By.id("id_state");
    By zip = By.id("postcode");
    By country = By.id("id_country");
    By number = By.id("phone_mobile");
    By botaoCadastro = By.id("submitAccount");

    public By getFirstName() {
        return firstName;
    }

    public By getLastName() {
        return lastName;
    }

    public By getSenha() {
        return senha;
    }

    public By getEndereco() {
        return endereco;
    }

    public By getCity() {
        return city;
    }

    public By getCountry() {
        return country;
    }

    public By getNumber() {
        return number;
    }

    public By getState() {
        return state;
    }

    public By getZip() {
        return zip;
    }

    public By getBotaoCadastro() {
        return botaoCadastro;
    }
}
