package com.xiaolanyun.appium.DataTest.pagesHelper;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import com.xiaolanyun.appium.DataTest.utils.AppiumUtil;

public class SearchNativePageHelper {
	
	public static Logger logger = Logger.getLogger(InitPageHelper.class);
	
	/**在此原生搜索页面点击操作*/
	public static void clickOnSearchNativePage(AppiumUtil appiumUtil,By byElement){
		
		appiumUtil.click(byElement);
	}
	
	/**向输入框输入内容*/
	public static void typeInfo(AppiumUtil appiumUtil,By byElement,String info){
		appiumUtil.typeContent(byElement, info);
	}
	
	/**清空输入框内容*/
	public static void clearContent(AppiumUtil appiumUtil,By byElement){
		appiumUtil.clear(byElement);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
