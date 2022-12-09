package com.Dayat.pages;

import com.Dayat.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class BlastPage extends TestBase {
    public BlastPage() {
        driver.navigate().to("https://staging.cicle.app/companies/61eba2c85080f47b25ddc8f8/teams/636b9e72aa1f4a00a8ab27f8/blasts/636b9e72aa1f4a00a8ab286e");
    }

    By cicleTeams = By.xpath("//*[contains(text(),'Cicle Bug & Feature Request')]");
    By blastMenu = By.xpath("//*[contains(text(),'Blast!')]");
    By createBlast = By.xpath("//*[contains(text(),'Create Blast')]");
    By typeTitle = By.xpath("//*[contains(@placeholder,'Type a title...')]");
    By typeTellStory = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[2]/div/div/div[3]/div/p");
    By publishBtn = By.xpath("//*[contains(text(),'Publish')]");
    By treeDotBtn = By.xpath("//*[contains(@data-testid,'MoreVertOutlinedIcon')]/child::node()[1]");
//    By archiveMenu = By.xpath("//*[contains(@class,'MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation2 css-16au8pw')]/child::node()[1]/child::node()[3]/child::node()[2]/child::node()[1]");
    By archiveMenu = By.xpath("//*[contains(text(),'Archive')]");
//    By editMenu = By.xpath("//*[contains(@class,'MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation2 css-16au8pw')]/child::node()[1]/child::node()[1]/child::node()[2]/child::node()[1]");
    By editMenu = By.xpath("//*[contains(text(),'Edit')]");
    By saveChangeBtn = By.xpath("//*[contains(text(),'Save Changes')]");
//    By selectBlastMssg = By.xpath("//*[contains(@class,'Post_contentSection__33WUN')]/child::node()[1]");
    By selectBlastMssg = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div/div/div/div[1]/a/div");
    By selectCollomCmnt = By.xpath("//*[contains(@placeholder,'Add new comment...')]");
    By typeTellStoryCmnt = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[4]/div/div/div/div[1]/div[2]/div[2]/div[1]/div/div/div[3]/div/p");
//    By typeTellStoryCmnt = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[4]/div/div/div/div[1]/div[2]/div[2]/div[1]/div/div/div[3]/span");
    By postBtnCmnt = By.xpath("//*[contains(text(),'Post')]");


    public void clickCicleTeams() {
        driver.findElement(cicleTeams).click();
    }

    public void clickBlastMenu() {
        driver.findElement(blastMenu).click();
    }

    public void clickCreateBlast() {
        driver.findElement(createBlast).click();
    }

    public void clickTypeTitle() {
        driver.findElement(typeTitle).click();
    }

    public void inputTypeTitle() {
        driver.findElement(typeTitle).sendKeys("Testinggssss");
    }

    public void clickTellStory() {
        driver.findElement(typeTellStory).click();
    }

    public void inputTellStory() {
        driver.findElement(typeTellStory).sendKeys("ahooooy.....");
    }

    public void clickPublish() {
        driver.findElement(publishBtn).click();
    }

    public void clickTreeDotBtn() {
        driver.findElement(treeDotBtn).click();
    }
    public void clickArchiveMenu(){
        driver.findElement(archiveMenu).click();
    }
    public void clickEditMenu(){
        driver.findElement(editMenu).click(); }
    public void clickSaveChangeBtn(){
        driver.findElement(saveChangeBtn).click();
    }
    public void clickSelectBlastMssg(){
        driver.findElement(selectBlastMssg).click();
    }
    public void clickSelectComment(){
        driver.findElement(selectCollomCmnt).click();
    }
//    public void clickSelectCommentInput(){
//        driver.findElement(selectCollomCmnt).sendKeys("ahooooy.....");
//    }

    public void clickTellStorryCmnt(){
        driver.findElement(typeTellStoryCmnt).sendKeys("bissmillah...");
    }
    public void clickPostBtnCmnt(){
        driver.findElement(postBtnCmnt).click();
    }

}
