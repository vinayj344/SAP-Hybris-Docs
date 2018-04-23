/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2015 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *
 *
 */
package de.hybris.platform.addons.merchandisecheckoutaddon.constants;

/**
 * Global class for all Merchandisecheckoutaddon web constants. You can add global constants for your extension into this class.
 */
public final class MerchandisecheckoutaddonWebConstants
{
	//Dummy field to avoid pmd error - delete when you add the first real constant!
	public static final String deleteThisDummyField = "DELETE ME";
	final String ADDON_PREFIX = "addon:/merchandisecheckoutaddon/";
	String GiftWrapPage = ADDON_PREFIX + "pages/checkout/multi/giftWrapPage";

	private MerchandisecheckoutaddonWebConstants()
	{
		//empty to avoid instantiating this constant class
	}

	// implement here constants used by this extension
}
