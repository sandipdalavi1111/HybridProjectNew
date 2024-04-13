package com.test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.pom.HomePage;
import com.utility.Base;
import com.utility.ExcelDataProvider;

public class VerifyLoginPage extends Base {

	@Test
	public void verifyLoginePage() throws IOException {

		HomePage hp = new HomePage(driver);
		
		ExcelDataProvider edp = new ExcelDataProvider();
		edp.getData();
		
		String user = edp.getStringData("Sheet1", 0, 0);
		hp.username(user);
		String pass = edp.getStringData("Sheet1", 1, 0);
		hp.password(pass);
//		hp.password();
//		hp.login();

}
}