package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {

        //1 - setup the browser driver
        WebDriverManager.chromedriver().setup();



        //2 - create instance of selenium web driver
        // this line opens a browser
        WebDriver driver = new ChromeDriver();


        //this line will maximize the browser size
        driver.manage().window().maximize();

        //3 - get the page for Tesla.com
        driver.get("https://www.tesla.com");

        System.out.println("Current title: " + driver.getTitle());

      String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);

        //putting 3 seconds of wait to stop code for 3 seconds
        Thread.sleep(1000);

        //Going back using navigations
        driver.navigate().back();

        //putting 3 seconds of wait to stop code for 3 seconds
        Thread.sleep(1000);

        //Going forward using navigations
        driver.navigate().forward();

        //putting 3 seconds of wait to stop code for 3 seconds
        Thread.sleep(1000);

        //refreshing
        driver.navigate().refresh();

        //going to another URL using .to() method
        driver.navigate().to("https://www.google.com");

        System.out.println("Current title: " + driver.getTitle());

        currentUrl = driver.getCurrentUrl();

        System.out.println("currentUrl = " + currentUrl);

        //this method will close the current opened browser
        //it will only close 1 browser or 1 tab
        driver.close();
        //driver.quit();







    }
}
