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

import static org.junit.Assert.assertTrue;

import com.akqa.test.pageobjects.Homepage;
import com.akqa.test.pageobjects.MyWishListPage;
import com.akqa.test.pageobjects.ProductDetailsPage;
import com.akqa.test.pageobjects.Resultpage;
import com.akqa.test.utils.NavigateUtil;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;




public class WishListStepDefs {

	// private final NavigateUtil navigate;
	private final Homepage homepage;
	private final Resultpage resultpage;
	private final ProductDetailsPage productDetailsPage;
	private final MyWishListPage myWishListPage;

	public WishListStepDefs(final Homepage homepage, final Resultpage resultpage, final ProductDetailsPage productDetailsPage,
			final MyWishListPage myWishListPage) {
		this.homepage = homepage;
		this.resultpage = resultpage;
		this.productDetailsPage = productDetailsPage;
		this.myWishListPage = myWishListPage;
	}

	@Then("^I open \"([^\"]*)\"$")
	public void I_open(final String link) {
		final NavigateUtil navigate = new NavigateUtil();
		navigate.navigateTo(link);
	}


	@When("^I search an item '(.*)'$")
	public void i_search_an_item_paint(final String searchItem) {
		this.homepage.searchAnItem(searchItem);
	}

	@Then("^I can see the results$")
	public void i_can_see_the_results() {
		this.resultpage.rangeResultsHasResults();
	}

	@Then("^I can add \"([^\"]*)\" in to my wish list$")
	public void i_can_add_in_to_my_wish_list(final String item) {
		this.productDetailsPage.selectItem(item);
		this.productDetailsPage.addItemToWishList();
		this.myWishListPage.openWishList();
		assertTrue(this.myWishListPage.IsItemOnWishList(item));
	}
}

