package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResizeWindow {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C://Users//anush//Selenium Jars and drivers//drivers//chromedriver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
          driver.get("http://www.facebook.com");
    /*    driver.manage().window().fullscreen();
        driver.navigate().back();
          driver.manage().window().maximize();
          driver.navigate().back();

     */
        Thread.sleep(1000);
        driver.manage().window().maximize(); // just makes the screen bigger
        Thread.sleep(1000);
        driver.manage().window().fullscreen(); // full screen doesn't show the tabs and the toolbar
       Thread.sleep(1000);
        driver.navigate().back();


    }
}
