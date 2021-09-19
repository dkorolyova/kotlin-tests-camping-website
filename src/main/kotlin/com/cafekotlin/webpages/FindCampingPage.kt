package com.cafekotlin.webpages

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory

class FindCampingPage(private val driver: WebDriver) {
    @FindBy(css = "span.common")
    private val heart: WebElement? = null

    @FindBy(xpath = "./html/body/div[3]")
    private val infoBox: WebElement? = null

    @FindBy(xpath = "/html/body/div[2]/div/form/div[2]/div[2]/article[1]/div/div[3]/a/p")
    private val mostPopularFirst: WebElement? = null

    @FindBy(xpath = "/html/body/div[2]/div/form/div[2]/div[2]/article[2]/div/div[3]/a/p")
    private val mostPopularSecond: WebElement? = null

    @FindBy(id = "dropdownMenuButton")
    private val dropdownMenuButton: WebElement? = null

    @FindBy(xpath = "/html/body/div[2]/div/form/div[1]/div/div/ul/li[2]")
    private val popularity: WebElement? = null

    @FindBy(xpath = "/html/body/div[2]/div/form/div[1]/div/div/ul/li[1]")
    private val rating: WebElement? = null

    @FindBy(xpath = "/html/body/div[2]/div/form/div[2]/div[2]/article[1]/div/div[3]/div")
    private val mostRatedFirst: WebElement? = null

    @FindBy(xpath = "/html/body/div[2]/div/form/div[2]/div[2]/article[2]/div/div[3]/div")
    private val mostRatedSecond: WebElement? = null

    @FindBy(id = "customCheck27")
    private val freeCampsite: WebElement? = null

    @FindBy(id = "customCheck1")
    private val caravanParks: WebElement? = null

    @FindBy(id = "customCheck2")
    private val motorhome: WebElement? = null

    @FindBy(id = "customCheck3")
    private val tent: WebElement? = null

    @FindBy(id = "customCheck4")
    private val glamping: WebElement? = null

    init {
        PageFactory.initElements(driver, this)
    }

    fun clickOnHeart() {
        heart?.click();
    }

    fun infoBoxDisplayed(): Boolean {
        if (infoBox == null) {
            return false
        }
        return infoBox.isDisplayed
    }

    fun clickSortPopularity() {
        dropdownMenuButton?.click();
        popularity?.click();
    }

    fun clickSortRating() {
        dropdownMenuButton?.click();
        rating?.click();
    }

    fun mostPopularFirst() : Int {
        if (mostPopularFirst?.getAttribute("data-total_reviews") == null) {
            return 0
        }
        return mostPopularFirst.getAttribute("data-total_reviews").toInt();
    }

    fun mostPopularSecond() : Int {
        if (mostPopularSecond?.getAttribute("data-total_reviews") == null) {
            return 0
        }
        return mostPopularSecond.getAttribute("data-total_reviews").toInt();
    }

    fun mostRatedFirst() : Double {
        if (mostRatedFirst?.getAttribute("data-total_rated") == null) {
            return 0.0
        }
        return mostRatedFirst.getAttribute("data-total_rated").toDouble();
    }

    fun mostRatedSecond() : Double {
        if (mostRatedSecond?.getAttribute("data-total_rated") == null) {
            return 0.0
        }
        return mostRatedSecond.getAttribute("data-total_rated").toDouble();
    }

    fun freeCampsiteChecked() : Boolean {
        return freeCampsite?.isEnabled  != null
    }

    fun caravanParksChecked() : Boolean {
        return caravanParks?.isEnabled  != null
    }

    fun motorhomeChecked() : Boolean {
        return motorhome?.isEnabled != null
    }

    fun tentChecked() : Boolean {
        return tent?.isEnabled != null
    }

    fun glampingChecked() : Boolean {
        return glamping?.isEnabled != null
    }

}