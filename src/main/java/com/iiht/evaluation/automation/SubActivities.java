package com.iiht.evaluation.automation;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SubActivities {
	public static WebElement find_element_use_xpath(WebDriver driver, String xpath) {
		WebElement requiredElement = null;
		Duration timeout = Duration.ofSeconds(10);
		try {
			requiredElement = new WebDriverWait(driver, timeout)
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
		} catch (Exception ex) {
			System.out.println("ex " + ex);
		} finally {
			return requiredElement;
		}
	}
}
	

