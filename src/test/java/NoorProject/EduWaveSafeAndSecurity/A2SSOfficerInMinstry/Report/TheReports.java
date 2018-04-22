/*
 * Created By  Rami AlShawabkeh  4/11/18 3:58 PM
 */
package NoorProject.EduWaveSafeAndSecurity.A2SSOfficerInMinstry.Report;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static NoorProject.Other.NoorLogin.browserQA;
import static NoorProject.Other.NoorLogin.waitQA;

public class TheReports {
    private By SwitchProfileLocator = By.id("ctl00_oHeader_divSwitchUser");
    private By UserNameLabelLocator = By.linkText("موظف الأمن والسلامة المدرسية");
    private By ReportsMainMenuLocator = By.id("divMenuItem_325");
    private By SerachLoactor = By.id("lisearch_list");
    private By TheReprtNameLocatorBI = By.linkText("بيانات المباني");
    private By GenderLocatorBI = By.id("select2-ctl00_PlaceHolderMain_ddlLearningGender-container");
    private By GenderSearchLocatorBI = By.xpath("/html/body/span/span/span[1]/input");
    private By DDLDistrictLocatorBI = By.id("select2-ctl00_PlaceHolderMain_ddlDistrict-container");
    private By DDLDistrictSearchLocatorBI = By.xpath("/html/body/span/span/span[1]/input");
    private By BTNSearchLocatorBI = By.id("ctl00_PlaceHolderMain_ibtnSearch");
    private By BTNBackLoactorBI = By.id("ctl00_PlaceHolderMain_ibtnBack");

    @Test
    public void switchUser() {
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SwitchProfileLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(UserNameLabelLocator)).click();
    }

    //التقارير_تقارير المباني والصيانة
    //بيانات المباني
    @Test
    public void buildingInformation() throws InterruptedException {
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportsMainMenuLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachLoactor)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(TheReprtNameLocatorBI)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(GenderLocatorBI)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(GenderSearchLocatorBI)).sendKeys("بنين" , Keys.ENTER);
        for (int i = 0; i < 2; i++) {
            try {
                WebElement ddlDistrictLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDLDistrictLocatorBI));
                ddlDistrictLocatorWait.click();
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDLDistrictSearchLocatorBI)).sendKeys("الحد الغربي" , Keys.ENTER);
        for (int i = 0; i < 2; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(BTNSearchLocatorBI)).click();

                break;
            } catch (Exception e) {
                Thread.sleep(100);
            }
        }
        By ReportTitleLoactor = By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[5]/div/span/div/table/tbody/tr[4]/td[3]/div/div[1]/div/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/table/tbody/tr[10]/td[2]/table/tbody/tr/td/div");
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportTitleLoactor));
        String TitleForTheReport = browserQA.findElement(ReportTitleLoactor).getText();
        String Title = "بيانات المباني";
        Assert.assertEquals(TitleForTheReport , Title , "التقرير المطلوب غير موجود");
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(BTNBackLoactorBI)).click();
    }

    private By TheReportNameLocatorSTC = By.linkText("توزيع الطلاب على الفصول");
    private By ddlLearningGenderLocatorSTC = By.id("select2-ctl00_PlaceHolderMain_ddlLearningGender-container");
    private By ddlLearningGenderSearchLocatorSTC = By.xpath("/html/body/span/span/span[1]/input");
    private By ddlDistrictLocatorSTC = By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[1]/div/div/div/div[2]/div[2]/div/span[1]/span[1]/span/span[2]");
    private By ddlDistrictSearchLocatorSTC = By.xpath("/html/body/span/span/span[1]/input");
    private By ddlStudylevelLocatorSTC = By.id("select2-ctl00_PlaceHolderMain_ddlStudylevel-container");
    private By ddlStudylevelSearchLocatorSTC = By.xpath("/html/body/span/span/span[1]/input");
    private By ddlSchoolCategorizationLocatorSTC = By.id("select2-ctl00_PlaceHolderMain_ddlSchoolCategorization-container");
    private By ddlSchoolCategorizationSearchLoactorSTC = By.xpath("/html/body/span/span/span[1]/input");
    private By btnSearchLocatorSTC = By.id("ctl00_PlaceHolderMain_ibtnSearch");
    private By NameOfTheReprtLoactorSTC = By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[5]/div/span/div/table/tbody/tr[4]/td[3]/div/div[1]/div/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[3]/table/tbody/tr/td/table/tbody/tr[11]/td[3]/table/tbody/tr/td/div");
    private By btnBackLocatorSTC = By.id("ctl00_PlaceHolderMain_ibtnBack");

    //التقارير_تقارير المدارس
    //توزيع الطلاب على الفصول
    @Test
    public void distributeStudentsToClasses() throws InterruptedException {
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportsMainMenuLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachLoactor)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(TheReportNameLocatorSTC)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ddlLearningGenderLocatorSTC)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ddlLearningGenderSearchLocatorSTC)).sendKeys("بنين" , Keys.ENTER);
        for (int i = 0; i < 3; i++) {
            try {
                WebElement ddlDistrictLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ddlDistrictLocatorSTC));
                ddlDistrictLocatorWait.click();
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ddlDistrictSearchLocatorSTC)).sendKeys("الحد الغربي" , Keys.ENTER);
        for (int i = 0; i < 3; i++) {

            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(ddlStudylevelLocatorSTC)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(100);
            }

        }
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ddlStudylevelSearchLocatorSTC)).sendKeys("الثانوية" , Keys.ENTER);
        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(ddlSchoolCategorizationLocatorSTC)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(100);
            }
        }
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ddlSchoolCategorizationSearchLoactorSTC)).sendKeys("حكومي" , Keys.ENTER);
        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(btnSearchLocatorSTC)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(100);
            }
        }
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(NameOfTheReprtLoactorSTC));
        String NameOfTheReprtTilte = "توزيع الطلاب على الفصول تجميعي";
        String NameOfTheReprtLoactoTitle = browserQA.findElement(NameOfTheReprtLoactorSTC).getText();
        Assert.assertEquals(NameOfTheReprtTilte , NameOfTheReprtLoactoTitle , "التقرير غير صحيح");
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(btnBackLocatorSTC)).click();
    }

    private By TheReportNameLocatorDSSOS = By.linkText("بيانات مسؤولي الامن والسلامة في المدارس");
    private By GenderDDlLocatorDSSOS = By.id("select2-ctl00_PlaceHolderMain_ddlLearningGender-container");
    private By GenderDDlSearchLocatorDSSOS = By.xpath("/html/body/span/span/span[1]/input");
    private By btnSearchLocatorDSSOS = By.id("ctl00_PlaceHolderMain_ibtnSearch");

    @Test
    public void dataSecurityAndSafetyOfficialsInSchools() throws InterruptedException {


        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportsMainMenuLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachLoactor)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(TheReportNameLocatorDSSOS)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(GenderDDlLocatorDSSOS)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(GenderDDlSearchLocatorDSSOS)).sendKeys("بنين" , Keys.ENTER);
        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(btnSearchLocatorDSSOS)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(100);
            }
        }
        By NameofTheReportLocator = By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[5]/div/span/div/table/tbody/tr[4]/td[3]/div/div[1]/div/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr[6]/td[3]/table/tbody/tr/td/div");
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(NameofTheReportLocator));
        String NameofTheReportString = browserQA.findElement(NameofTheReportLocator).getText();
        String ReportLabelString = "بيانات مسؤولي الامن والسلامة في المدارس";
        Assert.assertEquals(NameofTheReportString , ReportLabelString , "التقرير المطلوب غير موجود");
    }

    private By TheReportNameLoactorIS = By.linkText("بيانات المدرسة");
    private By drop_down_sex_LocatorIS = By.id("select2-ctl00_PlaceHolderMain_ddlLearningGender-container");
    private By txt_male_LocatorIS = By.xpath("/html/body/span/span/span[1]/input");
    private By drop_down_managements_LocatorIS = By.id("select2-ctl00_PlaceHolderMain_ddlDistrict-container");
    private By txt_drop_down_managements_LocatorIS = By.xpath("/html/body/span/span/span[1]/input");
    private By education_office_LocatorIS = By.id("select2-ctl00_PlaceHolderMain_ddlSupervisionCenter-container");
    private By education_office_Locator_txtIS = By.xpath("/html/body/span/span/span[1]/input");
    private By btn_search_LocatorIS = By.id("ctl00_PlaceHolderMain_ibtnSearch");
    private By Info_Schools_LocatorIS = By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[4]/div/span/div/table/tbody/tr[5]/td[3]/div/div[1]/div/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr[9]/td[3]/table/tbody/tr/td/div/div/span");
    private By btn_back_LocatorIS = By.id("ctl00_PlaceHolderMain_ibtnBack");

    //بيانات المدرسة
    @Test
    public void infoSchoolReport() throws InterruptedException {

        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportsMainMenuLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachLoactor)).click();
        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(TheReportNameLoactorIS)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(100);
            }
        }
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(drop_down_sex_LocatorIS)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(txt_male_LocatorIS)).sendKeys("بنين" , Keys.ENTER);
        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(drop_down_managements_LocatorIS)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(100);
            }
        }
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(txt_drop_down_managements_LocatorIS)).sendKeys("الحد الغربي" , Keys.ENTER);
        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(education_office_LocatorIS)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(100);
            }
        }
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(education_office_Locator_txtIS)).sendKeys("مكتب الخالدية" , Keys.ENTER);
        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(btn_search_LocatorIS)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(100);
            }
        }
        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(Info_Schools_LocatorIS));
                break;
            } catch (Exception e) {
                Thread.sleep(100);
            }
        }
        String s = browserQA.findElement(Info_Schools_LocatorIS).getText();
        String Info_schools_2 = "بيانات المدرسة";
        Assert.assertEquals(s , Info_schools_2 , "البيانات غير صحيحة");
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(btn_back_LocatorIS)).click();
    }

    private By TheReportNameLoactorSDWES = By.linkText("بيانات المدرسة مع المراحل التعليمية");
    private By ddlLearningGender_LocatorSDWES = By.id("select2-ctl00_PlaceHolderMain_ddlLearningGender-container");
    private By search_filed_LocatorSDWES = By.xpath("/html/body/span/span/span[1]/input");
    private By ddlDistrict_LocatorSDWES = By.id("select2-ctl00_PlaceHolderMain_ddlDistrict-container");
    private By search_field_2_LocatorSDWES = By.xpath("/html/body/span/span/span[1]/input");
    private By office_education_LocatorSDWES = By.id("select2-ctl00_PlaceHolderMain_ddlSupervisionCenter-container");
    private By search_field_3_LocatorSDWES = By.xpath("/html/body/span/span/span[1]/input");
    private By btn_search_LocatorSDWES = By.id("ctl00_PlaceHolderMain_ibtnSearch");

    //بيانات المدرسة مع المراحل التعليمية
    @Test
    public void schoolDataWithEducationalStagesReport() throws InterruptedException {
        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportsMainMenuLocator)).click();
                break;

            } catch (Exception e) {
                Thread.sleep(100);
            }
        }
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachLoactor)).click();
        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(TheReportNameLoactorSDWES)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(100);
            }

        }

        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ddlLearningGender_LocatorSDWES)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(search_filed_LocatorSDWES)).sendKeys("بنين" , Keys.ENTER);
        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(ddlDistrict_LocatorSDWES)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(100);
            }
        }

        waitQA.until(ExpectedConditions.visibilityOfElementLocated(search_field_2_LocatorSDWES)).sendKeys("الحد الغربي" , Keys.ENTER);
        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(office_education_LocatorSDWES)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(100);
            }
        }
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(search_field_3_LocatorSDWES)).sendKeys("الخالدية" , Keys.ENTER);
        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(btn_search_LocatorSDWES)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(100);
            }
        }
    }

    private By TheReportNameLocatorIR = By.linkText("الأمن والسلامة - نسبة الإدخال");
    private By GenderLocatorIR = By.id("select2-ctl00_PlaceHolderMain_ddlLearningGender-container");
    private By GenderSearchLoactorIR = By.xpath("/html/body/span/span/span[1]/input");
    private By ddlFormNameLoactorIR = By.id("select2-ctl00_PlaceHolderMain_ddlFormName-container");
    private By ddlFormNameSearchLoactorIR = By.xpath("/html/body/span/span/span[1]/input");
    private By btnSearchLocatorIR = By.id("ctl00_PlaceHolderMain_ibtnSearch");
    private By btnBackLocatorIR = By.id("ctl00_PlaceHolderMain_ibtnBack");

    //    //التقارير_تقارير الامن والسلامة المدرسية
    //الأمن والسلامة-نسب الإدخال على مستوى الوزارة
    @Test
    public void inputRatio() throws InterruptedException {

        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportsMainMenuLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachLoactor)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(TheReportNameLocatorIR)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(GenderLocatorIR)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(GenderSearchLoactorIR)).sendKeys("بنين" , Keys.ENTER);
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ddlFormNameLoactorIR)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ddlFormNameSearchLoactorIR)).sendKeys("Selenium Form Dont Delete" , Keys.ENTER);
        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(btnSearchLocatorIR)).click();

                break;
            } catch (Exception e) {
                Thread.sleep(100);
            }

        }
        By ReportInsideLabelLocator = By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div/div[7]/div/span/div/table/tbody/tr[4]/td[3]/div/div[1]/div/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[5]/td[3]/table/tbody/tr/td/div/div");
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportInsideLabelLocator));
        String ddd = browserQA.findElement(ReportInsideLabelLocator).getText();
        String ggg = "الأمن والسلامة-نسب الإدخال على مستوى الوزارة";
        Assert.assertEquals(ddd , ggg , "التقرير غير موجود");
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(btnBackLocatorIR)).click();

    }

    private By TheReportNameLocatorAR = By.linkText("الأمن والسلامة - نسبة التقييم");
    private By GenderLoactorAR = By.id("select2-ctl00_PlaceHolderMain_ddlLearningGender-container");
    private By GenderSearchLoactorAR = By.xpath("/html/body/span/span/span[1]/input");
    private By FormNameLoactorAR = By.id("select2-ctl00_PlaceHolderMain_ddlFormName-container");
    private By FormNameSearchLoactorAR = By.xpath("/html/body/span/span/span[1]/input");
    private By ibtnSearchLoactorAR = By.id("ctl00_PlaceHolderMain_ibtnSearch");
    private By ReportInsideNameLoactorAR = By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div/div[7]/div/span/div/table/tbody/tr[4]/td[3]/div/div[1]/div/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/table/tbody/tr[6]/td[3]/table/tbody/tr/td/div/div/span");
    private By ibtnBackLoactorAR = By.id("ctl00_PlaceHolderMain_ibtnBack");

    //التقارير_تقارير الامن والسلامة المدرسية
    //الأمن والسلامة-نسب التقييم على مستوى الوزارة
    @Test
    public void aasessmentRateReport() throws InterruptedException {
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportsMainMenuLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachLoactor)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(TheReportNameLocatorAR)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(GenderLoactorAR)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(GenderSearchLoactorAR)).sendKeys("بنين" , Keys.ENTER);
        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(FormNameLoactorAR)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(100);
            }
        }
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(FormNameSearchLoactorAR)).sendKeys("Selenium Form Dont Delete" , Keys.ENTER);
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ibtnSearchLoactorAR)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportInsideNameLoactorAR));
        String ReportInsideName = browserQA.findElement(ReportInsideNameLoactorAR).getText();
        String ReportInsideNameString = "الأمن والسلامة-نسب التقييم على مستوى الوزارة";
        Assert.assertEquals(ReportInsideName , ReportInsideNameString , "لتقرير المطلوب غير متوفر حاليا");
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ibtnBackLoactorAR)).click();
    }

    private By TheReportNameLocatorSWO = By.linkText("عدد الطلاب مع ملكية مبنى المدرسة");
    private By GenderLocatorSWO = By.id("select2-ctl00_PlaceHolderMain_ddlLearningGender-container");
    private By FemalelocatorSWO = By.xpath("/html/body/span/span/span[1]/input");
    private By ddlDistrictLocatorSWO = By.id("select2-ctl00_PlaceHolderMain_ddlDistrict-container");
    private By ddlDistrictSearchLocatorSWO = By.xpath("/html/body/span/span/span[1]/input");
    private By ddlSupervisionCenteLocatorSWO = By.id("select2-ctl00_PlaceHolderMain_ddlSupervisionCenter-container");
    private By ddlSupervisionCenteSearchLocatorSWO = By.xpath("/html/body/span/span/span[1]/input");
    private By ibtnSearchLocatorSWO = By.id("ctl00_PlaceHolderMain_ibtnSearch");

    /*
        ///عدد الطلاب مع ملكية مبنى المدرسة
    */
    @Test
    public void studentsWithOwnershipOfTheSchoolBuilding() throws InterruptedException {
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportsMainMenuLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachLoactor)).click();
        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(TheReportNameLocatorSWO)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(100);
            }
        }
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(GenderLocatorSWO)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(FemalelocatorSWO)).sendKeys("بنين" , Keys.ENTER);

        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(ddlDistrictLocatorSWO)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(100);
            }

        }
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ddlDistrictSearchLocatorSWO)).sendKeys("ادارة تعليم الحد الغربي(بنين)" , Keys.ENTER);
        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(ddlSupervisionCenteLocatorSWO)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(100);
            }
        }
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ddlSupervisionCenteSearchLocatorSWO)).sendKeys("مكتب الخالدية الشمالية" , Keys.ENTER);
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ibtnSearchLocatorSWO)).click();
        By ReportTitleInsidLoactor = By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[5]/div/span/div/table/tbody/tr[4]/td[3]/div/div[1]/div/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr[7]/td[3]/table/tbody/tr/td/div/div/span");
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportTitleInsidLoactor));
        String ReportTitleInsidLoactorElement = browserQA.findElement(ReportTitleInsidLoactor).getText();
        String ReportTitleInsidString = " عدد الطلاب مع ملكية مبنى المدرسة";
        Assert.assertEquals(ReportTitleInsidLoactorElement , ReportTitleInsidString , "لايمكن عرض التقرير المطلوب");

    }


    private By TheReportNameLocatorUDS = By.linkText("بيانات المستخدمين بالمدارس");
    private By drop_down_sex_LocatorUDS = By.id("select2-ctl00_PlaceHolderMain_ddlGender-container");
    private By txt_field_1_LocatorUDS = By.xpath("/html/body/span/span/span[1]/input");
    private By drop_down_managementt_LocatorUDS = By.id("select2-ctl00_PlaceHolderMain_ddlDistrict-container");
    private By txt_field_2_LocatorUDS = By.xpath("/html/body/span/span/span[1]/input");
    private By btn_search_LocatorUDS = By.id("ctl00_PlaceHolderMain_ibtnSearch");
    private By info_schools_LocatorUDS = By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[5]/span/div/table/tbody/tr[4]/td[3]/div/div[1]/div/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr[6]/td[3]/table/tbody/tr/td/div/div[1]/span");
    private By btn_back_LocatorUDS = By.id("ctl00_PlaceHolderMain_ibtnBack");

    //
//بيانات المستخدمين بالمدارس
    @Test
    public void userDataInTheSchools() {

        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportsMainMenuLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachLoactor)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(TheReportNameLocatorUDS)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(drop_down_sex_LocatorUDS)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(txt_field_1_LocatorUDS)).sendKeys("بنين" , Keys.ENTER);
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(drop_down_managementt_LocatorUDS)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(txt_field_2_LocatorUDS)).sendKeys("الحد الغربي" , Keys.ENTER);
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(btn_search_LocatorUDS)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(info_schools_LocatorUDS));
        String s = browserQA.findElement(info_schools_LocatorUDS).getText();
        String Info_schools_2 = "بيانات المستخدمين بالمدارس";
        Assert.assertEquals(s , Info_schools_2 , "البيانات غير صحيحة");
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(btn_back_LocatorUDS)).click();

    }

}
