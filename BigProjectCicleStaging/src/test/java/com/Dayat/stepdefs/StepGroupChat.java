package com.Dayat.stepdefs;

import com.Dayat.base.TestBase;
import com.Dayat.pages.GroupChatPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class StepGroupChat extends TestBase {

    GroupChatPage groupchat;
    @Given("User navigate to Group Chat")
    public void userNavigateToGroupChat() throws Exception{
        initialization();
        groupchat = new GroupChatPage();
        Thread.sleep(5000);
    }

    @When("User click Collom Type message here")
    public void userClickCollomTypeMessageHere() throws Exception{
        groupchat.clickCreatChat();
        Thread.sleep(3000);
    }

    @And("User input message")
    public void userInputMessage() throws Exception{
        groupchat.inputMessage();
        Thread.sleep(3000);
    }

    @Then("click button send")
    public void clickButtonSend() throws Exception{
        groupchat.clickBtnSend();
        Thread.sleep(3000);
    }

    @When("User click message what you want delete")
    public void userClickMessageWhatYouWantDelete() throws Exception{
        groupchat.selectDeleteMessage();
        Thread.sleep(3000);
    }
    @And("User click option Delete")
    public void userClickOptionDelete() throws Exception{
        groupchat.clickOptionDeleteMessage();
        Thread.sleep(3000);
    }

    @And("User click button delete message")
    public void userClickButtonDeleteMessage() throws Exception{
        groupchat.clickDeleteButton();
        Thread.sleep(3000);
    }

    @And("User click button delete pop up delete")
    public void userClickButtonDeletePopUpDelete()throws Exception{
        groupchat.clickDeleteButtonConfirmation();
        Thread.sleep(3000);
    }

    @Then("User success delet group chat")
    public void userSuccessDeletGroupChat() {
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Delete group chat message success')]")).isDisplayed());
        driver.quit();
    }

    @And("User input Blank message")
    public void userInputBlankMessage() throws Exception{
        groupchat.inputBlankMessage();
        Thread.sleep(3000);
    }
}
