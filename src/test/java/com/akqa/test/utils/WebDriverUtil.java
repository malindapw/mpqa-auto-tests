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



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverUtil {

	private static WebDriver driver;
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
		driver.manage().window().maximize();
		return driver;
	}

	public static void clearWebDriver() {
		if (driver != null) {
			try {
				driver.quit();
			} catch (final WebDriverException e) {
				// Selenium has probably already timed out.
				// This will probably happen every time too so don't print stacktrace.
				System.out.println("Failed to quit WebDriver: " + e.getMessage());
			}

			driver = null;
		}
	}

	private static WebDriver chooseWebDriver() {
		System.setProperty("webdriver.chrome.driver", "//Users//malindaw//Downloads//chromedriver");
		// System.setProperty("webdriver.gecko.driver", "./geckodriver");
		final WebDriver chromeDriver = new ChromeDriver();
		// driver.manage().window().getSize();
		return chromeDriver;
	}
}

