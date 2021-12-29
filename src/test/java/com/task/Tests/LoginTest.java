package com.task.Tests;

import com.task.pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest  {
    public  WebDriver driver;
    LoginPage loginPage;

    @BeforeClass()
    public void start_driver() {

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/login");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);      //implicit wait to make page load and element
        driver.manage().window().maximize();              //to maximize window
    }
    @Test()
    public void validate_login_function()
    {
        loginPage=new LoginPage(driver);
        loginPage.login_fun();
        Assert.assertTrue(loginPage.logout_btn.isDisplayed());
    }
    @AfterClass()
    public void tear_down()
    {
        driver.close();
    }
}

