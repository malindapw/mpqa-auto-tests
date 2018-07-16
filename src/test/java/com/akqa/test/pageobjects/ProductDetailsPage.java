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
package com.akqa.test.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.akqa.test.driver.CachedWebDriver;
import com.akqa.test.utils.WebUtil;

public class ProductDetailsPage {

	final private WebDriver driver;
	final private static String ITEM = "//DIV[@class='product-list__prodname product-list__title fn'][text()='%s']";

	public ProductDetailsPage(final CachedWebDriver webdriver) {
		this.driver = webdriver;
	}

	public void selectItem(final String item) {
		WebUtil.waitUntilPageLoaded(this.driver);
		this.driver.findElement(
				By.xpath(String.format(ITEM, item)))
				.click();
	}

	public void addItemToWishList() {
		this.driver.findElement(By.cssSelector("button.btn-add-wishlist.inactive")).click();
		// WebUtil.waitUntilVisibilityOfElementLocated(this.driver, By.cssSelector("button.btn-add-wishlist.added"));
		WebUtil.waitUntilConditionMet(this.driver,
				ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.btn-add-wishlist.added")));
	}
}

