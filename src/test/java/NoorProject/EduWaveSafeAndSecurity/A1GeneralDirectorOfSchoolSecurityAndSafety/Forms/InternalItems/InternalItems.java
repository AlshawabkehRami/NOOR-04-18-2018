/*
 * Created By  Rami AlShawabkeh  4/8/18 11:16 AM
 */

package NoorProject.EduWaveSafeAndSecurity.A1GeneralDirectorOfSchoolSecurityAndSafety.Forms.InternalItems;

import NoorProject.EduWaveSafeAndSecurity.A1GeneralDirectorOfSchoolSecurityAndSafety.Forms.ExternalItems.ExternalItems;
import NoorProject.EduWaveSafeAndSecurity.A1GeneralDirectorOfSchoolSecurityAndSafety.Forms.SectionsForm.SectionsForms;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static NoorProject.Other.NoorLogin.browserQA;
import static NoorProject.Other.NoorLogin.waitQA;

public class InternalItems {


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

    @Test
    public void addInternalItems() throws InterruptedException {
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(FormMainMenuLoactor)).click();

        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(FormStatusLocator)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(200);
            }
        }
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(FormStatusSearchLocator)).sendKeys("غير منشور", Keys.ENTER);

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
        int TableSizeForSections = SectionTableList.size();
        if (TableSizeForSections <= 1) {
            SectionsForms AddSections = new SectionsForms();
            AddSections.addSections();
        }
        By ExternalItemsLocator = By.id("ctl00_PlaceHolderMain_gvSections_ctl02_lbtnItems");
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ExternalItemsLocator)).click();
        List ExternalItemsTableList = browserQA.findElements(By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[1]/div[2]/table/tbody/tr[2]/td/div/div/table[1]/tbody/tr/td[1]"));
        int ExternalItemsTableSize = ExternalItemsTableList.size();
        if (ExternalItemsTableSize <= 1) {
            ExternalItems AddExternalItems = new ExternalItems();
            AddExternalItems.addExI();
        }
        By InternalItemsLocator = By.id("ctl00_PlaceHolderMain_gvItems_ctl02_lbtnInternalItems");
        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(InternalItemsLocator)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(100);
            }
        }
        List InternalItemsList = browserQA.findElements(By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[1]/div[2]/table/tbody/tr[2]/td/div/div/table[1]/tbody/tr/td[1]"));
        int InternalItemsListSize = InternalItemsList.size();
        if (InternalItemsListSize <= 1) {
            int InternalItemsListSizeAdd1 = InternalItemsList.size() + 2;
            String InternalItemsListSizeAdd1Format = String.format("%02d", InternalItemsListSizeAdd1);
            By InternalItemsDesc1 = By.id("ctl00_PlaceHolderMain_gvInternalItems_ctl" + InternalItemsListSizeAdd1Format + "_tbAddFormInternalItemDesc");
            Random Rand = new Random();
            int RandomNumber = Rand.nextInt(1000000);
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(InternalItemsDesc1)).sendKeys("بند داخلي" + RandomNumber);
            By AddEvaluationWeightLocator = By.id("ctl00_PlaceHolderMain_gvInternalItems_ctl" + InternalItemsListSizeAdd1Format + "_tbAddEvaluationWeight");
            WebElement AddEvaluationWeightLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddEvaluationWeightLocator));
            AddEvaluationWeightLocatorWait.sendKeys("10");
            By AddLink = By.id("ctl00_PlaceHolderMain_gvInternalItems_ctl" + InternalItemsListSizeAdd1Format + "_lbtnAddFormInternalItem");
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddLink)).click();
            By AddValidationMessageLocator = By.id("ctl00_PlaceHolderMain_lblOpertioanlResult");
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddValidationMessageLocator));
            String ActualResultAdd1 = browserQA.findElement(AddValidationMessageLocator).getText();
            String ExcpectedResultAdd1 = "تم إضافة البند الداخلي بنجاح.";
            Assert.assertEquals(ActualResultAdd1, ExcpectedResultAdd1, "لم تتم عملية اضافة البند الداخلي بنجاح");
        }
        if (InternalItemsListSize >= 2 && InternalItemsListSize < 22) {
            int InternalItemsListSizeAdd2 = InternalItemsList.size() + 1;
            String InternalItemsListSizeAdd1Format = String.format("%02d", InternalItemsListSizeAdd2);
            By InternalItemsDesc2 = By.id("ctl00_PlaceHolderMain_gvInternalItems_ctl" + InternalItemsListSizeAdd1Format + "_tbAddFormInternalItemDesc");
            Random Rand = new Random();
            int RandomNumber = Rand.nextInt(1000000);
            for (int i = 0; i < 3; i++) {
                try {
                    waitQA.until(ExpectedConditions.visibilityOfElementLocated(InternalItemsDesc2)).sendKeys("بند داخلي" + RandomNumber);
                    break;
                } catch (Exception e) {
                    Thread.sleep(100);
                }
            }
            By AddEvaluationWeightLocator2 = By.id("ctl00_PlaceHolderMain_gvInternalItems_ctl" + InternalItemsListSizeAdd1Format + "_tbAddEvaluationWeight");
            for (int i = 0; i < 3; i++) {
                try {
                    waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddEvaluationWeightLocator2)).sendKeys("10");
                    break;
                } catch (Exception e) {
                    Thread.sleep(100);
                }
            }
            By AddLink2 = By.id("ctl00_PlaceHolderMain_gvInternalItems_ctl" + InternalItemsListSizeAdd1Format + "_lbtnAddFormInternalItem");
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddLink2)).click();
            By AddValidationMessageLocator2 = By.id("ctl00_PlaceHolderMain_lblOpertioanlResult");
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddValidationMessageLocator2));
            String ActualResultAdd1 = browserQA.findElement(AddValidationMessageLocator2).getText();
            String ExcpectedResultAdd1 = "تم إضافة البند الداخلي بنجاح.";
            Assert.assertEquals(ActualResultAdd1, ExcpectedResultAdd1, "لم تتم عملية اضافة البند الداخلي بنجاح");
        }
        if (InternalItemsListSize >= 22) {
            int InternalItemsListSizeAdd3 = InternalItemsList.size();
            String InternalItemsListSizeAdd1Format3 = String.format("%02d", InternalItemsListSizeAdd3);
            By InternalItemsDesc2 = By.id("ctl00_PlaceHolderMain_gvInternalItems_ctl" + InternalItemsListSizeAdd1Format3 + "_tbAddFormInternalItemDesc");
            Random Rand = new Random();
            int RandomNumber = Rand.nextInt(1000000);

            for (int i = 0; i < 3; i++) {
                try {
                    waitQA.until(ExpectedConditions.visibilityOfElementLocated(InternalItemsDesc2)).sendKeys("بند داخلي" + RandomNumber);
                    break;
                } catch (Exception e) {
                    Thread.sleep(100);
                }
            }
            By AddEvaluationWeightLocator23 = By.id("ctl00_PlaceHolderMain_gvInternalItems_ctl" + InternalItemsListSizeAdd1Format3 + "_tbAddEvaluationWeight");
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddEvaluationWeightLocator23)).sendKeys("10");
            By AddLink23 = By.id("ctl00_PlaceHolderMain_gvInternalItems_ctl" + InternalItemsListSizeAdd1Format3 + "_lbtnAddFormInternalItem");
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddLink23)).click();
            By AddValidationMessageLocator23 = By.id("ctl00_PlaceHolderMain_lblOpertioanlResult");
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddValidationMessageLocator23));
            String ActualResultAdd1 = browserQA.findElement(AddValidationMessageLocator23).getText();
            String ExcpectedResultAdd1 = "تم إضافة البند الداخلي بنجاح.";
            Assert.assertEquals(ActualResultAdd1, ExcpectedResultAdd1, "لم تتم عملية اضافة البند الداخلي بنجاح");
        }
    }

    @Test

    public void deleteInternalItems() throws InterruptedException {
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(FormMainMenuLoactor)).click();

        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(FormStatusLocator)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(200);
            }
        }

        waitQA.until(ExpectedConditions.visibilityOfElementLocated(FormStatusSearchLocator)).sendKeys("غير منشور", Keys.ENTER);

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
            By InternalLink = By.id("ctl00_PlaceHolderMain_gvItems_ctl02_lbtnInternalItems");
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(InternalLink)).click();
            By AddFormInternalItemDesc = By.id("ctl00_PlaceHolderMain_gvInternalItems_ctl03_tbAddFormInternalItemDesc");
            By AddEvaluationWeight = By.id("ctl00_PlaceHolderMain_gvInternalItems_ctl03_tbAddEvaluationWeight");
            By AddFormInternalItem = By.id("ctl00_PlaceHolderMain_gvInternalItems_ctl03_lbtnAddFormInternalItem");
            By lbtnDelete = By.id("ctl00_PlaceHolderMain_gvInternalItems_ctl02_lbtnDelete");
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddFormInternalItemDesc)).sendKeys("Test");
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddEvaluationWeight)).sendKeys("10");
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddFormInternalItem)).click();
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(lbtnDelete)).click();
            By yes = By.id("ctl00_ibtnYes");
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(yes)).click();
            By DeleteMessage = By.id("ctl00_PlaceHolderMain_lblOpertioanlResult");
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(DeleteMessage));
            String DeleteActualREsult = browserQA.findElement(DeleteMessage).getText();
            String DeleteExcprctedResult = "تم حذف البند الداخلي بنجاح.";
            if (DeleteActualREsult.equals(DeleteExcprctedResult)) {
                System.out.println("تم حذف البند الداخلي بنجاح.");
            } else if (!DeleteActualREsult.equals(DeleteExcprctedResult)) {
                Assert.fail();
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
                By InternalLink = By.id("ctl00_PlaceHolderMain_gvItems_ctl02_lbtnInternalItems");
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(InternalLink)).click();
                By AddFormInternalItemDesc = By.id("ctl00_PlaceHolderMain_gvInternalItems_ctl03_tbAddFormInternalItemDesc");
                By AddEvaluationWeight = By.id("ctl00_PlaceHolderMain_gvInternalItems_ctl03_tbAddEvaluationWeight");
                By AddFormInternalItem = By.id("ctl00_PlaceHolderMain_gvInternalItems_ctl03_lbtnAddFormInternalItem");
                By lbtnDelete = By.id("ctl00_PlaceHolderMain_gvInternalItems_ctl02_lbtnDelete");
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddFormInternalItemDesc)).sendKeys("Test");
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddEvaluationWeight)).sendKeys("10");
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddFormInternalItem)).click();
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(lbtnDelete)).click();
                By yes = By.id("ctl00_ibtnYes");
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(yes)).click();
                By DeleteMessage = By.id("ctl00_PlaceHolderMain_lblOpertioanlResult");
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(DeleteMessage));
                String DeleteActualREsult = browserQA.findElement(DeleteMessage).getText();
                String DeleteExcprctedResult = "تم حذف البند الداخلي بنجاح.";
                if (DeleteActualREsult.equals(DeleteExcprctedResult)) {
                    System.out.println("تم حذف البند الداخلي بنجاح.");
                }
                if (!DeleteActualREsult.equals(DeleteExcprctedResult)) {
                    Assert.fail();
                }
            } else {
                By InternalLink = By.id("ctl00_PlaceHolderMain_gvItems_ctl02_lbtnInternalItems");
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(InternalLink)).click();
                List InternalList = browserQA.findElements(By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[1]/div[2]/table/tbody/tr[2]/td/div/div/table[1]/tbody/tr/td[1]"));
                int InternalListSize = InternalList.size();
                if (InternalListSize <= 1) {
                    By AddFormInternalItemDesc = By.id("ctl00_PlaceHolderMain_gvInternalItems_ctl03_tbAddFormInternalItemDesc");
                    By AddEvaluationWeight = By.id("ctl00_PlaceHolderMain_gvInternalItems_ctl03_tbAddEvaluationWeight");
                    By AddFormInternalItem = By.id("ctl00_PlaceHolderMain_gvInternalItems_ctl03_lbtnAddFormInternalItem");
                    By lbtnDelete = By.id("ctl00_PlaceHolderMain_gvInternalItems_ctl02_lbtnDelete");
                    waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddFormInternalItemDesc)).sendKeys("Test");
                    waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddEvaluationWeight)).sendKeys("10");
                    waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddFormInternalItem)).click();
                    waitQA.until(ExpectedConditions.visibilityOfElementLocated(lbtnDelete)).click();
                    By yes = By.id("ctl00_ibtnYes");
                    waitQA.until(ExpectedConditions.visibilityOfElementLocated(yes)).click();
                    By DeleteMessage = By.id("ctl00_PlaceHolderMain_lblOpertioanlResult");
                    waitQA.until(ExpectedConditions.visibilityOfElementLocated(DeleteMessage));
                    String DeleteActualREsult = browserQA.findElement(DeleteMessage).getText();
                    String DeleteExcprctedResult = "تم حذف البند الداخلي بنجاح.";
                    if (DeleteActualREsult.equals(DeleteExcprctedResult)) {
                        System.out.println("تم حذف البند الداخلي بنجاح.");
                    } else if (!DeleteActualREsult.equals(DeleteExcprctedResult)) {
                        Assert.fail();
                    }
                } else {
                    By lbtnDelete = By.id("ctl00_PlaceHolderMain_gvInternalItems_ctl02_lbtnDelete");
                    waitQA.until(ExpectedConditions.visibilityOfElementLocated(lbtnDelete)).click();
                    By yes = By.id("ctl00_ibtnYes");
                    waitQA.until(ExpectedConditions.visibilityOfElementLocated(yes)).click();
                    By DeleteMessage = By.id("ctl00_PlaceHolderMain_lblOpertioanlResult");
                    waitQA.until(ExpectedConditions.visibilityOfElementLocated(DeleteMessage));
                    String DeleteActualREsult = browserQA.findElement(DeleteMessage).getText();
                    String DeleteExcprctedResult = "تم حذف البند الداخلي بنجاح.";
                    if (DeleteActualREsult.equals(DeleteExcprctedResult)) {
                        System.out.println("تم حذف البند الداخلي بنجاح.");
                    } else if (!DeleteActualREsult.equals(DeleteExcprctedResult)) {
                        Assert.fail();
                    }
                }
            }
        }

    }


    @Test

    public void editInternalItems() throws InterruptedException {

        waitQA.until(ExpectedConditions.visibilityOfElementLocated(FormMainMenuLoactor)).click();
        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(FormStatusLocator)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(200);
            }
        }
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(FormStatusSearchLocator)).sendKeys("غير منشور", Keys.ENTER);
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
                Thread.sleep(100);
            }
        }
        List SectionTableListDelet = browserQA.findElements(By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[1]/div[2]/div/div/table[1]/tbody/tr/td[1]"));
        int TableSizeForSections = SectionTableListDelet.size();
        if (TableSizeForSections <= 1) {
            By SectionDescLocator = By.id("ctl00_PlaceHolderMain_gvSections_ctl03_tbAddFormSectionDesc");
            for (int i = 0; i < 3; i++) {
                try {
                    waitQA.until(ExpectedConditions.visibilityOfElementLocated(SectionDescLocator)).sendKeys("Test");
                    break;
                } catch (Exception e) {
                    Thread.sleep(100);
                }
            }
            By AddLinkLocator = By.id("ctl00_PlaceHolderMain_gvSections_ctl03_lbtnAddFormSectionDesc");
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddLinkLocator)).click();
            By ExternalLinkLocator = By.id("ctl00_PlaceHolderMain_gvSections_ctl02_lbtnItems");
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(ExternalLinkLocator)).click();
            By ExternalDescLocator = By.id("ctl00_PlaceHolderMain_gvItems_ctl03_tbAddFormItemDesc");
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(ExternalDescLocator)).sendKeys("Test");
            By AddExternaLink = By.id("ctl00_PlaceHolderMain_gvItems_ctl03_lbtnAddFormItemDesc");
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddExternaLink)).click();
            By InternalLink = By.id("ctl00_PlaceHolderMain_gvItems_ctl02_lbtnInternalItems");
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(InternalLink)).click();
            By AddFormInternalItemDesc = By.id("ctl00_PlaceHolderMain_gvInternalItems_ctl03_tbAddFormInternalItemDesc");
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddFormInternalItemDesc)).sendKeys("Test");
            By AddEvaluationWeight = By.id("ctl00_PlaceHolderMain_gvInternalItems_ctl03_tbAddEvaluationWeight");
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddEvaluationWeight)).sendKeys("10");
            By AddFormInternalItem = By.id("ctl00_PlaceHolderMain_gvInternalItems_ctl03_lbtnAddFormInternalItem");
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddFormInternalItem)).click();
            By EditLinkLoactor = By.id("ctl00_PlaceHolderMain_gvInternalItems_ctl02_lbtnEdit");
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(EditLinkLoactor)).click();
            By UpdateLink = By.id("ctl00_PlaceHolderMain_gvInternalItems_ctl02_lbtnUpdate");
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(UpdateLink)).click();
            By UpdateMessage = By.id("ctl00_PlaceHolderMain_lblOpertioanlResult");
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(UpdateMessage));
            String UpdateActualREsult = browserQA.findElement(UpdateMessage).getText();
            String UpdateExcprctedResult = "تم تعديل البند الداخلي بنجاح.";
            if (UpdateActualREsult.equals(UpdateExcprctedResult)) {
                System.out.println("تم تعديل البند الداخلي بنجاح.");
            } else if (!UpdateActualREsult.equals(UpdateExcprctedResult)) {
                Assert.fail();
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
                By InternalLink = By.id("ctl00_PlaceHolderMain_gvItems_ctl02_lbtnInternalItems");
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(InternalLink)).click();
                By AddFormInternalItemDesc = By.id("ctl00_PlaceHolderMain_gvInternalItems_ctl03_tbAddFormInternalItemDesc");
                By AddEvaluationWeight = By.id("ctl00_PlaceHolderMain_gvInternalItems_ctl03_tbAddEvaluationWeight");
                By AddFormInternalItem = By.id("ctl00_PlaceHolderMain_gvInternalItems_ctl03_lbtnAddFormInternalItem");
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddFormInternalItemDesc)).sendKeys("Test");
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddEvaluationWeight)).sendKeys("10");
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddFormInternalItem)).click();
                By EditLinkLoactor = By.id("ctl00_PlaceHolderMain_gvInternalItems_ctl02_lbtnEdit");
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(EditLinkLoactor)).click();
                By UpdateLink = By.id("ctl00_PlaceHolderMain_gvInternalItems_ctl02_lbtnUpdate");
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(UpdateLink)).click();
                By UpdateMessage = By.id("ctl00_PlaceHolderMain_lblOpertioanlResult");
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(UpdateMessage));
                String UpdateActualREsult = browserQA.findElement(UpdateMessage).getText();
                String UpdateExcprctedResult = "تم تعديل البند الداخلي بنجاح.";
                if (UpdateActualREsult.equals(UpdateExcprctedResult)) {
                    System.out.println("تم تعديل البند الداخلي بنجاح.");
                } else if (!UpdateActualREsult.equals(UpdateExcprctedResult)) {
                    Assert.fail();
                }
            } else {
                By InternalLink = By.id("ctl00_PlaceHolderMain_gvItems_ctl02_lbtnInternalItems");
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(InternalLink)).click();
                List InternalList = browserQA.findElements(By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[1]/div[2]/table/tbody/tr[2]/td/div/div/table[1]/tbody/tr/td[1]"));
                int InternalListSize = InternalList.size();
                if (InternalListSize <= 1) {
                    By AddFormInternalItemDesc = By.id("ctl00_PlaceHolderMain_gvInternalItems_ctl03_tbAddFormInternalItemDesc");
                    By AddEvaluationWeight = By.id("ctl00_PlaceHolderMain_gvInternalItems_ctl03_tbAddEvaluationWeight");
                    By AddFormInternalItem = By.id("ctl00_PlaceHolderMain_gvInternalItems_ctl03_lbtnAddFormInternalItem");
                    waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddFormInternalItemDesc)).sendKeys("Test");
                    waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddEvaluationWeight)).sendKeys("10");
                    waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddFormInternalItem)).click();
                    By EditLinkLoactor = By.id("ctl00_PlaceHolderMain_gvInternalItems_ctl02_lbtnEdit");
                    waitQA.until(ExpectedConditions.visibilityOfElementLocated(EditLinkLoactor)).click();
                    By UpdateLink = By.id("ctl00_PlaceHolderMain_gvInternalItems_ctl02_lbtnUpdate");
                    waitQA.until(ExpectedConditions.visibilityOfElementLocated(UpdateLink)).click();
                    By UpdateMessage = By.id("ctl00_PlaceHolderMain_lblOpertioanlResult");
                    waitQA.until(ExpectedConditions.visibilityOfElementLocated(UpdateMessage));
                    String UpdateActualREsult = browserQA.findElement(UpdateMessage).getText();
                    String UpdateExcprctedResult = "تم تعديل البند الداخلي بنجاح.";
                    if (UpdateActualREsult.equals(UpdateExcprctedResult)) {
                        System.out.println("تم تعديل البند الداخلي بنجاح.");
                    } else if (!UpdateActualREsult.equals(UpdateExcprctedResult)) {
                        Assert.fail();
                    }
                } else {
                    By EditLinkLoactor = By.id("ctl00_PlaceHolderMain_gvInternalItems_ctl02_lbtnEdit");
                    waitQA.until(ExpectedConditions.visibilityOfElementLocated(EditLinkLoactor)).click();
                    By UpdateLink = By.id("ctl00_PlaceHolderMain_gvInternalItems_ctl02_lbtnUpdate");
                    waitQA.until(ExpectedConditions.visibilityOfElementLocated(UpdateLink)).click();
                    By UpdateMessage = By.id("ctl00_PlaceHolderMain_lblOpertioanlResult");
                    waitQA.until(ExpectedConditions.visibilityOfElementLocated(UpdateMessage));
                    String UpdateActualREsult = browserQA.findElement(UpdateMessage).getText();
                    String UpdateExcprctedResult = "تم تعديل البند الداخلي بنجاح.";
                    if (UpdateActualREsult.equals(UpdateExcprctedResult)) {
                        System.out.println("تم تعديل البند الداخلي بنجاح.");
                    } else if (!UpdateActualREsult.equals(UpdateExcprctedResult)) {

                        Assert.fail();

                    }

                }
            }
        }
    }


}

