package br.test.automation.steps;

import br.test.automation.pages.TestLoginPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class TestLoginSteps {
	public TestLoginPage pg = new TestLoginPage();

	@Dado("que o usuario esteja na pagina de inicial gitmaratonadev")
	public void que_o_usuario_esteja_na_pagina_de_inicial_gitmaratonadev() throws Exception {
		pg.acessarSite();

	}

	@Quando("informar  os campos  {string} , {string} e clicar no botao login")
	public void informar_os_campos(String nome, String senha) {
		pg.realizarLogin(nome, senha);
	}

	@Entao("validar login com sucesso")
	public void validar_login_com_sucesso() {
		pg.validarLogin();	
	}
 


}
