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
package com.mpqa.test.driver;

import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.mpqa.test.utils.WebDriverUtil;

public class CachedWebDriver extends EventFiringWebDriver {

	public CachedWebDriver() {
		super(WebDriverUtil.getDefaultDriver());
	}
}

