package stepsDefinitions;

import io.cucumber.java.pt.E;

import static org.junit.Assert.assertTrue;
import static utils.Utils.*;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.CadastrarUsuarioPage;
import pageObjects.TelaInicialPage;

public class CadastrarUsuarioSteps {
	
	@Quando("eu acionar a aba admin")
	public void euAcionarAAbaAdmin() {
		Na(TelaInicialPage.class).acionarAbaAdmin();
	}

	@Quando("acionar o botao add")
	public void acionarOBotaoAdd() {
		Na(TelaInicialPage.class).acionarBotaoAdd();
	}

	@Quando("informar no campo employer name {string}")
	public void informarNoCampoEmployerName(String employeeName) {
		Na(CadastrarUsuarioPage.class).informarCampoEmployeeName(employeeName);
	}

	@Quando("^informar no campo username \"([^\"]*)\"$")
	public void informarNoCampoUsername(String userName) throws Throwable {
		Na(CadastrarUsuarioPage.class).informarCampoUserName(userName);
	}

	@Quando("informar no campo password {string}")
	public void informarNoCampoPassword(String password) {
		Na(CadastrarUsuarioPage.class).informarCampoPassword(password);
	}

	@Quando("informar no campo confirmar password {string}")
	public void informarNoCampoConfirmarPassword(String confirmPassword) {
		Na(CadastrarUsuarioPage.class).informarCampoConfirmaPassword(confirmPassword);
	}

	@E("^acionar o botao salvar$")
	public void acionarOBotaoSalvar() throws Throwable {
		Na(CadastrarUsuarioPage.class).acionarBotaoSalvar();
	}

	@Entao("^o sistema cadastra o usuario \"([^\"]*)\"$")
	public void oSistemaCadastraOUsuario(String userName) throws Throwable {
		assertTrue(driver.findElement(By.xpath("//a[text()='"+userName+"']")).isDisplayed());
	}


}
