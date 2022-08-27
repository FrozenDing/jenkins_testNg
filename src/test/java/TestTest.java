
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import static org.testng.Assert.*;
public class TestTest {
    @Test
    public  void test01(){
//        System.setProperty("webdriver.chrome.driver","D://Drivers//chromedriver.exe");
//        //设置程序路径，因chrome.exe不在默认安装路径，selenium找不到
//        WebDriver webDriver = new ChromeDriver();
//        webDriver.get("https://www.baidu.com");
//        System.out.println(webDriver.getTitle());
    }
    @BeforeTest
    public void beforeTest() {
        System.out.println("beforeTest");
    }
    @AfterTest
    public void afterTest() {
        System.out.println("afterTest");
    }
    @BeforeClass
    public void beforeClass() {
        System.out.println("beforeClass");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("afterClass");
    }

    @BeforeGroups(groups = "group1")
    public void beforeGroups() {
        System.out.println("beforeGroups");
    }

    @AfterGroups(groups = "group1")
    public void afterGroups() {
        System.out.println("afterGroups");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("beforeMethod");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("afterMethod");
    }
}