package com.neurosoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

    WebDriver driver = new ChromeDriver();

    WebElement email= driver.findElement(By.xpath("//input[@id='email']"));

    WebElement password= driver.findElement(By.xpath("//input[@id='pass']"));
    WebElement loginButton= driver.findElement(By.xpath("//button[@name='login']"));
    public void loginMethod(){
        email.sendKeys("iasadul437@gmail.com");
        password.sendKeys("sfkdjsbvjds");
        //loginButton.sendKeys(Keys.ENTER);
        loginButton.click();
    }





}
