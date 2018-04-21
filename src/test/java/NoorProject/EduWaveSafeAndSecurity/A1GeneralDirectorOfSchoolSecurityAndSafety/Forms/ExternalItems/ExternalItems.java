package NoorProject.EduWaveSafeAndSecurity.A1GeneralDirectorOfSchoolSecurityAndSafety.Forms.ExternalItems;

import NoorProject.EduWaveSafeAndSecurity.A1GeneralDirectorOfSchoolSecurityAndSafety.Forms.Forms.SafetyForms;
import NoorProject.EduWaveSafeAndSecurity.A1GeneralDirectorOfSchoolSecurityAndSafety.Forms.SectionsForm.SectionsForms;
import org.omg.PortableServer.THREAD_POLICY_ID;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static NoorProject.Other.NoorLogin.browserQA;
import static NoorProject.Other.NoorLogin.waitQA;

public class ExternalItems {

    private By SwitchProfileLocator = By.id("ctl00_oHeader_divSwitchUser");
    private By UserNameLabelLocator = By.linkText("مدير عام الأمن والسلامة المدرسية");
    private By FormMainMenuLoactor = By.id("divMenuItem_5968");
    private By FormStatusLocator = By.id("select2-ctl00_PlaceHolderMain_ddlFormStatus-container");
    private By FormStatusSearchLocator = By.xpath("/html/body/span/span/span[1]/input");
    private By SerachButtonLocator = By.id("ctl00_PlaceHolderMain_ibtnSearch");
    private By SectionsLinkLocator = By.id("ctl00_PlaceHolderMain_gvForms_ctl02_tdSections");


    @Test

    public void switchProfile() {

        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SwitchProfileLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(UserNameLabelLocator)).click();


    }


    //مدير عام الامن والسلامة/ أضافة البنود الخارجية
    @Test
    public void addExI() throws InterruptedException {
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(FormMainMenuLoactor)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(FormStatusLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(FormStatusSearchLocator)).sendKeys("غير منشور" , Keys.ENTER);
        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachButtonLocator)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(200);
            }
        }

        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(SectionsLinkLocator)).click();
                break;

            } catch (Exception e) {
                Thread.sleep(200);
            }
        }
        List SectionTableList = browserQA.findElements(By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[1]/div[2]/div/div/table[1]/tbody/tr/td[1]"));
        int TableSectionSizeForCheck = SectionTableList.size();
        if (TableSectionSizeForCheck <= 1) {

            SectionsForms AddSection = new SectionsForms();
            AddSection.addSections();
            List SectionsTableList = browserQA.findElements(By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[1]/div[2]/div/div/table[1]/tbody/tr/td[1]"));
            int SectionsTableListSize = SectionsTableList.size();
            System.out.println("Rami" + SectionsTableListSize);
            if (SectionsTableListSize >= 21) {
                By ExternalItemsLinkLocator = By.id("ctl00_PlaceHolderMain_gvSections_ctl20_lbtnItems");
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(ExternalItemsLinkLocator)).click();
                List ExternalItemsTableList = browserQA.findElements(By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[1]/div[2]/table/tbody/tr[2]/td/div/div/table[1]/tbody/tr/td[1]"));
                int TableSize = ExternalItemsTableList.size();
                if (TableSize <= 1) {
                    int TableSizeAdd = ExternalItemsTableList.size() + 2;
                    String TableSizeAddFormat = String.format("%02d" , TableSizeAdd);
                    System.out.println("TableSizeAdd::" + TableSizeAdd);
                    System.out.println("TableSizeAddFormat::" + TableSizeAddFormat);
                    By AddDescLink1 = By.id("ctl00_PlaceHolderMain_gvItems_ctl" + TableSizeAddFormat + "_tbAddFormItemDesc");
                    Random Rand = new Random();
                    int RandomNumber = Rand.nextInt(1000000);
                    waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddDescLink1)).sendKeys("Rami" + RandomNumber);
                    By AddLinkLocator1 = By.id("ctl00_PlaceHolderMain_gvItems_ctl" + TableSizeAddFormat + "_lbtnAddFormItemDesc");
                    waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddLinkLocator1)).click();
                    By MeesageResultLocator = By.id("ctl00_PlaceHolderMain_lblOpertioanlResult");
                    waitQA.until(ExpectedConditions.visibilityOfElementLocated(MeesageResultLocator));
                    String ActualResult = browserQA.findElement(MeesageResultLocator).getText();
                    String ExcpectedResult = "تم إضافة البند الخارجي بنجاح.";
                    Assert.assertEquals(ActualResult , ExcpectedResult , "لم تتم إضافة البند  الخارجي بنجاح.");
                }
                if (TableSize >= 2 && TableSize < 22) {
                    int TableSizeAdd = ExternalItemsTableList.size() + 1;
                    String TableSizeAddFormat = String.format("%02d" , TableSizeAdd);
                    By AddDescLink2 = By.id("ctl00_PlaceHolderMain_gvItems_ctl" + TableSizeAddFormat + "_tbAddFormItemDesc");
                    Random Rand = new Random();
                    int RandomNumber = Rand.nextInt(1000000);
                    waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddDescLink2)).sendKeys("Rami" + RandomNumber);
                    By AddLinkLocator2 = By.id("ctl00_PlaceHolderMain_gvItems_ctl" + TableSizeAddFormat + "_lbtnAddFormItemDesc");
                    waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddLinkLocator2)).click();
                    By MeesageResultLocator2 = By.id("ctl00_PlaceHolderMain_lblOpertioanlResult");
                    waitQA.until(ExpectedConditions.visibilityOfElementLocated(MeesageResultLocator2));
                    String ActualResult = browserQA.findElement(MeesageResultLocator2).getText();
                    String ExcpectedResult = "تم إضافة البند الخارجي بنجاح.";
                    Assert.assertEquals(ActualResult , ExcpectedResult , "لم تتم إضافة البند  الخارجي بنجاح.");
                }
                if (TableSize >= 22) {
                    int TableSizeAdd = ExternalItemsTableList.size();
                    String TableSizeAddFormat = String.format("%02d" , TableSizeAdd);
                    By AddDescLink2 = By.id("ctl00_PlaceHolderMain_gvItems_ctl" + TableSizeAddFormat + "_tbAddFormItemDesc");
                    Random Rand = new Random();
                    int RandomNumber = Rand.nextInt(1000000);
                    waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddDescLink2)).sendKeys("Rami" + RandomNumber);
                    By AddLinkLocator2 = By.id("ctl00_PlaceHolderMain_gvItems_ctl" + TableSizeAddFormat + "_lbtnAddFormItemDesc");
                    waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddLinkLocator2)).click();
                    By MeesageResultLocator3 = By.id("ctl00_PlaceHolderMain_lblOpertioanlResult");
                    waitQA.until(ExpectedConditions.visibilityOfElementLocated(MeesageResultLocator3));
                    String ActualResult = browserQA.findElement(MeesageResultLocator3).getText();
                    String ExcpectedResult = "تم إضافة البند الخارجي بنجاح.";
                    Assert.assertEquals(ActualResult , ExcpectedResult , "لم تتم إضافة البند  الخارجي بنجاح.");
                }
            } else {

                By ExternalItemsLinkLocator = By.id("ctl00_PlaceHolderMain_gvSections_ctl02_lbtnItems");
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(ExternalItemsLinkLocator)).click();
                List ExternalItemsTableList = browserQA.findElements(By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[1]/div[2]/table/tbody/tr[2]/td/div/div/table[1]/tbody/tr/td[1]"));
                int TableSize = ExternalItemsTableList.size();
                System.out.println("TableSize::" + TableSize);
                if (TableSize <= 1) {
                    int TableSizeAdd = ExternalItemsTableList.size() + 2;
                    String TableSizeAddFormat = String.format("%02d" , TableSizeAdd);
                    By AddDescLink1 = By.id("ctl00_PlaceHolderMain_gvItems_ctl" + TableSizeAddFormat + "_tbAddFormItemDesc");
                    Random Rand = new Random();
                    int RandomNumber = Rand.nextInt(1000000);
                    waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddDescLink1)).sendKeys("Rami" + RandomNumber);
                    By AddLinkLocator1 = By.id("ctl00_PlaceHolderMain_gvItems_ctl" + TableSizeAddFormat + "_lbtnAddFormItemDesc");
                    waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddLinkLocator1)).click();
                    By MeesageResultLocator = By.id("ctl00_PlaceHolderMain_lblOpertioanlResult");
                    waitQA.until(ExpectedConditions.visibilityOfElementLocated(MeesageResultLocator));
                    String ActualResult = browserQA.findElement(MeesageResultLocator).getText();
                    String ExcpectedResult = "تم إضافة البند الخارجي بنجاح.";
                    Assert.assertEquals(ActualResult , ExcpectedResult , "لم تتم إضافة البند  الخارجي بنجاح.");
                }
                if (TableSize >= 2 && TableSize < 22) {
                    int TableSizeAdd = ExternalItemsTableList.size() + 1;
                    String TableSizeAddFormat = String.format("%02d" , TableSizeAdd);
                    By AddDescLink2 = By.id("ctl00_PlaceHolderMain_gvItems_ctl" + TableSizeAddFormat + "_tbAddFormItemDesc");
                    Random Rand = new Random();
                    int RandomNumber = Rand.nextInt(1000000);
                    waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddDescLink2)).sendKeys("Rami" + RandomNumber);
                    By AddLinkLocator2 = By.id("ctl00_PlaceHolderMain_gvItems_ctl" + TableSizeAddFormat + "_lbtnAddFormItemDesc");
                    waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddLinkLocator2)).click();
                    By MeesageResultLocator2 = By.id("ctl00_PlaceHolderMain_lblOpertioanlResult");
                    waitQA.until(ExpectedConditions.visibilityOfElementLocated(MeesageResultLocator2));
                    String ActualResult = browserQA.findElement(MeesageResultLocator2).getText();
                    String ExcpectedResult = "تم إضافة البند الخارجي بنجاح.";
                    Assert.assertEquals(ActualResult , ExcpectedResult , "لم تتم إضافة البند  الخارجي بنجاح.");
                }
                if (TableSize >= 22) {
                    int TableSizeAdd = ExternalItemsTableList.size();
                    String TableSizeAddFormat = String.format("%02d" , TableSizeAdd);
                    By AddDescLink2 = By.id("ctl00_PlaceHolderMain_gvItems_ctl" + TableSizeAddFormat + "_tbAddFormItemDesc");
                    Random Rand = new Random();
                    int RandomNumber = Rand.nextInt(1000000);
                    waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddDescLink2)).sendKeys("Rami" + RandomNumber);
                    By AddLinkLocator2 = By.id("ctl00_PlaceHolderMain_gvItems_ctl" + TableSizeAddFormat + "_lbtnAddFormItemDesc");
                    waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddLinkLocator2)).click();
                    By MeesageResultLocator3 = By.id("ctl00_PlaceHolderMain_lblOpertioanlResult");
                    waitQA.until(ExpectedConditions.visibilityOfElementLocated(MeesageResultLocator3));
                    String ActualResult = browserQA.findElement(MeesageResultLocator3).getText();
                    String ExcpectedResult = "تم إضافة البند الخارجي بنجاح.";
                    Assert.assertEquals(ActualResult , ExcpectedResult , "لم تتم إضافة البند  الخارجي بنجاح.");
                }
            }
        } else {
            List SectionsTableList = browserQA.findElements(By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[1]/div[2]/div/div/table[1]/tbody/tr/td[1]"));
            int SectionsTableListSize = SectionsTableList.size();
            if (SectionsTableListSize >= 21) {
                By ExternalItemsLinkLocator = By.id("ctl00_PlaceHolderMain_gvSections_ctl20_lbtnItems");
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(ExternalItemsLinkLocator)).click();
                List ExternalItemsTableList = browserQA.findElements(By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[1]/div[2]/table/tbody/tr[2]/td/div/div/table[1]/tbody/tr/td[1]"));
                int TableSize = ExternalItemsTableList.size();
                if (TableSize <= 1) {
                    int TableSizeAdd = ExternalItemsTableList.size() + 2;
                    String TableSizeAddFormat = String.format("%02d" , TableSizeAdd);
                    By AddDescLink1 = By.id("ctl00_PlaceHolderMain_gvItems_ctl" + TableSizeAddFormat + "_tbAddFormItemDesc");
                    Random Rand = new Random();
                    int RandomNumber = Rand.nextInt(1000000);
                    waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddDescLink1)).sendKeys("Rami" + RandomNumber);
                    By AddLinkLocator1 = By.id("ctl00_PlaceHolderMain_gvItems_ctl" + TableSizeAddFormat + "_lbtnAddFormItemDesc");
                    waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddLinkLocator1)).click();
                    By MeesageResultLocator = By.id("ctl00_PlaceHolderMain_lblOpertioanlResult");
                    waitQA.until(ExpectedConditions.visibilityOfElementLocated(MeesageResultLocator));
                    String ActualResult = browserQA.findElement(MeesageResultLocator).getText();
                    String ExcpectedResult = "تم إضافة البند الخارجي بنجاح.";
                    Assert.assertEquals(ActualResult , ExcpectedResult , "لم تتم إضافة البند  الخارجي بنجاح.");
                }
                if (TableSize >= 2 && TableSize < 22) {
                    int TableSizeAdd = ExternalItemsTableList.size() + 1;
                    String TableSizeAddFormat = String.format("%02d" , TableSizeAdd);
                    By AddDescLink2 = By.id("ctl00_PlaceHolderMain_gvItems_ctl" + TableSizeAddFormat + "_tbAddFormItemDesc");
                    Random Rand = new Random();
                    int RandomNumber = Rand.nextInt(1000000);
                    waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddDescLink2)).sendKeys("Rami" + RandomNumber);
                    By AddLinkLocator2 = By.id("ctl00_PlaceHolderMain_gvItems_ctl" + TableSizeAddFormat + "_lbtnAddFormItemDesc");
                    waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddLinkLocator2)).click();
                    By MeesageResultLocator2 = By.id("ctl00_PlaceHolderMain_lblOpertioanlResult");
                    waitQA.until(ExpectedConditions.visibilityOfElementLocated(MeesageResultLocator2));
                    String ActualResult = browserQA.findElement(MeesageResultLocator2).getText();
                    String ExcpectedResult = "تم إضافة البند الخارجي بنجاح.";
                    Assert.assertEquals(ActualResult , ExcpectedResult , "لم تتم إضافة البند  الخارجي بنجاح.");
                }
                if (TableSize >= 22) {
                    int TableSizeAdd = ExternalItemsTableList.size();
                    String TableSizeAddFormat = String.format("%02d" , TableSizeAdd);
                    By AddDescLink2 = By.id("ctl00_PlaceHolderMain_gvItems_ctl" + TableSizeAddFormat + "_tbAddFormItemDesc");
                    Random Rand = new Random();
                    int RandomNumber = Rand.nextInt(1000000);
                    waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddDescLink2)).sendKeys("Rami" + RandomNumber);
                    By AddLinkLocator2 = By.id("ctl00_PlaceHolderMain_gvItems_ctl" + TableSizeAddFormat + "_lbtnAddFormItemDesc");
                    waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddLinkLocator2)).click();
                    By MeesageResultLocator3 = By.id("ctl00_PlaceHolderMain_lblOpertioanlResult");
                    waitQA.until(ExpectedConditions.visibilityOfElementLocated(MeesageResultLocator3));
                    String ActualResult = browserQA.findElement(MeesageResultLocator3).getText();
                    String ExcpectedResult = "تم إضافة البند الخارجي بنجاح.";
                    Assert.assertEquals(ActualResult , ExcpectedResult , "لم تتم إضافة البند  الخارجي بنجاح.");
                }

            } else {
                By ExternalItemsLinkLocator = By.id("ctl00_PlaceHolderMain_gvSections_ctl02_lbtnItems");
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(ExternalItemsLinkLocator)).click();
                List ExternalItemsTableList = browserQA.findElements(By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[1]/div[2]/table/tbody/tr[2]/td/div/div/table[1]/tbody/tr/td[1]"));
                int TableSize = ExternalItemsTableList.size();
                if (TableSize <= 1) {
                    int TableSizeAdd = ExternalItemsTableList.size() + 2;
                    String TableSizeAddFormat = String.format("%02d" , TableSizeAdd);
                    By AddDescLink1 = By.id("ctl00_PlaceHolderMain_gvItems_ctl" + TableSizeAddFormat + "_tbAddFormItemDesc");
                    Random Rand = new Random();
                    int RandomNumber = Rand.nextInt(1000000);
                    waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddDescLink1)).sendKeys("Rami" + RandomNumber);
                    By AddLinkLocator1 = By.id("ctl00_PlaceHolderMain_gvItems_ctl" + TableSizeAddFormat + "_lbtnAddFormItemDesc");
                    waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddLinkLocator1)).click();
                    By MeesageResultLocator = By.id("ctl00_PlaceHolderMain_lblOpertioanlResult");
                    waitQA.until(ExpectedConditions.visibilityOfElementLocated(MeesageResultLocator));
                    String ActualResult = browserQA.findElement(MeesageResultLocator).getText();
                    String ExcpectedResult = "تم إضافة البند الخارجي بنجاح.";
                    Assert.assertEquals(ActualResult , ExcpectedResult , "لم تتم إضافة البند  الخارجي بنجاح.");
                }
                if (TableSize >= 2 && TableSize < 22) {
                    int TableSizeAdd = ExternalItemsTableList.size() + 1;
                    String TableSizeAddFormat = String.format("%02d" , TableSizeAdd);
                    By AddDescLink2 = By.id("ctl00_PlaceHolderMain_gvItems_ctl" + TableSizeAddFormat + "_tbAddFormItemDesc");
                    Random Rand = new Random();
                    int RandomNumber = Rand.nextInt(1000000);
                    waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddDescLink2)).sendKeys("Rami" + RandomNumber);
                    By AddLinkLocator2 = By.id("ctl00_PlaceHolderMain_gvItems_ctl" + TableSizeAddFormat + "_lbtnAddFormItemDesc");
                    waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddLinkLocator2)).click();
                    By MeesageResultLocator2 = By.id("ctl00_PlaceHolderMain_lblOpertioanlResult");
                    waitQA.until(ExpectedConditions.visibilityOfElementLocated(MeesageResultLocator2));
                    String ActualResult = browserQA.findElement(MeesageResultLocator2).getText();
                    String ExcpectedResult = "تم إضافة البند الخارجي بنجاح.";
                    Assert.assertEquals(ActualResult , ExcpectedResult , "لم تتم إضافة البند  الخارجي بنجاح.");
                }
                if (TableSize >= 22) {
                    int TableSizeAdd = ExternalItemsTableList.size();
                    String TableSizeAddFormat = String.format("%02d" , TableSizeAdd);
                    By AddDescLink2 = By.id("ctl00_PlaceHolderMain_gvItems_ctl" + TableSizeAddFormat + "_tbAddFormItemDesc");
                    Random Rand = new Random();
                    int RandomNumber = Rand.nextInt(1000000);
                    waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddDescLink2)).sendKeys("Rami" + RandomNumber);
                    By AddLinkLocator2 = By.id("ctl00_PlaceHolderMain_gvItems_ctl" + TableSizeAddFormat + "_lbtnAddFormItemDesc");
                    waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddLinkLocator2)).click();
                    By MeesageResultLocator3 = By.id("ctl00_PlaceHolderMain_lblOpertioanlResult");
                    waitQA.until(ExpectedConditions.visibilityOfElementLocated(MeesageResultLocator3));
                    String ActualResult = browserQA.findElement(MeesageResultLocator3).getText();
                    String ExcpectedResult = "تم إضافة البند الخارجي بنجاح.";
                    Assert.assertEquals(ActualResult , ExcpectedResult , "لم تتم إضافة البند  الخارجي بنجاح.");
                }
            }
        }
    }

    private By ExternalItemsLinkviewLocator = By.id("ctl00_PlaceHolderMain_gvSections_ctl02_lbtnItems");
    private By BTNBack1 = By.id("ctl00_PlaceHolderMain_ibtnBack");
    private By BTNBack2 = By.id("ctl00_PlaceHolderMain_ibtnBack");


    //مدير عام الامن والسلامة/ عرض البنود الخارجية
    @Test
    public void viewExI() throws InterruptedException {

        waitQA.until(ExpectedConditions.visibilityOfElementLocated(FormMainMenuLoactor)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(FormStatusLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(FormStatusSearchLocator)).sendKeys("غير منشور" , Keys.ENTER);
        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachButtonLocator)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(200);
            }
        }
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SectionsLinkLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ExternalItemsLinkviewLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(BTNBack1)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(BTNBack2)).click();


    }

    //مدير عام الامن والسلامة/ تعديل  البنود الخارجية
    @Test
    public void editExI() throws InterruptedException {

        waitQA.until(ExpectedConditions.visibilityOfElementLocated(FormMainMenuLoactor)).click();

        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(FormStatusLocator)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(200);
            }
        }
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(FormStatusSearchLocator)).sendKeys("غير منشور" , Keys.ENTER);

        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachButtonLocator)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(200);
            }
        }


        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(SectionsLinkLocator)).click();
break;
            }
            catch (Exception e){
                Thread.sleep(100);
            }
        }
        List SectionTableListDelet = browserQA.findElements(By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[1]/div[2]/div/div/table[1]/tbody/tr/td[1]"));
        int TableSizeForSections = SectionTableListDelet.size();
        if (TableSizeForSections <= 1) {
            By SectionDescLocator = By.id("ctl00_PlaceHolderMain_gvSections_ctl03_tbAddFormSectionDesc");

            waitQA.until(ExpectedConditions.visibilityOfElementLocated(SectionDescLocator)).sendKeys("Test");

            By AddLinkLocator = By.id("ctl00_PlaceHolderMain_gvSections_ctl03_lbtnAddFormSectionDesc");

            waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddLinkLocator)).click();

            By ExternalLinkLocator = By.id("ctl00_PlaceHolderMain_gvSections_ctl02_lbtnItems");


            waitQA.until(ExpectedConditions.visibilityOfElementLocated(ExternalLinkLocator)).click();

            By ExternalDescLocator = By.id("ctl00_PlaceHolderMain_gvItems_ctl03_tbAddFormItemDesc");
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(ExternalDescLocator)).sendKeys("Test");
            By AddExternaLink = By.id("ctl00_PlaceHolderMain_gvItems_ctl03_lbtnAddFormItemDesc");
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddExternaLink)).click();
            By EditLink = By.id("ctl00_PlaceHolderMain_gvItems_ctl02_lbtnEdit");
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(EditLink)).click();
            By UpdateLink = By.id("ctl00_PlaceHolderMain_gvItems_ctl02_lbtnUpdate");
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(UpdateLink)).click();
            By EditMessage = By.id("ctl00_PlaceHolderMain_lblOpertioanlResult");
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(EditMessage));
            String EditActualREsult = browserQA.findElement(EditMessage).getText();
            String EditExcprctedResult = "تم تعديل البند الخارجي بنجاح.";
            if (EditActualREsult.equals("تم تعديل البند الخارجي بنجاح.")) {

                System.out.println("تم تعديل البند الخارجي بنجاح.");

            } else {
                Assert.assertEquals(EditActualREsult , EditExcprctedResult , "حدث خلل ");
            }
        } else {
            By ExternalLinkLocator = By.id("ctl00_PlaceHolderMain_gvSections_ctl02_lbtnItems");
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(ExternalLinkLocator)).click();
            List ExternalList = browserQA.findElements(By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[1]/div[2]/table/tbody/tr[2]/td/div/div/table[1]/tbody/tr/td[1]"));
            int ExternalListSize = ExternalList.size();
            if (ExternalListSize <= 1) {
                By ExternalDescLocator = By.id("ctl00_PlaceHolderMain_gvItems_ctl03_tbAddFormItemDesc");
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(ExternalDescLocator)).sendKeys("Test");
                By AddExternaLink = By.id("ctl00_PlaceHolderMain_gvItems_ctl03_lbtnAddFormItemDesc");
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddExternaLink)).click();
                By EditLink = By.id("ctl00_PlaceHolderMain_gvItems_ctl02_lbtnEdit");
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(EditLink)).click();
                By UpdateLink = By.id("ctl00_PlaceHolderMain_gvItems_ctl02_lbtnUpdate");
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(UpdateLink)).click();
                By EditMessage = By.id("ctl00_PlaceHolderMain_lblOpertioanlResult");
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(EditMessage));
                String EditActualREsult = browserQA.findElement(EditMessage).getText();
                String EditExcprctedResult = "تم تعديل البند الخارجي بنجاح.";
                if (EditActualREsult.equals("تم تعديل البند الخارجي بنجاح.")) {
                    System.out.println("تم تعديل البند الخارجي بنجاح.");
                } else {
                    Assert.assertEquals(EditActualREsult , EditExcprctedResult , "حدث خلل ");
                }

            } else {

                By EditLink = By.id("ctl00_PlaceHolderMain_gvItems_ctl02_lbtnEdit");
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(EditLink)).click();
                By UpdateLink = By.id("ctl00_PlaceHolderMain_gvItems_ctl02_lbtnUpdate");
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(UpdateLink)).click();
                By EditMessage = By.id("ctl00_PlaceHolderMain_lblOpertioanlResult");
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(EditMessage));
                String EditActualREsult = browserQA.findElement(EditMessage).getText();
                String EditExcprctedResult = "تم تعديل البند الخارجي بنجاح.";
                if (EditActualREsult.equals("تم تعديل البند الخارجي بنجاح.")) {

                    System.out.println("تم تعديل البند الخارجي بنجاح.");
                } else {
                    Assert.assertEquals(EditActualREsult , EditExcprctedResult , "حدث خلل ");
                }
            }

        }
    }


    @Test
    //مدير عام الامن والسلامة حذف البنود الخارجية


    public void deleteExI() throws InterruptedException {
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(FormMainMenuLoactor)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(FormStatusLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(FormStatusSearchLocator)).sendKeys("غير منشور" , Keys.ENTER);

        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachButtonLocator)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(200);
            }
        }

        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(SectionsLinkLocator)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(200);
            }
        }
        List SectionTableListDelet = browserQA.findElements(By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[1]/div[2]/div/div/table[1]/tbody/tr/td[1]"));
        int TableSizeForSections = SectionTableListDelet.size();
        if (TableSizeForSections <= 1) {
            By SectionDescLocator = By.id("ctl00_PlaceHolderMain_gvSections_ctl03_tbAddFormSectionDesc");
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(SectionDescLocator)).sendKeys("Test");
            By AddLinkLocator = By.id("ctl00_PlaceHolderMain_gvSections_ctl03_lbtnAddFormSectionDesc");
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddLinkLocator)).click();
            By ExternalLinkLocator = By.id("ctl00_PlaceHolderMain_gvSections_ctl02_lbtnItems");
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(ExternalLinkLocator)).click();
            By ExternalDescLocator = By.id("ctl00_PlaceHolderMain_gvItems_ctl03_tbAddFormItemDesc");
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(ExternalDescLocator)).sendKeys("Test");
            By AddExternaLink = By.id("ctl00_PlaceHolderMain_gvItems_ctl03_lbtnAddFormItemDesc");
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddExternaLink)).click();
            By DeleteLink = By.id("ctl00_PlaceHolderMain_gvItems_ctl02_lbtnDelete");
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(DeleteLink)).click();
            By yes = By.id("ctl00_ibtnYes");
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(yes)).click();
            By DeleteMessage = By.id("ctl00_PlaceHolderMain_lblOpertioanlResult");
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(DeleteMessage));
            String DeleteActualREsult = browserQA.findElement(DeleteMessage).getText();
            String DeleteExcprctedResult = "تم حذف البند بنجاح.";
            if (DeleteActualREsult.equals("تم حذف البند بنجاح.")) {
                System.out.println("تم حذف البند بنجاح.");
            } else if (DeleteActualREsult.equals("لا يمكن الحذف لان هناك بند داخلي مرتبط به.")) {
                System.out.println("لا يمكن الحذف لان هناك بند داخلي مرتبط به.");
            } else if (DeleteActualREsult.equals("لا يمكن حذف البند  الخارجي لارتباطه بمحددات ادخال.")) {
                System.out.println("لا يمكن حذف البند  الخارجي لارتباطه بمحددات ادخال.");
            } else {
                Assert.assertEquals(DeleteActualREsult , DeleteExcprctedResult , "حدث خلل ");
            }
        } else {


            By ExternalLinkLocator = By.id("ctl00_PlaceHolderMain_gvSections_ctl02_lbtnItems");
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(ExternalLinkLocator)).click();
            List ExternalList = browserQA.findElements(By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[1]/div[2]/table/tbody/tr[2]/td/div/div/table[1]/tbody/tr/td[1]"));
            int ExternalListSize = ExternalList.size();
            if (ExternalListSize <= 1) {
                By ExternalDescLocator = By.id("ctl00_PlaceHolderMain_gvItems_ctl03_tbAddFormItemDesc");
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(ExternalDescLocator)).sendKeys("Test");
                By AddExternaLink = By.id("ctl00_PlaceHolderMain_gvItems_ctl03_lbtnAddFormItemDesc");
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddExternaLink)).click();
                By DeleteLink = By.id("ctl00_PlaceHolderMain_gvItems_ctl02_lbtnDelete");
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(DeleteLink)).click();
                By yes = By.id("ctl00_ibtnYes");
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(yes)).click();
                By DeleteMessage = By.id("ctl00_PlaceHolderMain_lblOpertioanlResult");
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(DeleteMessage));
                String DeleteActualREsult = browserQA.findElement(DeleteMessage).getText();
                String DeleteExcprctedResult = "تم حذف البند بنجاح.";
                if (DeleteActualREsult.equals("تم حذف البند بنجاح.")) {
                    System.out.println("تم حذف البند بنجاح.");

                } else if (DeleteActualREsult.equals("لا يمكن الحذف لان هناك بند داخلي مرتبط به.")) {
                    System.out.println("لا يمكن الحذف لان هناك بند داخلي مرتبط به.");

                } else if (DeleteActualREsult.equals("لا يمكن حذف البند  الخارجي لارتباطه بمحددات ادخال.")) {
                    System.out.println("لا يمكن حذف البند  الخارجي لارتباطه بمحددات ادخال.");
                } else {
                    Assert.assertEquals(DeleteActualREsult , DeleteExcprctedResult , "حدث خلل ");
                }

            } else {
                By DeleteLink = By.id("ctl00_PlaceHolderMain_gvItems_ctl02_lbtnDelete");
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(DeleteLink)).click();
                By yes = By.id("ctl00_ibtnYes");
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(yes)).click();
                By DeleteMessage = By.id("ctl00_PlaceHolderMain_lblOpertioanlResult");
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(DeleteMessage));
                String DeleteActualREsult = browserQA.findElement(DeleteMessage).getText();
                if (DeleteActualREsult.equals("تم حذف البند بنجاح.")) {
                    System.out.println("تم حذف البند بنجاح.");
                } else if (DeleteActualREsult.equals("لا يمكن الحذف لان هناك بند داخلي مرتبط به.")) {
                    System.out.println("لا يمكن الحذف لان هناك بند داخلي مرتبط به.");
                } else if (DeleteActualREsult.equals("لا يمكن حذف البند  الخارجي لارتباطه بمحددات ادخال.")) {
                    System.out.println("لا يمكن حذف البند  الخارجي لارتباطه بمحددات ادخال.");
                } else {
                    Assert.fail();
                }

            }

        }
    }


}
