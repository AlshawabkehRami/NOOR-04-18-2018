/*
 * Created By  Rami AlShawabkeh  4/24/18 12:27 PM
 */

package NoorProject.EduWaveSafeAndSecurity.A5SchoolAdmin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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
        List TableSize = browserQA.findElements(By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[1]/div[2]/div/div/table[1]/tbody/tr/td[1]"));
        if (TableSize.size() <= 1) {
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
       By gg = By.id("ctl00_PlaceHolderMain_gvForm_ctl19_lbtnEditForm");
        browserQA.findElement(gg).getAttribute("disabled"); //"true , false , null"
        System.out.println(browserQA.findElement(gg).getAttribute("disabled"));

    }

}



