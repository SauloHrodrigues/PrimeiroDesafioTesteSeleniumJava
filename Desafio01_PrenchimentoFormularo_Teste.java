package desafio01;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Desafio01_PrenchimentoFormularo_Teste {
	@Test
	public void preenchimentoFormulario() {
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1200,725));
		driver.get("file:///"+System.getProperty("user.dir")+"/src/main/java/desafio01/componentes.html");
		driver.findElement(By.id("elementosForm:nome")).sendKeys("Saulo Henrique Rodrigues");
		driver.findElement(By.id("elementosForm:sobrenome")).sendKeys("Rodrigues");
		driver.findElement(By.id("elementosForm:sexo:0")).click();
		driver.findElement(By.id("elementosForm:comidaFavorita:0")).click();
		new Select(driver.findElement(By.id("elementosForm:escolaridade"))).selectByVisibleText("Superior");
		new Select(driver.findElement(By.id("elementosForm:esportes"))).selectByVisibleText("Natacao");
		driver.findElement(By.id("elementosForm:cadastrar")).click();
		Assert.assertTrue(driver.findElement(By.id("resultado")).getText().startsWith("Cadastrado!"));
		Assert.assertTrue(driver.findElement(By.id("descNome")).getText().endsWith("Saulo Henrique Rodrigues"));
		Assert.assertTrue(driver.findElement(By.id("descSobrenome")).getText().endsWith("Rodrigues"));
		Assert.assertTrue(driver.findElement(By.id("descSexo")).getText().endsWith("Masculino"));
		Assert.assertTrue(driver.findElement(By.id("descComida")).getText().endsWith("Carne"));
		Assert.assertTrue(driver.findElement(By.id("descEscolaridade")).getText().endsWith("superior"));
		Assert.assertTrue(driver.findElement(By.id("descEsportes")).getText().endsWith("Natacao"));
		Ass
		
		
		driver.quit();
	}

}
