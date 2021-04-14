package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C://Users//anush//Selenium Jars and drivers//drivers//chromedriver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
         driver.get("https://www.amazon.com");

        String url=driver.getCurrentUrl();
        System.out.println(url);

        String title = driver.getTitle();
        System.out.println(title);
        driver.navigate().to("https://facebook.com"); //it will override the existing browser
        //since it has the same object WebDriver driver=new ChromeDriver();, and on same browser, new url will override the older one
        //if we want to open new separate browser, we have to create a new object

        Thread.sleep(1000);

       driver.navigate().back();
       driver.navigate().forward();

        Thread.sleep(1000);
       driver.navigate().refresh();

       Thread.sleep(1000);
       driver.close();
        driver.quit();

     /* difference between .navigate() and .get()
     * get() can only only navigate to the url
     * navigate() can perform other actions including navigating (refresh, wait to load, forward, backward)
     * get() will not keep the history of the browser but navigate() will
      */
    }
}
