package com.Dayat.auth;

import com.Dayat.base.TestBase;
import com.Dayat.pages.LoginPage;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

       LoginPage loginPage;

       public LoginTest() {
       super();
    }

    @BeforeMethod
    public void setUp() throws InterruptedException {
        initialization();
        loginPage = new LoginPage();

    }

    @Test
    public void verify_success_login() {

    }

    @AfterMethod
    public void tearDown() {

    }
}

//    static WebDriver driver;
//    static String URL = "https://staging.cicle.app/companies/61eba2c85080f47b25ddc8f8";
//
//    @BeforeClass
//    public static void setUp() throws Exception {
//        ChromeOptions chrome_options = new ChromeOptions();
//        chrome_options.addArguments("--disable-extensions");
//        chrome_options.addArguments("--disable-popup-blocking");
//        chrome_options.addArguments("--profile-directory=Default");
//        chrome_options.addArguments("--ignore-certificate-errors");
//        chrome_options.addArguments("--disable-plugins-discovery");
//        chrome_options.addArguments("user_agent=DN");
//        chrome_options.addArguments("user-data-dir=/Users/syariefhidayat/Library/Application Support/Google/Chrome/Profile 1");
//        chrome_options.addArguments("--profile-directory=default");
//        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
//
//        driver = new ChromeDriver(chrome_options);
//        driver.manage().window().maximize();
//        driver.get("https://staging.cicle.app");
//    }
//
//    @Test
//    public void getTeams() throws Exception {
//        WebElement getTeams = driver.findElement(By.xpath("//*[contains(text(),'Cicle Bug & Feature Request')]"));
//        getTeams.click();
//    }
//
//    @AfterClass
//    public static void tearDown() throws Exception {
//        Thread.sleep(3000);
//        driver.close();
//    }
//}


