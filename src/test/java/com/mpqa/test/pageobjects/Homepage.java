package com.mpqa.test.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.mpqa.test.driver.CachedWebDriver;
import com.mpqa.test.utils.WebUtil;

public class Homepage {

	private final CachedWebDriver driver;

	public Homepage(final CachedWebDriver driver) {
		this.driver = driver;
	}

	private static final By SEARCH_CONTAINER = By.xpath("//div[contains(@class,'search-container_container')]//input[@type='text']");
	private static final By AUTO_COMPLETE_ELEMENT_LIST = By.id("ui-id-2");

	public void searchAnItem(final String searchItem) {
		this.driver.findElement(SEARCH_CONTAINER).sendKeys(searchItem);
		WebUtil.waitUntilAutoCompleteLoaded(this.driver, AUTO_COMPLETE_ELEMENT_LIST);
		final List<WebElement> searches = this.driver
				.findElements(By.xpath("//ul[@id='ui-id-2']//li[@class='ui-menu-item']"));
		searches.get(1).click();
	}
}

