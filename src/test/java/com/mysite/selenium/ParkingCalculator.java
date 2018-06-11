package com.mysite.selenium;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParkingCalculator {
    WebDriver driver = new ChromeDriver();
    String baseUrl = "http://adam.goucher.ca/parkcalc/";

    @Before
    public void setup() {
        driver.get(baseUrl);
    }

    @After
    public void teardown() {
        driver.close();
    }
}
