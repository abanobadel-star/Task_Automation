package com.task.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id="username")
    WebElement username_txt;

    @FindBy(id = "password")
    WebElement password_txt;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement login_btn;

    @FindBy(xpath = "//a[@class='button secondary radius']")
    public WebElement logout_btn;

    public void login_fun()
    {
        username_txt.sendKeys("tomsmith");
        password_txt.sendKeys("SuperSecretPassword!");
        login_btn.click();
    }

}
