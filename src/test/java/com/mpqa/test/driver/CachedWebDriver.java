package com.mpqa.test.driver;

import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.mpqa.test.utils.WebDriverUtil;

public class CachedWebDriver extends EventFiringWebDriver {

	public CachedWebDriver() {
		super(WebDriverUtil.getDefaultDriver());
	}
}

