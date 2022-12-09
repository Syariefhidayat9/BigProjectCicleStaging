package com.Dayat.stepdefs;

import com.Dayat.base.TestBase;
import com.Dayat.pages.BoardPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class StepBoard extends TestBase {
    BoardPage boardPage;
    @Given("User navigate to Board menu")
    public void userNavigateToBoardMenu() throws Exception{
        initialization();
        boardPage = new BoardPage();
        Thread.sleep(5000);
    }

    @When("User click add list")
    public void userClickAddList() throws Exception{
        boardPage.UserAddNewList();
        Thread.sleep(3000);
    }

    @And("User input list name")
    public void userInputListName() throws Exception{
        boardPage.UserInputListName();
        Thread.sleep(3000);
    }

    @And("User click button creat list")
    public void userClickButtonCreatList() throws Exception{
        boardPage.UserClickButtonCreate();
        Thread.sleep(3000);
    }

    @Then("User success create list")
    public void userSuccessCreateList() {
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Creating list is success')]")).isDisplayed());
        driver.quit();
    }

    @When("User click button add new card")
    public void userClickButtonAddNewCard() throws Exception{
        boardPage.UserClickAddCard();
        Thread.sleep(3000);
    }

    @And("User input card name")
    public void userInputCardName() throws Exception{
        boardPage.UserInputCardName();
        Thread.sleep(3000);
    }

    @And("User click button add card")
    public void userClickButtonAddCard() throws Exception{
        boardPage.UserClickAddCardButton();
        Thread.sleep(3000);
    }

    @Then("User success create card name")
    public void userSuccessCreateCardName() {
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Creating card is success')]")).isDisplayed());
        driver.quit();
    }

    @When("User click button edit")
    public void userClickButtonEdit() throws Exception{
        boardPage.UserEditCardMenu();
        Thread.sleep(3000);
    }

    @And("User click button archive")
    public void userClickButtonArchive() throws Exception{
        boardPage.UserArchiveCard();
        Thread.sleep(3000);
    }

    @Then("User success archive card")
    public void userSuccessArchiveCard() {
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'huft card has been moved to archived')]")).isDisplayed());
        driver.quit();
    }

    @Then("User have pop up message error add card negative")
    public void userHavePopUpMessageErrorAddCardNegative() {
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Card name cannot be empty')]")).isDisplayed());
        driver.quit();
    }
}
