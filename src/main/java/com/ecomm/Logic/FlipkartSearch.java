package com.ecomm.Logic;

import java.text.ParseException;
import com.ecomm.Helper.Action;

public class FlipkartSearch extends Action {

	public void search(String url, String browser, String data)
			throws ParseException {
		openUrl(url);
		//click on the search bar
		click(locator("SearchBox"));
		// look for laptops
		type(locator("SearchBox"), data);
		click(locator("SearchButton"));
		// list of all laptops according to their popularity 
		click(locator("SortButton"));
		//n get the details of the laptop.
		click(locator("ProductDetails"));

	}

}
