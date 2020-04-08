package com.mpqa.test.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mpqa.test.driver.CachedWebDriver;
import com.mpqa.test.utils.WebUtil;

public class MyWishListPage {
	WebDriver driver;

	public MyWishListPage(final CachedWebDriver cachedWebDriver) {
		this.driver = cachedWebDriver;
	}

	public void openWishList() {
		this.driver.findElement(By.cssSelector(".header_navbar-link.header_navbar-link-wishlist")).click();
		WebUtil.waitUntilPageLoaded(this.driver);
	}

	public boolean IsItemOnWishList(final String item) {
		final List<WebElement> itemLists = this.driver.findElements(By.cssSelector("a.GAEvent.display-block"));
		return itemLists.stream().anyMatch(itemList -> itemList.getText().contains(item));
	}
}

