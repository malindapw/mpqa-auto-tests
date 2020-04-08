package com.mpqa.test.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.mpqa.test.driver.CachedWebDriver;
import com.mpqa.test.utils.WebUtil;

public class ProductDetailsPage {

	final private WebDriver driver;
	final private static String ITEM = "//DIV[@class='product-list__prodname product-list__title fn'][text()='%s']";

	public ProductDetailsPage(final CachedWebDriver webdriver) {
		this.driver = webdriver;
	}

	public void selectItem(final String item) {
		WebUtil.waitUntilPageLoaded(this.driver);
		this.driver.findElement(
				By.xpath(String.format(ITEM, item)))
				.click();
	}

	public void addItemToWishList() {
		this.driver.findElement(By.cssSelector("button.btn-add-wishlist")).click();
		// WebUtil.waitUntilVisibilityOfElementLocated(this.driver, By.cssSelector("button.btn-add-wishlist.added"));
		WebUtil.waitUntilConditionMet(this.driver,
				ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.btn-add-wishlist.added")));
	}
}

