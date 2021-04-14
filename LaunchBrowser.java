package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) {
    //main method helps run/execute our codes
      //1.Set property (we need to mention what driver we are using and where those drivers are stored)
      System.setProperty("webdriver.chrome.driver","C://Users//anush//Selenium Jars and drivers//drivers//chromedriver/chromedriver.exe");
              //"webdriver.chrome.driver" is a in-built feature.
         //for windows we add .exe , change the slash if it doesn't work

        WebDriver driver=new ChromeDriver(); //launch the browser
        driver.get("https://www.google.com"); //navigate to the specific url

        String url= driver.getCurrentUrl(); //getting current url
        System.out.println(url);

        String title= driver.getTitle(); //getting the title of the page
        System.out.println(title);
        driver.quit();
    }
}
