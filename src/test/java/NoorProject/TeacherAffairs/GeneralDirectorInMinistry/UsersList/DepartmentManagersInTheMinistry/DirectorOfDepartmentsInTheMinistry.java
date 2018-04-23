/*
 * Created By Rami Alshawabkeh  3/15/18 2:30 PM
 */
package NoorProject.TeacherAffairs.GeneralDirectorInMinistry.UsersList.DepartmentManagersInTheMinistry;

import NoorProject.TeacherAffairs.GeneralDirectorInMinistry.SchoolsAndDepartments.Departments.Department;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

import static NoorProject.Other.NoorLogin.browserQA;
import static NoorProject.Other.NoorLogin.waitQA;

public class DirectorOfDepartmentsInTheMinistry {
    private By UsersMenuLocator = By.id("divMenuItem_4720");
    private By MyInputLocator = By.id("myInput");
    private By UserNameLinkLocator = By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/div/div/div[4]/a");
    private By AddedNewUserLinkLocator = By.id("ctl00_PlaceHolderMain_lbtnAddManagementUser");
    private By UserIdFieldLocator = By.id("ctl00_PlaceHolderMain_tbIdentification");
    private By IbtnCheckIdentificationIDLocator = By.id("ctl00_PlaceHolderMain_ibtnCheckIdentificationID0");
    private By DDlNationalityLocator = By.id("select2-ctl00_PlaceHolderMain_TabContainerMain_tabUserAuthentication_oUserAuthenticationUC_ddlNationality-container");
    private By DDLSearchOption = By.xpath("/html/body/span/span/span[1]/input");
    private By ArabicFirstNameLocator = By.id("ctl00_PlaceHolderMain_TabContainerMain_tabUserAuthentication_oUserAuthenticationUC_tbArabicFirstName");
    private By ArabicSecondNameLocator = By.id("ctl00_PlaceHolderMain_TabContainerMain_tabUserAuthentication_oUserAuthenticationUC_tbArabicSecondName");
    private By ArabicThirdNameLocator = By.id("ctl00_PlaceHolderMain_TabContainerMain_tabUserAuthentication_oUserAuthenticationUC_tbArabicThirdName");
    private By ArabicLastNameLocator = By.id("ctl00_PlaceHolderMain_TabContainerMain_tabUserAuthentication_oUserAuthenticationUC_tbArabicLastName");
    private By EnglishFirstNameLocator = By.id("ctl00_PlaceHolderMain_TabContainerMain_tabUserAuthentication_oUserAuthenticationUC_tbEnglishFirstName");
    private By EnglishSecondNameLocator = By.id("ctl00_PlaceHolderMain_TabContainerMain_tabUserAuthentication_oUserAuthenticationUC_tbEnglishSecondName");
    private By EnglishThirdNameLocator = By.id("ctl00_PlaceHolderMain_TabContainerMain_tabUserAuthentication_oUserAuthenticationUC_tbEnglishThirdName");
    private By EnglishLastNameLocator = By.id("ctl00_PlaceHolderMain_TabContainerMain_tabUserAuthentication_oUserAuthenticationUC_tbEnglishLastName");
    private By DdlGenderLocator = By.id("select2-ctl00_PlaceHolderMain_TabContainerMain_tabUserAuthentication_oUserAuthenticationUC_ddlGender-container");
    private By BirthDateLocator = By.id("ctl00_PlaceHolderMain_TabContainerMain_tabUserAuthentication_oUserAuthenticationUC_clrBirthDate_ibtnOpenCalendar");
    private By BirthDateLocatorDate = By.xpath("/html/body/div/table/tbody/tr[3]/td[3]");
    private By UserAuthenticationUCLocatr = By.id("ctl00_PlaceHolderMain_TabContainerMain_tabUserAuthentication_oUserAuthenticationUC_tbUserName");
    private By UserAuthenticationUC_ibtnGoLocator = By.id("ctl00_PlaceHolderMain_TabContainerMain_tabUserAuthentication_oUserAuthenticationUC_ibtnGo");
    private By UserAuthenticationUClblUserNameVerifyLocator = By.id("ctl00_PlaceHolderMain_TabContainerMain_tabUserAuthentication_oUserAuthenticationUC_lblUserNameVerify");
    private By PasswordLocator = By.id("ctl00_PlaceHolderMain_TabContainerMain_tabUserAuthentication_oUserAuthenticationUC_tbPassword");
    private By ConfirmPasswordLoactor = By.id("ctl00_PlaceHolderMain_TabContainerMain_tabUserAuthentication_oUserAuthenticationUC_tbConfirmPassword");
    private By DDLManagmentRegionLocator = By.id("select2-ctl00_PlaceHolderMain_TabContainerMain_tabUserAuthentication_oUserAuthenticationUC_ddlManagmentRegion-container");
    private By btnSaveLocator = By.id("ctl00_PlaceHolderMain_ibtnSave");


    Random Rand = new Random();
    int RandomNumberG = Rand.nextInt(1000000);

    //أضافة مدير القسم بالوزارة
    @Test
    public void AddDirectorOfDepartmentsInTheMinistry() {
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(UsersMenuLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(MyInputLocator)).sendKeys("مديرو القسم");
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(UserNameLinkLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddedNewUserLinkLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(UserIdFieldLocator)).sendKeys("1" + RandomNumberG);
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(IbtnCheckIdentificationIDLocator)).click();
    }

    public static String UserIdToPassString = null;

    @Test
    public void UserId() throws InterruptedException {
        Thread.sleep(500);
        UserIdToPassString = browserQA.findElement(By.id("ctl00_PlaceHolderMain_TabContainerMain_tabUserAuthentication_oUserAuthenticationUC_lblIdentificationNumber")).getText();
    }

    @Test
    public void AddedPart2() throws InterruptedException {
        browserQA.findElement(ArabicFirstNameLocator).sendKeys("رامي");
        browserQA.findElement(ArabicSecondNameLocator).sendKeys("أحمد");
        browserQA.findElement(ArabicThirdNameLocator).sendKeys("علي");
        browserQA.findElement(ArabicLastNameLocator).sendKeys("الشوابكة");
        browserQA.findElement(EnglishFirstNameLocator).sendKeys("Rami");
        browserQA.findElement(EnglishSecondNameLocator).sendKeys("Ahmad");
        browserQA.findElement(EnglishThirdNameLocator).sendKeys("Ali");
        browserQA.findElement(EnglishLastNameLocator).sendKeys("Alshawabkeh");
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(DdlGenderLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDLSearchOption)).sendKeys("بنين" , Keys.ENTER);
        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(BirthDateLocator)).click();
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(BirthDateLocatorDate)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(200);
            }
        }
        browserQA.findElement(UserAuthenticationUCLocatr).clear();
        browserQA.findElement(UserAuthenticationUCLocatr).sendKeys("Rami" + RandomNumberG);
        browserQA.findElement(UserAuthenticationUC_ibtnGoLocator).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(UserAuthenticationUClblUserNameVerifyLocator));
        String ValidationMeassageUN = browserQA.findElement(UserAuthenticationUClblUserNameVerifyLocator).getText();
        String ValidationMeassageUNString = "تم استخدام اسم الدخول من قبل، الرجاء إدخال اسم جديد.";
        Assert.assertNotEquals(ValidationMeassageUN , ValidationMeassageUNString , "الرجاء ادخال اسم مستخدم غير مستخدم من قبل  ");
        browserQA.findElement(PasswordLocator).click();
        browserQA.findElement(PasswordLocator).sendKeys("1234");
        browserQA.findElement(ConfirmPasswordLoactor).clear();
        browserQA.findElement(ConfirmPasswordLoactor).sendKeys("1234");
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDLManagmentRegionLocator)).click();
        browserQA.findElement(btnSaveLocator).click();
        By DDlJobTitleLocator = By.id("select2-ctl00_PlaceHolderMain_TabContainerMain_tabUserProfile_ddlJobTitle-container");
        By DDLCurrentWorkLocator = By.id("select2-ctl00_PlaceHolderMain_TabContainerMain_tabUserProfile_ddlCurrentWork-container");
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDlJobTitleLocator)).click();
        browserQA.findElement(DDLSearchOption).sendKeys("مدير القسم في الوزارة" , Keys.ENTER);
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDLCurrentWorkLocator)).click();
        browserQA.findElement(DDLSearchOption).sendKeys("مدير القسم في الوزارة" , Keys.ENTER);
        By CBTeacherDepartmentLocator = By.id("ctl00_PlaceHolderMain_TabContainerMain_tabUserProfile_cblTeacherDepartment_0");
        if (browserQA.findElements(CBTeacherDepartmentLocator).size() > 0) {
            browserQA.findElement(CBTeacherDepartmentLocator).click();
            browserQA.findElement(btnSaveLocator).click();
        } else {


            Department AddDept = new Department();
            AddDept.AddModeratorUser();
        }
        browserQA.close();
    }

}

