package com.mysite.selenium;

import org.openqa.selenium.*;
import org.junit.*;

public class ParkingCalculatorCalculation extends ParkingCalculator{

    @Test
    public void short_term_parking_calculation() {
        // Short term parking should be $2 per hour
        driver.findElement(By.id("EntryTime")).clear();
        driver.findElement(By.id("EntryTime")).sendKeys("6:00");

        driver.findElement(By.id("EntryDate")).clear();
        driver.findElement(By.id("EntryDate")).sendKeys("01/01/2016");

        driver.findElement(By.id("ExitTime")).clear();
        driver.findElement(By.id("ExitTime")).sendKeys("7:00");

        driver.findElement(By.id("ExitDate")).clear();
        driver.findElement(By.id("ExitDate")).sendKeys("01/01/2016");

        driver.findElement(By.name("Submit")).click();

        String CalculatedValue = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[4]/td[2]/span[1]/font/b")).getText();

        Assert.assertEquals("String doesn't match!",CalculatedValue,"$ 2.00");
    }
}

