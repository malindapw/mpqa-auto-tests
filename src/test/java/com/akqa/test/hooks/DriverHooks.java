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

import com.akqa.test.utils.WebDriverUtil;

import cucumber.api.Scenario;
import cucumber.api.java.After;

public class DriverHooks {

	WebDriverUtil wbDriverUtil;

	public static final int CLEAN_UP_WEB_DRIVER_AFTER = 0;

	@After(order = CLEAN_UP_WEB_DRIVER_AFTER)
	public void afterScenario(final Scenario result) {
		if (result.getName().contains("The number of errors and warnings displayed")) {
			return;
		}
		WebDriverUtil.clearWebDriver();
	}

}

