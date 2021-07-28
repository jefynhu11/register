package com.jeferson.appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterApp {

    private final WebDriver driver;

    public RegisterApp(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement firstNameFieldText() {
        return driver.findElement(By.cssSelector("input[placeholder='First Name']"));
    }
    public WebElement lastNameFieldText() {
        return driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
    }
    public WebElement addressTextArea() {
        return driver.findElement(By.cssSelector("textarea[ng-model]"));
    }
    public WebElement emailFieldText() {
        return driver.findElement(By.cssSelector("input[type='email']"));
    }
    public WebElement phoneFieldText() {
        return driver.findElement(By.cssSelector("input[type='tel']"));
    }
}
