package com.automationpratic.pages;

import org.openqa.selenium.By;

public class MyAccountPage {

    By nomeMyAccount =  By.xpath("//div[@id='center_column']/child::h1");

    public By getNomeMyAccount() {
        return nomeMyAccount;
    }
}
