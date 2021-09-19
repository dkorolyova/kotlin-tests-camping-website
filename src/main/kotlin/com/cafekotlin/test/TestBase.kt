package com.cafekotlin.test

import com.cafekotlin.UtilResources
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.testng.annotations.AfterTest
import org.testng.annotations.BeforeTest
import java.util.concurrent.TimeUnit

abstract class TestBase {

    lateinit var driver: WebDriver
        private set

    @BeforeTest
    open fun setup() {
        System.setProperty(UtilResources.getProperties("nameDriver"),
            UtilResources.getProperties("pathDriver"))
        driver = ChromeDriver()
        driver?.manage()?.timeouts()?.implicitlyWait(10, TimeUnit.SECONDS)
        driver?.manage()?.window()?.maximize()
    }

    @AfterTest
    fun driverClose() {
//        driver?.close();
    }
}