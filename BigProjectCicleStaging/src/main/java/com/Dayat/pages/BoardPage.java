package com.Dayat.pages;

import com.Dayat.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class BoardPage extends TestBase {

    public BoardPage() {
        driver.navigate().to("https://staging.cicle.app/companies/61eba2c85080f47b25ddc8f8/teams/636b9e72aa1f4a00a8ab27f8/boards/636b9e72aa1f4a00a8ab286c");
    }
    By cicleTeams = By.xpath("//*[contains(text(),'Cicle Bug & Feature Request')]");
    By boardMenu = By.xpath("//*[contains(text(),'Board')]");
    By addNewList = By.xpath("//*[contains(text(),'Add List')]");
    By inputListName = By.xpath("//*[contains(@placeholder,'Input list name...')]");
    By buttonCreate = By.xpath("//*[contains(@class,'Button_container__1WNuB')]");
    By addCard = By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div/div/div[4]/a");
    By cardName = By.xpath("//*[contains(@placeholder,'Card name')]");
    By addCardButton = By.xpath("//*[contains(@class,'CreateCardForm_actionSection__7iFql')]/child::node()[1]");
    By editCardMenu = By.xpath("//*[contains(@id,'editCardMenu')]");
    By archiveCard = By.xpath("//*[contains(@id,'editCardMenuButton__Archive__text')]");

    public void UserClickCicleTeams(){
        driver.findElement(cicleTeams).click();
    }
    public void UserClickBoardMenu(){
        driver.findElement(boardMenu).click();
    }
    public void UserAddNewList(){
        driver.findElement(addNewList).click();
    }
    public void UserInputListName(){
        driver.findElement(inputListName).sendKeys("cobaa");
    }
    public void UserClickButtonCreate(){
        driver.findElement(buttonCreate).click();
    }
    public void UserClickAddCard(){
        driver.findElement(addCard).click();
    }
    public void UserInputCardName(){
        driver.findElement(cardName).sendKeys("huft");
    }
    public void UserClickAddCardButton(){
        driver.findElement(addCardButton).click();
    }
    public void UserEditCardMenu(){
        driver.findElement(editCardMenu).click();
    }
    public void UserArchiveCard(){
        driver.findElement(archiveCard).click();
    }
}
