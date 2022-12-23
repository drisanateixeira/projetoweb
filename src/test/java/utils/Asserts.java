package utils;

import org.openqa.selenium.By;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static utils.Action.*;

public class Asserts {

	/**
	 * Method varify element is clickable
	 * 
	 * @param driver
	 * @param by
	 * @param time
	 * @return
	 * 
	 * @author Adara Drisana
	 */
	public static WebElement validateElement(WebDriver driver, By by, int time) {
		return new WebDriverWait(driver, time).until(ExpectedConditions.elementToBeClickable(by));
	}

	/**
	 * Method verify element is visible
	 * 
	 * @param driver
	 * @param by
	 * @param time
	 * @return
	 * 
	 * @author Adara Drisana
	 */
	public static WebElement validateElementExist(WebDriver driver, By by, int time) {
		return new WebDriverWait(driver, time).until(ExpectedConditions.visibilityOfElementLocated(by));
	}

	/**
	 * Method assert element is equals
	 * 
	 * @param driver
	 * @param by
	 * @param time
	 * @param expected
	 * 
	 * @author Adara Drisana
	 */
	public static void assertEqualsGetText(WebDriver driver, By by, int time, String expected) {
		Assert.assertEquals(expected, getText(driver, by, time).replaceAll("\"", ""));
	}

}
