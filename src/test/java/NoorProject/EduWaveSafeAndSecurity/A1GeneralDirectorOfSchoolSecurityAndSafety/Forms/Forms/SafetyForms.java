/*
 * Created By Rami AlShawabkeh  4/5/18 3:12 PM
 */

package NoorProject.EduWaveSafeAndSecurity.A1GeneralDirectorOfSchoolSecurityAndSafety.Forms.Forms;

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

public class SafetyForms {


    private By SwitchProfileLocator = By.id("ctl00_oHeader_divSwitchUser");
    private By UserNameLabelLocator = By.linkText("مدير عام الأمن والسلامة المدرسية");
    private By FormMainMenuLoactor = By.id("divMenuItem_5968");
    private By FromDayFooterLocator = By.xpath("/html/body/div/table/tbody/tr[4]/td[2]");
    private By ToDayFooterLocator = By.xpath("/html/body/div/table/tbody/tr[5]/td[1]");
    private By AddValidationMessageLoactor = By.id("ctl00_PlaceHolderMain_lblOpertioanlResult");


    @Test
    public void switchProfile() {
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SwitchProfileLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(UserNameLabelLocator)).click();
    }

    Random Rand = new Random();
    int RandomNumber = Rand.nextInt(1000000);
    String FormSDescrption = "نموذج رقم" + RandomNumber;
    private By FormStatusLocator = By.id("select2-ctl00_PlaceHolderMain_ddlFormStatus-container");
    private By FormStatusSearchLocator = By.xpath("/html/body/span/span/span[1]/input");
    private By SerachButtonLocator = By.id("ctl00_PlaceHolderMain_ibtnSearch");

    @Test
    public void addSafetyForms() throws InterruptedException {

        waitQA.until(ExpectedConditions.visibilityOfElementLocated(FormMainMenuLoactor)).click();
        List FormsTableList = browserQA.findElements(By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[3]/div[2]/div/div/table[1]/tbody/tr/td[1]"));
        int FormsTableListSize = FormsTableList.size();
        if (FormsTableListSize <= 1) {
            int FormsTableListSizeAdd1 = FormsTableList.size() + 2;
            String FormatAdd1 = String.format("%02d", FormsTableListSizeAdd1);
            By AddFormDescLocator = By.id("ctl00_PlaceHolderMain_gvForms_ctl" + FormatAdd1 + "_tbAddFormDesc");
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddFormDescLocator)).sendKeys(FormSDescrption);
            By FromDateFooterLocator = By.id("ctl00_PlaceHolderMain_gvForms_ctl" + FormatAdd1 + "_clrFromDateFooter_ibtnOpenCalendar");
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(FromDateFooterLocator)).click();
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(FromDayFooterLocator)).click();
            By ToDateFooterLocator = By.id("ctl00_PlaceHolderMain_gvForms_ctl" + FormatAdd1 + "_clrToDateFooter_ibtnOpenCalendar");
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(ToDateFooterLocator)).click();
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(ToDayFooterLocator)).click();
            By AddLinkLOcator = By.id("ctl00_PlaceHolderMain_gvForms_ctl" + FormatAdd1 + "_lbtnAddFormDesc");
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddLinkLOcator)).click();
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddValidationMessageLoactor));
            String AddValidationMessageLoactorString = browserQA.findElement(AddValidationMessageLoactor).getText();
            String message = "تم إضافة النموذج بنجاح";
            Assert.assertEquals(message, AddValidationMessageLoactorString, "لم تتم الاضافة بنجاح");
        }
        if (FormsTableListSize >= 2 && FormsTableListSize < 22) {
            int FormsTableListSizeAdd2 = FormsTableList.size() + 1;
            String FormatAdd2 = String.format("%02d", FormsTableListSizeAdd2);
            By AddFormDescLocator2 = By.id("ctl00_PlaceHolderMain_gvForms_ctl" + FormatAdd2 + "_tbAddFormDesc");
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddFormDescLocator2)).sendKeys(FormSDescrption);
            By FromDateFooterLocator2 = By.id("ctl00_PlaceHolderMain_gvForms_ctl" + FormatAdd2 + "_clrFromDateFooter_ibtnOpenCalendar");
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(FromDateFooterLocator2)).click();
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(FromDayFooterLocator)).click();
            By ToDateFooterLocator2 = By.id("ctl00_PlaceHolderMain_gvForms_ctl" + FormatAdd2 + "_clrToDateFooter_ibtnOpenCalendar");
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(ToDateFooterLocator2)).click();
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(ToDayFooterLocator)).click();
            By AddLinkLOcator2 = By.id("ctl00_PlaceHolderMain_gvForms_ctl" + FormatAdd2 + "_lbtnAddFormDesc");
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddLinkLOcator2)).click();
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddValidationMessageLoactor));
            String AddValidationMessageLoactorString2 = browserQA.findElement(AddValidationMessageLoactor).getText();
            String message2 = "تم إضافة النموذج بنجاح";
            Assert.assertEquals(message2, AddValidationMessageLoactorString2, "لم تتم الاضافة بنجاح");
        }
        if (FormsTableListSize >= 22) {
            int FormsTableListSizeAdd23 = FormsTableList.size();
            String FormatAdd3 = String.format("%02d", FormsTableListSizeAdd23);
            By AddFormDescLocator23 = By.id("ctl00_PlaceHolderMain_gvForms_ctl" + FormatAdd3 + "_tbAddFormDesc");
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddFormDescLocator23)).sendKeys(FormSDescrption);
            By FromDateFooterLocator23 = By.id("ctl00_PlaceHolderMain_gvForms_ctl" + FormatAdd3 + "_clrFromDateFooter_ibtnOpenCalendar");
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(FromDateFooterLocator23)).click();
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(FromDayFooterLocator)).click();
            By ToDateFooterLocator23 = By.id("ctl00_PlaceHolderMain_gvForms_ctl" + FormatAdd3 + "_clrToDateFooter_ibtnOpenCalendar");
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(ToDateFooterLocator23)).click();
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(ToDayFooterLocator)).click();
            By AddLinkLOcator2 = By.id("ctl00_PlaceHolderMain_gvForms_ctl" + FormatAdd3 + "_lbtnAddFormDesc");
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddLinkLOcator2)).click();
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddValidationMessageLoactor));
            String AddValidationMessageLoactorString23 = browserQA.findElement(AddValidationMessageLoactor).getText();
            String message23 = "تم إضافة النموذج بنجاح";
            Assert.assertEquals(message23, AddValidationMessageLoactorString23, "لم تتم الاضافة بنجاح");
        }
    }

    private By SearchLoactor = By.id("ctl00_PlaceHolderMain_ibtnSearch");

    @Test
    public void viewForm() throws InterruptedException {
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(FormMainMenuLoactor)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SearchLoactor)).click();
    }

    private By YesConfrmationLocator = By.id("ctl00_ibtnYes");
    private By PublishingLinkLocator = By.id("ctl00_PlaceHolderMain_gvForms_ctl02_lbtnPublish");

    @Test
    public void publishingForm() throws InterruptedException {
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(FormMainMenuLoactor)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(FormStatusLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(FormStatusSearchLocator)).sendKeys("غير منشور", Keys.ENTER);
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SearchLoactor)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(PublishingLinkLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(YesConfrmationLocator)).click();
        By MessageLocator = By.id("ctl00_PlaceHolderMain_lblOpertioanlResult");
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(MessageLocator));
        By MessageSucess = By.id("ctl00_PlaceHolderMain_oUpdatePanelResult");
        String ActualResult = browserQA.findElement(MessageLocator).getText();
        String ExcpectedResult = "تم نشر النموذج بنجاح.";
        if (ActualResult.equals("لايمكن النشر لعدم توفر الاقسام,البنود الخارجية,البنود الداخلية,المحددات.")) {
            System.out.println("لايمكن النشر لعدم توفر الاقسام.");
        } else if (ActualResult.equals("لا يمكن النشر لعدم توفر البنود الخارجية.")) {
            System.out.println("لا يمكن النشر لعدم توفر البنود الخارجية.");
        } else if (ActualResult.equals("لا يمكن النشر لعدم توفر البنود الداخلية.")) {
            System.out.println("لا يمكن النشر لعدم توفر البنود الداخلية.");
        } else if (ActualResult.equals("تم نشر النموذج بنجاح.")) {
            System.out.println("تم نشر النموذج بنجاح.");
        } else if (ActualResult.contentEquals("حدث خلل")) {
            Assert.fail("حدث خلل اثناء عملية الحفظ");
        } else {
            Assert.fail();
        }

    }

    private By FormDescriptionLocator1 = By.id("ctl00_PlaceHolderMain_gvForms_ctl02_tbFormDesc");
    private By UpdateLinkLocator = By.id("ctl00_PlaceHolderMain_gvForms_ctl02_lbtnUpdate");

    @Test
    public void editForms() throws InterruptedException {

        waitQA.until(ExpectedConditions.visibilityOfElementLocated(FormMainMenuLoactor)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(FormStatusLocator)).click();
        WebElement FormStatusSearchLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(FormStatusSearchLocator));
        FormStatusSearchLocatorWait.sendKeys("غير منشور", Keys.ENTER);

        Thread.sleep(1000);
        WebElement BTNSearchLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(SearchLoactor));
        BTNSearchLocatorWait.click();

        By EditLinkLocator = By.id("ctl00_PlaceHolderMain_gvForms_ctl02_lbtnEdit");

        WebElement EditLinkLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(EditLinkLocator));
        EditLinkLocatorWait.click();

        Random rand = new Random();
        int random_numbers = rand.nextInt(1000);


        WebElement FormDescriptionLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(FormDescriptionLocator1));
        FormDescriptionLocatorWait.clear();
        FormDescriptionLocatorWait.sendKeys("Form" + random_numbers);

        Thread.sleep(1000);
        WebElement UpdateLinkLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(UpdateLinkLocator));
        UpdateLinkLocatorWait.click();
        UpdateLinkLocatorWait.click();

        By UpadteMessageLOcator = By.id("ctl00_PlaceHolderMain_lblOpertioanlResult");

        Thread.sleep(1000);
        WebElement UpadteMessageLOcatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(UpadteMessageLOcator));

        String ActualResult = browserQA.findElement(UpadteMessageLOcator).getText();
        String ExpectedResult = "تمت عملية حفظ البيانات بنجاح.";

        Assert.assertEquals(ActualResult, ExpectedResult, "لم تتم عملية التعديل بنجاح");

    }


    @Test
    public void deleteForms() throws InterruptedException {

        WebElement FormMainMenuLoactorWait2 = waitQA.until(ExpectedConditions.visibilityOfElementLocated(FormMainMenuLoactor));
        FormMainMenuLoactorWait2.click();

        SafetyForms AddNewForm = new SafetyForms();
        AddNewForm.addSafetyForms();

        By FromDescrptionLocator = By.id("select2-ctl00_PlaceHolderMain_ddlFormName-container");
        By FromDescrptionSearchLocator = By.xpath("/html/body/span/span/span[1]/input");

        Thread.sleep(1000);

        WebElement FormMainMenuLoactorWait25 = waitQA.until(ExpectedConditions.visibilityOfElementLocated(FormMainMenuLoactor));
        FormMainMenuLoactorWait25.click();

        WebElement FromDescrptionLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(FromDescrptionLocator));
        FromDescrptionLocatorWait.click();

        WebElement FromDescrptionSearchLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(FromDescrptionSearchLocator));
        FromDescrptionSearchLocatorWait.sendKeys(FormSDescrption, Keys.ENTER);
        Thread.sleep(1000);

        WebElement SerachButtonLocatorWait2 = waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachButtonLocator));
        SerachButtonLocatorWait2.click();

        By DeleteLinkLocator = By.id("ctl00_PlaceHolderMain_gvForms_ctl02_lbtnDelete");

        WebElement DeleteLinkLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(DeleteLinkLocator));
        DeleteLinkLocatorWait.click();

        By YesButtonLocator = By.id("ctl00_ibtnYes");

        WebElement YesButtonLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(YesButtonLocator));
        YesButtonLocatorWait.click();

        By MessageResult = By.id("ctl00_PlaceHolderMain_lblOpertioanlResult");
        WebElement MessageResultWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(MessageResult));

        String ActualResult = browserQA.findElement(MessageResult).getText();
        String ExcpectedResultaa = "تم حذف النموذج بنجاح.";

        Assert.assertEquals(ActualResult, ExcpectedResultaa, "لم تتم عملية الحذف بنجاح");


    }

}
