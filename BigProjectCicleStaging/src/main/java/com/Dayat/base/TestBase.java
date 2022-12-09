package com.Dayat.base;

import com.Dayat.utils.TestUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.namespace.QName;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver;
    public static Properties properties;

    public TestBase(){
        try {
            properties = new Properties();
            FileInputStream inputStream = new FileInputStream("src/main/java/com/Dayat/config/config.properties");
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void initialization() {

        ChromeOptions chrome_options = new ChromeOptions();
        chrome_options.addArguments("--disable-extensions");
        chrome_options.addArguments("--disable-popup-blocking");
//        chrome_options.addArguments("--profile-directory=Profile 2");
        chrome_options.addArguments("--ignore-certificate-errors");
        chrome_options.addArguments("--disable-plugins-discovery");
        chrome_options.addArguments("user_agent=DN");
        chrome_options.addArguments("user-data-dir=/Users/syariefhidayat/Library/Application Support/Google/Chrome/Profile 2");
        chrome_options.addArguments("--profile-directory=default");
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");

        driver = new ChromeDriver(chrome_options);
//        WebDriverWait wait = new WebDriverWait(driver, 10, 10);
        driver.get("https://staging.cicle.app/companies/61eba2c85080f47b25ddc8f8");

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);


    }

}

