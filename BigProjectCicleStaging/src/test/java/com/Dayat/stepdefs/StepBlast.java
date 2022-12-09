package com.Dayat.stepdefs;

import com.Dayat.base.TestBase;
import com.Dayat.pages.BlastPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StepBlast extends TestBase {

    BlastPage blastPage;
//    WebDriverWait wait = new WebDriverWait(TestBase.driver, 10, 10);
    @Given("User navigate to Blast menu")
    public void userNavigateToBlastMenu() throws Exception {
        initialization();
        blastPage = new BlastPage();
        Thread.sleep(5000);
    }

    @When("User click button Create Blast")
    public void userClickButtonCreateBlast() throws Exception {
        blastPage.clickCreateBlast();
        Thread.sleep(3000);

    }

    @And("User click title")
    public void userClickTitle() throws Exception{
        blastPage.clickTypeTitle();
        Thread.sleep(3000);
    }

    @And("User input title")
    public void userInputTitle() throws Exception{
        blastPage.inputTypeTitle();
        Thread.sleep(3000);
    }

    @And("User input tell story")
    public void userInputTellStory() throws Exception{
        blastPage.inputTellStory();
        Thread.sleep(3000);
    }

    @And("User click button publish")
    public void userClickButtonPublish() throws Exception {
        blastPage.clickPublish();
    }

    @Then("User successfully create new blast")
    public void userSuccessfullyCreateNewBlast() {
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Create post successful')]")).isDisplayed());
        driver.quit();
    }

    @When("User select post blast want edit")
    public void userSelectPostBlastWantEdit() throws Exception{
        blastPage.clickSelectBlastMssg();
        Thread.sleep(3000);
    }

    @And("User click tree dot button")
    public void userClickTreeDotButton() throws Exception{
        blastPage.clickTreeDotBtn();
        Thread.sleep(3000);
    }

    @And("User click edit menu")
    public void userClickEditMenu() throws Exception{
        blastPage.clickEditMenu();
        Thread.sleep(6000);
    }

    @And("User input tell story comment")
    public void userInputTellStoryComment() throws Exception{
        blastPage.clickTellStorryCmnt();
        Thread.sleep(3000);
    }

    @And("User click Save Change Button")
    public void userClickSaveChangeButton() throws Exception{
        blastPage.clickSaveChangeBtn();
        Thread.sleep(3000);
    }

    @Then("User successfully edit post blast")
    public void userSuccessfullyEditPostBlast() {
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Update post successful')]")).isDisplayed());
        driver.quit();
    }

    @Then("User can't create new blast")
    public void userCanTCreateNewBlast() {
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Field parameter not complete.')]")).isDisplayed());
        driver.quit();
    }

    @When("User select post blast want comment")
    public void userSelectPostBlastWantComment() throws Exception{
        blastPage.clickSelectBlastMssg();
        Thread.sleep(3000);
    }

    @And("User click select comment")
    public void userClickSelectComment() throws Exception{
        blastPage.clickSelectComment();
        Thread.sleep(3000);
    }
    @And("User click button post")
    public void userClickButtonPost() throws Exception{
        blastPage.clickPostBtnCmnt();
        Thread.sleep(3000);
    }

    @Then("User create comment successful")
    public void userCreateCommentSuccessful() {
        WebDriverWait wait = new WebDriverWait(driver,10);
        WebElement editMsgBtn = driver.findElement(By.xpath("//*[contains(text(),'Create comment on blast post successful')]"));
        wait.until(ExpectedConditions.visibilityOf(editMsgBtn));
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Create comment on blast post successful')]")).isDisplayed());
        driver.quit();
    }
}
