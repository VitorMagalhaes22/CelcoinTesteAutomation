#language: pt
#encoding: UTF-8
#Author: João
#Date: 06/05/2021
#version: 1.0


@smoketest
Funcionalidade: Cadastro de usuário

  Cenário: Validar o cadastro realizado com sucesso
    Dado entrar na tela de login
    Quando preencher o cadastro de um novo usuário
    Então deve exibir o cadastro realizado com sucesso