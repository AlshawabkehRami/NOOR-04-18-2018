/*
 * Created By  Rami AlShawabkeh  4/9/18 5:46 PM
 */

/*
 * Created By  Rami AlShawabkeh  4/9/18 5:33 PM
 */

package NoorProject.EduWaveSafeAndSecurity.A3SSMangerInDistrict;

import NoorProject.Other.NoorLogin;
import NoorProject.TeacherAffairs.GeneralDirectorInMinistry.UsersList.DepartmentManagersInTheMinistry.DirectorOfDepartmentsInTheMinistry;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

import static NoorProject.Other.NoorLogin.browserQA;
import static NoorProject.Other.NoorLogin.waitQA;
import static NoorProject.TeacherAffairs.GeneralDirectorInMinistry.UsersList.DepartmentManagersInTheMinistry.DirectorOfDepartmentsInTheMinistry.UserIdToPassString;

public class TheUsers {
    private By SwitchProfileLocator = By.id("ctl00_oHeader_divSwitchUser");
    private By UserNameLabelLocator = By.partialLinkText("مدير الأمن والسلامة في إدارة التعليم");
    private By UsersTypeMenuLocator = By.id("divMenuItem_3923");
    private By DDLSerachTextSendOptionLoactor = By.xpath("/html/body/span/span/span[1]/input");
    private By AddedNewUserLinkLocator = By.id("ctl00_PlaceHolderMain_lbtnAddManagementUser");
    private By UserIdFieldLocator = By.id("ctl00_PlaceHolderMain_tbIdentification");
    private By IbtnCheckIdentificationIDLocator = By.id("ctl00_PlaceHolderMain_ibtnCheckIdentificationID0");
    private By DDlNationalityLocator = By.id("select2-ctl00_PlaceHolderMain_oUserAuthenticationUC_ddlNationality-container");
    private By PassportNumberLocator = By.id("ctl00_PlaceHolderMain_oUserAuthenticationUC_tbPassportNumber");
    private By CLRIdentificationDateLocator = By.id("ctl00_PlaceHolderMain_oUserAuthenticationUC_clrIdentificationDate_ibtnOpenCalendar");
    private By CLRIdentificationDayLocator = By.xpath("/html/body/div/table/tbody/tr[3]/td[5]");
    private By CLRResidenceDateLocator = By.id("ctl00_PlaceHolderMain_oUserAuthenticationUC_clrResidenceDate_ibtnOpenCalendar");
    private By CLRResidenceDayLocator = By.xpath("/html/body/div/table/tbody/tr[3]/td[3]");
    private By DDLIdentificationPlaceLocator = By.id("select2-ctl00_PlaceHolderMain_oUserAuthenticationUC_ddlIdentificationPlace-container");
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
    private By DDLBloodTypesLocator = By.id("select2-ctl00_PlaceHolderMain_oUserAuthenticationUC_ddlBloodTypes-container");
    private By DDlResidenceTypeLocator = By.id("select2-ctl00_PlaceHolderMain_oUserAuthenticationUC_ddlResidenceType-container");
    private By DDLResidenceOwnerShipLocator = By.id("select2-ctl00_PlaceHolderMain_oUserAuthenticationUC_ddlResidenceOwnerShip-container");
    private By DDlSocialSituationLOcator = By.id("select2-ctl00_PlaceHolderMain_oUserAuthenticationUC_ddlSocialSituation-container");
    private By UserAuthenticationUCLocatr = By.id("ctl00_PlaceHolderMain_oUserAuthenticationUC_tbUserName");
    private By UserAuthenticationUC_ibtnGoLocator = By.id("ctl00_PlaceHolderMain_oUserAuthenticationUC_ibtnGo");
    private By UserAuthenticationUClblUserNameVerifyLocator = By.id("ctl00_PlaceHolderMain_oUserAuthenticationUC_lblUserNameVerify");
    private By PasswordLocator = By.id("ctl00_PlaceHolderMain_oUserAuthenticationUC_tbPassword");
    private By ConfirmPasswordLoactor = By.id("ctl00_PlaceHolderMain_oUserAuthenticationUC_tbConfirmPassword");
    private By DDLManagmentRegionLocator = By.id("select2-ctl00_PlaceHolderMain_oUserAuthenticationUC_ddlManagmentRegion-container");
    private By DDlCityLocator = By.id("select2-ctl00_PlaceHolderMain_oUserAuthenticationUC_ddlCity-container");
    private By DDlRegionLOcator = By.id("select2-ctl00_PlaceHolderMain_oUserAuthenticationUC_ddlRegion-container");
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


    @Test
    public void LoginUserSwitch() {
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SwitchProfileLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(UserNameLabelLocator)).click();
    }

    private By UserAuthorityEmployeeLocator = By.linkText("موظف صلاحيات مدير الامن والسلامة في ادارة التعليم");

    @Test
    public void addUserAuthorityEmployee() throws InterruptedException {
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(UsersTypeMenuLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(UserAuthorityEmployeeLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddedNewUserLinkLocator)).click();
        Random Rand = new Random();
        int RandomNumber = Rand.nextInt(1000000);
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(UserIdFieldLocator)).sendKeys("1" + RandomNumber);
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(IbtnCheckIdentificationIDLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDlNationalityLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDLSerachTextSendOptionLoactor)).sendKeys("أسبانيا" , Keys.ENTER);
        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(PassportNumberLocator)).sendKeys("2" + RandomNumber);
                break;
            } catch (Exception e) {
                Thread.sleep(100);
            }
        }
        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(CLRIdentificationDateLocator)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(100);
            }
        }
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(CLRIdentificationDayLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(CLRResidenceDateLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(CLRResidenceDayLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDLIdentificationPlaceLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDLSerachTextSendOptionLoactor)).sendKeys("الشمال" , Keys.ENTER);
        browserQA.findElement(ArabicFirstNameLocator).sendKeys("رامي");
        browserQA.findElement(ArabicSecondNameLocator).sendKeys("أحمد");
        browserQA.findElement(ArabicThirdNameLocator).sendKeys("علي");
        browserQA.findElement(ArabicLastNameLocator).sendKeys("الشوابكة");
        browserQA.findElement(EnglishFirstNameLocator).sendKeys("Rami");
        browserQA.findElement(EnglishSecondNameLocator).sendKeys("Ahmad");
        browserQA.findElement(EnglishThirdNameLocator).sendKeys("Ali");
        browserQA.findElement(EnglishLastNameLocator).sendKeys("Alshawabkeh");

        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(BirthDateLocator)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(100);
            }
        }
        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(BirthDateLocatorDate)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(100);
            }
        }
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ArabicBirthPlaceLocator)).sendKeys(" مكان الميلاد بالعربية ");
        browserQA.findElement(EnglishBirthPlaceLocator).sendKeys(" مكان الميلاد بالإنجليزية ");
        browserQA.findElement(DDlReligionLocator).click();
        browserQA.findElement(DDLSerachTextSendOptionLoactor).sendKeys("أخرى" , Keys.ENTER);
        browserQA.findElement(DDLBloodTypesLocator).click();
        browserQA.findElement(DDLSerachTextSendOptionLoactor).sendKeys("AB+" , Keys.ENTER);
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDlResidenceTypeLocator)).click();
        browserQA.findElement(DDLSerachTextSendOptionLoactor).sendKeys("بيت شعر" , Keys.ENTER);
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDLResidenceOwnerShipLocator)).click();
        browserQA.findElement(DDLSerachTextSendOptionLoactor).sendKeys("ملكية بالوقف/بالهبة" , Keys.ENTER);
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDlSocialSituationLOcator)).click();
        browserQA.findElement(DDLSerachTextSendOptionLoactor).sendKeys("مطلق" , Keys.ENTER);
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


        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDLManagmentRegionLocator)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(100);
            }
        }
        browserQA.findElement(DDLSerachTextSendOptionLoactor).sendKeys("الرياض" , Keys.ENTER);
        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDlCityLocator)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(100);
            }
        }
        browserQA.findElement(DDLSerachTextSendOptionLoactor).sendKeys("محافظة الرياض 1" , Keys.ENTER);

        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDlRegionLOcator)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(100);
            }
        }

        for (int i = 0; i < 3; i++) {
            try {
                browserQA.findElement(DDLSerachTextSendOptionLoactor).sendKeys("مركز الرياض 1" , Keys.ENTER);
                break;
            } catch (Exception e) {
                Thread.sleep(100);
            }
        }
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
        String MSELoctor = browserQA.findElement(ValidationMessageAfterAddTheUser).getText();
        String MesaString = "لا يمكن اضافة ملف لعدم وجود ملف له في شؤون المعلمين";

        if (MSELoctor.equals(MesaString))

        {
            browserQA.close();
            NoorLogin LoginToTAMinstry = new NoorLogin();
            LoginToTAMinstry.DirectorGeneralofTeachersAffairsintheMinistry();
            DirectorOfDepartmentsInTheMinistry AddUser1 = new DirectorOfDepartmentsInTheMinistry();
            AddUser1.AddDirectorOfDepartmentsInTheMinistry();
            DirectorOfDepartmentsInTheMinistry CallClassID1 = new DirectorOfDepartmentsInTheMinistry();
            CallClassID1.UserId();
            String UserIdAfterAdded1 = UserIdToPassString;
            DirectorOfDepartmentsInTheMinistry AddUser2 = new DirectorOfDepartmentsInTheMinistry();
            AddUser2.AddedPart2();
            NoorLogin LoginToTheUser = new NoorLogin();
            LoginToTAMinstry.SecurityAndSafetyManagersInDistrictLogin();
            TheUsers LoginUserSwitch = new TheUsers();
            LoginUserSwitch.LoginUserSwitch();
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(UsersTypeMenuLocator)).click();
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(UserAuthorityEmployeeLocator)).click();
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
            Assert.fail("لم تتم عملية الاضافة بنجاح ");
        }
    }

    private By StaffMemberUserLoactor = By.linkText("موظفون بإدارة الأمن والسلامة بإدارة التعليم");

    @Test
    public void addStaffMember() throws InterruptedException {
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(UsersTypeMenuLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(StaffMemberUserLoactor)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddedNewUserLinkLocator)).click();
        Random Rand = new Random();
        int RandomNumber = Rand.nextInt(1000000);
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(UserIdFieldLocator)).sendKeys("1" + RandomNumber);
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(IbtnCheckIdentificationIDLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDlNationalityLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDLSerachTextSendOptionLoactor)).sendKeys("أسبانيا" , Keys.ENTER);
        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(PassportNumberLocator)).sendKeys("2" + RandomNumber);
                break;
            } catch (Exception e) {
                Thread.sleep(100);
            }
        }

        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(CLRIdentificationDateLocator)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(100);
            }
        }

        waitQA.until(ExpectedConditions.visibilityOfElementLocated(CLRIdentificationDayLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(CLRResidenceDateLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(CLRResidenceDayLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDLIdentificationPlaceLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDLSerachTextSendOptionLoactor)).sendKeys("الشمال" , Keys.ENTER);
        browserQA.findElement(ArabicFirstNameLocator).sendKeys("رامي");
        browserQA.findElement(ArabicSecondNameLocator).sendKeys("أحمد");
        browserQA.findElement(ArabicThirdNameLocator).sendKeys("علي");
        browserQA.findElement(ArabicLastNameLocator).sendKeys("الشوابكة");
        browserQA.findElement(EnglishFirstNameLocator).sendKeys("Rami");
        browserQA.findElement(EnglishSecondNameLocator).sendKeys("Ahmad");
        browserQA.findElement(EnglishThirdNameLocator).sendKeys("Ali");
        browserQA.findElement(EnglishLastNameLocator).sendKeys("Alshawabkeh");

        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(BirthDateLocator)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(100);
            }
        }
        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(BirthDateLocatorDate)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(100);
            }
        }
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ArabicBirthPlaceLocator)).sendKeys(" مكان الميلاد بالعربية ");
        browserQA.findElement(EnglishBirthPlaceLocator).sendKeys(" مكان الميلاد بالإنجليزية ");
        browserQA.findElement(DDlReligionLocator).click();
        browserQA.findElement(DDLSerachTextSendOptionLoactor).sendKeys("أخرى" , Keys.ENTER);
        browserQA.findElement(DDLBloodTypesLocator).click();
        browserQA.findElement(DDLSerachTextSendOptionLoactor).sendKeys("AB+" , Keys.ENTER);
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDlResidenceTypeLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDLSerachTextSendOptionLoactor)).sendKeys("بيت شعر" , Keys.ENTER);
        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDLResidenceOwnerShipLocator)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(100);
            }
        }
        browserQA.findElement(DDLSerachTextSendOptionLoactor).sendKeys("ملكية بالوقف/بالهبة" , Keys.ENTER);
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDlSocialSituationLOcator)).click();
        browserQA.findElement(DDLSerachTextSendOptionLoactor).sendKeys("مطلق" , Keys.ENTER);
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
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDLManagmentRegionLocator)).click();
        browserQA.findElement(DDLSerachTextSendOptionLoactor).sendKeys("الرياض" , Keys.ENTER);
        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDlCityLocator)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(100);
            }
        }
        for (int i = 0; i < 3; i++) {
            try {
                browserQA.findElement(DDLSerachTextSendOptionLoactor).sendKeys("محافظة الرياض 1" , Keys.ENTER);
                break;
            } catch (Exception e) {
                Thread.sleep(100);
            }
        }
        for (int i = 0; i < 3; i++) {
            try {
                waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDlRegionLOcator)).click();
                break;
            } catch (Exception e) {
                Thread.sleep(100);
            }
        }
        for (int i = 0; i < 3; i++) {
            try {
                browserQA.findElement(DDLSerachTextSendOptionLoactor).sendKeys("مركز الرياض 1" , Keys.ENTER);
                break;
            } catch (Exception e) {
                Thread.sleep(100);
            }
        }

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
        String MSELoctor2 = browserQA.findElement(ValidationMessageAfterAddTheUser).getText();
        String MesaString2 = "لا يمكن اضافة ملف لعدم وجود ملف له في شؤون المعلمين";
        if (MSELoctor2.equals(MesaString2)) {
            System.out.println("يجب اضافة ملف فئات تشكيلية من قبل شؤون المعلمين");
            browserQA.close();
            NoorLogin LoginToTAMinstry2 = new NoorLogin();
            LoginToTAMinstry2.DirectorGeneralofTeachersAffairsintheMinistry();
            DirectorOfDepartmentsInTheMinistry AddUser12 = new DirectorOfDepartmentsInTheMinistry();
            AddUser12.AddDirectorOfDepartmentsInTheMinistry();
            DirectorOfDepartmentsInTheMinistry CallClassID12 = new DirectorOfDepartmentsInTheMinistry();
            CallClassID12.UserId();
            String UserIdAfterAdded12 = UserIdToPassString;
            DirectorOfDepartmentsInTheMinistry AddUser22 = new DirectorOfDepartmentsInTheMinistry();
            AddUser22.AddedPart2();
            NoorLogin LoginToTheUser = new NoorLogin();
            LoginToTAMinstry2.SecurityAndSafetyManagersInDistrictLogin();
            TheUsers LoginUserSwitch = new TheUsers();
            LoginUserSwitch.LoginUserSwitch();
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(UsersTypeMenuLocator)).click();
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(UserAuthorityEmployeeLocator)).click();
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddedNewUserLinkLocator)).click();
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(UserIdFieldLocator)).sendKeys(UserIdAfterAdded12);
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(IbtnCheckIdentificationIDLocator)).click();
            browserQA.findElement(By.id("ctl00_PlaceHolderMain_ibtnSave")).click();
            By ValidationMeassage = By.id("ctl00_PlaceHolderMain_lblResult");
            WebElement ValidationMeassageWait1 = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ValidationMeassage));
            String ActualResult2 = browserQA.findElement(ValidationMeassage).getText();
            String ExpectedResult2 = "تمت عملية الحفظ بنجاح.";
            Assert.assertEquals(ActualResult2 , ExpectedResult2 , "يوجد مشكلة");
        } else {
            Assert.fail("لم تتم عملية الاضافة بنجاح ");
        }
    }
}

