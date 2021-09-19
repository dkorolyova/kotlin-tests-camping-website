package com.cafekotlin.webpages

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory

class HomePage(private val driver: WebDriver) {
    @FindBy(id = "user_logged_in")
    private val loggedInUser: WebElement? = null

    @FindBy(xpath = "/html/body/div[2]/div/div[1]/div[2]")
    private val freeCamping: WebElement? = null

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div[1]")
    private val caravanParks: WebElement? = null

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div[2]")
    private val motorhome: WebElement? = null

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div[3]")
    private val tent: WebElement? = null

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div[4]")
    private val glamping: WebElement? = null

    init {
        PageFactory.initElements(driver, this)
    }

    fun checkLogin() : Boolean {
        return loggedInUser != null
    }

    fun clickFreeCampsite() {
        freeCamping?.click()
    }

    fun clickCaravanParks() {
        caravanParks?.click()
    }

    fun clickMotorhome() {
        motorhome?.click()
    }

    fun clickTent() {
        tent?.click()
    }

    fun clickGlamping() {
        glamping?.click()
    }

}