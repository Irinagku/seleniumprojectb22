package com.cybertek.tests.day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class F2_facebook {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to https://www.facebook.com
        driver.get("https://www.facebook.com");


        //3. Enter incorrect username
        driver.findElement(By.id("email")).sendKeys("iqiqiqiqi@gmail.comm");

        //4. Enter incorrect password
        driver.findElement(By.id("pass")).sendKeys("__728282" + Keys.ENTER);

        // 5. Verify title changed to:
        //Expected: “Log into Facebook”
        String expectedTitle = "Log into Facebook";
       Thread.sleep(2000);
        String actualTitle = driver.getTitle();
        Thread.sleep(2000);

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title verification PASSED");
        } else {
            System.out.println("Title verification FAILED");

        }
    }

}