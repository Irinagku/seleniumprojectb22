package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo_practice {
    public static void main(String[] args) {
        // setup browser driver
        WebDriverManager.chromedriver().setup();
        
        // this line opens empty browser
        WebDriver driver = new ChromeDriver();
        
        // maximize browser 
        driver.manage().window().maximize();
        
        // go to yahoo.com
        driver.get(("https://www.yahoo.com"));
        
        //expected : "Yahoo"
        String expectedTitle = "Yahoo";
        System.out.println("expectedTitle = " + expectedTitle);
        

        String actualTitle = driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);
        //creating our verification
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title is as expected. Verification PASSED!");
        }else{
            System.out.println("Title is not as expected. Verification FAILED!");
        }
        //closing the browser
        driver.close();
    }
}
