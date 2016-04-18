package Gebbish.support.Twitter

import geb.Page

/**
 * Created by rohit on 3/9/2016.
 */
class TwitterPage extends Page {

    static url = "https://twitter.com/GebFramework"
    static at = {$("#global-nav-home > a > span.text").text()=="Home"}

}
