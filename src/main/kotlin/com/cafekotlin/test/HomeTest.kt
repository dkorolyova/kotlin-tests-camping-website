package com.cafekotlin.test

import com.cafekotlin.UtilResources
import com.cafekotlin.webpages.FindCampingPage
import com.cafekotlin.webpages.HomePage
import org.testng.Assert
import org.testng.annotations.BeforeTest
import org.testng.annotations.Test
import java.net.URI

class HomeTest() : TestBase() {
    @BeforeTest
    override fun setup() {
        super.setup()
        driver?.get(URI(UtilResources.getProperties("homePage")).toString())
        homePage = HomePage(driver)
        findCampingPage = FindCampingPage(driver)
    }

    private var homePage: HomePage? = null
    private var findCampingPage: FindCampingPage? = null

    @Test
    fun freeCampsite() {
        homePage?.clickFreeCampsite()
        val freeCampsite = findCampingPage?.freeCampsiteChecked()
        Assert.assertTrue(freeCampsite !== null)
    }

    @Test
    fun caravanParks() {
        homePage?.clickCaravanParks()
        val caravanParks = findCampingPage?.caravanParksChecked()
        Assert.assertTrue(caravanParks !== null)
    }

    @Test
    fun motorhome() {
        homePage?.clickMotorhome()
        val motorhome = findCampingPage?.motorhomeChecked()
        Assert.assertTrue(motorhome !== null)
    }

    @Test
    fun tent() {
        homePage?.clickTent()
        val tent = findCampingPage?.tentChecked()
        Assert.assertTrue(tent !== null)
    }

    @Test
    fun glamping() {
        homePage?.clickGlamping()
        val glamping = findCampingPage?.glampingChecked()
        Assert.assertTrue(glamping !== null)
    }
}