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

import com.akqa.test.utils.WebDriverUtil;

public class Homepage {

	private final WebDriver driver;

	public Homepage() {
		this.driver = WebDriverUtil.getDefaultDriver();
	}

	private static final By SEARCH_CONTAINER = By.xpath("//div[contains(@class,'search-container_container')]//input[@type='text']");

	public void searchAnItem(final String searchItem) {
		this.driver.findElement(SEARCH_CONTAINER).sendKeys(searchItem);
		final List<WebElement> searches = this.driver
				.findElements(By.xpath(".//*[contains(@class,'search-container_history_item')]"));
		searches.get(0).click();
	}
}

