package br.test.automation.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import br.test.automation.core.BasePage;

public class TestLoginPage extends BasePage {
	
	By inpLoginUsuario = By.cssSelector("body > app > div > div > div > div > ng-component > div > form > div:nth-child(1) > input");
	
	By inpLoginSenha = By.cssSelector("body > app > div > div > div > div > ng-component > div > form > div:nth-child(2) > input");
	
	By btnLogin = By.cssSelector("body > app > div > div > div > div > ng-component > div > form > div:nth-child(3) > button");
	
	By headerLogin = By.cssSelector("body > app > div > div > div > div > ng-component > h3");
	
	public void realizarLogin(String usuario, String senha) {
		escrever(inpLoginUsuario, usuario);
		escrever(inpLoginSenha, senha);
		clicar(btnLogin);
	}
	
	public void validarLogin() {
		verificarElementoVisivel(headerLogin);
		
	}
	

}
