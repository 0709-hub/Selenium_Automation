package br.test.automation.pages;

import org.openqa.selenium.By;

import br.test.automation.core.BasePage;

public class TestCadastroPage extends BasePage {
	
	By inpNome = By.cssSelector("body > app > div > div > div > div > ng-component > div > form > div:nth-child(1) > input");
	
	By inpIdade = By.cssSelector("#inline > input");

	By inpPeriodoInicio = 	By.cssSelector("body > app > div > div > div > div > ng-component > div > form > div:nth-child(2) > div:nth-child(2) > input:nth-child(2)");

	By inpPeriodoFinalizacao = By.cssSelector("body > app > div > div > div > div > ng-component > div > form > div:nth-child(2) > div:nth-child(2) > input:nth-child(4)");
	
	By inpTelefone = By.cssSelector("body > app > div > div > div > div > ng-component > div > form > div:nth-child(2) > div:nth-child(3) > input");

	By selectSexo = By.id("sexo");

	By inpEmail = By.cssSelector("#email > input");

	By checkNao = By.cssSelector("body > app > div > div > div > div > ng-component > div > form > div:nth-child(5) > input:nth-child(6)");

	By inpUsuario = By.cssSelector("body > app > div > div > div > div > ng-component > div > form > div:nth-child(6) > input");

	By inpSenha = By.cssSelector( "body > app > div > div > div > div > ng-component > div > form > div:nth-child(7) > input");

	By btnRegistrar = By.cssSelector("body > app > div > div > div > div > ng-component > div > form > div:nth-child(8) > button");

	By btnCadastro = By.cssSelector("body > app > div > div > div > div > ng-component > div > form > div:nth-child(3) > a");
	
	By inpLoginUsuario = By.cssSelector("body > app > div > div > div > div > ng-component > div > form > div:nth-child(1) > input");
	
	By inpLoginSenha = By.cssSelector("body > app > div > div > div > div > ng-component > div > form > div:nth-child(2) > input");
	
	By btnLogin = By.cssSelector("body > app > div > div > div > div > ng-component > div > form > div:nth-child(3) > button");
	
	By headerLogin = By.cssSelector("body > app > div > div > div > div > ng-component > h3");
	
	By campoObrigatorio = By.cssSelector("body > app > div > div > div > div > ng-component > div > form > div:nth-child(6) > div > div");


	
	public void acessarCadastro() {
		clicar(btnCadastro);		
	}

	public void preencherCadastro(String nome, String idade, String periodoIni, String periodoFin, String tel, String email, String usuario, String senha, String sexo) {
		escrever(inpNome, nome);
		escrever(inpIdade, idade);
		escrever(inpPeriodoInicio, periodoIni);
		escrever(inpPeriodoFinalizacao, periodoFin);
		escrever(inpTelefone, tel);
		escrever(inpEmail, email);
		escrever(inpUsuario, usuario);
		escrever(inpSenha, senha);
		selecionarOpcaoText(selectSexo, sexo); 

	}

	public void selecionarCheckbox() {
		clicar(checkNao);
	}

	public void selecionarSexo() {
		selecionarOpcaoText(selectSexo, "Masculino");
	}
	
	public void clicarBotaoRegistrar() {
		clicar(btnRegistrar);
	}

	public void validarCadastroSucesso(String usuario, String senha) throws InterruptedException {
		getDriver().get("https://gitmaratonadev.stefanini.com.br/maratonaqa");
		escrever(inpLoginUsuario, usuario);
		escrever(inpLoginSenha, senha);
		clicar(btnLogin);
		verificarElementoVisivel(headerLogin);

	}

	public void validarCampoObrigatorio() {
		verificarElementoVisivel(campoObrigatorio);
		
	}
	


}
