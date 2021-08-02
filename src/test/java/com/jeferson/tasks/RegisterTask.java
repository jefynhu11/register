package com.jeferson.tasks;

import com.jeferson.appobjects.RegisterApp;
import com.jeferson.framework.tools.JsExecutor;
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

    public void cadastrarRegistar(){
        registerApp.firstNameFieldText().sendKeys("Jeferson");
        registerApp.lastNameFieldText().sendKeys("Lopes");
        registerApp.addressTextArea().sendKeys("Teste de mensagem");
        registerApp.emailFieldText().sendKeys("jefy@hotmail.com");
        registerApp.phoneFieldText().sendKeys("987654321");
        registerApp.sexoMasculinoRadio().click();
        registerApp.hobbiesFilmesCheckBox().click();
        registerApp.hobbiesHoqueiCheckBox().click();
        registerApp.linguasSelect().click();
//        registerApp.linguasSelects().selectByValue("árabe");
    }

}
