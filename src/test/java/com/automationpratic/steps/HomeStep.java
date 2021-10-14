package com.automationpratic.steps;

import com.automationpratic.funcionalidades.HomeFunc;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

public class HomeStep {

    HomeFunc homeFunc = new HomeFunc();

    @Entao("visualizo nome {string}")
    public void visualizoNome(String usuario) {
        Assert.assertEquals(usuario, homeFunc.getNomeUsuario());
    }

    @Dado("que o usuario esteja na tela Home")
    public void estejaNaTelaHome() {
        homeFunc.entrarTelaHome();

    }

    @Quando("Adicionar o produto ao carrinho")
    public void adicionarProduto() {
        homeFunc.adicionarAoCarrinho();
        // Assert.assertTrue(homeFunc.visulizarLogo());

    }

    @Então("visualizo o produto no carrinho")
    public void adicionarAoCarrinho() {
        homeFunc.visualizarProduto();
        Assert.assertTrue(homeFunc.obterprodutoCarrinho());

    }
}
