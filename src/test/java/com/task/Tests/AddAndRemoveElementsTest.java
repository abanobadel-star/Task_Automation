package com.task.Tests;

import com.task.pages.AddAndRemoveElementsPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AddAndRemoveElementsTest {
    public WebDriver driver;
    AddAndRemoveElementsPage addAndRemoveElementsobject;

    @BeforeClass()
    public void start_driver() {

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);      //implicit wait to make page load and element
        driver.manage().window().maximize();              //to maximize window

    }
    @Test()
    public void Add_element() throws InterruptedException {
        addAndRemoveElementsobject=new AddAndRemoveElementsPage(driver);
        addAndRemoveElementsobject.add_element();
        Thread.sleep(2000);
        Assert.assertTrue(addAndRemoveElementsobject.RemoveElements_Btn.isDisplayed());
        addAndRemoveElementsobject.remove_element();
    }
    @Test()
    public void Remove_elements() throws InterruptedException {
        addAndRemoveElementsobject=new AddAndRemoveElementsPage(driver);
        addAndRemoveElementsobject.add_element();
        Thread.sleep(2000);
        addAndRemoveElementsobject.remove_element();
      //  Assert.assertFalse(addAndRemoveElementsobject.RemoveElements_Btn.isDisplayed());
    }

    @AfterClass()
    public void tear_down()
    {
        driver.close();
    }
}
