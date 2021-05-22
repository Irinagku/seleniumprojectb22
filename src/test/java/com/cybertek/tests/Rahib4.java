package com.cybertek.tests;
/*
1. Use WebDriverFactory method to call the Google Chrome

2. Command Chrome Browser to open YouTube.com

3. Maximize the screen

4. Locate YouTube search bar By xPath

5. Create a WebElement from the located Search Bar xPath

6. Reuse the created WebElement to send search content into the serach bar and send "Blue - One Love" to the search bar
Put the whole thread to Sleep for 3 seconds

7. Resuse the created WebElement and SUBMIT the search
Put the whole thread to Sleep for 3 seconds

8. Click on the first Music video named: Blue - One Love (Official Music Video) (FEEL FREE TO USE WHATEVER LOCATER YOU WANT - JUST CLICK ON THAT VIDEO)

then...

Disregard add rolls - / SKipIt - and enjoy some good oldschool song 😉
 */

import com.cybertek.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Rahib4 {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://Youtube.com");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();
       WebElement searchBar = driver.findElement(By.xpath(("//input[@id='search']")));
       searchBar.sendKeys("Blue - One Love");
       driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
       searchBar.submit();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
      WebElement clip = driver.findElement(By.xpath("//yt-formatted-string[@aria-label='Blue - One Love (Official Music Video) by Relie Helei 4 years ago 3 minutes, 32 seconds 1,095,458 views']"));
     clip.click();







    }
}
