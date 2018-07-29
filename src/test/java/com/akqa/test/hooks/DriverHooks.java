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
package com.akqa.test.hooks;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;

import com.akqa.test.driver.CachedWebDriver;
import com.akqa.test.utils.WebDriverUtil;

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

