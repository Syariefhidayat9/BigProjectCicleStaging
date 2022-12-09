package com.Dayat.pages;

import com.Dayat.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

    public LoginPage() {
        PageFactory.initElements(driver, "/https://staging.cicle.app/companies/61eba2c85080f47b25ddc8f8");
    }

    By googleLoginBtn = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]");
    By googleEmailField = By.id("identifierId");
    By googleNextButton = By.xpath("//*[@id=\"identifierNext\"]/div/button/span");
    By googlePassField = By.name("password");
    By getGoogleNextPassButton = By.xpath("//*[@id=\"passwordNext\"]/div/button/div[3]");
    By cicleTeams = By.xpath("//*[@id=\"root\"]/div[3]/div[4]/a/div/div[1]");

    By groupChat = By.xpath("//*[@id=\"root\"]/div[3]/div[1]/div[1]/a/div/div[2]");

    public void clickGoogleLoginBtn() {
        driver.findElement(googleLoginBtn).click();
    }
    public void inputGoogleEmailField(String email) {
        driver.findElement(googleEmailField).sendKeys(email);
    }
    public void clickGoogleNextBtn() { driver.findElement(googleNextButton).click(); }

    public void inputGooglePassField(String password) { driver.findElement(googlePassField).sendKeys(password);}
    public void clickGoogleNextPassBtn() { driver.findElement(getGoogleNextPassButton).click();}

//    public void clickTeams() {driver.findElement(cicleTeams).click();}
//
//    public void openGroupChat() { driver.findElement(groupChat).click();}



}