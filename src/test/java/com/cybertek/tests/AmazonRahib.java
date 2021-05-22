package com.cybertek.tests;


import com.cybertek.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonRahib {
    public static void main(String[] args) {
       // Amazon.com Search "Wooden Spoon"

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://Amazon.com");
        //1. Build the WebDriverManager and call Chrome Driver


       // 2. Go to Amazon.com

       // 3. Locate the amazon search bar

        WebElement searchBar = driver.findElement((By.xpath("//input[@id='twotabsearchtextbox']")));

       // 4. Send "Wooden Spoon" and click search


        searchBar.sendKeys("Wooden Spoon" + Keys.ENTER);

        String actualTile = driver.getTitle();
        String expectedTitle = "Amazon.com : Wooden Spoon";

        //5. Check the title with if conditon
       if(expectedTitle.equals(actualTile)){
           System.out.println("PASSED ! ");
       }else{
           System.out.println("FAILED ! ");
       }

    }
}
