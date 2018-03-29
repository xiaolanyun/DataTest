package com.xiaolanyun.appium.DataTest.testCase.search;

import java.util.Map;

import org.testng.annotations.Test;

import com.xiaolanyun.appium.DataTest.base.BasePrepare;
import com.xiaolanyun.appium.DataTest.pages.HomePage;
import com.xiaolanyun.appium.DataTest.pages.InitPage;
import com.xiaolanyun.appium.DataTest.pages.SearchNativePage;
import com.xiaolanyun.appium.DataTest.pages.SearchWebviewPage;
import com.xiaolanyun.appium.DataTest.pagesHelper.HomePageHelper;
import com.xiaolanyun.appium.DataTest.pagesHelper.InitPageHelper;
import com.xiaolanyun.appium.DataTest.pagesHelper.SearchNativePageHelper;
import com.xiaolanyun.appium.DataTest.pagesHelper.SearchWebviewPageHelper;

public class SearchPage_001_SearchDemo_Test  extends BasePrepare{
	
	@Test(dataProvider="testData")
	public void searchDemo(Map<String, String> data){
		//去除欢迎界面和定位弹窗
		InitPageHelper.handleInit(appiumUtil, InitPage.byElements);
		//点击搜索按钮
		HomePageHelper.clickOnHomePage(appiumUtil, HomePage.HP_BUTTON_SEARCH);
		//在搜索界面输入框输入Java
		SearchNativePageHelper.typeInfo(appiumUtil, SearchNativePage.SNP_INPUT_SEARCH, data.get("KEYWORD"));
		//点击搜索网页，进行搜索
		SearchNativePageHelper.clickOnSearchNativePage(appiumUtil, SearchNativePage.SNP_LINK_WEBSEARCH);
		//进入webview内容
		SearchWebviewPageHelper.enterWebview(appiumUtil, SearchWebviewPage.WEBVIEW_NAME);
		//等待webview内容显示出来
		SearchWebviewPageHelper.waitForSearchResultDisplay(appiumUtil, elementTimeOut);
		//验证搜索的结果是否包含Java
		SearchWebviewPageHelper.checkResultFitKeyword(appiumUtil, data.get("KEYWORD"), SearchWebviewPage.SWP_LINK_RESULT);
	}

}
