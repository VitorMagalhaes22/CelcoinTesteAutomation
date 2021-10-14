package com.automationpratic.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage {
    By nomeUsuario = By.xpath("//a[@class='account']/child::span");
    By clicarBotaoCarrinho = By.xpath("//a[@class='button ajax_add_to_cart_button btn btn-default']");
    By imagem = By.xpath("//div[@class='product-container']");
    By fecharJanela = By.xpath("//span[@class='cross']");
    By visualizarCarrinho = By.xpath("//a[@title='View my shopping cart']");
    By visualizarProduto = By.xpath("//*[@class='cart_block_product_name']");
    By frameCarrinho = By.xpath("//div[@id='layer_cart']");
    By visualizarLogo = By.xpath("//*[@class='logo img-responsive']");

    public By getNomeUsuario() {
        return nomeUsuario;
    }

    public By getClicarBotaoCarrinho() {
        return clicarBotaoCarrinho;
    }

    public By getVisualizarLogo() {
        return visualizarLogo;
    }

    public By getImagem() {
        return imagem;
    }

    public By getFrameCarrinho() {
        return frameCarrinho;
    }

    public By getFecharJanela() {
        return fecharJanela;
    }

    public By getVisualizarCarrinho() {
        return visualizarCarrinho;
    }

    public By getVisualizarProduto() {
        return visualizarProduto;
    }
}
