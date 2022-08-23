
/**
 * @Author:dingrui
 * @date: 2022-08-21 02:29
 * interface：/yuqing/chat/list
 * 标题：在线会话框根据用户名或uuid查找全部对话
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class main {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D://Drivers//chromedriver.exe");
        //设置程序路径，因chrome.exe不在默认安装路径，selenium找不到
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.baidu.com");
        System.out.println(webDriver.getTitle());
        //关闭浏览器
        webDriver.quit();
    }

}

