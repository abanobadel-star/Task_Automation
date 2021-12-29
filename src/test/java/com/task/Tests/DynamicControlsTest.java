package com.task.Tests;

import com.task.pages.AddAndRemoveElementsPage;
import com.task.pages.DynamicControlsPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DynamicControlsTest {
    public WebDriver driver;
    DynamicControlsPage dynamicControlsPage ;
    @BeforeClass()
    public void start_driver() {

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/dynamic_controls");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);      //implicit wait to make page load and element
        driver.manage().window().maximize();              //to maximize window

    }
    @Test()
    public void CheckBoxFunction() throws InterruptedException {
        dynamicControlsPage=new DynamicControlsPage(driver);
        dynamicControlsPage.clickONCheckbox();
        dynamicControlsPage.clickONRemoveBtn();
        Assert.assertTrue(dynamicControlsPage.add_btn.isDisplayed());
    }
    @Test()
    public void EnableFunction() throws InterruptedException {
        dynamicControlsPage=new DynamicControlsPage(driver);
        dynamicControlsPage.clickOnEnableButton();
        Thread.sleep(4000);
        dynamicControlsPage.writeOnTextFiled();
    }
    @AfterClass()
    public void tear_down()
    {
        driver.close();
    }
}
