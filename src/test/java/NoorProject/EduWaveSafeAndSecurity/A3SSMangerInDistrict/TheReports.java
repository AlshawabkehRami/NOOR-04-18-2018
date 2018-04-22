/*
 * Created By  Rami AlShawabkeh  4/9/18 5:22 PM
 */

/*
 * Created By  Rami AlShawabkeh  4/9/18 4:16 PM
 */

package NoorProject.EduWaveSafeAndSecurity.A3SSMangerInDistrict;

import org.omg.PortableServer.THREAD_POLICY_ID;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static NoorProject.Other.NoorLogin.browserQA;
import static NoorProject.Other.NoorLogin.waitQA;

public class TheReports {
    private By SwitchProfileLocator = By.id("ctl00_oHeader_divSwitchUser");
    private By UserNameLabelLocator = By.partialLinkText("مدير الأمن والسلامة في إدارة التعليم");
    private By ReportsMainMenuLocator = By.id("divMenuItem_304");
    private By SerachLinkReportLocator = By.id("lisearch_list");
    private By SerachTextReportLocator = By.id("myInput");
    private By SearchButtonLOcator = By.id("ctl00_PlaceHolderMain_ibtnSearch");
    private By DDLSearchSendOptionTxtLoactor = By.xpath("/html/body/span/span/span[1]/input");


    @Test
    public void LoginTotheUserAndSwitchDistrict() {
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SwitchProfileLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(UserNameLabelLocator)).click();
    }

    //بيانات المباني
    private By ReportNameLoactorBI = By.linkText("بيانات المباني");

    @Test
    public void buildingInformation() {
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportsMainMenuLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachLinkReportLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachTextReportLocator)).sendKeys("بيانات المباني");
        browserQA.findElement(ReportNameLoactorBI).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SearchButtonLOcator)).click();
        By NameOfTheReportLocator = By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[4]/div/span/div/table/tbody/tr[4]/td[3]/div/div[1]/div/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/table/tbody/tr[10]/td[2]/table/tbody/tr/td/div");
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(NameOfTheReportLocator));
        String NameOfTheReportString = browserQA.findElement(NameOfTheReportLocator).getText();
        String NameOfThePageLString = "بيانات المباني";
        Assert.assertEquals(NameOfTheReportString, NameOfThePageLString, "التقرير المطلوب غير متوفر");
    }

    private By ReportLinkLocatorDSTC = By.linkText("توزيع الطلاب على الفصول");
    private By ddlStudylevelLocatorDSTC = By.id("select2-ctl00_PlaceHolderMain_ddlStudylevel-container");
    private By ddlSchoolCategorizationLocatorDSTC = By.id("select2-ctl00_PlaceHolderMain_ddlSchoolCategorization-container");

    //توزيع الطلاب على الفصول
    @Test
    public void DSTC() throws InterruptedException {

        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportsMainMenuLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachLinkReportLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachTextReportLocator)).sendKeys("توزيع الطلاب على الفصول");
        browserQA.findElement(ReportLinkLocatorDSTC).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ddlStudylevelLocatorDSTC)).click();
        browserQA.findElement(DDLSearchSendOptionTxtLoactor).sendKeys("المرحلة الثانوية", Keys.ENTER);
        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(ddlSchoolCategorizationLocatorDSTC)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(100);
            }
        }
        browserQA.findElement(DDLSearchSendOptionTxtLoactor).sendKeys("حكومي", Keys.ENTER);
        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(SearchButtonLOcator)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(100);
            }
        }
        By ReportTitleLocator = By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[5]/div/span/div/table/tbody/tr[4]/td[3]/div/div[1]/div/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[3]/table/tbody/tr/td/table/tbody/tr[11]/td[3]/table/tbody/tr/td/div");

        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportTitleLocator));
                break;
            } catch (Exception e) {
                Thread.sleep(100);
            }
        }
        String ReportTitleString = browserQA.findElement(ReportTitleLocator).getText();
        String ReportNameString = "توزيع الطلاب على الفصول مكتب";
        Assert.assertEquals(ReportTitleString, ReportNameString, "التقرير المطلوب غير متوفر");
    }

    private By TheReportNameLocatorSC = By.linkText("إحصائي عن تقييم الأمن والسلامة - تجميعي");
    private By drop_down_l_LocatorSC = By.id("select2-ctl00_PlaceHolderMain_ddlSupervisionCenter-container");
    private By drop_down_2_LocatorSC = By.id("select2-ctl00_PlaceHolderMain_ddlFormName-container");

    //إحصائي عن تقييم الأمن والسلامة - تجميعي
    @Test
    public void statisticalAssessmentOfSafetyAndSecurityCompilationReport() throws InterruptedException {
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportsMainMenuLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachLinkReportLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachTextReportLocator)).sendKeys("إحصائي عن تقييم الأمن والسلامة - تجميعي");
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(TheReportNameLocatorSC)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(drop_down_l_LocatorSC)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDLSearchSendOptionTxtLoactor)).sendKeys("مكتب الخالدية الشمالية", Keys.ENTER);

        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(drop_down_2_LocatorSC)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(100);
            }
        }
        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDLSearchSendOptionTxtLoactor)).sendKeys("Selenium Form Dont Delete", Keys.ENTER);
                break;
            } catch (Exception e) {
                Thread.sleep(100);
            }
        }
        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(SearchButtonLOcator)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(100);
            }
        }
        String expected_result = "إحصائي عن تقييم الأمن والسلامة - تجميعي";
        By actual_result = By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[5]/div/span/div/table/tbody/tr[4]/td[3]/div/div[1]/div/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr[9]/td[3]/table/tbody/tr/td");
        WebElement actual_resultt = waitQA.until(ExpectedConditions.visibilityOfElementLocated(actual_result));
        String actual__result = actual_resultt.getText();
        System.out.println(actual_resultt);
        Assert.assertEquals(actual__result, expected_result, "التقرير المطلوب غير متوفر");
    }

    private By TheReportNameLocatorSD = By.linkText("إحصائي عن تقييم الأمن والسلامة - تفصيلي");
    private By SupervisionCenterLocatorSD = By.xpath("//*[@id=\"select2-ctl00_PlaceHolderMain_ddlSupervisionCenter-container\"]");
    private By FormNameLocatorSD = By.id("select2-ctl00_PlaceHolderMain_ddlFormName-container");

    //إحصائي عن تقييم الأمن والسلامة - تفصيلي
    @Test
    public void statisticalAssessmentOfSafetyAndSecurityDetailedReport() throws InterruptedException {
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportsMainMenuLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachLinkReportLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachTextReportLocator)).sendKeys("إحصائي عن تقييم الأمن والسلامة - تفصيلي");
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(TheReportNameLocatorSD)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SupervisionCenterLocatorSD)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDLSearchSendOptionTxtLoactor)).sendKeys("مكتب الخالدية الشمالية", Keys.ENTER);

        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(FormNameLocatorSD)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(100);
            }
        }
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDLSearchSendOptionTxtLoactor)).sendKeys("Selenium Form Dont Delete", Keys.ENTER);
        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(SearchButtonLOcator)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(100);
            }
        }
        String expected_result = "إحصائي عن تقييم الأمن والسلامة - تفصيلي";
        By actual_reuslt = By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[5]/div/span/div/table/tbody/tr[5]/td[3]/div/div[1]/div/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr[8]/td[3]/table/tbody/tr/td/div/div/span");
        WebElement actual__result = waitQA.until(ExpectedConditions.visibilityOfElementLocated(actual_reuslt));
        String actual___reuslt = actual__result.getText();
        Assert.assertEquals(actual___reuslt, expected_result, "التقرير المطلوب غير متوفر");
    }

    private By TheReportNameLocatorNSSB = By.linkText("عدد الطلاب مع ملكية مبنى المدرسة");
    private By Drop_down_list_LocatorNSSB = By.id("select2-ctl00_PlaceHolderMain_ddlSupervisionCenter-container");

    //عدد الطلاب مع ملكية مبنى المدرسة
    @Test
    public void numberOfStudentsWhoOwnTheSchoolBuildingReport() {
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportsMainMenuLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachLinkReportLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachTextReportLocator)).sendKeys("عدد الطلاب مع ملكية مبنى المدرسة");
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(TheReportNameLocatorNSSB)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(Drop_down_list_LocatorNSSB)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDLSearchSendOptionTxtLoactor)).sendKeys("مكتب الخالدية الشمالية", Keys.ENTER);
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SearchButtonLOcator)).click();
        String expected_result = " عدد الطلاب مع ملكية مبنى المدرسة";
        By actual_result = By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[5]/div/span/div/table/tbody/tr[4]/td[3]/div/div[1]/div/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr[7]/td[3]/table/tbody/tr/td/div/div/span");
        WebElement actual__result = waitQA.until(ExpectedConditions.visibilityOfElementLocated(actual_result));
        String actual___result = actual__result.getText();
        Assert.assertEquals(expected_result, actual___result, "التقرير المطلوب غير متوفر");
    }

    private By TheReportNameLocatorAI = By.linkText("المدارس التي قامت بتعبئة الاستمارة ولم يتم اعتمادها من مدير المدرسة");
    private By drop_down_list_LocatorAI = By.id("select2-ctl00_PlaceHolderMain_ddlFormName-container");

    //المدارس التي قامت بتعبئة الاستمارة ولم يتم اعتمادها من قائد المدرسة
    @Test
    public void SchoolsThatHaveCompletedTheFormAndHaveNotBeenApprovedByTheSchoolLeaderReport() throws InterruptedException {
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportsMainMenuLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachLinkReportLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachTextReportLocator)).sendKeys("المدارس التي قامت بتعبئة الاستمارة ولم يتم اعتمادها");
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(TheReportNameLocatorAI)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(drop_down_list_LocatorAI)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDLSearchSendOptionTxtLoactor)).sendKeys("Form12", Keys.ENTER);
        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(SearchButtonLOcator)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(100);
            }
        }
        String expected_result = "   المدارس التي قامت بتعبئة الاستمارة ولم يتم اعتمادها من قائد المدرسة   ";
        By acutal_result = By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[5]/div/span/div/table/tbody/tr[4]/td[3]/div/div[1]/div/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr[5]/td[3]/table/tbody/tr/td/div/div/span");
        WebElement actual__reuslt = waitQA.until(ExpectedConditions.visibilityOfElementLocated(acutal_result));
        String actual___result = actual__reuslt.getText();
        System.out.println(actual___result);
        Assert.assertEquals(actual___result, expected_result, "التقرير المطلوب غير متوفر");
    }

    private By TheReportNameLocatorSHCF = By.linkText("المدارس التي لم تقم بتعبئة الاستمارة");
    private By drop_down_list_LocatorSHCF = By.id("select2-ctl00_PlaceHolderMain_ddlFormName-container");

    //المدارس التي لم تقم بتعبئة الاستمارة
    @Test
    public void schoolsThatHaveNotCompletedTheFormReport() throws InterruptedException {
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportsMainMenuLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachLinkReportLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachTextReportLocator)).sendKeys("المدارس التي لم تقم بتعبئة الاستمارة");
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(TheReportNameLocatorSHCF)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(drop_down_list_LocatorSHCF)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDLSearchSendOptionTxtLoactor)).sendKeys("Selenium Form Dont Delete", Keys.ENTER);
        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(SearchButtonLOcator)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(100);
            }
        }
        String expected_result = "المدارس التي لم تقم بتعبئة الاستمارة";
        By actual_result = By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[5]/div/span/div/table/tbody/tr[4]/td[3]/div/div[1]/div/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr[4]/td[3]/table/tbody/tr/td/div/div/span");
        WebElement actual__result = waitQA.until(ExpectedConditions.visibilityOfElementLocated(actual_result));
        String actual___result = actual__result.getText();
        Assert.assertEquals(actual___result, expected_result, "التقرير المطلوب غير متوفر");
    }

    private By school_data_LocatorSDD = By.linkText("بيانات المدرسة");
    private By drop_down_list_LocatorSDD = By.id("select2-ctl00_PlaceHolderMain_ddlSupervisionCenter-container");

    //بيانات المدرسة
    @Test
    public void schoolDataReport() throws InterruptedException {
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportsMainMenuLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachLinkReportLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachTextReportLocator)).sendKeys("بيانات المدرسة");
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(school_data_LocatorSDD)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(drop_down_list_LocatorSDD)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDLSearchSendOptionTxtLoactor)).sendKeys("مكتب الخالدية الشمالية", Keys.ENTER);
        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(SearchButtonLOcator)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(100);
            }
        }
        String expected_result = "بيانات المدرسة";
        By actual_result = By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[4]/div/span/div/table/tbody/tr[5]/td[3]/div/div[1]/div/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr[9]/td[3]/table/tbody/tr/td/div/div/span");
        WebElement actual_result_wait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(actual_result));
        String actual__result = actual_result_wait.getText();
        Assert.assertEquals(actual__result, expected_result, "التقرير المطلوب غير متوفر");
    }

    private By TheReportNameLocatorSDES = By.linkText("بيانات المدرسة مع المراحل التعليمية");
    private By OfficeNameLOcaterSDES = By.id("select2-ctl00_PlaceHolderMain_ddlSupervisionCenter-container");

    //بيانات المدرسة مع المراحل التعليمية
    @Test
    public void schoolDataWithEducationalStagesReport() throws InterruptedException {
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportsMainMenuLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachLinkReportLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachTextReportLocator)).sendKeys("بيانات المدرسة مع المراحل التعليمية");
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(TheReportNameLocatorSDES)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(OfficeNameLOcaterSDES)).click();
        browserQA.findElement(DDLSearchSendOptionTxtLoactor).sendKeys("مكتب الخالدية الشمالية", Keys.ENTER);
        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(SearchButtonLOcator)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(100);
            }
        }
    }

    private By ReportLinkLocatorDSOIS = By.linkText("بيانات مسؤولي الامن والسلامة في المدارس");

    //بيانات مسؤولي الامن والسلامة في المدارس
    @Test
    public void dataSecurityAndSafetyOfficialsInSchoolsReport() {
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportsMainMenuLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachLinkReportLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachTextReportLocator)).sendKeys("بيانات مسؤولي الامن");
        browserQA.findElement(ReportLinkLocatorDSOIS).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SearchButtonLOcator)).click();
        By ReportTitleLocator = By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[5]/div/span/div/table/tbody/tr[4]/td[3]/div/div[1]/div/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr[6]/td[3]/table/tbody/tr/td/div");
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportTitleLocator));
        String ReportTitle = browserQA.findElement(ReportTitleLocator).getText();
        String ReportTitleName = "بيانات مسؤولي الامن والسلامة في المدارس";
        Assert.assertEquals(ReportTitle, ReportTitleName, "التقرير المطلوب غير متوفر");
    }

    private By ReportLinkLocatorSASAR = By.linkText("الأمن والسلامة - نسبة التقييم");
    private By DDLFormNameLocatorSASAR = By.id("select2-ctl00_PlaceHolderMain_ddlFormName-container");

    //الأمن والسلامة - نسبة التقييم
    @Test
    public void assessmentRate() throws InterruptedException {

        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportsMainMenuLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachLinkReportLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachTextReportLocator)).sendKeys("نسبة التقييم");
        browserQA.findElement(ReportLinkLocatorSASAR).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDLFormNameLocatorSASAR)).click();
        browserQA.findElement(DDLSearchSendOptionTxtLoactor).sendKeys("Selenium Form Dont Delete", Keys.ENTER);

        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(SearchButtonLOcator)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(100);
            }
        }
        By ReportTitleLoactr = By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div/div[7]/div/span/div/table/tbody/tr[4]/td[3]/div/div[1]/div/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/table/tbody/tr[7]/td[3]/table/tbody/tr/td/div/div/span");
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportTitleLoactr));
        String ReportTilte = browserQA.findElement(ReportTitleLoactr).getText();
        String NameOfTheReport = "الأمن والسلامة-نسب التقييم على مستوى الإدارة";
        Assert.assertEquals(ReportTilte, NameOfTheReport, "التقرير المطلوب غير متوفر");
    }

    private By ReportLinkLocatorIRR = By.linkText("الأمن والسلامة - نسبة الإدخال");
    private By DDlFormNameLocatorIRR = By.id("select2-ctl00_PlaceHolderMain_ddlFormName-container");

    //الأمن والسلامة - نسبة الإدخال
    @Test
    public void inputRatio() throws InterruptedException {
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportsMainMenuLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachLinkReportLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachTextReportLocator)).sendKeys("نسبة الإدخال");
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportLinkLocatorIRR)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDlFormNameLocatorIRR)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDLSearchSendOptionTxtLoactor)).sendKeys("Selenium Form Dont Delete", Keys.ENTER);
        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(SearchButtonLOcator)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(100);
            }
        }
        By ReportTitleLoactor = By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div/div[7]/div/span/div/table/tbody/tr[4]/td[3]/div/div[1]/div/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/table/tbody/tr[8]/td[3]/table/tbody/tr/td/div/div/span");
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportTitleLoactor));
        String ReportName = browserQA.findElement(ReportTitleLoactor).getText();
        String NameOfTheReport = "الأمن والسلامة-نسب الإدخال على مستوى الإدارة";
        Assert.assertEquals(ReportName, NameOfTheReport, "التقرير المطلوب غير متوفر");
    }

    private By TheReportNameLocatorUDITS = By.linkText("بيانات المستخدمين بالمدارس");

    //بيانات المستخدمين بالمدارس
    @Test
    public void userDataInSchoolsReport() {
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportsMainMenuLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachLinkReportLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachTextReportLocator)).sendKeys("بيانات المستخدمين بالمدارس");
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(TheReportNameLocatorUDITS)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SearchButtonLOcator)).click();
        String expected_result = "بيانات المستخدمين بالمدارس";
        By actual_result = By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[4]/span/div/table/tbody/tr[4]/td[3]/div/div[1]/div/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr[6]/td[3]/table/tbody/tr/td/div/div[1]/span");
        WebElement actual_result_wait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(actual_result));
        String actual__result = actual_result_wait.getText();
        Assert.assertEquals(actual__result, expected_result, "البيانات غير صحيحة");
    }
}
