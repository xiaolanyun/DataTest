package com.xiaolanyun.appium.DataTest.testCase.more;
import java.util.Map;
import org.testng.annotations.Test;
import com.xiaolanyun.appium.DataTest.base.BasePrepare;
import com.xiaolanyun.appium.DataTest.pages.HomePage;
import com.xiaolanyun.appium.DataTest.pages.InitPage;
import com.xiaolanyun.appium.DataTest.pagesHelper.HomePageHelper;
import com.xiaolanyun.appium.DataTest.pagesHelper.InitPageHelper;
import com.xiaolanyun.appium.DataTest.pagesHelper.MorePageHelper;

public class MorePage_001_UiCheckForMorePage_Test  extends BasePrepare{
	
	@Test(dataProvider="testData")
	public void uiCheckForMorePage(Map<String, String> data){
		//去除欢迎界面和定位弹窗
		InitPageHelper.handleInit(appiumUtil, InitPage.byElements);
		//在首页上点击更多按钮
		HomePageHelper.clickOnHomePage(appiumUtil, HomePage.HP_BUTTON_MORE);
		//检查更多页面的文本
		MorePageHelper.checkMorePageUIText(appiumUtil, data.get("LOGIN"),data.get("HISTORY"),data.get("SETTINGS"),data.get("FEEDBACK"));
	}

}
