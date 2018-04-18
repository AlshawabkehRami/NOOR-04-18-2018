/*
 * Created By  Rami AlShawabkeh  4/11/18 3:58 PM
 */
package NoorProject.EduWaveSafeAndSecurity.A2SSOfficerInMinstry.Report;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
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
        browserQA.manage().window().maximize();
        browserQA.manage().timeouts().pageLoadTimeout(5 , TimeUnit.SECONDS);
        WebElement SwitchProfileLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(SwitchProfileLocator));
        SwitchProfileLocatorWait.click();
        WebElement UserNameLabelLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(UserNameLabelLocator));
        UserNameLabelLocatorWait.click();
    }

    //التقارير_تقارير المباني والصيانة
    //بيانات المباني
    @Test
    public void buildingInformation() throws InterruptedException {

        WebElement ReportsMainMenuLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportsMainMenuLocator));
        ReportsMainMenuLocatorWait.click();
        WebElement SerachLoactorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachLoactor));
        SerachLoactorWait.click();
        WebElement BuildingAndMaintenanceReportsLabelWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(TheReprtNameLocatorBI));
        BuildingAndMaintenanceReportsLabelWait.click();
        WebElement GenderWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(GenderLocatorBI));
        GenderWait.click();
        WebElement GenderSearchLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(GenderSearchLocatorBI));
        GenderSearchLocatorWait.sendKeys("بنين" , Keys.ENTER);


        for (int i = 0; i < 2; i++) {
            try {
                WebElement ddlDistrictLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDLDistrictLocatorBI));
                ddlDistrictLocatorWait.click();
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }


        WebElement ddlDistrictSearchLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDLDistrictSearchLocatorBI));
        ddlDistrictSearchLocatorWait.sendKeys("الحد الغربي" , Keys.ENTER);
        WebElement btnSearchLocatorElement = browserQA.findElement(BTNSearchLocatorBI);


        for (int i = 0; i < 2; i++) {

            try {
                WebElement btnSearchLocatorElementWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(BTNSearchLocatorBI));
                btnSearchLocatorElementWait.click();
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        By ReportTitleLoactor = By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[5]/div/span/div/table/tbody/tr[4]/td[3]/div/div[1]/div/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/table/tbody/tr[10]/td[2]/table/tbody/tr/td/div");
        WebElement ReportTitleWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportTitleLoactor));
        String TitleForTheReport = browserQA.findElement(ReportTitleLoactor).getText();
        String Title = "بيانات المباني";
        Assert.assertEquals(TitleForTheReport , Title , "التقرير المطلوب غير موجود");
        WebElement BTNBackLoactorBIWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(BTNBackLoactorBI));
        BTNBackLoactorBIWait.click();
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

        WebElement ReportsMainMenuLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportsMainMenuLocator));
        ReportsMainMenuLocatorWait.click();
        WebElement SerachLoactorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachLoactor));
        SerachLoactorWait.click();
        WebElement SchoolReportsWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(TheReportNameLocatorSTC));
        SchoolReportsWait.click();
        WebElement ddlLearningGenderWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ddlLearningGenderLocatorSTC));
        ddlLearningGenderWait.click();
        WebElement ddlLearningGenderSearchLocatorSTCWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ddlLearningGenderSearchLocatorSTC));
        ddlLearningGenderSearchLocatorSTCWait.sendKeys("بنين" , Keys.ENTER);


        for (int i = 0; i < 3; i++) {
            try {
                WebElement ddlDistrictLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ddlDistrictLocatorSTC));
                ddlDistrictLocatorWait.click();
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        WebElement ddlDistrictSearchLocatorSTCWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ddlDistrictSearchLocatorSTC));
        ddlDistrictSearchLocatorSTCWait.sendKeys("الحد الغربي" , Keys.ENTER);
        for (int i = 0; i < 3; i++) {

            try {
                WebElement ddlStudylevelLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ddlStudylevelLocatorSTC));
                ddlStudylevelLocatorWait.click();
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
        WebElement ddlStudylevelSearchLocatorSTCWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ddlStudylevelSearchLocatorSTC));
        ddlStudylevelSearchLocatorSTCWait.sendKeys("الثانوية" , Keys.ENTER);
        for (int i = 0; i < 3; i++) {
            try {
                WebElement ddlSchoolCategorizationLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ddlSchoolCategorizationLocatorSTC));
                ddlSchoolCategorizationLocatorWait.click();
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        WebElement ddlSchoolCategorizationSearchLoactorSTCWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ddlSchoolCategorizationSearchLoactorSTC));
        ddlSchoolCategorizationSearchLoactorSTCWait.sendKeys("حكومي" , Keys.ENTER);
        for (int i = 0; i < 3; i++) {
            try {
                WebElement btnSearchLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(btnSearchLocatorSTC));
                btnSearchLocatorWait.click();
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        WebElement NameOfTheReprtLoactorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(NameOfTheReprtLoactorSTC));
        String NameOfTheReprtTilte = "توزيع الطلاب على الفصول تجميعي";
        String NameOfTheReprtLoactoTitle = browserQA.findElement(NameOfTheReprtLoactorSTC).getText();
        Assert.assertEquals(NameOfTheReprtTilte , NameOfTheReprtLoactoTitle , "التقرير غير صحيح");
        WebElement btnBackLocatorSTCWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(btnBackLocatorSTC));
        btnBackLocatorSTCWait.click();
    }

    private By TheReportNameLocatorDSSOS = By.linkText("بيانات مسؤولي الامن والسلامة في المدارس");
    private By GenderDDlLocatorDSSOS = By.id("select2-ctl00_PlaceHolderMain_ddlLearningGender-container");
    private By GenderDDlSearchLocatorDSSOS = By.xpath("/html/body/span/span/span[1]/input");
    private By btnSearchLocatorDSSOS = By.id("ctl00_PlaceHolderMain_ibtnSearch");

    @Test
    public void dataSecurityAndSafetyOfficialsInSchools() throws InterruptedException {


        WebElement ReportsMainMenuLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportsMainMenuLocator));
        ReportsMainMenuLocatorWait.click();
        WebElement SerachLoactorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachLoactor));
        SerachLoactorWait.click();
        WebElement TheReportLocatoeWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(TheReportNameLocatorDSSOS));
        TheReportLocatoeWait.click();
        WebElement GenderDDlLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(GenderDDlLocatorDSSOS));
        GenderDDlLocatorWait.click();
        WebElement GenderDDlSearchLocatorDSSOSWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(GenderDDlSearchLocatorDSSOS));
        GenderDDlSearchLocatorDSSOSWait.sendKeys("بنين" , Keys.ENTER);
        for (int i = 0; i < 3; i++) {
            try {
                WebElement btnSearchLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(btnSearchLocatorDSSOS));
                btnSearchLocatorWait.click();
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        By NameofTheReportLocator = By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[5]/div/span/div/table/tbody/tr[4]/td[3]/div/div[1]/div/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr[6]/td[3]/table/tbody/tr/td/div");
        WebElement NameofTheReportLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(NameofTheReportLocator));
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

    //
//بيانات المدرسة
    @Test
    public void infoSchoolReport() throws InterruptedException {


        WebElement ReportsMainMenuLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportsMainMenuLocator));
        ReportsMainMenuLocatorWait.click();
        WebElement SerachLoactorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachLoactor));
        SerachLoactorWait.click();
        for (int i = 0; i < 3; i++) {
            try {
                WebElement TheReportNameLoactorISWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(TheReportNameLoactorIS));
                TheReportNameLoactorISWait.click();
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        WebElement drop_down_sex_LocatorISWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(drop_down_sex_LocatorIS));
        drop_down_sex_LocatorISWait.click();
        WebElement txt_male_wait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(txt_male_LocatorIS));
        txt_male_wait.sendKeys("بنين" , Keys.ENTER);
        for (int i = 0; i < 3; i++) {
            try {
                WebElement drop_down_managements_LocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(drop_down_managements_LocatorIS));
                drop_down_managements_LocatorWait.click();
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        WebElement txt_drop_down_managements_LocatorISWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(txt_drop_down_managements_LocatorIS));
        txt_drop_down_managements_LocatorISWait.sendKeys("الحد الغربي" , Keys.ENTER);

        for (int i = 0; i < 3; i++) {
            try {
                WebElement education_office_LocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(education_office_LocatorIS));
                education_office_LocatorWait.click();
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }


        WebElement education_office_Locator_txtISWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(education_office_Locator_txtIS));
        education_office_Locator_txtISWait.sendKeys("مكتب الخالدية" , Keys.ENTER);
        for (int i = 0; i < 3; i++) {
            try {
                WebElement btn_search_LocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(btn_search_LocatorIS));
                btn_search_LocatorWait.click();
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        WebElement Info_Schools_LocatorISWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(Info_Schools_LocatorIS));
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

    //
//بيانات المدرسة مع المراحل التعليمية
    @Test
    public void schoolDataWithEducationalStagesReport() throws InterruptedException {


        for (int i = 0; i < 3; i++) {
            try {
                WebElement ReportsMainMenuLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportsMainMenuLocator));
                ReportsMainMenuLocatorWait.click();
                break;

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        WebElement SerachLoactorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachLoactor));
        SerachLoactorWait.click();


        for (int i = 0; i < 3; i++) {
            try {
                WebElement SchoolInfoWithStudyLevel_LocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(TheReportNameLoactorSDWES));
                SchoolInfoWithStudyLevel_LocatorWait.click();
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }

        WebElement ddlLearningGender_LocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ddlLearningGender_LocatorSDWES));
        ddlLearningGender_LocatorWait.click();
        WebElement search_filed_LocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(search_filed_LocatorSDWES));
        search_filed_LocatorWait.sendKeys("بنين" , Keys.ENTER);

        for (int i = 0; i < 3; i++) {
            try {
                WebElement ddlDistrict_LocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ddlDistrict_LocatorSDWES));
                ddlDistrict_LocatorWait.click();
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        WebElement search_field_2_LocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(search_field_2_LocatorSDWES));
        search_field_2_LocatorWait.sendKeys("الحد الغربي" , Keys.ENTER);

        for (int i = 0; i < 3; i++) {
            try {
                WebElement office_education_LocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(office_education_LocatorSDWES));
                office_education_LocatorWait.click();
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        WebElement search_field_3_LocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(search_field_3_LocatorSDWES));
        search_field_3_LocatorWait.sendKeys("الخالدية" , Keys.ENTER);

        for (int i = 0; i < 3; i++) {
            try {
                WebElement btn_search_LocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(btn_search_LocatorSDWES));
                btn_search_LocatorWait.click();
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
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


        WebElement ReportsMainMenuLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportsMainMenuLocator));
        ReportsMainMenuLocatorWait.click();

        WebElement SerachLoactorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachLoactor));
        SerachLoactorWait.click();
        WebElement SecurityAndSafety_InputRatioReportLoactorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(TheReportNameLocatorIR));
        SecurityAndSafety_InputRatioReportLoactorWait.click();
        WebElement GenderLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(GenderLocatorIR));
        GenderLocatorWait.click();
        WebElement GenderSearchLoactorIRWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(GenderSearchLoactorIR));
        GenderSearchLoactorIRWait.sendKeys("بنين" , Keys.ENTER);

        WebElement ddlFormNameLoactorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ddlFormNameLoactorIR));
        ddlFormNameLoactorWait.click();

        WebElement ddlFormNameSearchLoactorIRWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ddlFormNameSearchLoactorIR));
        ddlFormNameSearchLoactorIRWait.sendKeys("Selenium Form Dont Delete" , Keys.ENTER);
        WebElement btnSearchLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(btnSearchLocatorIR));
        btnSearchLocatorWait.click();
        By ReportInsideLabelLocator = By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div/div[7]/div/span/div/table/tbody/tr[4]/td[3]/div/div[1]/div/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[5]/td[3]/table/tbody/tr/td/div/div");
        WebElement ReportInsideLabelLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportInsideLabelLocator));
        String ddd = browserQA.findElement(ReportInsideLabelLocator).getText();
        String ggg = "الأمن والسلامة-نسب الإدخال على مستوى الوزارة";
        Assert.assertEquals(ddd , ggg , "التقرير غير موجود");
        WebElement btnBackLocatorIRWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(btnBackLocatorIR));
        btnBackLocatorIRWait.click();

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

        WebElement ReportsMainMenuLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportsMainMenuLocator));
        ReportsMainMenuLocatorWait.click();
        WebElement SerachLoactorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachLoactor));
        SerachLoactorWait.click();
        WebElement SecurityAndSafety_AssessmentRateLoactorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(TheReportNameLocatorAR));
        SecurityAndSafety_AssessmentRateLoactorWait.click();
        WebElement GenderLoactorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(GenderLoactorAR));
        GenderLoactorWait.click();
        WebElement GenderSearchLoactorARWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(GenderSearchLoactorAR));
        GenderSearchLoactorARWait.sendKeys("بنين" , Keys.ENTER);

        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(FormNameLoactorAR)).click();
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        WebElement FormNameSearchLoactorARWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(FormNameSearchLoactorAR));
        FormNameSearchLoactorARWait.sendKeys("Selenium Form Dont Delete" , Keys.ENTER);

        WebElement ibtnSearchLoactorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ibtnSearchLoactorAR));
        ibtnSearchLoactorWait.click();

        WebElement ReportInsideNameLoactorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportInsideNameLoactorAR));
        String ReportInsideName = browserQA.findElement(ReportInsideNameLoactorAR).getText();
        String ReportInsideNameString = "الأمن والسلامة-نسب التقييم على مستوى الوزارة";
        Assert.assertEquals(ReportInsideName , ReportInsideNameString , "لتقرير المطلوب غير متوفر حاليا");
        WebElement ibtnBackLoactorARWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ibtnBackLoactorAR));
        ibtnBackLoactorARWait.click();

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


        WebElement ReportsMainMenuLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportsMainMenuLocator));
        ReportsMainMenuLocatorWait.click();

        WebElement SerachLoactorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachLoactor));
        SerachLoactorWait.click();

        for (int i = 0; i < 3; i++) {
            try {
                WebElement NumberOfStudendLocatorwait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(TheReportNameLocatorSWO));
                NumberOfStudendLocatorwait.click();
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        waitQA.until(ExpectedConditions.visibilityOfElementLocated(GenderLocatorSWO)).click();
        WebElement FemalelocatorSWOWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(FemalelocatorSWO));
        FemalelocatorSWOWait.sendKeys("بنين" , Keys.ENTER);

        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ddlDistrictLocatorSWO)).click();


        WebElement ddlDistrictSearchLocatorSWOWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ddlDistrictSearchLocatorSWO));
        ddlDistrictSearchLocatorSWOWait.sendKeys("ادارة تعليم الحد الغربي(بنين)" , Keys.ENTER);

        WebElement ddlSupervisionCenteLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ddlSupervisionCenteLocatorSWO));
        ddlSupervisionCenteLocatorWait.click();

        WebElement ddlSupervisionCenteSearchLocatorSWOWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ddlSupervisionCenteSearchLocatorSWO));
        ddlSupervisionCenteSearchLocatorSWOWait.sendKeys("مكتب الخالدية الشمالية" , Keys.ENTER);
        WebElement ibtnSearchLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ibtnSearchLocatorSWO));
        ibtnSearchLocatorWait.click();
        By ReportTitleInsidLoactor = By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[5]/div/span/div/table/tbody/tr[4]/td[3]/div/div[1]/div/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr[7]/td[3]/table/tbody/tr/td/div/div/span");
        WebElement ReportTitleInsidLoactorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportTitleInsidLoactor));
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
    public void userDataInTheSchools() throws InterruptedException {

        WebElement ReportsMainMenuLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportsMainMenuLocator));
        ReportsMainMenuLocatorWait.click();
        WebElement SerachLoactorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachLoactor));
        SerachLoactorWait.click();
        WebElement reports_LocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(TheReportNameLocatorUDS));
        reports_LocatorWait.click();
        WebElement drop_down_sex_LocatorUDSWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(drop_down_sex_LocatorUDS));
        drop_down_sex_LocatorUDSWait.click();
        WebElement txt_field_1_LocatorUDSWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(txt_field_1_LocatorUDS));
        txt_field_1_LocatorUDSWait.sendKeys("بنين" , Keys.ENTER);
        WebElement drop_down_managementt_LocatorUDSWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(drop_down_managementt_LocatorUDS));
        drop_down_managementt_LocatorUDSWait.click();
        WebElement txt_field_2_LocatorUDSWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(txt_field_2_LocatorUDS));
        txt_field_2_LocatorUDSWait.sendKeys("الحد الغربي" , Keys.ENTER);
        WebElement btn_search_LocatorUDSWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(btn_search_LocatorUDS));
        btn_search_LocatorUDSWait.click();
        WebElement info_schools_LocatorUDSWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(info_schools_LocatorUDS));
        String s = browserQA.findElement(info_schools_LocatorUDS).getText();
        String Info_schools_2 = "بيانات المستخدمين بالمدارس";
        Assert.assertEquals(s , Info_schools_2 , "البيانات غير صحيحة");
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(btn_back_LocatorUDS)).click();

    }

}
