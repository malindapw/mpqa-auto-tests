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
package com.mpqa.test.pageobjects;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mpqa.test.driver.CachedWebDriver;
import com.mpqa.test.utils.WebUtil;

public class Resultpage {

	final private WebDriver driver;

	public Resultpage(final CachedWebDriver webdriver) {
		this.driver = webdriver;
	}

	public void rangeResultsHasResults() {
		WebUtil.waitUntilPageLoaded(this.driver);
		WebUtil.waitUntilVisibilityOfElementLocated(this.driver, By.cssSelector(".paged-results"));
		final List<WebElement> resultsLists = this.driver.findElements(By.cssSelector(".product-list__item"));
		Assert.assertTrue(resultsLists.size() > 0);
	}

}

