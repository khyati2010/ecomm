package com.ecomm.Logic;

import java.text.ParseException;
import com.ecomm.Helper.Action;

public class FlipkartSearch extends Action {

	public void search(String url, String browser, String data)
			throws ParseException {
		openUrl(url);
		click(locator("SearchBox"));
		type(locator("SearchBox"), data);
		click(locator("SearchButton"));
		click(locator("SortButton"));
		click(locator("ProductDetails"));

	}

}
