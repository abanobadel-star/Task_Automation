package com.task.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddAndRemoveElementsPage extends PageBase{

    public AddAndRemoveElementsPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath ="//button[@onclick='addElement()']")
    public WebElement AddElements_Btn;

    @FindBy(xpath ="//button[@onclick='deleteElement()']")
    public WebElement RemoveElements_Btn;

    public void add_element()
    {
        AddElements_Btn.click();
    }
    public void remove_element()
    {
        RemoveElements_Btn.click();
    }


}
