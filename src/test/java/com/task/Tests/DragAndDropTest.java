package com.task.Tests;

import com.task.pages.AddAndRemoveElementsPage;
import com.task.pages.DragAndDropPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DragAndDropTest {
    public WebDriver driver;
    DragAndDropPage dragAndDropPageobject;
    @BeforeClass()
    public void start_driver() {

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/drag_and_drop");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);      //implicit wait to make page load and element
        driver.manage().window().maximize();              //to maximize window

    }
    @Test()
    public void DragAndDrop() throws InterruptedException {
        dragAndDropPageobject=new DragAndDropPage(driver);
        Actions actions=new Actions(driver);
        actions.dragAndDrop(dragAndDropPageobject.Drag,dragAndDropPageobject.Drop).build().perform();
    }
    @AfterClass()
    public void tear_down()
    {
        driver.close();
    }
}
