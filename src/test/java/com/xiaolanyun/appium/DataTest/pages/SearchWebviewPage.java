package com.xiaolanyun.appium.DataTest.pages;

import org.openqa.selenium.By;

/**@author xiaolanyun
 * @description 搜索页面元素
 * */

public class SearchWebviewPage {
	/**WebView名字*/
	 public static final String WEBVIEW_NAME = "WEBVIEW_com.microsoft.bing";
	 
	 /*
	  * webview中网页，图片，视频，学术，词典
	  */
	 public static final By SNP_LINK_WEBSEARCH2 =By.xpath("//android.view.View[@text='网页']");
	 public static final By SNP_LINK_IMAGESEARCH2 =By.xpath("//android.view.View[@text='图片']");
	 public static final By SNP_LINK_VEDIOSEARCH2 = By.xpath("//android.view.View[@text='视频']");
	 public static final By SNP_LINK_ACADEMICSEARCH2 = By.xpath("//android.view.View[@text='学术']");
	 public static final By SNP_LINK_DICTSEARCH2= By.xpath("//android.view.View[@text='词典']");
	
	 /**搜索的结果列表*/
	// public static final By SWP_LINK_RESULT = By.xpath("//*[@class='deeplink_title']");
	 public static final By SWP_LINK_RESULT = By.id("b_results");
	 
	 /**全部搜索*/
	 //public static final By SWP_LINK_ALLSEARCH = By.xpath("//*[@class='b_hList']/li[2]");
	 /**英文搜索*/
	 //public static final By SWP_LINK_ENGLISHSEARCH = By.xpath("//*[@class='b_hList']/li[4]");

	 
	 
	 
	

}
