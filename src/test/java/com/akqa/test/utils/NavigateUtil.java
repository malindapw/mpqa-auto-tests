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

import org.openqa.selenium.WebDriver;

public class NavigateUtil {

	private final WebDriver driver;

	public NavigateUtil() {
		this.driver = WebDriverUtil.getDefaultDriver();
	}
	/** Method to open link
	 * @param url : String : URL for navigation
	 */
	public void navigateTo(final String url)
	{
		this.driver.get(url);
		WebUtil.waitUntilPageLoaded(this.driver);
	}

}

