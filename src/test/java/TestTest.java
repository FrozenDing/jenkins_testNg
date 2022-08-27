
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import static org.testng.Assert.*;
@Epic("类似一级目录")
@Feature("类似二级目录")
public class TestTest {
    @Test(description = "测试用例1")
    @Story("类似三级目录")
    public  void test01(){
        System.setProperty("webdriver.chrome.driver","D://Drivers//chromedriver.exe");
        //设置程序路径，因chrome.exe不在默认安装路径，selenium找不到
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.baidu.com");
        System.out.println(webDriver.getTitle());
    }

    @Test(description = "测试用例2")
    @Story("类似三级目录")
    public  void test02(){
        Assert.assertEquals(1,1);
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