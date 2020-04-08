package com.mpqa.test.utils;



import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverUtil {

	private static WebDriver driver;
	// private static Dimension defaultDimension;
	public static long DEFAULT_WAIT = 20;

	static {
		Runtime.getRuntime().addShutdownHook(new Thread() {
			@Override
			public void run() {
				clearWebDriver();
			}
		});
	}

	public static WebDriver getDefaultDriver() {
		if (driver != null) {
			return driver;
		}
		driver = chooseWebDriver();
		driver.manage().timeouts().setScriptTimeout(DEFAULT_WAIT,
				TimeUnit.SECONDS);
		// driver.manage().window().setSize(new Dimension(2560, 1440));
		return driver;
	}

	public static void clearWebDriver() {
		if (driver != null) {
			try {
				driver.quit();
			} catch (final WebDriverException e) {
				System.out.println("Failed to quit WebDriver: " + e.getMessage());
			}

			driver = null;
		}
	}

	private static WebDriver chooseWebDriver() {
		final String driverType = getTestUserProperties().getProperty("driver.type");
		final String chromeDriverLocation = getTestUserProperties().getProperty("chrome.driver.location");
		final String geckoDriverLocation = getTestUserProperties().getProperty("gecko.driver.location");

		switch (driverType.toLowerCase()) {
			case "firefox":
				System.setProperty("webdriver.gecko.driver", geckoDriverLocation);
				final WebDriver fireFoxDriver = new FirefoxDriver();
				return fireFoxDriver;
			case "chrome":
				System.setProperty("webdriver.chrome.driver", chromeDriverLocation);
				final WebDriver chromeDriver = new ChromeDriver();
				return chromeDriver;
			default:
				throw new IllegalArgumentException("Wrong choice of web driver");
		}
	}

	/**
	 * Read properties from configuration file.
	 *
	 * @return the properties.
	 */
	private static Properties getTestUserProperties() {
		final URL dataURL = WebDriverUtil.class.getClassLoader().getResource("environment.properties");
		final Properties props = new Properties();
		try {
			props.load(dataURL.openStream());
		} catch (final IOException e) {
			throw new RuntimeException(e);
		}

		return props;
	}
}

