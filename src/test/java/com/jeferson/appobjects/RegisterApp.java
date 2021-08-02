package com.jeferson.appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

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
    public WebElement sexoMasculinoRadio() { return driver.findElement(By.cssSelector("input[type='radio'][value='Male']")); }
    public WebElement sexoFemininoRadio() { return  driver.findElement(By.cssSelector("input[type='radio'][value='FeMale']")); }
    public WebElement hobbiesGriloCheckBox() { return driver.findElement(By.id("checkbox1")); }
    public WebElement hobbiesFilmesCheckBox() { return driver.findElement(By.id("checkbox2")); }
    public WebElement hobbiesHoqueiCheckBox() { return driver.findElement(By.id("checkbox3")); }
    public WebElement linguasSelect() { return driver.findElement(By.id("msdd")); }
    public Select linguasSelects() { return  new Select(driver.findElement(By.id("msdd"))); }
}
