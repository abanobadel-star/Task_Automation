package com.task.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DragAndDropPage extends PageBase {

    public DragAndDropPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id="column-a")
   public  WebElement Drag;

    @FindBy(id = "column-b")
   public  WebElement Drop;

}
