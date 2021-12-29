package com.task.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FirstPage  extends PageBase{

    public FirstPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id="email")
    WebElement email;

    @FindBy(id = "password")
    WebElement password;



    public void login ()
    {
        email.sendKeys("FinanceDepartmentManager");
        password.sendKeys("hello");
    }
}
