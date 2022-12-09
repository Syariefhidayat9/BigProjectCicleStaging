package com.Dayat.blast;

import com.Dayat.base.TestBase;
import com.Dayat.pages.BlastPage;
import com.sun.jdi.InternalException;
import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BlastTest extends TestBase {

    BlastPage Blast_feature;

    public BlastTest() {
        super();
    }

        @BeforeMethod
        public void setUp() throws InterruptedException {
            initialization();
            Blast_feature = new BlastPage();
        }

        @Test (priority = 0)
        public void User_Publish_a_Post_by_input_valid_title_and_description() {
            Blast_feature.clickCicleTeams();
            Blast_feature.clickBlastMenu();
            Blast_feature.clickCreateBlast();
            Blast_feature.clickTypeTitle();
            Blast_feature.inputTypeTitle();
//        Blast_feature.clickTellStory();
            Blast_feature.inputTellStory();
            Blast_feature.clickPublish();
        }

    @Test (priority = 1)
    public void Use_Edit_a_Blast_Post(){
        Blast_feature.clickCicleTeams();
        Blast_feature.clickBlastMenu();
        Blast_feature.clickSelectBlastMssg();
        Blast_feature.clickTreeDotBtn();
        Blast_feature.clickEditMenu();
        Blast_feature.inputTellStory();
        Blast_feature.clickSaveChangeBtn();

    }

    @Test (priority = 2)
    public void User_Create_Comment_Positive(){
        Blast_feature.clickCicleTeams();
        Blast_feature.clickBlastMenu();
        Blast_feature.clickSelectBlastMssg();

    }

//        @Test (priority = )
//        public void User_Archive_a_Blast_post(){
//        Blast_feature.clickTreeDotBtn();
//        Blast_feature.clickArchiveMenu();
//            }

        @AfterMethod
        public void tearDown(){
        driver.quit();
        }

}
