package br.test.automation.steps;

import br.test.automation.pages.TestCadastroPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class TestCadastroSteps {
	public TestCadastroPage pg = new TestCadastroPage();

	@Dado("que o usuario esteja na pagina de cadastro gitmaratonadev")
	public void que_o_usuario_esteja_na_pagina_de_cadastro_gitmaratonadev() throws Exception {
		pg.acessarSite();
		pg.acessarCadastro();
		
	}

	@Quando("informar  os campos  {string} , {string} , {string} , {string} , {string} , {string} , {string} , {string}, {string}")
	public void informar_os_campos(String nome, String idade, String periodoIni, String periodoFin, String tel, String email, String usuario, String senha, String sexo) {
		pg.preencherCadastro(nome, idade, periodoIni, periodoFin, tel, email, usuario, senha, sexo);
	}

	@Quando("selecionar o checkbox voce atua ou ja atuou com TI")
	public void selecionar_o_checkbox_voce_atua_ou_ja_atuou_com_ti() throws InterruptedException {
		pg.selecionarCheckbox();
		pg.selecionarSexo();

	}

	@Quando("clicar no botao registrar")
	public void clicar_no_botao_registrar() throws InterruptedException {
		pg.clicarBotaoRegistrar();
	}


	@Entao("realizar login com {string} e {string} para validar cadastro com sucesso")
	public void realizar_login_com_e_para_validar_cadastro_com_sucesso(String usuario, String senha) throws InterruptedException {
		pg.validarCadastroSucesso(usuario, senha);

}
	
	@Entao("validar campo obrigatorio")
	public void validar_campo_obrigatorio() {
		pg.validarCampoObrigatorio();

	
	}

}
