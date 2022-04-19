package com.projectbanking.pageobjectclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	public String baseURL="https://www.saucedemo.com/";
	public String username="abc#xyz";
	public String password="123@xyz";
	
	public static WebDriver driver;
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"D:/eclipse-java-2021-09-R-win32-x86_64/ProjectBanking/Driver/chromedriver.exe");
		driver=new ChromeDriver();
	}
	@AfterClass
	public void closebrowser() {
		driver.quit();
	}
	public  String  URL  =  readconfig.getApplicationURL( ) ;	
	public  String  uname  =  readconfig.getUserName( ) ;
	public String pword = readconfig.getPassword() ;
	
	public  static ExtentSparkReporter sparkreport ;
	public   static  ExtentReports  extent ;
	public  static  ExtentTest  test;
	@BeforeSuite
	public  void  setReport( )  {
	sparkreport  = new  ExtentsparkReporter ( "/Users/amitpa rate/Des ktop/Amit  wo rkspace/BankingPro j ect/ reports/htm lreport" + LoealDateTime. now()+ ".html" ) ;
	extent  =  new  ExtentReports( ) ;
	extent.attachReporter ( sparkreport ) ;
	extent.setSysteminfo ( "Operating System" , "Windows ") ;
	extent.setSysteminfo ( "Enve ronment" , "QA") ;
	sparkreport.conf ig ( ) .setReportName( "Integration Test  Execution" ) ;
	sparkreport.config( ) .setDocumentTitle( "QA  Automation  Testing  Report" ) ;
	sparkreport.config( ). setTheme(Theme .STANOARO ) ;

	}
	@Parameters ( "chrome" )
	@BetoreClass
	public static WebDriver driver1;
	public void screenshot() {
		System.setProperty("webdriver.gecko.driver",
				"D:\\GitHub\\gickodriver.exe");
		driver1=new ChromeDriver();
}
}