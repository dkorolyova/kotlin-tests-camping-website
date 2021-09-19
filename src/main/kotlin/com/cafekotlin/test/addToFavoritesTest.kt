package com.cafekotlin.test

import com.cafekotlin.UtilResources
import com.cafekotlin.webpages.FindCampingPage
import com.cafekotlin.webpages.HomePage
import com.cafekotlin.webpages.LoginPage
import org.testng.Assert
import org.testng.annotations.BeforeTest
import org.testng.annotations.Test
import java.net.URI

class AddToFavoritesTest() : TestBase() {
    @BeforeTest
    override fun setup() {
        super.setup()
        driver.get(URI(UtilResources.getProperties("loginPage")).toString())
        homePage = HomePage(driver)
        findCampingPage = FindCampingPage(driver)
    }
    private var homePage: HomePage? = null
    private var findCampingPage: FindCampingPage? = null

    @Test
    fun addToFavFindCamping() {
        val loginPage = LoginPage(driver)
        loginPage.loginUser()
        driver.get(URI(UtilResources.getProperties("findCampingPage")).toString())
        val findCampingPage = FindCampingPage(driver)
        findCampingPage.clickOnHeart()
        Assert.assertTrue(findCampingPage.checkHeartLogged())
    }
}