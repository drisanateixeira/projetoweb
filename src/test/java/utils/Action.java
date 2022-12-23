package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.qameta.allure.Allure;
import static utils.Asserts.*;
import java.io.ByteArrayInputStream;
import java.util.logging.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Action {

	static Logger logger = Logger.getLogger(Browser.class.toString());

	/**
	 * method open browser
	 * 
	 * @param driver
	 * @param url
	 */
	public static void getBrowser(WebDriver driver, String url) {
		try {
			driver.get(url);
			logger.info(ValidationMessage.PASSED.getValidation());
		} catch (Exception e) {
			logger.info(ValidationMessage.FAILED.getValidation() + e);
		}
		screenshot(driver);
	}

	/**
	 * method to do click
	 * 
	 * @param driver
	 * @param by
	 * @param time
	 * 
	 * @author Adara Drisana
	 */
	public static void click(WebDriver driver, By by, int time) {
		try {
			WebElement element = validateElement(driver, by, time);
			element.click();
			logger.info(ValidationMessage.PASSED.getValidation());
		} catch (Exception e) {
			logger.info(ValidationMessage.FAILED.getValidation() + e);
		}
		screenshot(driver);
	}

	/**
	 * method put text and press Enter
	 * 
	 * @param driver
	 * @param by
	 * @param text
	 * @param time
	 */
	public static void setTextAndEnter(WebDriver driver, By by, String text, int time) {
		try {
			driver.findElement(by).sendKeys(text + Keys.ENTER);
			logger.info(ValidationMessage.PASSED.getValidation());
		} catch (Exception e) {
			logger.info(ValidationMessage.FAILED.getValidation() + e);
		}
		screenshot(driver);
	}

	/**
	 * method put text in the field
	 * 
	 * @param driver
	 * @param by
	 * @param text
	 * @param time
	 * 
	 * @author Adara Drisana
	 */
	public static void setText(WebDriver driver, By by, String text, int time) {
		try {
			WebElement element = validateElement(driver, by, time);
			element.sendKeys(text);
			logger.info(ValidationMessage.PASSED.getValidation());
		} catch (Exception e) {
			logger.info(ValidationMessage.FAILED.getValidation() + e);
		}
		screenshot(driver);
	}

	/**
	 * Method get tex
	 * 
	 * @param driver
	 * @param by
	 * @param time
	 * @return
	 * 
	 * @author Adara Drisana
	 */
	public static String getText(WebDriver driver, By by, int time) {
		String text = null;
		try {
			WebElement element = validateElementExist(driver, by, time);
			if (element != null) {
				text = element.getText().trim();
			}
			logger.info(ValidationMessage.PASSED.getValidation());
		} catch (Exception e) {
			logger.info(ValidationMessage.FAILED.getValidation() + e);
		}
		screenshot(driver);
		return text;
	}

	/**
	 * Method take Screenshot
	 * 
	 * @param driver
	 * 
	 * @author Adara Drisana
	 * 
	 */
	public static void screenshot(WebDriver driver) {
		try {
			Allure.addAttachment("Evidence: ",	new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
			logger.info(ValidationMessage.PASSED.getValidation());
		} catch (Exception e) {
			logger.info(ValidationMessage.FAILED.getValidation() + e);
		}
	}

}
