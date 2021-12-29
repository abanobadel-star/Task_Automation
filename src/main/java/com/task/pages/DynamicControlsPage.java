package com.task.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DynamicControlsPage extends PageBase {

    public DynamicControlsPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//input[@type='checkbox']")
    public WebElement checkbox;

    @FindBy(xpath = "//button[@type='button']")
    public WebElement remove_btn;

    @FindBy(xpath = "//button[@onclick='swapCheckbox()']")
    public WebElement add_btn;

    @FindBy(xpath = "//button[@onclick='swapInput()']")
    public WebElement enable_btn;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement Text_filed;


    public void  clickONCheckbox()
    {
        checkbox.click();
    }
    public void clickONRemoveBtn()
    {
        remove_btn.click();
    }
    public void clickOnEnableButton()
    {
        enable_btn.click();
    }
    public void writeOnTextFiled()
    {
        Text_filed.click();
        Text_filed.sendKeys("hello");
    }
}
