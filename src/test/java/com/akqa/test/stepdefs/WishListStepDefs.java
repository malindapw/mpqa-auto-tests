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
package com.akqa.test.stepdefs;

import com.akqa.test.baseobjects.baseObjects;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;




public class WishListStepDefs implements baseObjects {


	@Then("^I open \"([^\"]*)\"$")
	public void I_open(final String link) {
		navigate.navigateTo(link);
	}


	@When("^I search an item '(.*)'$")
	public void i_search_an_item_paint(final String searchItem) {
		homepage.searchAnItem(searchItem);
	}

	@Then("^I can see the results$")
	public void i_can_see_the_results() {
		resultpage.rangeResultsHasResults();
	}
}

