package Module;


import Main.Base;
import Utilities.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class Process extends Base {

    Elements e = new Elements();
    String po_number = "";

    @Test(priority = 1)

    public void Sign_in() throws InterruptedException {

        WebElement Sign_in = driver.findElement(By.xpath(e.Sign_in));
        Sign_in.click();
        Sign_in.sendKeys("demo_uae@super.com");

        Delay(2);
        WebElement Password = driver.findElement(By.xpath(e.Password));
        Password.click();
        Password.sendKeys("demo1234");

        WebElement Submit = driver.findElement(By.xpath(e.Submit));
        Submit.click();

    }

    @Test(priority = 2)
    public void Click_Po() throws InterruptedException {
        Delay(1);
        WebElement po = driver.findElement(By.xpath(e.po));
        po.click();
    }

    @Test(priority = 3)
    public void create_po() throws InterruptedException {
        Delay(1);
        WebElement create_po = driver.findElement(By.xpath(e.create_po));
        create_po.click();
    }

    @Test(priority = 4)
    public void click_sup() throws InterruptedException {
       // Thread.sleep(500);
        WebElement click_sup = driver.findElement(By.xpath(e.click_sup));
        click_sup.click();
    }

    @Test(priority = 5)
    public void sel_sup() throws InterruptedException {
        Delay(1);
        WebElement sel_sup = driver.findElement(By.xpath(e.sel_sup));
        sel_sup.click();
    }

    @Test(priority = 6)
    public void click_seller() throws InterruptedException {
        Delay(1);
        WebElement click_seller = driver.findElement(By.xpath(e.click_seller));
        click_seller.click();
    }

    @Test(priority = 7)
    public void sel_seller() throws InterruptedException {
        Delay(1);
        WebElement sel_seller = driver.findElement(By.xpath(e.sel_seller));
        sel_seller.click();
    }

    @Test(priority = 8)
    public void click_country() throws InterruptedException {
        Delay(1);
        WebElement click_country = driver.findElement(By.xpath(e.click_country));
        click_country.click();
    }

    @Test(priority = 9)
    public void sel_country() throws InterruptedException {
       // Thread.sleep(1500);
        WebElement sel_country = driver.findElement(By.xpath(e.sel_country));
        sel_country.click();
    }

    @Test(priority = 10)
    public void click_warehouse() throws InterruptedException {
      //  Thread.sleep(1500);
        WebElement click_warehouse = driver.findElement(By.xpath(e.click_warehouse));
        click_warehouse.click();
    }

    @Test(priority = 11)
    public void sel_warehouse() throws InterruptedException {
        Delay(1);
        WebElement sel_warehouse = driver.findElement(By.xpath(e.sel_warehouse));
        sel_warehouse.click();
    }


    @Test(priority = 12)
    public void create_po_btn() throws InterruptedException {
      //  Thread.sleep(1500);
        WebElement create_po_btn = driver.findElement(By.xpath(e.create_po_btn));
        create_po_btn.click();
    }

    @Test(priority = 13)
    public void ok_btn() throws InterruptedException {
      //  Thread.sleep(1500);
        WebElement ok = driver.findElement(By.xpath(e.ok));
        ok.click();
    }

    @Test(priority = 14)
    public void edit_btn() throws InterruptedException {
        Delay(1);
        po_number = driver.findElement(By.xpath("//tr[@class=\"odd\"]/td[1]")).getText();
        System.out.println(po_number);
        Delay(2);
        WebElement edit_btn = driver.findElement(By.xpath(e.edit_btn));
        edit_btn.click();
    }

    @Test(priority = 15)
    public void product() throws InterruptedException {
        Delay(3);
        WebElement product = driver.findElement(By.xpath(e.product));
        product.click();
    }

    @Test(priority = 16)
    public void product_id() throws InterruptedException {
        Delay(2);
        WebElement product_id = driver.findElement(By.xpath(e.product_id));
        product_id.click();
        product_id.sendKeys("apple");

        Delay(2);
        WebElement select_option = driver.findElement(By.xpath(e.select_option));
        select_option.click();

    }

    @Test(priority = 17)
    public void Quantity() throws InterruptedException {
       // Thread.sleep(1500);
        WebElement quantity = driver.findElement(By.xpath(e.quantity));
        quantity.click();
        quantity.sendKeys("1");
    }

    @Test(priority = 18)
    public void Price() throws InterruptedException {
       // Thread.sleep(1500);
        WebElement price = driver.findElement(By.xpath(e.price));
        price.click();
        price.sendKeys("10");
    }

    @Test(priority = 19)
    public void create_po_item() throws InterruptedException {
       // Thread.sleep(1500);
        WebElement create_po_item = driver.findElement(By.xpath(e.create_po_item));
        create_po_item.click();

    }

    @Test(priority = 20)
    public void po_ok() throws InterruptedException {
        Delay(1);
        WebElement po_ok = driver.findElement(By.xpath(e.po_ok));
        po_ok.click();

    }

    @Test(priority = 21)
    public void po_list() throws InterruptedException {
        Delay(1);
        WebElement po_list = driver.findElement(By.xpath(e.po_list));
        po_list.click();

    }

    @Test(priority = 22)
    public void edit_btn_1() throws InterruptedException {
        Delay(1);
        WebElement edit_btn = driver.findElement(By.xpath(e.edit_btn));
        edit_btn.click();
    }

    @Test(priority = 23)
    public void click_status() throws InterruptedException {
       // Delay(2);
        WebElement click_status = driver.findElement(By.xpath(e.click_status));
        click_status.click();

    }

    @Test(priority = 24)
    public void Invoice() throws InterruptedException {
        Delay(1);
        WebElement invoiced = driver.findElement(By.xpath(e.invoiced));
        invoiced.click();

    }

    @Test(priority = 25)
    public void save_changes() throws InterruptedException {
       // Delay(2);
        WebElement save_changes = driver.findElement(By.xpath(e.save_changes));
        save_changes.click();
    }

    @Test(priority = 26)
    public void po_ok_updated() throws InterruptedException {
        Delay(1);
        WebElement po_ok_updated = driver.findElement(By.xpath(e.po_ok_updated));
        po_ok_updated.click();
    }

    @Test(priority = 27)
    public void receive() throws InterruptedException {
        Delay(1);
        WebElement receive = driver.findElement(By.xpath(e.receive));
        receive.click();
    }

    @Test(priority = 28)
    public void refresh() throws InterruptedException {
        Delay(2);
        WebElement refresh = driver.findElement(By.xpath(e.refresh));
        refresh.click();
    }

    @Test(priority = 29)
    public void select() throws InterruptedException {
        Delay(1);
        WebElement select = driver.findElement(By.xpath(e.select));
        select.click();
    }

    @Test(priority = 30)
    public void all_received() throws InterruptedException {
        Delay(2);
        WebElement all_received = driver.findElement(By.xpath(e.all_received));
        all_received.click();
    }


    @Test(priority = 31)
    public void closed() throws InterruptedException {
        Delay(1);
        WebElement closed = driver.findElement(By.xpath(e.closed));
        closed.click();
    }

    @Test(priority = 32)
    public void ok_close() throws InterruptedException {
        Delay(1);
        WebElement ok_close = driver.findElement(By.xpath(e.ok_close));
        ok_close.click();
    }

    @Test(priority = 33)
    public void Movement() throws InterruptedException {
        Delay(1);
        WebElement Movement = driver.findElement(By.xpath(e.Movement));
        Movement.click();
    }

    @Test(priority = 34)
    public void Move_to_Qc() throws InterruptedException {
        Delay(1);
        WebElement Move_to_Qc = driver.findElement(By.xpath(e.Move_to_Qc));
        Move_to_Qc.click();
    }

    @Test(priority = 35)
    public void search_po() throws InterruptedException {
        Delay(1);
        WebElement search_po = driver.findElement(By.xpath(e.search_po));
        search_po.click();
        search_po.sendKeys(po_number);
    }

    @Test(priority = 36)
    public void search() throws InterruptedException {
        Delay(1);
        WebElement search = driver.findElement(By.xpath(e.search));
        search.click();

    }

    @Test(priority = 37)
    public void move_all() throws InterruptedException {
        Delay(1);
        WebElement move_all = driver.findElement(By.xpath(e.move_all));
        move_all.click();

    }

    @Test(priority = 38)
    public void move_ok() throws InterruptedException {
        Delay(1);
        WebElement move_ok = driver.findElement(By.xpath(e.move_ok));
        move_ok.click();

    }

    @Test(priority = 39)
    public void quality_control() throws InterruptedException {
        Movement();
        Delay(1);
        WebElement quality_control = driver.findElement(By.xpath(e.quality_control));
        quality_control.click();
    }

    @Test(priority = 40)
    public void quality_control_list() throws InterruptedException {
        Delay(1);
        WebElement quality_control_list = driver.findElement(By.xpath(e.quality_control_list));
        quality_control_list.click();
        search_po();
        Delay(1);
        search();
    }

    @Test(priority = 41)
    public void Qc_completed() throws InterruptedException {
        Delay(1);
        WebElement Qc_completed = driver.findElement(By.xpath(e.Qc_completed));
        Qc_completed.click();
    }

    @Test(priority = 42)
    public void Add_comment() throws InterruptedException {
        Delay(1);
        WebElement Add_comment = driver.findElement(By.xpath(e.Add_comment));
        Add_comment.click();
        Add_comment.sendKeys("Demo testing");

    }

    @Test(priority = 43)
    public void Save() throws InterruptedException {
        Delay(1);
        WebElement Save = driver.findElement(By.xpath(e.Save));
        Save.click();
        ok_btn();
    }

    @Test(priority = 44)
    public void Move_to_putaway() throws InterruptedException {
        Movement();

        Delay(1);
        WebElement Move_to_putaway = driver.findElement(By.xpath(e.Move_to_putaway));
        Move_to_putaway.click();
        search_po();
        search();
        select();

    }

    @Test(priority = 45)
    public void Move_to_putaway_btn() throws InterruptedException {
        Delay(1);
        WebElement Move_to_putaway_btn = driver.findElement(By.xpath(e.Move_to_putaway_btn));
        Move_to_putaway_btn.click();
        ok_btn();
    }

    @Test(priority = 46)
    public void Inventory_movement() throws InterruptedException {
        Delay(2);
        WebElement Inventory_movement = driver.findElement(By.xpath(e.Inventory_movement));
        Inventory_movement.click();
        search_po();
        search();
    }

    @Test(priority = 47)
    public void location() throws InterruptedException {
        Delay(1);
        WebElement location = driver.findElement(By.xpath(e.location));
        location.click();
        WebElement location_field = driver.findElement(By.xpath(e.location_field));
        location_field.sendKeys("Live");
        Delay(2);
        WebElement location_field_1 = driver.findElement(By.xpath(e.location_field_1));
        location_field_1.click();
    }

    @Test(priority = 48)
    public void Move_items() throws InterruptedException {
        Delay(1);
        WebElement move_items = driver.findElement(By.xpath(e.move_items));
        move_items.click();
        ok_btn();
    }
    @Test(priority = 49)
    public void admin_login() throws InterruptedException {

        driver.get("http://admin.cartlow.lan/");
        Delay(1);
    }

    @Test(priority = 50)
    public void admin_email() {
        WebElement admin_email = driver.findElement(By.xpath(e.admin_email));
        admin_email.sendKeys("azeem.hassan@cartlow.com");
    }

    @Test(priority = 51)
    public void admin_password() {
        WebElement admin_password = driver.findElement(By.xpath(e.admin_password));
        admin_password.sendKeys("Cartlow@12");
    }

    @Test(priority = 52)
    public void admin_submitBtn() {
        WebElement admin_submit = driver.findElement(By.xpath(e.admin_submit));
        admin_submit.click();

    }
    @Test(priority = 53)
    public void Inventory_admin() throws InterruptedException {
        Delay(1);
        WebElement inventory_admin= driver.findElement(By.xpath(e.inventory_admin));
        inventory_admin.click();
    }
    @Test(priority = 54)
    public void Pending_content(){
        WebElement pending_content= driver.findElement(By.xpath(e.pending_content));
        pending_content.click();
    }


    @Test(priority = 55)
    public void PO_admin() throws InterruptedException {
        Delay(1);
        WebElement po_admin= driver.findElement(By.xpath(e.po_admin));
        po_admin.click();
        po_admin.sendKeys(po_number);
    }


    @Test(priority = 56)
    public void search_pc() throws InterruptedException {
        Delay(1);
        WebElement search_pc= driver.findElement(By.xpath(e.search_pc));
        search_pc.click();
    }

    @Test(priority = 57)
    public void Validate_admin() throws InterruptedException {
        Delay(1);
        WebElement Validate_admin= driver.findElement(By.xpath(e.Validate_admin));
        Validate_admin.click();
        Delay(3);

    }

    @Test(priority = 58)
    public void Mark_as_close() throws InterruptedException {
        Delay(4);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//        WebElement Element = driver.findElement(By.linkText("Mark all same items valid"));
//        js.executeScript("arguments[0].scrollIntoView();", Element);
//        Thread.sleep(1000);
        WebElement mark_as_close= driver.findElement(By.xpath(e.mark_as_close));
        mark_as_close.click();
        Delay(1);
        driver.switchTo().alert().accept();
    }
//    @Test(priority = 59)
//    public void error(ITestContext context) throws IOException, InterruptedException {
//        WebElement error = driver.findElement(By.xpath(e.error));
//        while (error.isDisplayed()) {
//
//            JavascriptExecutor js = (JavascriptExecutor) driver;
//            js.executeScript("window.scrollBy(0,250)", "");
//            Delay(2);
//            WebElement Select_parent_category= driver.findElement(By.xpath(e.Select_parent_category));
//            Select_parent_category.click();
//            Delay(1);
//            WebElement search_field= driver.findElement(By.xpath(e.search_field));
//            search_field.sendKeys("mobile");
//            search_field.click();
//
//            Delay(2);
//            WebElement online_price=driver.findElement(By.xpath(e.online_price));
//            online_price.sendKeys("100");
//            online_price.click();
//        }
//    }


//    @Test(priority = 59)
//    public void error() throws InterruptedException {
//        Delay(3);
//        WebElement error = driver.findElement(By.xpath(e.error));
//        while (error.isDisplayed()) {
//            JavascriptExecutor js = (JavascriptExecutor) driver;
//            js.executeScript("window.scrollBy(0,-250)");
//            Delay(2);
//            WebElement Select_parent_category= driver.findElement(By.xpath(e.Select_parent_category));
//            Select_parent_category.click();
//            Delay(3);
//            WebElement search_field= driver.findElement(By.xpath(e.search_field));
//            search_field.click();
//            search_field.sendKeys("mobile"+ Keys.chord(Keys.ENTER));
//            Delay(2);
//            WebElement Select_sub_category = driver.findElement(By.xpath(e.sub_category));
//            Select_sub_category.click();
//            Select_sub_category.sendKeys("m"+Keys.chord(Keys.ENTER));
//            Delay(2);
//            WebElement online_price=driver.findElement(By.xpath(e.online_price));
//            online_price.sendKeys("100");
//            Delay(2);
//            WebElement mark_as_close= driver.findElement(By.xpath(e.mark_as_close));
//            mark_as_close.click();
//            Thread.sleep(1500);
//            driver.switchTo().alert().accept();
//        }
//    }
    @Test(priority = 60)
    public void publish() throws InterruptedException {
        Inventory_admin();
        Delay(1);
        WebElement publish= driver.findElement(By.xpath(e.publish));
        publish.click();
        PO_admin();
        Thread.sleep(1000);
        search_pc();
    }

//    @Test(priority = 60)
//    public void publish_item() throws InterruptedException {
//        Thread.sleep(1000);
//        WebElement publish_item= driver.findElement(By.xpath(e.publish_item));
//        publish_item.click();
//    }
    @Test(priority = 61)
    public void publish_btn() throws InterruptedException {
        Thread.sleep(1000);
        WebElement publish_btn= driver.findElement(By.xpath(e.publish_btn));
        publish_btn.click();
    }
    @Test(priority = 62)
    public void publish_item_btn() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        Thread.sleep(1000);
        WebElement publish_item_btn= driver.findElement(By.xpath(e.publish_item_btn));
        publish_item_btn.click();
    }

}
