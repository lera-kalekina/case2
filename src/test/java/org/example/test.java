package org.example;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestConcatenation {

    @Test
    public void testConcatenation() {

        System.setProperty("webdriver.chrome.driver","путь к драйверу");
        WebDriver wd = new ChromeDriver();

        wd.get("http://testsheep.com/");

        // скролим страницу вниз
        wd.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);

        while(wd.findElements(By.class_name("build")).size()>1){
            wd.findElement(By.partialLinkText("Prototype")).click();
        }

        wd.findElement(wd.findElement(By.name("string1")).clear();
        Продолжи
        for(int i=0; i<2; i++){
            wd.findElement(By.name(“string”+i)).sendKeys(“gs”);
        };
        wd.findElement(By.name(“operator”)).click(); or(int i=0; i<2; i++){
            wd.findElement(By.name(“string”+i)).sendKeys(“gs”);
        };
        wd.findElement(By.name(“operator”)).click();

        if(wd.findElement(By.id("result")).getText().contains("gsbu")){

            System.out.print("Тест пройден");
        }else{

            Assert.fail("Тест не пройден");

        }
    }
}