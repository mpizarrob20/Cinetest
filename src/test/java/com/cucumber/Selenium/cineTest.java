package com.cucumber.Selenium;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class cineTest {
	
	private WebDriver driver;
	private String baseUrl;
	private String driverPath = "C:/Users/May/Documents";
	
	@Given("^Ingreso el mail mpizarrob(\\d+)@gmail\\.com en el campo mail$")
	public void ingreso_el_mail_mpizarrob_gmail_com_en_el_campo_mail(int arg1) throws Throwable {
		System.setProperty("webdriver.gecko.driver", driverPath + "geckodriver.exe");
		System.setProperty("webdriver.firefox.marionette", driverPath + "geckodriver.exe");

		driver = new FirefoxDriver();
		baseUrl = "https://www.facebook.com/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseUrl);
		
		WebElement usuario = driver.findElement(By.id("email"));
		usuario.sendKeys("mpizarrob20@gmail.com");
	}

	@Given("^Ingreso \"([^\"]*)\" en el campo pass$")
	public void ingreso_en_el_campo_pass(String arg1) throws Throwable {
		WebElement clave = driver.findElement(By.id("pass"));
		clave.sendKeys("Kubanit47842");
	}

	@When("^Pulso el boton iniciar sesion$")
	public void pulso_el_boton_iniciar_sesion() throws Throwable {
		driver.findElement(By.id("u_0_l")).click();
	}

	@Then("^Se ingresa al perfil del usuario$")
	public void se_ingresa_al_perfil_del_usuario() throws Throwable {
		if (driver.findElement(By.xpath("//*[@id='u_0_2']/div[1]/div[1]/div/a/span"))
				.isDisplayed()) {
			System.out.println("Ingreso correcto");
		}
	}
	


}
