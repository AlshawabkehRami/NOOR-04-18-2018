/*
 * Created By  Rami AlShawabkeh  4/11/18 3:58 PM
 */

/*
 * Created By  Rami AlShawabkeh  4/8/18 3:08 PM
 */

package NoorProject.EduWaveSafeAndSecurity.A2SSOfficerInMinstry.Forms.SectionsForm;

import NoorProject.EduWaveSafeAndSecurity.A1GeneralDirectorOfSchoolSecurityAndSafety.Forms.Forms.SafetyForms;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static NoorProject.Other.NoorLogin.browserQA;
import static NoorProject.Other.NoorLogin.waitQA;

public class SectionsForm {


    private By SwitchProfileLocator = By.id("ctl00_oHeader_divSwitchUser");
    private By UserNameLabelLocator = By.linkText("موظف الأمن والسلامة المدرسية");
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

    //مدير عام الامن والسلامة/ أضافة الاقسام
    @Test
    public void addSections() throws InterruptedException {
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(FormMainMenuLoactor)).click();
        List FormTableSizeElse = browserQA.findElements(By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[3]/div[2]/div/div/table[1]/tbody/tr/td[1]"));
        int TableSizeNO1 = FormTableSizeElse.size();
        if (TableSizeNO1 <= 1) {
            SafetyForms AddNewForms = new SafetyForms();
            AddNewForms.addSafetyForms();
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(FormStatusLocator)).click();
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(FormStatusSearchLocator)).sendKeys("غير منشور" , Keys.ENTER);
            for (int i = 0; i < 3; i++) {
                try {
                    waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachButtonLocator)).click();
                    break;
                } catch (Exception e) {
                    Thread.sleep(100);
                }
            }
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(SectionsLinkLocator)).click();
            List SectionTableList = browserQA.findElements(By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[1]/div[2]/div/div/table[1]/tbody/tr/td[1]"));
            int TableSize = SectionTableList.size();
            if (TableSize <= 1) {
                int TableSizeAdd = SectionTableList.size() + 2;
                String TableSizeAddFormat = String.format("%02d" , TableSizeAdd);
                By SectionDescrptionSplit = By.id("ctl00_PlaceHolderMain_gvSections_ctl" + TableSizeAddFormat + "_tbAddFormSectionDesc");
                Random Rand = new Random();
                int RandomNumber = Rand.nextInt(1000000);
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(SectionDescrptionSplit)).sendKeys("Rami" + RandomNumber);
                By AddLinkSpilt = By.id("ctl00_PlaceHolderMain_gvSections_ctl" + TableSizeAddFormat + "_lbtnAddFormSectionDesc");
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddLinkSpilt)).click();
                By AddSectionsMessageLocator = By.id("ctl00_PlaceHolderMain_lblOpertioanlResult");
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddSectionsMessageLocator));
                String ActualResult = browserQA.findElement(AddSectionsMessageLocator).getText();
                String ExcpectedResult = "تم إضافة القسم بنجاح.";
                Assert.assertEquals(ActualResult , ExcpectedResult , "لم تتم عملية اضافة القسم بنجاح");
            }
            if (TableSize >= 2 && TableSize < 22) {
                int TableSizeAdd = SectionTableList.size() + 1;
                String TableSizeAddFormat = String.format("%02d" , TableSizeAdd);
                By SectionDescrptionSplit = By.id("ctl00_PlaceHolderMain_gvSections_ctl" + TableSizeAddFormat + "_tbAddFormSectionDesc");
                Random Rand = new Random();
                int RandomNumber = Rand.nextInt(1000000);
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(SectionDescrptionSplit)).sendKeys("Rami" + RandomNumber);
                By AddLinkSpilt = By.id("ctl00_PlaceHolderMain_gvSections_ctl" + TableSizeAddFormat + "_lbtnAddFormSectionDesc");
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddLinkSpilt)).click();
                By AddSectionsMessageLocator = By.id("ctl00_PlaceHolderMain_lblOpertioanlResult");
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddSectionsMessageLocator));
                String ActualResult = browserQA.findElement(AddSectionsMessageLocator).getText();
                String ExcpectedResult = "تم إضافة القسم بنجاح.";
                Assert.assertEquals(ActualResult , ExcpectedResult , "لم تتم عملية اضافة القسم بنجاح");
            }
            if (TableSize >= 22) {
                int TableSizeAdd = SectionTableList.size();
                String TableSizeAddFormat = String.format("%02d" , TableSizeAdd);
                By SectionDescrptionSplit = By.id("ctl00_PlaceHolderMain_gvSections_ctl" + TableSizeAddFormat + "_tbAddFormSectionDesc");
                Random Rand = new Random();
                int RandomNumber = Rand.nextInt(1000000);
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(SectionDescrptionSplit)).sendKeys("Rami" + RandomNumber);
                By AddLinkSpilt = By.id("ctl00_PlaceHolderMain_gvSections_ctl" + TableSizeAddFormat + "_lbtnAddFormSectionDesc");
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddLinkSpilt)).click();
                By AddSectionsMessageLocator = By.id("ctl00_PlaceHolderMain_lblOpertioanlResult");
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddSectionsMessageLocator));
                String ActualResult = browserQA.findElement(AddSectionsMessageLocator).getText();
                String ExcpectedResult = "تم إضافة القسم بنجاح.";
                Assert.assertEquals(ActualResult , ExcpectedResult , "لم تتم عملية اضافة القسم بنجاح");
            }
        } else {
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(FormStatusLocator)).click();
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(FormStatusSearchLocator)).sendKeys("غير منشور" , Keys.ENTER);

            for (int i = 0; i < 3; i++) {
                try {
                    waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachButtonLocator)).click();
                    break;
                } catch (Exception e) {
                    Thread.sleep(100);
                }
            }

            for (int i = 0; i < 3; i++) {
                try {
                    waitQA.until(ExpectedConditions.visibilityOfElementLocated(SectionsLinkLocator)).click();
                    break;
                } catch (Exception e) {
                    Thread.sleep(100);
                }
            }
            List SectionTableList = browserQA.findElements(By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[1]/div[2]/div/div/table[1]/tbody/tr/td[1]"));
            int TableSize = SectionTableList.size();
            if (TableSize <= 1) {
                int TableSizeAdd = SectionTableList.size() + 2;
                String TableSizeAddFormat = String.format("%02d" , TableSizeAdd);
                By SectionDescrptionSplit = By.id("ctl00_PlaceHolderMain_gvSections_ctl" + TableSizeAddFormat + "_tbAddFormSectionDesc");
                Random Rand = new Random();
                int RandomNumber = Rand.nextInt(1000000);

                for (int i = 0; i < 3; i++) {
                    try {
                        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SectionDescrptionSplit)).sendKeys("Rami" + RandomNumber);
                        break;
                    } catch (Exception e) {
                        Thread.sleep(100);
                    }
                }
                By AddLinkSpilt = By.id("ctl00_PlaceHolderMain_gvSections_ctl" + TableSizeAddFormat + "_lbtnAddFormSectionDesc");
                for (int i = 0; i < 3; i++) {
                    try {
                        waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddLinkSpilt)).click();
                        break;
                    } catch (Exception e) {
                        Thread.sleep(100);
                    }
                }
                By AddSectionsMessageLocator = By.id("ctl00_PlaceHolderMain_lblOpertioanlResult");
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddSectionsMessageLocator));
                String ActualResult = browserQA.findElement(AddSectionsMessageLocator).getText();
                String ExcpectedResult = "تم إضافة القسم بنجاح.";
                Assert.assertEquals(ActualResult , ExcpectedResult , "لم تتم عملية اضافة القسم بنجاح");
            }
            if (TableSize >= 2 && TableSize < 22) {
                int TableSizeAdd = SectionTableList.size() + 1;
                String TableSizeAddFormat = String.format("%02d" , TableSizeAdd);
                By SectionDescrptionSplit = By.id("ctl00_PlaceHolderMain_gvSections_ctl" + TableSizeAddFormat + "_tbAddFormSectionDesc");
                Random Rand = new Random();
                int RandomNumber = Rand.nextInt(1000000);
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(SectionDescrptionSplit)).sendKeys("Rami" + RandomNumber);
                By AddLinkSpilt = By.id("ctl00_PlaceHolderMain_gvSections_ctl" + TableSizeAddFormat + "_lbtnAddFormSectionDesc");
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddLinkSpilt)).click();
                By AddSectionsMessageLocator = By.id("ctl00_PlaceHolderMain_lblOpertioanlResult");
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddSectionsMessageLocator));
                String ActualResult = browserQA.findElement(AddSectionsMessageLocator).getText();
                String ExcpectedResult = "تم إضافة القسم بنجاح.";
                Assert.assertEquals(ActualResult , ExcpectedResult , "لم تتم عملية اضافة القسم بنجاح");
            }
            if (TableSize >= 22) {
                int TableSizeAdd = SectionTableList.size();
                String TableSizeAddFormat = String.format("%02d" , TableSizeAdd);
                By SectionDescrptionSplit = By.id("ctl00_PlaceHolderMain_gvSections_ctl" + TableSizeAddFormat + "_tbAddFormSectionDesc");
                Random Rand = new Random();
                int RandomNumber = Rand.nextInt(1000000);
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(SectionDescrptionSplit)).sendKeys("Rami" + RandomNumber);
                By AddLinkSpilt = By.id("ctl00_PlaceHolderMain_gvSections_ctl" + TableSizeAddFormat + "_lbtnAddFormSectionDesc");
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddLinkSpilt)).click();
                By AddSectionsMessageLocator = By.id("ctl00_PlaceHolderMain_lblOpertioanlResult");
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddSectionsMessageLocator));
                String ActualResult = browserQA.findElement(AddSectionsMessageLocator).getText();
                String ExcpectedResult = "تم إضافة القسم بنجاح.";
                Assert.assertEquals(ActualResult , ExcpectedResult , "لم تتم عملية اضافة القسم بنجاح");
            }
        }
    }

    private By BTNBack = By.id("ctl00_PlaceHolderMain_ibtnBack");

    //مدير عام الامن والسلامة/ عرض الاقسام الاقسام
    @Test
    public void viewSections() throws InterruptedException {
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(FormMainMenuLoactor)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(FormStatusLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(FormStatusSearchLocator)).sendKeys("غير منشور" , Keys.ENTER);
        Thread.sleep(1000);


        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachButtonLocator)).click();

        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SectionsLinkLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(BTNBack)).click();
    }


    private By EditLinkLocator = By.id("ctl00_PlaceHolderMain_gvSections_ctl02_lbtnEdit");
    private By SaveLinkLocator = By.id("ctl00_PlaceHolderMain_gvSections_ctl02_lbtnUpdate");

    //مدير عام الامن والسلامة/ تعديل الاقسام الاقسام
    @Test
    public void editSections() throws InterruptedException {
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(FormMainMenuLoactor)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(FormStatusLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(FormStatusSearchLocator)).sendKeys("غير منشور" , Keys.ENTER);
        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachButtonLocator)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(100);
            }
        }

        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(SectionsLinkLocator)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(100);
            }
        }
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(EditLinkLocator)).click();
        By SectionDescLoactor = By.id("ctl00_PlaceHolderMain_gvSections_ctl02_tbFormSectionDesc");
        Random Rand = new Random();
        int RandomNumber = Rand.nextInt(1000000);
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SectionDescLoactor)).clear();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SectionDescLoactor)).sendKeys("Rami" + RandomNumber);
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SaveLinkLocator)).click();
        By MessgaeLocator = By.id("ctl00_PlaceHolderMain_lblOpertioanlResult");
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(MessgaeLocator));
        String ActualResult = browserQA.findElement(MessgaeLocator).getText();
        String ExcpectedResult = "تم تعديل القسم بنجاح.";
        Assert.assertEquals(ActualResult , ExcpectedResult , "لم تتم عملية التعديل بنجاح");
    }

    private By DeleteLinkLocator = By.id("ctl00_PlaceHolderMain_gvSections_ctl02_lbtnDelete");
    private By YesConfrmationLocator = By.id("ctl00_ibtnYes");

    //مدير عام الامن والسلامة حذف الاقسام
    @Test
    public void deleteSections() throws InterruptedException, IOException {

        waitQA.until(ExpectedConditions.visibilityOfElementLocated(FormMainMenuLoactor)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(FormStatusLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(FormStatusSearchLocator)).sendKeys("غير منشور" , Keys.ENTER);
        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachButtonLocator)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(100);
            }
        }
        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(SectionsLinkLocator)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(100);
            }
        }
        List SectionTableSize = browserQA.findElements(By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[1]/div[2]/div/div/table[1]/tbody/tr/td[1]"));
        int TableSizeDotSize = SectionTableSize.size();
        if (TableSizeDotSize == (1)) {
            By SectionDescLocator = By.id("ctl00_PlaceHolderMain_gvSections_ctl03_tbAddFormSectionDesc");
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(SectionDescLocator)).sendKeys("Rami");
            By AddLinkLocator = By.id("ctl00_PlaceHolderMain_gvSections_ctl03_lbtnAddFormSectionDesc");
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddLinkLocator)).click();
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(DeleteLinkLocator)).click();
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(YesConfrmationLocator)).click();
            By MessageLocator = By.id("ctl00_PlaceHolderMain_lblOpertioanlResult");
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(MessageLocator));
            String ActualResult = browserQA.findElement(MessageLocator).getText();
            String ExpectedResult = "تم حذف القسم بنجاح.";
            if (ActualResult.equals("لايمكن الحذف لارتباطه ببند خارجي.")) {
                System.out.println("لايمكن الحذف لارتباطه ببند خارجي.");
            } else if (ActualResult.equals("تم حذف القسم بنجاح.")) {
                System.out.println("تم حذف القسم بنجاح.");
            } else if (!ActualResult.equals("لايمكن الحذف لارتباطه ببند خارجي.") && !ActualResult.equals(ExpectedResult)) {
                TakesScreenshot Ts = (TakesScreenshot) browserQA;
                File Src = Ts.getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(Src , new File("src/test/resc/TakeScreenShot/DeleteSection.png"));
                Assert.fail("حدث خلل لعميلة الحذف");
            }
        } else {


            for (int i = 0; i < 3; i++) {
                try {
                    waitQA.until(ExpectedConditions.visibilityOfElementLocated(DeleteLinkLocator)).click();
                    break;
                } catch (Exception e) {
                    Thread.sleep(100);
                }
            }
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(YesConfrmationLocator)).click();
            By MessageLocator = By.id("ctl00_PlaceHolderMain_lblOpertioanlResult");
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(MessageLocator));
            String ActualResult = browserQA.findElement(MessageLocator).getText();
            String ExpectedResult = "تم حذف القسم بنجاح.";
            if (ActualResult.equals("لايمكن الحذف لارتباطه ببند خارجي.")) {
                System.out.println("لايمكن الحذف لارتباطه ببند خارجي.");
            } else if (ActualResult.equals("تم حذف القسم بنجاح.")) {
                System.out.println("تم حذف القسم بنجاح.");
            } else if (!ActualResult.equals("لايمكن الحذف لارتباطه ببند خارجي.") && !ActualResult.equals(ExpectedResult)) {
                TakesScreenshot Ts = (TakesScreenshot) browserQA;
                File Src = Ts.getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(Src , new File("src/test/resc/TakeScreenShot/DeleteSection.png"));
                System.out.println("حدث خلل في عملية الحذف");
                System.out.println(ActualResult);
            }
        }

    }

}



