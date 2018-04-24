/*
 * Created By  Rami AlShawabkeh  4/10/18 2:59 PM
 */

package NoorProject.EduWaveSafeAndSecurity.A5SchoolAdmin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static NoorProject.Other.NoorLogin.browserQA;
import static NoorProject.Other.NoorLogin.waitQA;

public class Reports {

    private By ReportsMenuLocator = By.id("divMenuItem_321");
    private By SearchFieldLocator = By.id("lisearch_list");
    private By TheReportLocator = By.linkText("معلومات بطاقات المدارس");
    private By TextFieldTitleLocator = By.id("ctl00_lblPageTitle");
    private By BTNBack = By.id("ctl00_PlaceHolderMain_ibtnBack");

    //مدير مدرسة-تقرير معلومات بطاقات المدرسة
    @Test
    public void SchoolCardInformationView() {
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportsMenuLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SearchFieldLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(TheReportLocator)).click();
        By ReortTitleLocator = By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[4]/div/span/div/table/tbody/tr[4]/td[3]/div/div[1]/div/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr[7]/td[3]/table/tbody/tr/td/div/div/span");
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReortTitleLocator));
        String ExpectedResult = browserQA.findElement(ReortTitleLocator).getText();
        String Actual_Result = "معلومات بطاقات المدارس";
        Assert.assertEquals(Actual_Result , ExpectedResult , "التقرير المطلوب غير متوفر");
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(BTNBack)).click();
    }

    private By TheReportLocatorSD = By.linkText("بيانات المدرسة");

    //مدير مدرسة تقرير بيانات المدرسة
    @Test
    public void SchoolDataReport() throws InterruptedException {
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportsMenuLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SearchFieldLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(TheReportLocatorSD)).click();
        String TextFieldTitle = "بيانات المدرسة";
        By TxtFieldTableLocator = By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[3]/div/span/div/table/tbody/tr[4]/td[3]/div/div[1]/div/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr[7]/td[3]/table/tbody/tr/td/div/div/span");
        WebElement TxtFieldTableLocatorElement = waitQA.until(ExpectedConditions.visibilityOfElementLocated(TxtFieldTableLocator));
        String TextFieldTable = TxtFieldTableLocatorElement.getText();
        System.out.println(TextFieldTitle);
        System.out.println(TextFieldTable);
        Assert.assertEquals(TextFieldTable , TextFieldTitle , "التقرير المطلوب غير متوفر");
        By BTNBack = By.id("ctl00_PlaceHolderMain_ibtnBack");
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(BTNBack)).click();
    }


    private By TheReportLocatorUDITS = By.linkText("بيانات المستخدمين بالمدارس");
    private By BtnSearchLocator = By.id("ctl00_PlaceHolderMain_ibtnSearch");

    //مدير مدرسة تقرير بيانات المستخدمين بالمدارس
    @Test
    public void UserDataInSchoolsView() throws InterruptedException {
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportsMenuLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SearchFieldLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(TheReportLocatorUDITS)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(BtnSearchLocator)).click();
        WebElement TextFieldTitleLocatorElement = waitQA.until(ExpectedConditions.visibilityOfElementLocated(TextFieldTitleLocator));
        String ExpectedResult = TextFieldTitleLocatorElement.getText();
        By TextFieldTableLocator = By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[4]/span/div/table/tbody/tr[4]/td[3]/div/div[1]/div/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr[6]/td[3]/table/tbody/tr/td/div/div[1]/span");
        WebElement TextFieldTableLocatorElement = waitQA.until(ExpectedConditions.visibilityOfElementLocated(TextFieldTableLocator));
        String ActualResult = TextFieldTableLocatorElement.getText();
        System.out.println(ExpectedResult);
        System.out.println(ActualResult);
        Assert.assertEquals(ActualResult , ExpectedResult , "التقرير المطلوب غير متوفر");
    }
}

