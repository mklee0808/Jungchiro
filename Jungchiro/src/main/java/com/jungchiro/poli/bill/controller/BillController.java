package com.jungchiro.poli.bill.controller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BillController {

	public static void main(String[] args) {

		BillController bill = new BillController();
		bill.crawl();

	}

	// WebDriver
	private WebDriver driver;

	// Properties
	public static final String WEB_DRIVER_ID = "webdriver.chrome.driver";
	public static final String WEB_DRIVER_PATH = "C:\\ChromeDriver/chromedriver.exe";

	// 크롤링 할 URL
	private String base_url;

	public BillController() {
        super();
 
        //System Property SetUp
        System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
        
        //Driver SetUp
        driver = new ChromeDriver();
        base_url = "http://likms.assembly.go.kr/bill/BillSearchResult.do";
    }

	public void crawl() {

		try {
			// get page (= 브라우저에서 url을 주소창에 넣은 후 request 한 것과 같다)
			driver.get(base_url);
			System.out.println(driver.getPageSource());

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			driver.close();
		}

	}

}
