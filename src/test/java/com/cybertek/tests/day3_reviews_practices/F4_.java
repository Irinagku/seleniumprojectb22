package com.cybertek.tests.day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F4_{
    public static void main(String[] args) {
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to https://www.facebook.com
        driver.get("https://www.facebook.com");

        //3. Verify “Create a page” link href value contains text:
        //Expected: “registration_form”
        WebElement createAPageLink = driver.findElement(By.className("_8esh"));
        String actualHrefValue = createAPageLink.getAttribute("href");
        String expectedHrefValue = "registration_form";

        if (actualHrefValue.contains(expectedHrefValue)) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }
    }
}





