package com.mpqa.test.utils;

import org.openqa.selenium.WebDriver;

public class NavigateUtil {

	private final WebDriver driver;

	public NavigateUtil() {
		this.driver = WebDriverUtil.getDefaultDriver();
	}
	/** Method to open link
	 * @param url : String : URL for navigation
	 */
	public void navigateTo(final String url)
	{
		this.driver.get(url);
		WebUtil.waitUntilPageLoaded(this.driver);
	}

}

