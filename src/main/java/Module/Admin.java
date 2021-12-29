package Module;

import Main.Base;
import Utilities.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Admin extends Base {

    Elements e = new Elements();

    @Test(priority = 1)
    public void admin_login() throws InterruptedException {

        driver.get("http://admin.cartlow.lan/");
        Thread.sleep(1500);
    }

    @Test(priority = 2)
    public void admin_email() {
        WebElement admin_email = driver.findElement(By.xpath(e.admin_email));
        admin_email.sendKeys("azeem.hassan@cartlow.com");
    }

    @Test(priority = 3)
    public void admin_password() {
        WebElement admin_password = driver.findElement(By.xpath(e.admin_password));
        admin_password.sendKeys("Cartlow@12");
    }

    @Test(priority = 4)
    public void admin_submitBtn() {
        WebElement admin_submit = driver.findElement(By.xpath(e.admin_submit));
        admin_submit.click();

    }
    @Test(priority = 5)
    public void Inventory_admin() throws InterruptedException {
        Thread.sleep(1000);
        WebElement inventory_admin= driver.findElement(By.xpath(e.inventory_admin));
       // Thread.sleep(1000);
        inventory_admin.click();
    }
    @Test(priority = 6)
    public void Pending_content() throws InterruptedException {
        Thread.sleep(1500);
        WebElement pending_content= driver.findElement(By.xpath(e.pending_content));
        pending_content.click();
    }



    @Test(priority = 7)
    public void PO_admin() throws InterruptedException {
        Thread.sleep(1500);
        WebElement po_admin= driver.findElement(By.xpath(e.po_admin));
        po_admin.click();
        po_admin.sendKeys("7030");
    }


    @Test(priority = 9)
    public void search_pc() throws InterruptedException {
        Thread.sleep(1500);
        WebElement search_pc= driver.findElement(By.xpath(e.search_pc));
        search_pc.click();
    }

    @Test(priority = 10)
    public void Validate_admin() throws InterruptedException {
        Thread.sleep(1500);
        WebElement Validate_admin= driver.findElement(By.xpath(e.Validate_admin));
        Validate_admin.click();
        Thread.sleep(3000);

    }
    @Test(priority = 11)
    public void Mark_as_close() throws InterruptedException {
        Thread.sleep(10000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//        WebElement Element = driver.findElement(By.linkText("Mark all same items valid"));
//        js.executeScript("arguments[0].scrollIntoView();", Element);
//        Thread.sleep(1000);
        WebElement mark_as_close= driver.findElement(By.xpath(e.mark_as_close));
        mark_as_close.click();
        Thread.sleep(1500);
        driver.switchTo().alert().accept();
    }

    @Test(priority = 12)
    public void error() throws InterruptedException {
        Delay(3);
        WebElement error = driver.findElement(By.xpath(e.error));
        while (error.isDisplayed()) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,-250)");
            Delay(2);
            WebElement Select_parent_category= driver.findElement(By.xpath(e.Select_parent_category));
            Select_parent_category.click();
            Delay(3);
            WebElement search_field= driver.findElement(By.xpath(e.search_field));
            search_field.click();
            search_field.sendKeys("mobile"+ Keys.chord(Keys.ENTER));
            Delay(2);
            WebElement Select_sub_category = driver.findElement(By.xpath(e.sub_category));
            Select_sub_category.click();
            Select_sub_category.sendKeys("m"+Keys.chord(Keys.ENTER));
            Delay(2);
            WebElement online_price=driver.findElement(By.xpath(e.online_price));
            online_price.sendKeys("100");
            Delay(2);
            WebElement mark_as_close= driver.findElement(By.xpath(e.mark_as_close));
            mark_as_close.click();
            iDelay(3);
            driver.switchTo().alert().accept();
        }
    }
    @Test(priority = 13)
    public void publish() throws InterruptedException {
        Inventory_admin();
        Thread.sleep(1500);
        WebElement publish= driver.findElement(By.id(e.publish));
        publish.click();
    }

    @Test(priority = 14)
    public void publish_item() throws InterruptedException {
        Thread.sleep(1000);
        WebElement publish_item= driver.findElement(By.xpath(e.publish_item));
        publish_item.click();
    }

}
