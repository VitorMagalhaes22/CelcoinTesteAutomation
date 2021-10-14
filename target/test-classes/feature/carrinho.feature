#language: pt
#encoding: UTF-8
#Author: João
#Date: 06/05/2021
#version: 1.0


@smoketest
  Funcionalidade: Carrinho
    essa funcionalidade ira realizar acões no carrinho

  Cenario: Inserir produto no carrinho
    Dado que o usuario esteja na tela Home
    Quando Adicionar o produto ao carrinho
    Entao visualizo o produto no carrinho



