package Gebbish.Automation

import Gebbish.support.API.ApClass
import Gebbish.support.Issues.IssuePage
import Gebbish.support.Mailing_Lists.MailingListPage
import Gebbish.support.Manual.CurrentManual
import Gebbish.support.Manual.Current_ManualPage

import geb.spock.GebReportingSpec
import groovy.transform.PackageScope
import org.openqa.selenium.Keys

/**
*  Created by rohit on 3/9/2016.
*/
class AutomationPageSpec extends GebReportingSpec{

def "At Manual Page"() {

    when:
    to Current_ManualPage
    waitFor {$("#main > h1:nth-child(1)").displayed}

    then:
    to CurrentManual
}
    def "HomePage" (){
        when:
        to Current_ManualPage
        waitFor {$("#main > h1:nth-child(1)").displayed}
        then:
        $("#main > h1:nth-child(1)").text()== "What is it?"
    }

    def "HomePage Hihglights"(){
        when:
        to Current_ManualPage
        waitFor {$("#main > h1:nth-child(1)").displayed}
        then:
        $("#sidebar > h1:nth-child(1)").text() == "Highlights"
        $("#sidebar > h1:nth-child(1)").height == 25
        $("#sidebar > h1:nth-child(1)").width == 185
        $("#sidebar > h1:nth-child(1)").css("color") == "rgba(108, 110, 58, 1)"
    }
    def "Homepage Links"() {
        when:
        to Current_ManualPage
        waitFor {$("#main > h1:nth-child(1)").displayed}
        and:
        $("#sidebar > ul > li.crossbrowser > a").text() == "Cross Browser"
        $("#sidebar > ul > li.crossbrowser > a").css("display") == "block"
        $("#sidebar > ul > li.crossbrowser > a").css("color") == "rgba(102, 102, 102, 1)"
        then:
        $("#sidebar > ul > li.crossbrowser > a").click()
        $("#sidebar > ul > li.crossbrowser.selected > a").css("color") == "rgba(248, 143, 38, 1)"
        $("#sidebar > ul > li.crossbrowser.selected > a").css("font-weight") == "700"
        $("#main > h1:nth-child(1)").text() == "Cross Browser Automation"

        when:
        $("#sidebar > ul > li.pages > a").text() == "Page Objects"
        $("#sidebar > ul > li.pages > a").css("display") == "block"
        $("#sidebar > ul > li.pages > a").css("color") == "rgba(102, 102, 102, 1)"

        then:
        $("#sidebar > ul > li.pages > a").click()
        $("#main > h1").text() == "Page Objects"
        $("#sidebar > ul > li.pages.selected > a").css("color") == "rgba(248, 143, 38, 1)"
        $("#sidebar > ul > li.pages.selected > a").css("font-weight") == "700"

        when:
        $("#sidebar > ul > li.async > a").text() == "Asynchronous Pages"
        $("#sidebar > ul > li.async > a").css("display") == "block"
        $("#sidebar > ul > li.async > a").css("color") == "rgba(102, 102, 102, 1)"

        then:
        $("#sidebar > ul > li.async > a").click()
        $("#sidebar > ul > li.async.selected > a").text() == "Asynchronous Pages"
        $("#sidebar > ul > li.async.selected > a").css("color") == "rgba(248, 143, 38, 1)"
        $("#sidebar > ul > li.async.selected > a").css("font-weight") == "700"

        when:
        $("#sidebar > ul > li.testing > a").text() == "Testing"
        $("#sidebar > ul > li.testing > a").css("display") == "block"
        $("#sidebar > ul > li.testing > a").css("color") == "rgba(102, 102, 102, 1)"
        then:
        $("#sidebar > ul > li.testing > a").click()
        $("#sidebar > ul > li.testing.selected > a").text() == "Testing"
        $("#sidebar > ul > li.testing.selected > a").css("color") == "rgba(248, 143, 38, 1)"
        $("#sidebar > ul > li.testing.selected > a").css("font-weight") == "700"

        when:
        $("#sidebar > ul > li.integration > a").text() == "Build Integration"
        $("#sidebar > ul > li.integration > a").css("display") == "block"
        $("#sidebar > ul > li.integration > a").css("color") == "rgba(102, 102, 102, 1)"

        then:
        $("#sidebar > ul > li.integration > a").click()
        $("#sidebar > ul > li.integration.selected > a").text()=="Build Integration"
        $("#sidebar > ul > li.integration.selected > a").css("color") == "rgba(248, 143, 38, 1)"
        $("#sidebar > ul > li.integration.selected > a").css("font-weight") == "700"

    }

    def "PageObject"(){
        when:
        to Current_ManualPage
        waitFor {$("#main > h1:nth-child(1)").displayed}
        and:
        $("#sidebar > ul > li.pages > a").text() == "Page Objects"
        $("#sidebar > ul > li.pages > a").css("display") == "block"
        $("#sidebar > ul > li.pages > a").css("color") == "rgba(102, 102, 102, 1)"
        then:
        $("#sidebar > ul > li.pages > a").click()
        $("#main > h1").text() == "Page Objects"
        $("#sidebar > ul > li.pages.selected > a").css("color") == "rgba(248, 143, 38, 1)"
        $("#sidebar > ul > li.pages.selected > a").css("font-weight") == "700"
    }

def "Navigation Check for Gebbish.org"(){

    when:
    to Current_ManualPage
    waitFor {$("#main > h1:nth-child(1)").displayed}
    $("#header-content > ul > li:nth-child(1) > span").text() == "Manual"
    then:
    $("#header-content > ul > li:nth-child(1) > span").height == 35
    $("#header-content > ul > li:nth-child(1) > span").width == 95
    $("#header-content > ul > li:nth-child(1) > span").css("display") == "block"
    $("#header-content > ul > li:nth-child(1) > span").css("color") == "rgba(243, 162, 81, 1)"

    when:
    $("#header-content > ul > li:nth-child(2) > span").text() == "API"

    then:
    $("#header-content > ul > li:nth-child(2) > span").height == 35
    $("#header-content > ul > li:nth-child(2) > span").width == 59
    $("#header-content > ul > li:nth-child(2) > span").css("color") == "rgba(243, 162, 81, 1)"
    $("#header-content > ul > li:nth-child(2) > span").css("display") == "block"

    when:
    $("#header-content > ul > li:nth-child(3) > a").text() == "Mailing Lists"

    then:
    $("#header-content > ul > li:nth-child(3) > a").height == 35
    $("#header-content > ul > li:nth-child(3) > a").width == 136
    $("#header-content > ul > li:nth-child(3) > a").css("color") == "rgba(243, 162, 81, 1)"
    $("#header-content > ul > li:nth-child(3) > a").css("display") == "block"

    when:
    $("#header-content > ul > li:nth-child(4) > a").text() == "Issues"

    then:
    $("#header-content > ul > li:nth-child(4) > a").height == 35
    $("#header-content > ul > li:nth-child(4) > a").width == 83
    $("#header-content > ul > li:nth-child(4) > a").css("color") == "rgba(243, 162, 81, 1)"
    $("#header-content > ul > li:nth-child(4) > a").css("display") == "block"

}

def "Current Manual Logo Spec"(){
    when:
    to CurrentManual
    waitFor {$("#header > h1").displayed}
    then:
    $("#preamble > div > div > div > img"). height == 114
    $("#preamble > div > div > div > img").width == 333
}

def "The Book Of geb Page Spec"(){
    when:
    to CurrentManual
    waitFor {$("#header > h1").displayed}

    and:
    $("#toc > ul > li:nth-child(1) > a").click()

    then:
    $("#introduction > a").text()=="1. Introduction"
    $("#introduction > a").css("color")== "rgba(186, 57, 37, 1)"
    $("#toc > ul > li:nth-child(1) > a").css("color")== "rgba(29, 75, 143, 1)"
    $("#toc > ul > li:nth-child(4) > a").click()
    $("#toc > ul > li:nth-child(4) > ul > li:nth-child(14) > a").click()
    $("#toc > ul > li:nth-child(5) > ul > li:nth-child(10) > a").click()


}
    def "At Mailing List page"(){
        when:
        to MailingListPage
        waitFor {$("#main > h1:nth-child(1)").displayed}
        $("#main > p:nth-child(2) > a") .click()
        waitFor{$("#f-tl").displayed}

        then:
        $("#f-tl").text().contains("Geb User Mailing List")

        when:
        $("#gbqfq")<<"Geb"+Keys.ENTER
        waitFor {$("body > div.IVILX2C-f-F > div.IVILX2C-f-x > div.IVILX2C-f-l.IVILX2C-f-e > div > div > div > div:nth-child(2) > div > div > div:nth-child(1) > div > div.IVILX2C-Y-j > div:nth-child(1) > div").displayed}
        then:
        $("body > div.IVILX2C-f-F > div.IVILX2C-f-x > div.IVILX2C-f-l.IVILX2C-f-e > div > div > div > div:nth-child(2) > div > div > div:nth-child(1) > div > div.IVILX2C-Y-j > div:nth-child(1) > div > h3 > a").click()
        waitFor {$("#tm-tl > div.IVILX2C-tb-W.IVILX2C-tb-Y.IVILX2C-b-Db.IVILX2C-tb-X > div > div > div > div.IVILX2C-fd-a > div:nth-child(4) > div > div > div > div > div:nth-child(1)").displayed}

        when:
        $("#groups-banner-link > a").text()==("Groups")
        $("#groups-banner-link > a").click()
        waitFor {$("#o-c > div > div:nth-child(1) > div > div.IVILX2C-bc-g.IVILX2C-bc-i > div > div").displayed}

        then:
        $("#o-c > div > div:nth-child(1) > div > div:nth-child(1) > div.IVILX2C-bc-d > table > tbody > tr > td:nth-child(2) > a > span").click()

    }


    def "Issues Page test"(){
        when:
        to Current_ManualPage
        waitFor {$("#main > h1:nth-child(1)").displayed}
        and:
        $("#header-content > ul > li:nth-child(4) > a").text() == "Issues"
        then:
        $("#header-content > ul > li:nth-child(4) > a").click()
        waitFor {$("#js-repo-pjax-container").displayed}
        when:
        $("body > header > div > div > nav.site-header-nav.site-header-nav-secondary > div > form > label > input ")<<"Geb"+Keys.ENTER
        Thread.sleep(5000)
        then:
        $("#code_search_results > div > div > p > a").text()== "README.md"
        $("#code_search_results > div > div > p > a").click()
        waitFor{$("#js-repo-pjax-container > div.container.new-discussion-timeline.experiment-repo-nav > div.repository-content > div.commit-tease > div:nth-child(2)").displayed}
        $("#readme > article > p").text()
    }
    def "Twitter Page Of Geb"(){
        when:
        to Current_ManualPage
        waitFor {$("#main > h1:nth-child(1)").displayed}
        and:
        $("#header-content > ul > li:nth-child(6) > a").text() == "Twitter"
        then:
        $("#header-content > ul > li:nth-child(6) > a").click()
        waitFor {$("#global-nav-home > a > span.text").displayed}
    }
    def "Twitter Page of Geb Search Test and login"(){
        when:
        to Current_ManualPage
        waitFor {$("#main > h1:nth-child(1)").displayed}
        then:
        $("#header-content > ul > li:nth-child(6) > a").click()
        waitFor{$("#global-nav-home > a > span.text").displayed}
        when:
        $("#search-query")<<"FootBall"+Keys.ENTER
        waitFor {$("#page-container > div.AdaptiveSearchTitle.u-bgUserColor > h1").displayed}
        then:
        $("#page-container > div.AdaptiveSearchTitle.u-bgUserColor > h1").text() == "FootBall"

        when:
        $("#search-query")<< Keys.chord(Keys.CONTROL, "a")+Keys.BACK_SPACE
        $("#search-query")<<"WWE"+Keys.ENTER
        Thread.sleep(3000)
        then:
        $("#page-container > div.AdaptiveSearchTitle.u-bgUserColor > h1").text() == "WWE"

        when:
        $("#search-query")<< Keys.chord(Keys.CONTROL, "a")+Keys.BACK_SPACE
        $("#search-query")<<"Microsoft"+Keys.ENTER
        Thread.sleep(3000)

        then:
        $("#page-container > div.AdaptiveSearchTitle.u-bgUserColor > h1").text() == "Microsoft"

        when:
        $("#session").click()
        $("#signin-dropdown > div.signin-dialog-body > form > div.LoginForm-input.LoginForm-username > input")<<"rohit"
        $("#signin-dropdown > div.signin-dialog-body > form > div.LoginForm-input.LoginForm-password > input")<<"rohit"
        $("#signin-dropdown > div.signin-dialog-body > form > input.submit.btn.primary-btn.js-submit").click()
        then:
        waitFor {$("#message-drawer > div > div > span").displayed}

    }

    def "Build Status Page"(){
        when:
        to Current_ManualPage
        waitFor {$("#main > h1:nth-child(1)").displayed}
        then:
        $("#sidebar > h1:nth-child(3)").text() == "Build status"
        $("#sidebar > h1:nth-child(3)").height == 25
        $("#sidebar > h1:nth-child(3)").width == 185
        $("#sidebar > h1:nth-child(3)").css("color") == "rgba(108, 110, 58, 1)"

        when:
        $("#sidebar > a:nth-child(4) > img").click()
        waitFor {$("#logo").displayed}

        then:
        Thread.sleep(15000)
    }

    def "Latest Version Page Test"(){
        when:
        to Current_ManualPage
        Thread.sleep(5000)
        $("#sidebar > a:nth-child(6) > img").click()
        waitFor {$("#logo > a > img").displayed}
        then:
        Thread.sleep(5000)
        System.out.println("Link Of Latest Version Page Works Properly")
    }
    def "testing API Page"(){
        when:
        to ApClass
        then:
        System.out.print("Reached to Api Page no further action is required")
    }


}

