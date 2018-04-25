/*
 * Created By  Rami AlShawabkeh  4/24/18 12:27 PM
 */

package NoorProject.EduWaveSafeAndSecurity.A5SchoolAdmin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static NoorProject.Other.NoorLogin.browserQA;
import static NoorProject.Other.NoorLogin.waitQA;

public class SSForms {
    private By SettingMenuLocator = By.id("divMenuItem_2805");
    private By SearchLocator = By.id("lisearch_list");
    private By SSLinkLocator = By.linkText("السلامة المدرسية");
    private By ViewLinkLoactor = By.linkText("عرض");
    private By BTNBackLocator = By.id("ctl00_PlaceHolderMain_ibtnBack");


    @Test
    public void viewForm() {
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SettingMenuLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SearchLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SSLinkLocator)).click();
        WebElement Table = browserQA.findElement(By.id("ctl00_PlaceHolderMain_gvForm"));
        List Rows = Table.findElements(By.cssSelector("tr[id*='ctl00_PlaceHolderMain_gvForm']"));
        if (Rows.size() <= 1) {
            System.out.println("يجب نشر نماذج للامن والسلامة");
        } else {
            waitQA.until(ExpectedConditions.visibilityOfElementLocated(ViewLinkLoactor)).click();
        }
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(BTNBackLocator)).click();
    }

    @Test
    public void editForm() {
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SettingMenuLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SearchLocator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(SSLinkLocator)).click();

        WebElement Table = browserQA.findElement(By.id("ctl00_PlaceHolderMain_gvForm"));
        List Rows = Table.findElements(By.cssSelector("tr[id*='ctl00_PlaceHolderMain_gvForm']"));
        if (Rows.size() <= 1) {
            System.out.println("يجب نشر نماذج للامن والسلامة");
        } else {
            for (int i = 2; i < Rows.size() + 1; i++) {
                String IdFormat = String.format("%02d" , i);

                By EditLinkLocator = By.id("ctl00_PlaceHolderMain_gvForm_ctl" + IdFormat + "_lbtnEditForm");
                boolean A1 = Boolean.parseBoolean(browserQA.findElement(EditLinkLocator).getAttribute("disabled"));

                String B1 = String.valueOf(A1);

                if (B1.equals("false")) {
                    waitQA.until(ExpectedConditions.visibilityOfElementLocated(EditLinkLocator)).click();
                    browserQA.findElement(By.id("ctl00_PlaceHolderMain_ibtnNext")).click();
                    browserQA.findElement(By.id("ctl00_ibtnYes")).click();

                    waitQA.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_PlaceHolderMain_lblOpertioanlResult")));
                    String ActualResult = browserQA.findElement(By.id("ctl00_PlaceHolderMain_lblOpertioanlResult")).getText();
                    String ExpecteResult = "تمت عملية حفظ البيانات بنجاح.";
                    Assert.assertEquals(ActualResult , ExpecteResult , "لم تتم عملية الحفظ بنجاح");

                    browserQA.findElement(By.id("ctl00_PlaceHolderMain_ibtnBack")).click();
                    break;
                } else {
                    System.out.println("رابط التعديل غير فعال الرجاء اعتماد النموذج من المؤول المدرسي");
                }


            }
        }
    }
}