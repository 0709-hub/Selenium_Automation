package br.test.automation.core;

import static br.test.automation.core.DriverFactory.getDriver;
import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage extends DriverFactory {
	private static WebDriverWait wait;

	
	public void clicar(By elemento) {
		wait = new WebDriverWait(getDriver(), 10); 
		wait.until(ExpectedConditions.elementToBeClickable(elemento));
		wait.until(ExpectedConditions.visibilityOfElementLocated(elemento));
		getDriver().findElement(elemento).click();
	}

	
	public void clicarPorTextoXpath(String texto) {
		clicar(By.xpath("//*[@text=' + texto + ']"));
	}
	
	public void clicarPorTextoClassName(String texto) {
		clicar(By.className("//*[@text=' + texto + ']"));
	}

	
	public void clicarPorTextoCss(String texto) {
		clicar(By.cssSelector("a[href*=' + texto + ']"));
	}

	// Metodo para escrever
	public void escrever(By elemento, String texto) {
		getDriver().findElement(elemento).sendKeys(texto);
	}

	// Metodo para apagar campo texto
	public void apagar(By elemento) {
		getDriver().findElement(elemento).clear();
	}



	public String lerTexto(By elemento) {
		return getDriver().findElement(elemento).getText().toString();
	}

	
	public void validarTexto(String textoEsperado, By elemento) {
		Assert.assertEquals(textoEsperado, lerTexto(elemento));
	}

	
	public void validarElemento(By elemento, String textoEsperado) {
		Assert.assertEquals(elemento, textoEsperado);
	}

	
	public void ignorarElementoAusente(By elemento) {
		if (getDriver().findElements(elemento).size() != 0) {
			clicar(elemento);
			;
		} else {
			System.out.println("Elemento est� ausente");
		}
	}

	
	public void verificarElementoVisivel(By elemento) {
		if (getDriver().findElement(elemento).isDisplayed()) {
			System.out.println("Element is Visible");
		} else {
			System.out.println("Element is InVisible");
		}
	}

	
	public void selecionarOpcaoText(By elemento, String opcaoDesejada) {
		Select sl = new Select(getDriver().findElement(elemento));
		sl.selectByVisibleText(opcaoDesejada);

	}


	public void selecionarOpcaoValue(By elemento, String value) {
		Select sl = new Select(getDriver().findElement(elemento));
		sl.selectByValue(value);

	}

	
	public void clicar_por_link(String link_text) {
		getDriver().findElement(By.linkText(link_text));
	}


	public void escrever_e_clicar(By elemento, String texto) {
		getDriver().findElement(elemento).sendKeys(texto);
		getDriver().findElement(elemento).sendKeys(Keys.ENTER);
	}


	public void esperar_elemento_ficar_visivel(By elemento) {
		wait = new WebDriverWait(getDriver(), 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(elemento));

	}

	
	public void validarStringsIguais(String texto, String textoEsperado) {
		Assert.assertEquals(texto, textoEsperado);
	}

	public void acessarSite() throws Exception {
		getDriver().get("https://gitmaratonadev.stefanini.com.br/maratonaqa");
	}



}
