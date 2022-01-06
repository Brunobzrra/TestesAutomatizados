package stepsDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import pageObjects.LoginPage;

import static utils.Utils.*;

public class Hooks {

	
	@Before()
	public void setup() {
		acessarSistema();
		Na(LoginPage.class).realizarLogin("admin123", "Admin");
	}
	
	@Before(value = "@Login")
	public void funcionalidadeLogin() {
		acessarSistema();
	}
	

	@After
	public void AfterSteps() {
//		driver.quit();
	}

}
