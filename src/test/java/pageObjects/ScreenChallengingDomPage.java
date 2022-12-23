package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import attributesPage.ScreenChallengingDomAttribute;

import static utils.Action.*;
import static utils.Asserts.*;


public class ScreenChallengingDomPage extends ScreenChallengingDomAttribute{

	private WebDriver driver;
	 
	public ScreenChallengingDomPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void getURL(String url) {
		getBrowser(driver, url);
	}
	
	
	public void procurarBotao() {
		click(driver, quxBotao, 2);
		click(driver,barBotao , 1);
		click(driver,quxSuccessBotao , 1);
	}
	
	
	public void deletarDezVezes() {
		int i =1;
		while (i <= 10) {
			click(driver, By.xpath("(//a[@href='#delete'][text()='delete'])[\""+i+"\"]"), 0);
			i++;
		}
		
	}
	
	public void editarDezVezes() {
		int i =1;
		while (i <= 10) {
			click(driver, By.xpath("(//a[@href='#edit'][text()='edit'])[\""+i+"\"]"), 0);
			i++;
			
		}
		
	}
}
