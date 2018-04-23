/*
 * Created By Rami AlShawabkeh  4/5/18 3:51 PM
 */

package NoorProject.EduWaveSafeAndSecurity.A1GeneralDirectorOfSchoolSecurityAndSafety.Users;

import NoorProject.Other.NoorLogin;
import NoorProject.TeacherAffairs.GeneralDirectorInMinistry.UsersList.DepartmentManagersInTheMinistry.DirectorOfDepartmentsInTheMinistry;
import org.omg.PortableServer.THREAD_POLICY_ID;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.Random;

import static NoorProject.Other.NoorLogin.browserQA;
import static NoorProject.Other.NoorLogin.waitQA;
import static NoorProject.TeacherAffairs.GeneralDirectorInMinistry.UsersList.DepartmentManagersInTheMinistry.DirectorOfDepartmentsInTheMinistry.UserIdToPassString;

public class TheUsers {


    private By SwitchProfileLocator = By.id("ctl00_oHeader_divSwitchUser");
    private By UserNameLabelLocator = By.linkText("مدير عام الأمن والسلامة المدرسية");

    @Test
    public void loginAndSwitchPrfileUsers() {
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SwitchProfileLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(UserNameLabelLocator)).click();
    }

    private By UsersTypeMenuLocator = By.id("divMenuItem_4720");
    private By UserLinkLocator1 = By.linkText("موظف صلاحيات مدير عام الأمن والسلامة المدرسية");
    private By AddedNewUserLinkLocator = By.id("ctl00_PlaceHolderMain_lbtnAddManagementUser");
    private By UserIdFieldLocator = By.id("ctl00_PlaceHolderMain_tbIdentification");
    private By IbtnCheckIdentificationIDLocator = By.id("ctl00_PlaceHolderMain_ibtnCheckIdentificationID0");
    private By DDlNationalityLocator = By.id("select2-ctl00_PlaceHolderMain_oUserAuthenticationUC_ddlNationality-container");
    private By DDlNationalitySearchLocator = By.xpath("/html/body/span/span/span[1]/input");
    private By PassportNumberLocator = By.id("ctl00_PlaceHolderMain_oUserAuthenticationUC_tbPassportNumber");
    private By CLRIdentificationDateLocator = By.id("ctl00_PlaceHolderMain_oUserAuthenticationUC_clrIdentificationDate_ibtnOpenCalendar");
    private By CLRIdentificationDayLocator = By.xpath("/html/body/div/table/tbody/tr[3]/td[5]");
    private By CLRResidenceDateLocator = By.id("ctl00_PlaceHolderMain_oUserAuthenticationUC_clrResidenceDate_ibtnOpenCalendar");
    private By CLRResidenceDayLocator = By.xpath("/html/body/div/table/tbody/tr[3]/td[3]");
    private By DDLIdentificationPlaceLocator = By.id("select2-ctl00_PlaceHolderMain_oUserAuthenticationUC_ddlIdentificationPlace-container");
    private By DDLIdentificationPlaceSearchLocator = By.xpath("/html/body/span/span/span[1]/input");
    private By ArabicFirstNameLocator = By.id("ctl00_PlaceHolderMain_oUserAuthenticationUC_tbArabicFirstName");
    private By ArabicSecondNameLocator = By.id("ctl00_PlaceHolderMain_oUserAuthenticationUC_tbArabicSecondName");
    private By ArabicThirdNameLocator = By.id("ctl00_PlaceHolderMain_oUserAuthenticationUC_tbArabicThirdName");
    private By ArabicLastNameLocator = By.id("ctl00_PlaceHolderMain_oUserAuthenticationUC_tbArabicLastName");
    private By EnglishFirstNameLocator = By.id("ctl00_PlaceHolderMain_oUserAuthenticationUC_tbEnglishFirstName");
    private By EnglishSecondNameLocator = By.id("ctl00_PlaceHolderMain_oUserAuthenticationUC_tbEnglishSecondName");
    private By EnglishThirdNameLocator = By.id("ctl00_PlaceHolderMain_oUserAuthenticationUC_tbEnglishThirdName");
    private By EnglishLastNameLocator = By.id("ctl00_PlaceHolderMain_oUserAuthenticationUC_tbEnglishLastName");
    private By BirthDateLocator = By.id("ctl00_PlaceHolderMain_oUserAuthenticationUC_clrBirthDate_ibtnOpenCalendar");
    private By BirthDateLocatorDate = By.xpath("/html/body/div/table/tbody/tr[3]/td[3]");
    private By ArabicBirthPlaceLocator = By.id("ctl00_PlaceHolderMain_oUserAuthenticationUC_tbArabicBirthPlace");
    private By EnglishBirthPlaceLocator = By.id("ctl00_PlaceHolderMain_oUserAuthenticationUC_tbEnglishBirthPlace");
    private By DDlReligionLocator = By.id("select2-ctl00_PlaceHolderMain_oUserAuthenticationUC_ddlReligion-container");
    private By DDlReligionSearchLocator = By.xpath("/html/body/span/span/span[1]/input");
    private By DDLBloodTypesLocator = By.id("select2-ctl00_PlaceHolderMain_oUserAuthenticationUC_ddlBloodTypes-container");
    private By DDLBloodTypesSearchLocator = By.xpath("/html/body/span/span/span[1]/input");
    private By DDlResidenceTypeLocator = By.id("select2-ctl00_PlaceHolderMain_oUserAuthenticationUC_ddlResidenceType-container");
    private By DDlResidenceTypeSearchLocator = By.xpath("/html/body/span/span/span[1]/input");
    private By DDLResidenceOwnerShipLocator = By.id("select2-ctl00_PlaceHolderMain_oUserAuthenticationUC_ddlResidenceOwnerShip-container");
    private By DDLResidenceOwnerShipSearchLocator = By.xpath("/html/body/span/span/span[1]/input");
    private By DDlSocialSituationLOcator = By.id("select2-ctl00_PlaceHolderMain_oUserAuthenticationUC_ddlSocialSituation-container");
    private By DDlSocialSituationSerachLOcator = By.xpath("/html/body/span/span/span[1]/input");
    private By UserAuthenticationUCLocatr = By.id("ctl00_PlaceHolderMain_oUserAuthenticationUC_tbUserName");
    private By UserAuthenticationUC_ibtnGoLocator = By.id("ctl00_PlaceHolderMain_oUserAuthenticationUC_ibtnGo");
    private By UserAuthenticationUClblUserNameVerifyLocator = By.id("ctl00_PlaceHolderMain_oUserAuthenticationUC_lblUserNameVerify");
    private By PasswordLocator = By.id("ctl00_PlaceHolderMain_oUserAuthenticationUC_tbPassword");
    private By ConfirmPasswordLoactor = By.id("ctl00_PlaceHolderMain_oUserAuthenticationUC_tbConfirmPassword");
    private By DDLManagmentRegionLocator = By.id("select2-ctl00_PlaceHolderMain_oUserAuthenticationUC_ddlManagmentRegion-container");
    private By MainStreetLocator = By.id("ctl00_PlaceHolderMain_oUserAuthenticationUC_tbMainStreet");
    private By SubStreetLOcator = By.id("ctl00_PlaceHolderMain_oUserAuthenticationUC_tbSubStreet");
    private By HouseNoLocator = By.id("ctl00_PlaceHolderMain_oUserAuthenticationUC_tbHouseNo");
    private By HouseNextToLocator = By.id("ctl00_PlaceHolderMain_oUserAuthenticationUC_tbHouseNextTo");
    private By TelephoneNo1Locator = By.id("ctl00_PlaceHolderMain_oUserAuthenticationUC_oAddressUC_tbTelephoneNo1");
    private By TelephoneNo2LOcator = By.id("ctl00_PlaceHolderMain_oUserAuthenticationUC_oAddressUC_tbTelephoneNo2");
    private By AdmissionMobileNoLOcator = By.id("ctl00_PlaceHolderMain_oUserAuthenticationUC_oAddressUC_tbAdmissionMobileNo");
    private By EmailAddressLocator = By.id("ctl00_PlaceHolderMain_oUserAuthenticationUC_oAddressUC_tbEmailAddress");
    private By StreetAddressLocator = By.id("ctl00_PlaceHolderMain_oUserAuthenticationUC_oAddressUC_tbStreetAddress");
    private By ZipCodeLocator = By.id("ctl00_PlaceHolderMain_oUserAuthenticationUC_oAddressUC_tbZipCode");
    private By POBoxLocator = By.id("ctl00_PlaceHolderMain_oUserAuthenticationUC_oAddressUC_tbPOBox");
    private By FaxNumber = By.id("ctl00_PlaceHolderMain_oUserAuthenticationUC_oAddressUC_tbFaxNumber");
    private By btnSaveLocator = By.id("ctl00_PlaceHolderMain_ibtnSave");

    //موظفو صلاحيات مدير عام الأمن والسلامة المدرسية
    @Test
    public void addGeneralDirectorOfSchoolSecurityAndSafetyOfficer() throws InterruptedException {


        waitQA.until(ExpectedConditions.visibilityOfElementLocated(UsersTypeMenuLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(UserLinkLocator1)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddedNewUserLinkLocator)).click();
        Random Rand = new Random();
        int RandomNumber = Rand.nextInt(1000000);
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(UserIdFieldLocator)).sendKeys("1" + RandomNumber);
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(IbtnCheckIdentificationIDLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDlNationalityLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(PassportNumberLocator)).sendKeys("2" + RandomNumber);
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(CLRIdentificationDateLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(CLRIdentificationDayLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(CLRResidenceDateLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(CLRResidenceDayLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDLIdentificationPlaceLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDLIdentificationPlaceSearchLocator)).sendKeys("الشمال" , Keys.ENTER);
        browserQA.findElement(ArabicFirstNameLocator).sendKeys("رامي");
        browserQA.findElement(ArabicSecondNameLocator).sendKeys("أحمد");
        browserQA.findElement(ArabicThirdNameLocator).sendKeys("علي");
        browserQA.findElement(ArabicLastNameLocator).sendKeys("الشوابكة");
        browserQA.findElement(EnglishFirstNameLocator).sendKeys("Rami");
        browserQA.findElement(EnglishSecondNameLocator).sendKeys("Ahmad");
        browserQA.findElement(EnglishThirdNameLocator).sendKeys("Ali");
        browserQA.findElement(EnglishLastNameLocator).sendKeys("Alshawabkeh");
        By GebderDDLLocator = By.id("select2-ctl00_PlaceHolderMain_oUserAuthenticationUC_ddlGender-container");
        By GebderDDLLSearchocator = By.xpath("/html/body/span/span/span[1]/input");
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(GebderDDLLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(GebderDDLLSearchocator)).sendKeys("بنين" , Keys.ENTER);

        Thread.sleep(1000);
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(BirthDateLocator)).click();
        Thread.sleep(1000);
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(BirthDateLocatorDate)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ArabicBirthPlaceLocator)).sendKeys(" مكان الميلاد بالعربية ");
        browserQA.findElement(EnglishBirthPlaceLocator).sendKeys(" مكان الميلاد بالإنجليزية ");
        browserQA.findElement(DDlReligionLocator).click();
        browserQA.findElement(DDlReligionSearchLocator).sendKeys("أخرى" , Keys.ENTER);
        browserQA.findElement(DDLBloodTypesLocator).click();
        browserQA.findElement(DDLBloodTypesSearchLocator).sendKeys("AB+" , Keys.ENTER);
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDlResidenceTypeLocator)).click();
        browserQA.findElement(DDlResidenceTypeSearchLocator).sendKeys("بيت شعر" , Keys.ENTER);
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDLResidenceOwnerShipLocator)).click();
        browserQA.findElement(DDLResidenceOwnerShipSearchLocator).sendKeys("ملكية بالوقف/بالهبة" , Keys.ENTER);
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDlSocialSituationLOcator)).click();
        browserQA.findElement(DDlSocialSituationSerachLOcator).sendKeys("مطلق" , Keys.ENTER);
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(UserAuthenticationUCLocatr)).clear();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(UserAuthenticationUCLocatr)).sendKeys("Rami" + RandomNumber);
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(UserAuthenticationUC_ibtnGoLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(UserAuthenticationUClblUserNameVerifyLocator));
        String ValidationMeassageUN = browserQA.findElement(UserAuthenticationUClblUserNameVerifyLocator).getText();
        String ValidationMeassageUNString = "تم استخدام اسم الدخول من قبل، الرجاء إدخال اسم جديد.";
        Assert.assertNotEquals(ValidationMeassageUN , ValidationMeassageUNString , "الرجاء ادخال اسم مستخدم غير مستخدم من قبل  ");
        browserQA.findElement(PasswordLocator).click();
        browserQA.findElement(PasswordLocator).sendKeys("1234");
        browserQA.findElement(ConfirmPasswordLoactor).clear();
        browserQA.findElement(ConfirmPasswordLoactor).sendKeys("1234");
        browserQA.findElement(MainStreetLocator).sendKeys(" الشارع الرئيسي ");
        browserQA.findElement(SubStreetLOcator).sendKeys(" الشارع الفرعي ");
        browserQA.findElement(HouseNoLocator).sendKeys("123");
        browserQA.findElement(HouseNextToLocator).sendKeys("بجوار");
        browserQA.findElement(TelephoneNo1Locator).sendKeys("4546545646");
        browserQA.findElement(TelephoneNo2LOcator).sendKeys("3546546545");
        browserQA.findElement(AdmissionMobileNoLOcator).sendKeys("599999999");
        browserQA.findElement(EmailAddressLocator).sendKeys("www.Rami" + RandomNumber + "@gmail.com");
        browserQA.findElement(StreetAddressLocator).sendKeys("7" + RandomNumber);
        browserQA.findElement(ZipCodeLocator).sendKeys("7" + RandomNumber);
        browserQA.findElement(POBoxLocator).sendKeys("7" + RandomNumber);
        browserQA.findElement(FaxNumber).sendKeys("7" + RandomNumber);
        browserQA.findElement(btnSaveLocator).click();
        By ValidationMessageAfterAddTheUser = By.id("ctl00_PlaceHolderMain_lblResult");

        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(ValidationMessageAfterAddTheUser));
                break;
            } catch (Exception e) {
                Thread.sleep(200);
            }
        }
        String ActualResult = browserQA.findElement(ValidationMessageAfterAddTheUser).getText();
        String Excpectesresult = "لا يمكن اضافة ملف لعدم وجود ملف له في شؤون المعلمين";

        if (ActualResult.equals(Excpectesresult)) {
            browserQA.close();
            NoorLogin LoginTeacherAffiarAdmin = new NoorLogin();
            LoginTeacherAffiarAdmin.DirectorGeneralofTeachersAffairsintheMinistry();
            DirectorOfDepartmentsInTheMinistry AddDirectorOfDepartment = new DirectorOfDepartmentsInTheMinistry();
            AddDirectorOfDepartment.AddDirectorOfDepartmentsInTheMinistry();
            DirectorOfDepartmentsInTheMinistry CallClassID = new DirectorOfDepartmentsInTheMinistry();
            CallClassID.UserId();
            System.out.println(UserIdToPassString);
            String UserIdAfterAdded = UserIdToPassString;
            DirectorOfDepartmentsInTheMinistry Add2 = new DirectorOfDepartmentsInTheMinistry();
            Add2.AddedPart2();
            NoorLogin Login2 = new NoorLogin();
            Login2.GeneralDirectorOfSchoolSecurityAndSafety();
            TheUsers LoginAndSitch = new TheUsers();
            LoginAndSitch.loginAndSwitchPrfileUsers();
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(UsersTypeMenuLocator)).click();
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(UserLinkLocator1)).click();
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddedNewUserLinkLocator)).click();
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(UserIdFieldLocator)).sendKeys(UserIdAfterAdded);
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(IbtnCheckIdentificationIDLocator)).click();
            browserQA.findElement(By.id("ctl00_PlaceHolderMain_ibtnSave")).click();
            By ValidationMeassage = By.id("ctl00_PlaceHolderMain_lblResult");

            Thread.sleep(200);
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(ValidationMeassage));
            String ActualResult2 = browserQA.findElement(ValidationMeassage).getText();
            String ExpectedResult2 = "تمت عملية الحفظ بنجاح.";
            Assert.assertEquals(ActualResult2 , ExpectedResult2 , "يوجد مشكلة");
        } else {
            Assert.assertEquals(ActualResult , Excpectesresult , "لم تتم عملية اضافة المستخدم بنجاح ");
        }
    }

    private By UserLinkLocator2 = By.linkText("موظفو الأمن والسلامة المدرسية");

    //موظفو الأمن والسلامة المدرسية
    @Test
    public void addSchoolSecurityAndSafetyOfficer() throws InterruptedException {

        waitQA.until(ExpectedConditions.visibilityOfElementLocated(UsersTypeMenuLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(UserLinkLocator2)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddedNewUserLinkLocator)).click();
        Random Rand = new Random();
        int RandomNumber = Rand.nextInt(1000000);
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(UserIdFieldLocator)).sendKeys("1" + RandomNumber);
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(IbtnCheckIdentificationIDLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDlNationalityLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDlNationalitySearchLocator)).sendKeys("أسبانيا" , Keys.ENTER);
        Thread.sleep(500);
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(PassportNumberLocator)).sendKeys("2" + RandomNumber);
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(CLRIdentificationDateLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(CLRIdentificationDayLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(CLRResidenceDateLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(CLRResidenceDayLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDLIdentificationPlaceLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDLIdentificationPlaceSearchLocator)).sendKeys("الشمال" , Keys.ENTER);
        browserQA.findElement(ArabicFirstNameLocator).sendKeys("رامي");
        browserQA.findElement(ArabicSecondNameLocator).sendKeys("أحمد");
        browserQA.findElement(ArabicThirdNameLocator).sendKeys("علي");
        browserQA.findElement(ArabicLastNameLocator).sendKeys("الشوابكة");
        browserQA.findElement(EnglishFirstNameLocator).sendKeys("Rami");
        browserQA.findElement(EnglishSecondNameLocator).sendKeys("Ahmad");
        browserQA.findElement(EnglishThirdNameLocator).sendKeys("Ali");
        browserQA.findElement(EnglishLastNameLocator).sendKeys("Alshawabkeh");
        By GebderDDLLocator = By.id("select2-ctl00_PlaceHolderMain_oUserAuthenticationUC_ddlGender-container");
        By GebderDDLLSearchocator = By.xpath("/html/body/span/span/span[1]/input");
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(GebderDDLLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(GebderDDLLSearchocator)).sendKeys("بنين" , Keys.ENTER);
        Thread.sleep(500);
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(BirthDateLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(BirthDateLocatorDate)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ArabicBirthPlaceLocator)).sendKeys(" مكان الميلاد بالعربية ");
        browserQA.findElement(EnglishBirthPlaceLocator).sendKeys(" مكان الميلاد بالإنجليزية ");
        browserQA.findElement(DDlReligionLocator).click();
        browserQA.findElement(DDlReligionSearchLocator).sendKeys("أخرى" , Keys.ENTER);
        browserQA.findElement(DDLBloodTypesLocator).click();
        browserQA.findElement(DDLBloodTypesSearchLocator).sendKeys("AB+" , Keys.ENTER);
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDlResidenceTypeLocator)).click();
        browserQA.findElement(DDlResidenceTypeSearchLocator).sendKeys("بيت شعر" , Keys.ENTER);
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDLResidenceOwnerShipLocator)).click();
        browserQA.findElement(DDLResidenceOwnerShipSearchLocator).sendKeys("ملكية بالوقف/بالهبة" , Keys.ENTER);
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDlSocialSituationLOcator)).click();
        browserQA.findElement(DDlSocialSituationSerachLOcator).sendKeys("مطلق" , Keys.ENTER);
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(UserAuthenticationUCLocatr)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(UserAuthenticationUCLocatr)).clear();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(UserAuthenticationUCLocatr)).sendKeys("Rami" + RandomNumber);
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(UserAuthenticationUC_ibtnGoLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(UserAuthenticationUClblUserNameVerifyLocator));
        String ValidationMeassageUN = browserQA.findElement(UserAuthenticationUClblUserNameVerifyLocator).getText();
        String ValidationMeassageUNString = "تم استخدام اسم الدخول من قبل، الرجاء إدخال اسم جديد.";
        Assert.assertNotEquals(ValidationMeassageUN , ValidationMeassageUNString , "الرجاء ادخال اسم مستخدم غير مستخدم من قبل  ");
        browserQA.findElement(PasswordLocator).click();
        browserQA.findElement(PasswordLocator).sendKeys("1234");
        browserQA.findElement(ConfirmPasswordLoactor).clear();
        browserQA.findElement(ConfirmPasswordLoactor).sendKeys("1234");
        browserQA.findElement(MainStreetLocator).sendKeys(" الشارع الرئيسي ");
        browserQA.findElement(SubStreetLOcator).sendKeys(" الشارع الفرعي ");
        browserQA.findElement(HouseNoLocator).sendKeys("123");
        browserQA.findElement(HouseNextToLocator).sendKeys("بجوار");
        browserQA.findElement(TelephoneNo1Locator).sendKeys("4546545646");
        browserQA.findElement(TelephoneNo2LOcator).sendKeys("3546546545");
        browserQA.findElement(AdmissionMobileNoLOcator).sendKeys("599999999");
        browserQA.findElement(EmailAddressLocator).sendKeys("www.Rami" + RandomNumber + "@gmail.com");
        browserQA.findElement(StreetAddressLocator).sendKeys("7" + RandomNumber);
        browserQA.findElement(ZipCodeLocator).sendKeys("7" + RandomNumber);
        browserQA.findElement(POBoxLocator).sendKeys("7" + RandomNumber);
        browserQA.findElement(FaxNumber).sendKeys("7" + RandomNumber);
        browserQA.findElement(btnSaveLocator).click();
        By ValidationMessageAfterAddTheUser = By.id("ctl00_PlaceHolderMain_lblResult");
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ValidationMessageAfterAddTheUser));
        String ActualResult = browserQA.findElement(ValidationMessageAfterAddTheUser).getText();
        String ExcpectedResult = "لا يمكن اضافة ملف لعدم وجود ملف له في شؤون المعلمين";
        if (ActualResult.equals(ExcpectedResult)) {
            browserQA.close();
            NoorLogin LoginTeacherAffiarAdmin1 = new NoorLogin();
            LoginTeacherAffiarAdmin1.DirectorGeneralofTeachersAffairsintheMinistry();
            DirectorOfDepartmentsInTheMinistry AddDirectorOfDepartment1 = new DirectorOfDepartmentsInTheMinistry();
            AddDirectorOfDepartment1.AddDirectorOfDepartmentsInTheMinistry();
            DirectorOfDepartmentsInTheMinistry CallClassID1 = new DirectorOfDepartmentsInTheMinistry();
            CallClassID1.UserId();
            String UserIdAfterAdded1 = UserIdToPassString;
            DirectorOfDepartmentsInTheMinistry Add21 = new DirectorOfDepartmentsInTheMinistry();
            Add21.AddedPart2();
            NoorLogin Login21 = new NoorLogin();
            Login21.GeneralDirectorOfSchoolSecurityAndSafety();
            TheUsers LoginAndSitch1 = new TheUsers();
            LoginAndSitch1.loginAndSwitchPrfileUsers();
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(UsersTypeMenuLocator)).click();
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(UserLinkLocator2)).click();
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddedNewUserLinkLocator)).click();
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(UserIdFieldLocator)).sendKeys(UserIdAfterAdded1);
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(IbtnCheckIdentificationIDLocator)).click();
            browserQA.findElement(By.id("ctl00_PlaceHolderMain_ibtnSave")).click();
            By ValidationMeassage = By.id("ctl00_PlaceHolderMain_lblResult");
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(ValidationMeassage));
            String ActualResult2 = browserQA.findElement(ValidationMeassage).getText();
            String ExpectedResult2 = "تمت عملية الحفظ بنجاح.";
            Assert.assertEquals(ActualResult2 , ExpectedResult2 , "يوجد مشكلة");
        } else {
            Assert.assertEquals(ActualResult , ExcpectedResult , "لم تتم عملية اضافة المستخدم بنجاح ");
        }
    }
}

