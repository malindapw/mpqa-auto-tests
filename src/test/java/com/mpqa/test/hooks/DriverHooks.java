package com.mpqa.test.hooks;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;

import com.mpqa.test.driver.CachedWebDriver;
import com.mpqa.test.utils.WebDriverUtil;

import cucumber.api.Scenario;
import cucumber.api.java.After;

public class DriverHooks {

	WebDriverUtil wbDriverUtil;
	private final CachedWebDriver cachedWebDriver;

	public DriverHooks(final CachedWebDriver cachedWebDriver) {
		this.cachedWebDriver = cachedWebDriver;
	}

	public static final int TAKE_SCREENSHOT_AFTER = 1;
	public static final int SNAPSHOT_DOM_AFTER = 2;
	public static final int CLEAN_UP_WEB_DRIVER_AFTER = 0;

	@After()
	public void afterScenario(final Scenario scenario) {
		if (scenario.isFailed()) {
			embedScreenshot(scenario);
		}
		try {
			WebDriverUtil.clearWebDriver();
		} catch (final WebDriverException e) {
			scenario.write("Failed to clean up driver with exception:" + e.getMessage());
		}
	}

	private void embedScreenshot(final Scenario scenario) {
		try {
			final byte[] screenshot = this.cachedWebDriver.getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshot, "image/png");
		} catch (final UnsupportedOperationException somePlatformsDontSupportScreenshots) {
			System.err.println(somePlatformsDontSupportScreenshots.getMessage());
		} catch (final WebDriverException e) {
			scenario.write("Failed to take screenshot with exception:" + e.getMessage());
		}
	}

}

