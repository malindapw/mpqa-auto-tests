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

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;



public class WebUnitl {

	public static final int TIMEOUT = 60;
	private static final Logger LOGGER = Logger.getLogger(WebUnitl.class);

	public static class Wait<T> extends FluentWait<T> {
		public Wait(final T t) {
			super(t);
			withTimeout(TIMEOUT, TimeUnit.SECONDS);
			// Ignore exceptions commonly caused by page reloads/DOM updates
			ignoring(StaleElementReferenceException.class);
			ignoring(NoSuchElementException.class);
			ignoring(NoSuchFrameException.class);
		}
	}

	public static void waitUntilPageLoaded(final WebDriver webDriver) {
		try {
			new WebDriverWait(webDriver, TIMEOUT).until(
					driver -> ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete"));
		} catch (final TimeoutException ex) {
			LOGGER.warn("Selenium has failed to detect if the page has loaded. Allowing tests to continue as they may still pass.");
		}
	}
}

