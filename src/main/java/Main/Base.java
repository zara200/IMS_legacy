package Main;

import Utilities.Elements;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Base {
        Elements e=new Elements();

        public static WebDriver driver;

        @BeforeTest
        public void main()  {

//          WebDriverManager.chromedriver().setup();
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://ims-uae.cartlow.lan/login");

        }


        public static void fluentWait(int time){
            FluentWait fWait = new FluentWait(driver);
            fWait.withTimeout(Duration.ofSeconds(time));
        }

        public void iDelay(int j){driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(j));}

        public void iDelay (int i ,String xpath){

            WebDriverWait webDriverWait=new WebDriverWait(driver , Duration.ofSeconds(i));
            webDriverWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpath)));

        }


    public void Delay(int j) throws InterruptedException{


        for(int i=0; i<j; i++){
            Thread.sleep(1500);
        }

    }
    public void iwait(int a){
        driver.manage().timeouts().implicitlyWait(a, TimeUnit.SECONDS);


    }

//        public void loginFun(){
//            WebElement userName= driver.findElement(By.cssSelector ("#kt_sign_in_form > div:nth-child(3) > input"));
//
//            WebElement password= driver.findElement(By.cssSelector ("#kt_sign_in_form > div:nth-child(4) > input"));
//
//            WebElement SubmitBtn =driver.findElement(By.cssSelector( "#kt_sign_in_submit"));
//
//
//            // WebElement userName = driver.findElement(By.cssSelector("#kt_sign_in_form > div:nth-child(3) > input"));
//            // WebElement password = driver.findElement(By.cssSelector("#kt_sign_in_form > div:nth-child(4) > input"));
//            // WebElement SubmitBtn = driver.findElement(By.cssSelector("#kt_sign_in_submit"));
//
//
//            fluentWait(10);
//            userName.click();
//            userName.sendKeys("user");
//            fluentWait(10);
//            password.click();
//            password.sendKeys("pass");
//            fluentWait(10);
//            SubmitBtn.click();
//
//        }
    }


