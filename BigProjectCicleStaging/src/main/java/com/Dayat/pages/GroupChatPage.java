package com.Dayat.pages;

import com.Dayat.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class GroupChatPage extends TestBase {
    public GroupChatPage(){

        driver.navigate().to("https://staging.cicle.app/companies/61eba2c85080f47b25ddc8f8/teams/636b9e72aa1f4a00a8ab27f8/group-chats/636b9e72aa1f4a00a8ab286d");
    }

    By cicleTeams = By.xpath("//*[contains(text(),'Cicle Bug & Feature Request')]");
    By GroupChatMenu = By.xpath("//*[contains(text(),'Group Chat')]");
    By clickCreatChat = By.xpath("//*[@id=\"root\"]/div[3]/div[1]/div[2]/div/div[2]/div/div/div/p");
    By inputTypeMessage = By.xpath("//*[@class='CreateMessage_text__2pZbe']/div/div/div");
    By clickBtnSend = By.xpath("//*[contains(@data-testid,'SendIcon')]");
    By textBallonMessage = By.className("Message_balloonMessage__3dmkS");
    By optionBallonMessage = By.className("Message_iconOption__3F-Ru");
    By deleteMessageBtn = By.className("MessageMenuPopUp_menu__1rkRG");
    By popUpConfirmationDeleteMessage = By.xpath("//*[contains(@class,'btn btn-danger btn-block btn-sm')]");

    public void clickCicleTeam(){
        driver.findElement(cicleTeams).click();
    }
    public void clickGroupChatMenu(){
        driver.findElement(GroupChatMenu).click();
    }
    public void clickCreatChat(){
        driver.findElement(clickCreatChat).click();
    }
    public void inputMessage(){
        driver.findElement(inputTypeMessage).sendKeys("test");
    }
    public void clickBtnSend(){
        driver.findElement(clickBtnSend).click();
    }
    public void inputBlankMessage(){
        driver.findElement(inputTypeMessage).sendKeys(" ");
    }
    public void sendMessage(){
        driver.findElement(clickBtnSend).click();
    }
    public void selectDeleteMessage(){
        driver.findElement(textBallonMessage).click();
    }
    public void clickOptionDeleteMessage(){
        driver.findElement(optionBallonMessage).click();
    }
    public void clickDeleteButton(){
        driver.findElement(deleteMessageBtn).click();
    }
    public void clickDeleteButtonConfirmation(){
        driver.findElement(popUpConfirmationDeleteMessage).click();
    }

}
