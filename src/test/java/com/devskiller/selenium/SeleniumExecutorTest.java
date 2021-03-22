package com.devskiller.selenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertEquals;

public class SeleniumExecutorTest extends BaseSeleniumTest {

    @Test
    public void shouldInputValues() {
        webDriver.get("http://localhost:8089/index.html");
        SeleniumExecutor executor = new SeleniumExecutor(webDriver);

        executor.getDropdownValues();
//        executor.setInput("test input");
        
        //ข้อที่ 1
        String[] dropDown = {"Volvo", "Fiat", "Opel", "Audi", "BMW", "Toyota"};
        new SeleniumExecutorExtension(webDriver).setDropdownValues(dropDown);

        //ข้อที่ 2
        String[] inputs = new SeleniumExecutorExtension(webDriver).getInput();
        assertEquals("test input", inputs[0]);
        assertEquals("test input", inputs[1]);
        assertEquals("test input", inputs[2]);
        for (String var : inputs) {
            System.out.println(var);
        }

        
    }
}
