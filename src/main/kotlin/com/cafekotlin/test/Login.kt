package com.cafekotlin.test

import com.cafekotlin.UtilResources
import com.cafekotlin.webpages.LoginPage
import com.cafekotlin.webpages.HomePage
import org.testng.Assert
import org.testng.annotations.BeforeTest
import org.testng.annotations.Test
import java.net.URI

class Login() : TestBase() {

    @BeforeTest
    override fun setup() {
        super.setup();
        driver.get(URI(UtilResources.getProperties("loginPage")).toString())
    }

    @Test
    fun loginUser() {
        val loginPage = LoginPage(driver)
        val userLogin = UtilResources.getProperties("userLogin")
        val userPassword = UtilResources.getProperties("userPassword")
        loginPage.loginUser(userLogin, userPassword)

        val homePage = HomePage(driver)
        Assert.assertTrue(homePage.checkLogin())
    }
}