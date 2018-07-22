/*
 * Copyright (c) Orchestral Developments Ltd and the Orion Health group of companies (2001 - 2018).
 *
 * This document is copyright. Except for the purpose of fair reviewing, no part
 * of this publication may be reproduced or transmitted in any form or by any
 * means, electronic or mechanical, including photocopying, recording, or any
 * information storage and retrieval system, without permission in writing from
 * the publisher. Infringers of copyright render themselves liable for
 * prosecution.
 */
package com.akqa.test.utils;



import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

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

		switch (driverType.toLowerCase()) {
			case "firefox":
				System.setProperty("webdriver.gecko.driver", "./geckodriver");
				final WebDriver fireFoxDriver = new ChromeDriver();
				return fireFoxDriver;
			case "chrome":
				System.setProperty("webdriver.chrome.driver", "//Users//malindaw//Downloads//chromedriver");
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

