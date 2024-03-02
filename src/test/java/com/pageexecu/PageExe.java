package com.pageexecu;

import com.baseclass.BaseClass;
import com.locators.Locators;

public class PageExe extends Locators {
	public static void userName(String data) {
		BaseClass.input_Data(Locators.getLoginDetails("username"),data);
	}
	public static void password(String data) {
		BaseClass.input_Data(Locators.getLoginDetails("password"),data);
		}
	public static void loginButton() {
		BaseClass.click_value(Locators.getLoginDetails("login"));
	}
}
