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

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.akqa.test.driver.CachedWebDriver;
import com.akqa.test.utils.WebUtil;

public class MyWishListPage {
	WebDriver driver;

	public MyWishListPage(final CachedWebDriver cachedWebDriver) {
		this.driver = cachedWebDriver;
	}

	public void openWishList() {
		this.driver.findElement(By.cssSelector(".header_navbar-link.header_navbar-link-wishlist")).click();
		WebUtil.waitUntilPageLoaded(this.driver);
	}

	public boolean IsItemOnWishList(final String item) {
		final List<WebElement> itemLists = this.driver.findElements(By.cssSelector("a.GAEvent.display-block"));
		itemLists.forEach(
				itemList -> {
					if (itemList.getText().contains(item)) {
						return;
					}
				}
		);
		return false;
	}
}

