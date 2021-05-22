package com.cybertek.tests.day5_FindElements_checkboxes;

import com.cybertek.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class PO_FindElements_Practice {
    public static void main(String[] args) {
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        //2. Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");
       List<WebElement> listOfLinks = driver.findElements(By.xpath("//body//a"));
        
        //3. Print out the texts of all links
        
        for(WebElement each : listOfLinks){
            System.out.println(each.getText());
            
            int numberOfLinks = listOfLinks.size();
            System.out.println("numberOfLinks = " + numberOfLinks);
        }




        //4. Print out how many total link


    }
}
