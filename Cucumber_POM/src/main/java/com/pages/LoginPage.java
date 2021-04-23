package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {

    private WebDriver driver;

    //Locators
    private By username = By.xpath("//input[@id='txtUsername']");
    private By password = By.xpath("//input[@id='txtPassword']");
    private By loginButton = By.id("btnLogin123");


    //constructor
    public LoginPage (WebDriver driver){
        this.driver = driver;
    }

    public void launchURL(){
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    public String getLoginPageTitle(){
        return driver.getTitle();
    }

    public void enterUsername(String uname){
        driver.findElement(username).sendKeys(uname);
    }

    public void enterPassword(String pwd){
        driver.findElement(password).sendKeys(pwd);
    }

    public void clickLogin(){
        driver.findElement(loginButton).click();
    }
}
