package com.cafekotlin.webpages

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory

class LoginPage(private val driver: WebDriver) {
    @FindBy(xpath = "/html/body/div[2]/div/form/div/input[1]")
    private val email: WebElement? = null;

    @FindBy(xpath = "/html/body/div[2]/div/form/div/input[2]")
    private val password: WebElement? = null;

    @FindBy(xpath = "/html/body/div[2]/div/form/div/div/button")
    private val loginBtn: WebElement? = null;

    init {
        PageFactory.initElements(driver, this)
    }

    fun loginUser(userLogin: String, userPassword: String) {
        email?.sendKeys(userLogin)
        password?.sendKeys(userPassword)
        loginBtn?.click()
    }
}