package com.mysite.selenium;

import org.openqa.selenium.*;
import org.junit.*;
import java.util.List;
import org.openqa.selenium.support.ui.Select;

public class ParkingCalculatorHomepage extends ParkingCalculator{

    @Test
    public void page_title_check() {
        String expectedTitle = "Parking Calculator";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    @Test
    public void lot_dropdown_content_check() {
        String[] expectedDropDownValues = {"Short-Term Parking",
                "Economy Parking",
                "Long-Term Surface Parking",
                "Long-Term Garage Parking",
                "Valet Parking"};

        WebElement dropDownListBox = driver.findElement(By.id("Lot"));

        Select dropDown = new Select(dropDownListBox);

        List<WebElement> options = dropDown.getOptions();

        for(WebElement we:options)
        {
            boolean match = false;
            for (int i=0; i<expectedDropDownValues.length; i++){
                if (we.getText().equals(expectedDropDownValues[i])){
                    match = true;
                }
            }
            Assert.assertTrue(match);
        }
    }
}

