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
package com.mpqa.test.utils;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;



public class WebUtil {

	public static final int TIMEOUT = 60;
	private static final Logger LOGGER = Logger.getLogger(WebUtil.class);

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

	public static void waitUntilVisibilityOfElementLocated(final WebDriver webDriver, final By condition) {
		try {
			new WebDriverWait(webDriver, TIMEOUT).until(
					driver -> ExpectedConditions.visibilityOfElementLocated(condition));
		} catch (final TimeoutException ex) {
			LOGGER.warn("Selenium has failed to detect the visibility of element");
		}
	}

	public static void waitUntilAutoCompleteLoaded(final WebDriver webDriver, final By condition) {
		waitUntilConditionMet(webDriver, new ExpectedCondition<Boolean>() {
			@Override
			public Boolean apply(final WebDriver driver) {
				return driver.findElement(condition).isDisplayed();
			}
		});
	}

	public static <T, E> T waitUntilConditionMet(final E input, final Function<E, T> condition) {
		return await(input).until(condition);
	}

	private static <T> FluentWait<T> await(final T driver) {
		return new Wait<T>(driver);
	}
}

