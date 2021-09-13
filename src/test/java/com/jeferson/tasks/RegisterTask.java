package com.jeferson.tasks;

import com.jeferson.appobjects.RegisterApp;
import com.jeferson.framework.tools.JsExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class RegisterTask {

    private final WebDriver driver;
    private final RegisterApp registerApp;
    private final JsExecutor jsExecutor;

    public RegisterTask(WebDriver driver){
        this.driver = driver;
        registerApp = new RegisterApp(driver);
        jsExecutor = new JsExecutor();
    }

    public void cadastrarRegistar() throws InterruptedException {
        registerApp.firstNameFieldText().sendKeys("Jeferson");
        registerApp.lastNameFieldText().sendKeys("Lopes");
        registerApp.addressTextArea().sendKeys("Teste de mensagem");
        registerApp.emailFieldText().sendKeys("jefy@hotmail.com");
        registerApp.phoneFieldText().sendKeys("987654321");
        registerApp.sexoMasculinoRadio().click();
        registerApp.hobbiesFilmesCheckBox().click();
        registerApp.hobbiesHoqueiCheckBox().click();
        registerApp.languages().click();
        registerApp.languagesOption("Dutch").click();
        registerApp.languagesOption("Czech").click();
        registerApp.skillsSelect().selectByValue("Android");
        registerApp.countrySelect().selectByValue("Afghanistan");
        /*Opção 1*/
//        registerApp.selectCountrySelect().selectByVisibleText("Japan");
        /*Opção 2*/
        registerApp.selectCountryCheckBox().click();
        registerApp.selectCountryFieldText().sendKeys("New"+ Keys.ENTER);
        registerApp.dateBirthYearSelect().selectByValue("1992");
        registerApp.dateBirthMonthSelect().selectByValue("May");
        registerApp.dateBirthDaySelect().selectByValue("3");
        Thread.sleep(3000);


    }

}
