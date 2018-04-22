/*
 * Created By Rami AlShawabkeh  4/5/18 10:18 AM
 */

package NoorProject.EduWaveSafeAndSecurity.A1GeneralDirectorOfSchoolSecurityAndSafety.TheReports;

import NoorProject.EduWaveSafeAndSecurity.A2SSOfficerInMinstry.Report.TheReports;
import org.omg.PortableServer.THREAD_POLICY_ID;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static NoorProject.Other.NoorLogin.browserQA;
import static NoorProject.Other.NoorLogin.waitQA;

public class AllReports {


    private By SwitchProfileLocator = By.id("ctl00_oHeader_divSwitchUser");
    private By UserNameLabelLocator = By.linkText("مدير عام الأمن والسلامة المدرسية");
    private By ReportsMainMenuLocator = By.id("divMenuItem_325");
    private By SearchLinkLocator = By.id("lisearch_list");
    private By DistributeStudentsToClassesReportLocator = By.linkText("توزيع الطلاب على الفصول");
    private By ddlLearningGenderLocatorDSTC = By.id("select2-ctl00_PlaceHolderMain_ddlLearningGender-container");
    private By ddlLearningGenderSearchLocatorDSTC = By.xpath("/html/body/span/span/span[1]/input");
    private By ddlDistrictLocatorDSTC = By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[1]/div/div/div/div[2]/div[2]/div/span[1]/span[1]/span/span[2]");
    private By ddlDistrictSearchLocatorDSTC = By.xpath("/html/body/span/span/span[1]/input");
    private By ddlStudylevelLocatorDSTC = By.id("select2-ctl00_PlaceHolderMain_ddlStudylevel-container");
    private By ddlStudylevelSearchLocatorDSTC = By.xpath("/html/body/span/span/span[1]/input");
    private By ddlSchoolCategorizationLocatorDSTC = By.id("select2-ctl00_PlaceHolderMain_ddlSchoolCategorization-container");
    private By ddlSchoolCategorizationSearchLoactorDSTC = By.xpath("/html/body/span/span/span[1]/input");
    private By btnSearchLocatorDSTC = By.id("ctl00_PlaceHolderMain_ibtnSearch");


    //التقارير_تقارير المدارس
    //توزيع الطلاب على الفصول
    @Test
    public void viewDistributeStudentsToClasses() throws InterruptedException {
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SwitchProfileLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(UserNameLabelLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportsMainMenuLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SearchLinkLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(DistributeStudentsToClassesReportLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ddlLearningGenderLocatorDSTC)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ddlLearningGenderSearchLocatorDSTC)).sendKeys("بنين", Keys.ENTER);

        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(ddlDistrictLocatorDSTC)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(200);
            }
        }
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ddlDistrictSearchLocatorDSTC)).sendKeys("الحد الغربي", Keys.ENTER);

        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(ddlStudylevelLocatorDSTC)).click();
                break;

            } catch (Exception e) {
                Thread.sleep(200);
            }
        }


        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(ddlStudylevelSearchLocatorDSTC)).sendKeys("الثانوية", Keys.ENTER);
                break;

            } catch (Exception e) {
                Thread.sleep(200);
            }
        }

        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(ddlSchoolCategorizationLocatorDSTC)).click();

                break;
            } catch (Exception e) {
                Thread.sleep(200);
            }
        }
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ddlSchoolCategorizationSearchLoactorDSTC)).sendKeys("حكومي", Keys.ENTER);

        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(btnSearchLocatorDSTC)).click();

                break;
            } catch (Exception e) {
                Thread.sleep(200);
            }
        }
        By ReportTitleLocator = By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[5]/div/span/div/table/tbody/tr[4]/td[3]/div/div[1]/div/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[3]/table/tbody/tr/td/table/tbody/tr[11]/td[3]/table/tbody/tr/td/div");
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportTitleLocator));
        String ActualResult = browserQA.findElement(ReportTitleLocator).getText();
        String ExpectedResult = "توزيع الطلاب على الفصول تجميعي";

        Assert.assertEquals(ActualResult, ExpectedResult, "التقرير المطلوب غير متوفر");
    }

    private By BuildingInformationReportLocator = By.linkText("بيانات المباني");
    private By GenderLocatorBI = By.id("select2-ctl00_PlaceHolderMain_ddlLearningGender-container");
    private By GenderSearchLocatorBI = By.xpath("/html/body/span/span/span[1]/input");
    private By DDLDistrictLocatorBI = By.id("select2-ctl00_PlaceHolderMain_ddlDistrict-container");
    private By DDLDistrictSearchLocatorBI = By.xpath("/html/body/span/span/span[1]/input");
    private By BTNSearchLocatorBI = By.id("ctl00_PlaceHolderMain_ibtnSearch");

    //التقارير_تقارير المباني والصيانة
    //بيانات المباني
    @Test
    public void buildingInformation() throws InterruptedException {
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportsMainMenuLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SearchLinkLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(BuildingInformationReportLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(GenderLocatorBI)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(GenderSearchLocatorBI)).sendKeys("بنين", Keys.ENTER);


        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDLDistrictLocatorBI)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(200);
            }
        }
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDLDistrictSearchLocatorBI)).sendKeys("الحد الغربي", Keys.ENTER);

        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(BTNSearchLocatorBI)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(200);
            }
        }
        By ReportTitleLoactor = By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[5]/div/span/div/table/tbody/tr[4]/td[3]/div/div[1]/div/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/table/tbody/tr[10]/td[2]/table/tbody/tr/td/div");
        Thread.sleep(200);
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportTitleLoactor));
        String ActualResult = browserQA.findElement(ReportTitleLoactor).getText();
        String ExpectedResult = "بيانات المباني";
        Assert.assertEquals(ActualResult, ExpectedResult, "التقرير المطلوب غير متوفر");

    }

    private By InputRatioReportLocator = By.linkText("الأمن والسلامة - نسبة الإدخال");
    private By GenderLocatorIR = By.id("select2-ctl00_PlaceHolderMain_ddlLearningGender-container");
    private By GenderSearchLoactorIR = By.xpath("/html/body/span/span/span[1]/input");
    private By DDLFormNameLoactorIR = By.id("select2-ctl00_PlaceHolderMain_ddlFormName-container");
    private By DDLFormNameSearchLoactorIR = By.xpath("/html/body/span/span/span[1]/input");
    private By BTNSearchLocatorIR = By.id("ctl00_PlaceHolderMain_ibtnSearch");

    //    //التقارير_تقارير الامن والسلامة المدرسية
    //الأمن والسلامة-نسب الإدخال على مستوى الوزارة
    @Test
    public void inputRatio() throws InterruptedException {
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportsMainMenuLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SearchLinkLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(InputRatioReportLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(GenderLocatorIR)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(GenderSearchLoactorIR)).sendKeys("بنين", Keys.ENTER);

        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDLFormNameLoactorIR)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(100);
            }
        }
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDLFormNameSearchLoactorIR)).sendKeys("Selenium Form Dont Delete", Keys.ENTER);
        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(BTNSearchLocatorIR)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(200);
            }
        }
        By ReportInsideLabelLocator = By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div/div[7]/div/span/div/table/tbody/tr[4]/td[3]/div/div[1]/div/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[5]/td[3]/table/tbody/tr/td/div/div");
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportInsideLabelLocator));
        String ActualResult = browserQA.findElement(ReportInsideLabelLocator).getText();
        String ExpectedResult = "الأمن والسلامة-نسب الإدخال على مستوى الوزارة";
        Assert.assertEquals(ActualResult, ExpectedResult, "التقرير المطلوب غير متوفر");


    }

    private By AssessmentRateReportLocator = By.linkText("الأمن والسلامة - نسبة التقييم");
    private By GenderLoactorAR = By.id("select2-ctl00_PlaceHolderMain_ddlLearningGender-container");
    private By GenderSearchLoactorAR = By.xpath("/html/body/span/span/span[1]/input");
    private By FormNameLoactorAR = By.id("select2-ctl00_PlaceHolderMain_ddlFormName-container");
    private By FormNameSearchLoactorAR = By.xpath("/html/body/span/span/span[1]/input");
    private By BTNSearchLoactorAR = By.id("ctl00_PlaceHolderMain_ibtnSearch");
    private By ReportInsideNameLoactorAR = By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div/div[7]/div/span/div/table/tbody/tr[4]/td[3]/div/div[1]/div/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/table/tbody/tr[6]/td[3]/table/tbody/tr/td/div/div/span");

    //التقارير_تقارير الامن والسلامة المدرسية
    //الأمن والسلامة-نسب التقييم على مستوى الوزارة
    @Test
    public void assessmentRate() throws InterruptedException {


        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportsMainMenuLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SearchLinkLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(AssessmentRateReportLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(GenderLoactorAR)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(GenderSearchLoactorAR)).sendKeys("بنين", Keys.ENTER);
        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(FormNameLoactorAR)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(200);
            }
        }
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(FormNameSearchLoactorAR)).sendKeys("Selenium Form Dont Delete", Keys.ENTER);
        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(BTNSearchLoactorAR)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(200);
            }
        }
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportInsideNameLoactorAR));
        String ActualResult = browserQA.findElement(ReportInsideNameLoactorAR).getText();
        String ExpectedResult = "الأمن والسلامة-نسب التقييم على مستوى الوزارة";
        Assert.assertEquals(ActualResult, ExpectedResult, "التقرير المطلوب غير متوفر");
    }

    private By SchoolInfoReportLocator = By.linkText("بيانات المدرسة");
    private By DDLGenderLocatorSR = By.id("select2-ctl00_PlaceHolderMain_ddlLearningGender-container");
    private By DDLGenderSearchLocatorSR = By.xpath("/html/body/span/span/span[1]/input");
    private By DDLDistrictLocatorSR = By.id("select2-ctl00_PlaceHolderMain_ddlDistrict-container");
    private By DDLDistrictSearchLocatorSR = By.xpath("/html/body/span/span/span[1]/input");
    private By DDLOfficeLocatorSR = By.id("select2-ctl00_PlaceHolderMain_ddlSupervisionCenter-container");
    private By DDLOfficeSearchLocatorSR = By.xpath("/html/body/span/span/span[1]/input");
    private By BTNSearchLocator = By.id("ctl00_PlaceHolderMain_ibtnSearch");
    private By Info_Schools_Locator = By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[4]/div/span/div/table/tbody/tr[5]/td[3]/div/div[1]/div/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr[9]/td[3]/table/tbody/tr/td/div/div/span");

    //
//بيانات المدرسة
    @Test
    public void infoSchool() throws InterruptedException {


        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportsMainMenuLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SearchLinkLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SchoolInfoReportLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDLGenderLocatorSR)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDLGenderSearchLocatorSR)).sendKeys("بنين", Keys.ENTER);

        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDLDistrictLocatorSR)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(200);
            }
        }

        waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDLDistrictSearchLocatorSR)).sendKeys("الحد الغربي", Keys.ENTER);
        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDLOfficeLocatorSR)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(200);
            }
        }
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDLOfficeSearchLocatorSR)).sendKeys("مكتب الخالدية", Keys.ENTER);
        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(BTNSearchLocator)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(200);
            }
        }
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(Info_Schools_Locator));
        String ActualResult = browserQA.findElement(Info_Schools_Locator).getText();
        String ExpectedResult = "بيانات المدرسة";
        Assert.assertEquals(ActualResult, ExpectedResult, "التقرير المطلوب غير متوفر");


    }

    private By SchoolDataWithEducationalStagesLocator = By.linkText("بيانات المدرسة مع المراحل التعليمية");
    private By DDLGenderLocatorSDWES = By.id("select2-ctl00_PlaceHolderMain_ddlLearningGender-container");
    private By GenderSearchLocatorSDWES = By.xpath("/html/body/span/span/span[1]/input");
    private By DDLDistrictLocatorSDWES = By.id("select2-ctl00_PlaceHolderMain_ddlDistrict-container");
    private By DistrictSearchLocatorSDWES = By.xpath("/html/body/span/span/span[1]/input");
    private By OfficeLocatorSDWES = By.id("select2-ctl00_PlaceHolderMain_ddlSupervisionCenter-container");
    private By OfficeSearchLocatorSDWES = By.xpath("/html/body/span/span/span[1]/input");
    private By BTNSearchLocatorSDWES = By.id("ctl00_PlaceHolderMain_ibtnSearch");

    //
//بيانات المدرسة مع المراحل التعليمية
    @Test
    public void schoolDataWithEducationalStages() throws InterruptedException {


        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportsMainMenuLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SearchLinkLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SchoolDataWithEducationalStagesLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDLGenderLocatorSDWES)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(GenderSearchLocatorSDWES)).sendKeys("بنين", Keys.ENTER);

        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDLDistrictLocatorSDWES)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(200);
            }
        }

        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(DistrictSearchLocatorSDWES)).sendKeys("الحد الغربي", Keys.ENTER);
                break;
            } catch (Exception e) {
                Thread.sleep(100);
            }
        }
        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(OfficeLocatorSDWES)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(200);
            }

        }
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(OfficeSearchLocatorSDWES)).sendKeys("الخالدية", Keys.ENTER);

        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(BTNSearchLocatorSDWES)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(200);
            }
        }


    }


    private By UserDataInTheSchoolsLocator = By.linkText("بيانات المستخدمين بالمدارس");
    private By DDLGenderLocatorUDIS = By.id("select2-ctl00_PlaceHolderMain_ddlGender-container");
    private By DDLGenderSearchLocatorUDIS = By.xpath("/html/body/span/span/span[1]/input");
    private By DDLDistrictLocatorUDIS = By.id("select2-ctl00_PlaceHolderMain_ddlDistrict-container");
    private By DDLDistrictSearchLocatorUDIS = By.xpath("/html/body/span/span/span[1]/input");
    private By BTNSearchLocatorUDIS = By.xpath("//*[@id=\"ctl00_PlaceHolderMain_ibtnSearch\"]");
    private By info_schools_LocatorUDIS = By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[5]/span/div/table/tbody/tr[4]/td[3]/div/div[1]/div/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr[6]/td[3]/table/tbody/tr/td/div/div[1]/span");

    //
//بيانات المستخدمين بالمدارس
    @Test
    public void userDataInTheSchools() throws InterruptedException {
        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportsMainMenuLocator)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(100);
            }
        }
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SearchLinkLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(UserDataInTheSchoolsLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDLGenderLocatorUDIS)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDLGenderSearchLocatorUDIS)).sendKeys("بنين", Keys.ENTER);
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDLDistrictLocatorUDIS)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDLDistrictSearchLocatorUDIS)).sendKeys("الحد الغربي", Keys.ENTER);
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(BTNSearchLocatorUDIS)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(info_schools_LocatorUDIS));
        String ActualResult = browserQA.findElement(info_schools_LocatorUDIS).getText();
        String ExpectedResult = "بيانات المستخدمين بالمدارس";
        Assert.assertEquals(ActualResult, ExpectedResult, "البيانات غير صحيحة");

    }

    private By StudentsWithOwnershipOfTheSchoolBuilding = By.linkText("عدد الطلاب مع ملكية مبنى المدرسة");
    private By GenderLocatorSWOSB = By.id("select2-ctl00_PlaceHolderMain_ddlLearningGender-container");
    private By FemalelocatorSWOSB = By.xpath("/html/body/span/span/span[1]/input");
    private By DDLDistrictLocatorSWOSB = By.id("select2-ctl00_PlaceHolderMain_ddlDistrict-container");
    private By DDLDistrictSearchLocatorSWOSB = By.xpath("/html/body/span/span/span[1]/input");
    private By DDLSupervisionCenteLocatorSWOSB = By.id("select2-ctl00_PlaceHolderMain_ddlSupervisionCenter-container");
    private By DDLSupervisionCenteSearchLocatorSWOSB = By.xpath("/html/body/span/span/span[1]/input");
    private By BTNSearchLocatorSWOSB = By.id("ctl00_PlaceHolderMain_ibtnSearch");


    @Test
    public void studentsWithOwnershipOfTheSchoolBuilding() throws InterruptedException {
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportsMainMenuLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SearchLinkLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(StudentsWithOwnershipOfTheSchoolBuilding)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(GenderLocatorSWOSB)).click();
        browserQA.findElement(FemalelocatorSWOSB).sendKeys("بنات", Keys.ENTER);

        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDLDistrictLocatorSWOSB)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(200);
            }
        }

        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDLDistrictSearchLocatorSWOSB)).sendKeys("عمان", Keys.ENTER);
                break;
            } catch (Exception e) {
                Thread.sleep(100);
            }
        }
        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDLSupervisionCenteLocatorSWOSB)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(200);
            }
        }


        browserQA.findElement(DDLSupervisionCenteSearchLocatorSWOSB).sendKeys("عمان", Keys.ENTER);

        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(BTNSearchLocatorSWOSB)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(100);
            }
        }
        By ReportTitleInsidLoactor = By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[5]/div/span/div/table/tbody/tr[4]/td[3]/div/div[1]/div/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr[7]/td[3]/table/tbody/tr/td/div/div/span");
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportTitleInsidLoactor));
        String ActualResult = browserQA.findElement(ReportTitleInsidLoactor).getText();
        String ExpectedResult = " عدد الطلاب مع ملكية مبنى المدرسة";
        Assert.assertEquals(ActualResult, ExpectedResult, "لايمكن عرض التقرير المطلوب");

    }

}
