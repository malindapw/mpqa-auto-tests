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

import com.akqa.test.driver.CachedWebDriver;
import com.akqa.test.utils.WebUnitl;

public class Resultpage {

	CachedWebDriver webdriver;

	public Resultpage() {
	}

	public void rangeResultsHasResults() {
		WebUnitl.waitUntilPageLoaded(this.webdriver);
//		final WebDriverWait wait = new WebDriverWait(WebDriverUtil.getDefaultDriver(), 10);
//		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(
//				By.xpath("//div[contains(@class,'paged-results')]")));
//		assertTrue(WebDriverUtil.getDefaultDriver().findElements(By.className("product-list-group paged-items")).size() > 0);
		//
	}

}

