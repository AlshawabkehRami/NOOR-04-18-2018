/*
 * Created By  Rami AlShawabkeh  4/10/18 11:25 AM
 */

package NoorProject.EduWaveSafeAndSecurity.A4SSStaffInDistrict;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static NoorProject.Other.NoorLogin.browserQA;
import static NoorProject.Other.NoorLogin.waitQA;

public class ReportsMenu {


    private By SwitchProfileLocator = By.id("ctl00_oHeader_divSwitchUser");
    private By UserNameLabelLocator = By.partialLinkText("موظف بإدارة الأمن والسلامة بإدارة التعليم");
    private By ReportsMainMenuLocator = By.id("divMenuItem_304");
    private By SerachLinkReportLocator = By.id("lisearch_list");
    private By SerachTextReportLocator = By.id("myInput");
    private By SearchButtonLocator = By.id("ctl00_PlaceHolderMain_ibtnSearch");
    private By SearchDDLOptionLocator = By.xpath("/html/body/span/span/span[1]/input");


    @Test

    public void SwitchProfile() {

        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SwitchProfileLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(UserNameLabelLocator)).click();
    }

    private By ReportLinkLocator = By.linkText("بيانات المباني");

    //بيانات المباني
    @Test
    public void buildingInformation() {

        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportsMainMenuLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachLinkReportLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachTextReportLocator)).sendKeys("بيانات المباني");
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportLinkLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SearchButtonLocator)).click();
        By NameOfTheReportLocator = By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[4]/div/span/div/table/tbody/tr[4]/td[3]/div/div[1]/div/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/table/tbody/tr[10]/td[2]/table/tbody/tr/td/div");
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(NameOfTheReportLocator));
        String NameOfTheReportString = browserQA.findElement(NameOfTheReportLocator).getText();
        String NameOfThePageLString = "بيانات المباني";
        Assert.assertEquals(NameOfTheReportString , NameOfThePageLString , "التقرير المطلوب غير متوفر");
    }


    private By ReportNameLocator1 = By.linkText("بيانات المدرسة مع المراحل التعليمية");
    private By OfficeNameLOcater1 = By.id("select2-ctl00_PlaceHolderMain_ddlSupervisionCenter-container");
    private By BackBTN1 = By.id("ctl00_PlaceHolderMain_ibtnBack");


    //
//بيانات المدرسة مع المراحل التعليمية
    @Test
    public void schoolDataWithEducationalStages() throws InterruptedException {

        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportsMainMenuLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachLinkReportLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachTextReportLocator)).sendKeys("بيانات المدرسة مع المراحل التعليمية");
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportNameLocator1)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(OfficeNameLOcater1)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SearchDDLOptionLocator)).sendKeys("مكتب الخالدية الشمالية" , Keys.ENTER);
        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(SearchButtonLocator)).click();

            } catch (Exception e) {
                Thread.sleep(200);
            }
        }

        waitQA.until(ExpectedConditions.visibilityOfElementLocated(BackBTN1)).click();
        Assert.assertEquals(browserQA.findElement(ReportNameLocator1).getText() , "بيانات المدرسة مع المراحل التعليمية" , "تم الروجع الى صفحة خاطئة");

    }

    private By TheReportNameLoactor2 = By.linkText("المدارس التي قامت بتعبئة الاستمارة ولم يتم اعتمادها من مدير المدرسة");
    private By drop_down_list_Locator2 = By.id("select2-ctl00_PlaceHolderMain_ddlFormName-container");

    //
//المدارس التي قامت بتعبئة الاستمارة ولم يتم اعتمادها من قائد المدرسة
    @Test
    public void schoolsThatHaveCompletedTheFormAndHaveNotBeenApprovedByTheSchoolLeader() throws InterruptedException {

        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportsMainMenuLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachLinkReportLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachTextReportLocator)).sendKeys("المدارس التي قامت بتعبئة الاستمارة ولم يتم اعتمادها");
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(TheReportNameLoactor2)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(drop_down_list_Locator2)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SearchDDLOptionLocator)).sendKeys("Form12" , Keys.ENTER);
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SearchButtonLocator)).click();
        String expected_result = "   المدارس التي قامت بتعبئة الاستمارة ولم يتم اعتمادها من قائد المدرسة   ";
        By acutal_result = By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[5]/div/span/div/table/tbody/tr[4]/td[3]/div/div[1]/div/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr[5]/td[3]/table/tbody/tr/td/div/div/span");
        WebElement actual__reuslt = waitQA.until(ExpectedConditions.visibilityOfElementLocated(acutal_result));
        String actual___result = actual__reuslt.getText();
        System.out.println(actual___result);
        Assert.assertEquals(actual___result , expected_result , "التقرير المطلوب غير متوفر");


    }

    private By TheReportNameLocator3 = By.linkText("المدارس التي لم تقم بتعبئة الاستمارة");
    private By drop_down_list_Locator3 = By.id("select2-ctl00_PlaceHolderMain_ddlFormName-container");

    //
//المدارس التي لم تقم بتعبئة الاستمارة
    @Test
    public void schoolsThatHaveNotCompletedTheForm() throws InterruptedException { //المدارس التي لم تقم بتعبئة الاستمارة
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportsMainMenuLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachLinkReportLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachTextReportLocator)).sendKeys("المدارس التي لم تقم بتعبئة الاستمارة");
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(TheReportNameLocator3)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(drop_down_list_Locator3)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SearchDDLOptionLocator)).sendKeys("Form12" , Keys.ENTER);
        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(SearchButtonLocator)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(200);
            }
        }
        String expected_result = "المدارس التي لم تقم بتعبئة الاستمارة";
        By actual_result = By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[5]/div/span/div/table/tbody/tr[4]/td[3]/div/div[1]/div/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr[4]/td[3]/table/tbody/tr/td/div/div/span");
        WebElement actual__result = waitQA.until(ExpectedConditions.visibilityOfElementLocated(actual_result));
        String actual___result = actual__result.getText();
        Assert.assertEquals(actual___result , expected_result , "التقرير المطلوب غير متوفر");

    }

    private By ReportLinkLocator4 = By.linkText("معلومات بطاقات المدارس");
    private By ddlSchoolLocator4 = By.id("select2-ctl00_PlaceHolderMain_ddlSchool-container");


    //
//معلومات بطاقات المدارس
    @Test
    public void assessmentRate() throws InterruptedException {


        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportsMainMenuLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachLinkReportLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachTextReportLocator)).sendKeys("معلومات بطاقات");
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportLinkLocator4)).click();
        By ddlSupervisionCenterLocator = By.id("select2-ctl00_PlaceHolderMain_ddlSupervisionCenter-container");
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ddlSupervisionCenterLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SearchDDLOptionLocator)).sendKeys("مكتب الخالدية الشمالية" , Keys.ENTER);
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ddlSchoolLocator4)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SearchDDLOptionLocator)).sendKeys("مدرسة سعيد بن المسيب التانوية" , Keys.ENTER);
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SearchButtonLocator));
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(BackBTN1)).click();

    }


    private By ReportLinkLocator5 = By.linkText("الأمن والسلامة - نسبة التقييم");
    private By DDLFormNameLocator5 = By.id("select2-ctl00_PlaceHolderMain_ddlFormName-container");


    //
//الأمن والسلامة - نسبة التقييم
    @Test
    public void securityAndSafetyAssessmentRateReport() throws InterruptedException {
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportsMainMenuLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachLinkReportLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachTextReportLocator)).sendKeys("نسبة التقييم");
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportLinkLocator5)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDLFormNameLocator5)).click();
        browserQA.findElement(SearchDDLOptionLocator).sendKeys("Selenium Form Dont Delete" , Keys.ENTER);
        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(SearchButtonLocator)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(200);
            }
        }
        By ReportTitleLoactr = By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div/div[7]/div/span/div/table/tbody/tr[4]/td[3]/div/div[1]/div/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/table/tbody/tr[7]/td[3]/table/tbody/tr/td/div/div/span");
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportTitleLoactr));
        String ReportTilte = browserQA.findElement(ReportTitleLoactr).getText();
        String NameOfTheReport = "الأمن والسلامة-نسب التقييم على مستوى الإدارة";
        Assert.assertEquals(ReportTilte , NameOfTheReport , "التقرير المطلوب غير متوفر");
    }

    private By ReportLinkLocator6 = By.linkText("الأمن والسلامة - نسبة الإدخال");
    private By DDlFormNameLocator6 = By.id("select2-ctl00_PlaceHolderMain_ddlFormName-container");


    //
//الأمن والسلامة - نسبة الإدخال
    @Test
    public void inputRatio() throws InterruptedException {


        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportsMainMenuLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachLinkReportLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachTextReportLocator)).sendKeys("نسبة الإدخال");
        browserQA.findElement(ReportLinkLocator6).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDlFormNameLocator6)).click();
        browserQA.findElement(SearchDDLOptionLocator).sendKeys("Form12" , Keys.ENTER);

        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(SearchButtonLocator)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(200);
            }
        }

        By ReportTitleLoactor = By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div/div[7]/div/span/div/table/tbody/tr[4]/td[3]/div/div[1]/div/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/table/tbody/tr[8]/td[3]/table/tbody/tr/td/div/div/span");
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportTitleLoactor));
        String ReportName = browserQA.findElement(ReportTitleLoactor).getText();
        String NameOfTheReport = "الأمن والسلامة-نسب الإدخال على مستوى الإدارة";
        Assert.assertEquals(ReportName , NameOfTheReport , "التقرير المطلوب غير متوفر");

    }


    //
//بيانات المستخدمين بالمدارس
    private By TheReportNameLocator7 = By.linkText("بيانات المستخدمين بالمدارس");

    @Test
    public void UserDataInSchools() {

        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportsMainMenuLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachLinkReportLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachTextReportLocator)).sendKeys("بيانات المستخدمين بالمدارس");
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(TheReportNameLocator7)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SearchButtonLocator)).click();
        By ReportTitle = By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[4]/span/div/table/tbody/tr[4]/td[3]/div/div[1]/div/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr[6]/td[3]/table/tbody/tr/td/div/div[1]/span");
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportTitle));
        String ActualResult = browserQA.findElement(ReportTitle).getText();
        String ExcpectedResult = "بيانات المستخدمين بالمدارس";

        Assert.assertEquals(ActualResult , ExcpectedResult , "التقرير المطلوب غير متوفر");

    }

    private By TheReportNameLocator9 = By.linkText("عدد الطلاب مع ملكية مبنى المدرسة");
    private By Drop_down_list_Locator9 = By.id("select2-ctl00_PlaceHolderMain_ddlSupervisionCenter-container");

    //
//عدد الطلاب مع ملكية مبنى المدرسة
    @Test
    public void numberOfStudentsWhoOwnTheSchoolBuilding() {
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportsMainMenuLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachLinkReportLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachTextReportLocator)).sendKeys("عدد الطلاب مع ملكية مبنى المدرسة");
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(TheReportNameLocator9)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(Drop_down_list_Locator9)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SearchDDLOptionLocator)).sendKeys("مكتب الخالدية الشمالية" , Keys.ENTER);
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SearchButtonLocator)).click();


        By ReportTitle = By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[5]/div/span/div/table/tbody/tr[4]/td[3]/div/div[1]/div/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr[7]/td[3]/table/tbody/tr/td/div/div/span");
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportTitle));
        String ActualResult = browserQA.findElement(ReportTitle).getText();
        String ExcpectedResult = " عدد الطلاب مع ملكية مبنى المدرسة";

        Assert.assertEquals(ActualResult , ExcpectedResult , "التقرير المطلوب غير متوفر");
    }
}
