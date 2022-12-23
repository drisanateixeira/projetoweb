package stepDefinitions;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.qameta.allure.Allure;
import utils.Browser;
import utils.Log;
 
public class ServiceHooks {

	Browser base;
	Logger log = Log.getLogger(ServiceHooks.class);
	 

	@Before
	public void initializeTest() throws  Exception {
		base = new Browser();
		base.inicializandoNavegador();
	 
	}

	
	@Test
	public void getScrollStatus() throws Exception {
		Browser.driver.manage().window().setSize(new Dimension(1366, 768));
		Thread.sleep(2000);
	}

	@After(order = 1)
	public void endTest(Scenario cenario) {
		if (cenario.isFailed()) {
			byte[] screenshootBytes = ((TakesScreenshot) Browser.driver).getScreenshotAs(OutputType.BYTES);
			InputStream screenshootStream = new ByteArrayInputStream(screenshootBytes);
			 Allure.addAttachment(cenario.getName(), screenshootStream);
			try {
				log.info(cenario.getName());
				 Allure.addAttachment(cenario.getName(), screenshootStream);
			 
			} catch (Exception e) {
				e.printStackTrace();
			}
		}		
		 else {
			 byte[] screenshootBytes = ((TakesScreenshot) Browser.driver).getScreenshotAs(OutputType.BYTES);
			 InputStream screenshootStream = new ByteArrayInputStream(screenshootBytes);
			 Allure.addAttachment(cenario.getName(), screenshootStream);
			 
			try {
			 	log.info(cenario.getName());
			 	 Allure.addAttachment(cenario.getName(), screenshootStream);
				 
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	

	@After(order = 0)
	public void fecharBrowser() throws Exception {
		Browser.driver.quit();
	}

}
