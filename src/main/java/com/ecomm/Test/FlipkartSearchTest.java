package com.ecomm.Test;

import java.io.IOException;
import java.text.ParseException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ecomm.Helper.ExcelReader;
import com.ecomm.Logic.FlipkartSearch;

public class FlipkartSearchTest extends FlipkartSearch {
	ExcelReader read = new ExcelReader();

	@Test(description = "Search Test", dataProvider = "laptop")
	public void searchTestPass(String url, String browser, String data)
			throws ParseException {
		search(url, browser, data);
		Assert.assertNotNull(element(locator("BuyNow")));
		Assert.assertNotNull(element(locator("AddToCart")));

	}

	@DataProvider(name = "laptop")
	public Object[][] dataProvideremail() throws IOException {

		read.testDataFile(File);
		Object[][] data = new Object[][] { { read.readFromColumn("Base", 1, 0),
				read.readFromColumn("Base", 1, 8),
				read.readFromColumn("Base", 1, 1), } };
		read.closeFile();
		return data;
	}
}
