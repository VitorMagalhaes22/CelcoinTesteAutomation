#language: pt
#encoding: UTF-8
#Author: João
#Date: 06/05/2021
#version: 1.0


@smoketest
Funcionalidade: Login
  Essa funcionalidade ira realizar login
  de um usuario cadastrado na aplicação



  Cenario: Validar login na aplicação
    Dado entrar na tela de login
    Quando inserir os dados cadastrais "mentoria_etech@dev.com"
    Entao visualizo nome "Etech Mentoria"


