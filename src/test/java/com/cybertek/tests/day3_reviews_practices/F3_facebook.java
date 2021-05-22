package com.cybertek.tests.day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F3_facebook {
    public static void main(String[] args) throws InterruptedException {


        //TC #3: Facebook header verification
        // 1.Open Chrome browser

        //set up browser driver
        WebDriverManager.chromedriver().setup();

        //create driver instance and open browser
        WebDriver driver = new ChromeDriver();

        //maximize browser
        driver.manage().window().maximize();

        // 2.Go to https://www.facebook.com/
        driver.get("https://www.facebook.com");
        Thread.sleep(2000);

        //locate the WedElement
        WebElement headerText = driver.findElement(By.className("_8eso"));

        // 3.Verify header text is as expected:
        // Expected: “Connect with friends and the world around you on Facebook.”
        Thread.sleep(2000);
        String expectedHeader = "Connect with friends and the world around you on Facebook.";
        Thread.sleep(2000);
        String actualHeader = driver.getTitle();
        Thread.sleep(2000);

        if (actualHeader.equals(expectedHeader)) {
            System.out.println("HEADER VERIFICATION PASSED");
        } else {
            System.out.println("HEADER VERIFICATION FAILED");
        }
    }
}

