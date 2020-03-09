package com.test.step.logic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.step.definitions.Hook;

import cucumber.api.DataTable;

public class TiendaVirtualLogic {

	public static WebDriver driver = Hook.getDriver();
	public static WebDriverWait wait = new WebDriverWait(TiendaVirtualLogic.driver, 120);
	public static JavascriptExecutor js = (JavascriptExecutor) driver;
	
	public static void clickUserButton() throws InterruptedException {
		WebElement button = driver.findElement(By.id("Header_GlobalLogin_signInQuickLink"));
		button.click();
	}

	public static void completeLoginForm(DataTable data) throws InterruptedException {
		List<List<String>> dat = data.raw();
		WebElement id = driver.findElement(By.id("Header_GlobalLogin_WC_AccountDisplay_FormInput_logonId_In_Logon_1"));
		WebElement pass = driver.findElement(By.id("Header_GlobalLogin_WC_AccountDisplay_FormInput_logonPassword_In_Logon_1"));

		id.sendKeys(dat.get(0).get(0));
		pass.sendKeys(dat.get(0).get(1));
	}

	public static void clickOnLoginButton() throws InterruptedException {
			WebElement button = driver.findElement(By.id("Header_GlobalLogin_WC_AccountDisplay_links_2"));
			button.click();
			Thread.sleep(5000);
	}

	public static void clickImagenEquipo() throws InterruptedException {
		WebElement button = driver.findElement(By.id("catalogEntry_img24596"));
		button.click();
		Thread.sleep(5000);
	}

	public static void seleccionarModalidad() throws InterruptedException {
		WebElement modalidad = driver.findElement(By.id("conditionModality"));
		modalidad.sendKeys("Prepago Linea nueva");
		modalidad.click();
		Thread.sleep(3000);
	}

	public static void clickAddCarrito() throws InterruptedException {
		WebElement button = driver.findElement(By.id("productPageAdd2Cart"));
		button.click();
		Thread.sleep(5000);
		
	}

	public static void clickGoCarrito() throws InterruptedException {
		WebElement button = driver.findElement(By.id("GotoCartButton2"));
		button.click();
//		Thread.sleep(5000);
	}

	public static void clickContinuar() throws InterruptedException {
		WebElement button = driver.findElement(By.id("shopcartCheckout"));
		button.click();
		Thread.sleep(5000);
	}

	public static void completaInfoCompra() throws InterruptedException {
		WebElement ubigeo = driver.findElement(By.xpath("//*[@class = 'coverage_content content-step-info1']"))
				.findElement(By.xpath("//*[@class = 'item_shipping_billing']"))
				.findElement(By.xpath("//*[@class = 'ubigeo_item']"));
		
		WebElement departamento = ubigeo.findElement(By.id("departamentoSelections")).findElement(By.id("selectDepartamentoClaro"));
//		departamento.findElement(By.xpath("//*[@class = 'dijitReset dijitStretch dijitButtonContents']"));
//		departamento.findElement(By.xpath("//*[@class = 'dijitReset dijitInputField dijitButtonText']"));
//		departamento.findElement(By.xpath("//*[@class = 'dijitReset dijitInline dijitSelectLabel dijitValidationTextBoxLabel ']"));
		
		departamento.sendKeys("LIMA");
		departamento.click();
				
		WebElement provincia = ubigeo.findElement(By.id("provinceClaroSelections")).findElement(By.id("selectProvinciaClaro"));
		provincia.sendKeys("ABANCAY");
		provincia.click();
		
		WebElement distrito = ubigeo.findElement(By.id("distritoClaroSelections")).findElement(By.id("selectDistritoClaro"));
		distrito.sendKeys("ABANCAY");
		distrito.click();
		
//		WebElement centroPoblado = ubigeo.findElement(By.id("centroPobladoClaroSelections")).findElement(By.id("selectCentroPobladoClaro"));
//		centroPoblado.sendKeys("ABANCAY");
//		centroPoblado.click();
//		Thread.sleep(3000);
	}

	public static void clickCentroPoblado() throws InterruptedException {
		WebElement button = driver.findElement(By.id("dirCenterSubSection"));
		button.click();
		
		WebElement departamento = driver.findElement(By.id("selectCacDepartamentoClaro"));
		departamento.sendKeys("HUANUCO");
		departamento.click();
		
		WebElement provincia = driver.findElement(By.id("cacProvinciaClaroSelections"));
		provincia.sendKeys("HUANUCO");
		provincia.click();
		
		WebElement distrito = driver.findElement(By.id("cacDistritoClaroSelections"));
		distrito.sendKeys("SAN FRANCISCO DE CAYRAN");
		distrito.click();
		Thread.sleep(3000);
	}
	
	public static void clickFormaPago() throws InterruptedException {
		WebElement button = driver.findElement(By.id("rowPagoEntrega"));
		button.click();
	}
	
	public static void clickCheckTerminos() throws InterruptedException {
		WebElement button = driver.findElement(By.id("checkTermPorta"));
		button.click();
	}
	
	public static void clickFinalizarPedido() throws InterruptedException {
		WebElement button = driver.findElement(By.id("bt_eval"));
		button.click();
	}

	public static void clickCrearCuenta() throws InterruptedException {
		Thread.sleep(3000);
		WebElement button = driver.findElement(By.id("Header_GlobalLogin_WC_AccountDisplay_links_3"));
		button.click();
	}

	public static void completeDatosPersonales(DataTable data) throws InterruptedException {
		List<List<String>> dat = data.raw();
		WebElement nombres = driver.findElement(By.id("WC_UserRegistrationAddForm_NameEntryForm_FormInput_firstName_1"));
		WebElement apePaterno = driver.findElement(By.id("WC_UserRegistrationAddForm_NameEntryForm_FormInput_lastName_1"));
		WebElement apeMaterno = driver.findElement(By.id("WC_UserRegistrationAddForm_NameEntryForm_FormInput_middleName_1"));
		WebElement tipoDocumento = driver.findElement(By.id("demographicField6"));
		WebElement nroDocumento = driver.findElement(By.id("WC_UserRegistrationAddForm_FormInput_demographicField7_In_Register_1"));
		WebElement telPrincipal = driver.findElement(By.id("WC_UserRegistrationAddForm_FormInput_phoneNum_In_Register_1"));
		
		nombres.sendKeys(dat.get(0).get(0));
		apePaterno.sendKeys(dat.get(0).get(1));
		apeMaterno.sendKeys(dat.get(0).get(2));
		tipoDocumento.sendKeys("DNI");
		tipoDocumento.click();
		Thread.sleep(3000);
		nroDocumento.sendKeys(dat.get(0).get(3));
		telPrincipal.sendKeys(dat.get(0).get(4));
	}
	
	public static void completeDatosCuenta(DataTable data) throws InterruptedException {
		List<List<String>> dat = data.raw();
		WebElement correo = driver.findElement(By.id("WC_UserRegistrationAddForm_FormInput_logonId_In_Register_1_1"));
		WebElement pass = driver.findElement(By.id("WC_UserRegistrationAddForm_FormInput_logonPassword_In_Register_1"));
		WebElement confirmPass = driver.findElement(By.id("WC_UserRegistrationAddForm_FormInput_logonPasswordVerify_In_Register_1"));
		
		correo.sendKeys(dat.get(0).get(0));
		pass.sendKeys(dat.get(0).get(1));
		confirmPass.sendKeys(dat.get(0).get(2));
	}

	public static void clickCrearCuentaButton() throws InterruptedException {
		WebElement button = driver.findElement(By.id("WC_UserRegistrationAddForm_links_1"));
		button.click();
		Thread.sleep(3000);
	}
	
	public static void clickMiCuenta() throws InterruptedException {
		WebElement button = driver.findElement(By.xpath("//*[@class = 'panel loggedInContractSelectPanel']")).findElement(By.id("myAccountQuickLink"));
		button.click();
	}

	public static void clickMenuHistorialPedidos() throws InterruptedException {
		WebElement button = driver.findElement(By.id("li_MyAccount_8"));
		button.click();
		Thread.sleep(6000);
	}

	public static void clickPerfilButton() throws InterruptedException {
		WebElement button = driver.findElement(By.id("Header_GlobalLogin_signOutQuickLinkUser"));
		button.click();
	}

}