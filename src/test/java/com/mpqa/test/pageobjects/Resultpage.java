package com.mpqa.test.pageobjects;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mpqa.test.driver.CachedWebDriver;
import com.mpqa.test.utils.WebUtil;

public class Resultpage {

	final private WebDriver driver;

	public Resultpage(final CachedWebDriver webdriver) {
		this.driver = webdriver;
	}

	public void rangeResultsHasResults() {
		WebUtil.waitUntilPageLoaded(this.driver);
		WebUtil.waitUntilVisibilityOfElementLocated(this.driver, By.cssSelector(".paged-results"));
		final List<WebElement> resultsLists = this.driver.findElements(By.cssSelector(".product-list__item"));
		Assert.assertTrue(resultsLists.size() > 0);
	}

}

