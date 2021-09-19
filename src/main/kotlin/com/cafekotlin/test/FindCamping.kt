package com.cafekotlin.test

import com.cafekotlin.UtilResources
import com.cafekotlin.webpages.FindCampingPage
import org.testng.Assert
import org.testng.annotations.BeforeTest
import org.testng.annotations.Test
import java.net.URI

class FindCamping() : TestBase() {
    @BeforeTest
    override fun setup() {
        super.setup();
        driver?.get(URI(UtilResources.getProperties("findCampingPage")).toString())
    }

    @Test
    fun clickHeart() {
        val findCampingPage = FindCampingPage(driver!!)
        findCampingPage.clickOnHeart()
        Assert.assertTrue(findCampingPage.infoBoxDisplayed())
    }

    @Test
    fun clickSortPopularity() {
        val findCampingPage = FindCampingPage(driver!!)
        findCampingPage.clickSortPopularity()
        Assert.assertTrue(findCampingPage.mostPopularFirst() > findCampingPage.mostPopularSecond())
    }

    @Test
    fun clickSortRating() {
        val findCampingPage = FindCampingPage(driver!!)
        findCampingPage.clickSortRating()
        Assert.assertTrue(findCampingPage.mostRatedFirst() > findCampingPage.mostRatedSecond())
    }
}