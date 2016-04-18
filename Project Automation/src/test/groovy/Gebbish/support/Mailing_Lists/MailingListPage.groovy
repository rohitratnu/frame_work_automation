package Gebbish.support.Mailing_Lists

import geb.Page

/**
 * Created by rohit on 3/9/2016.
 */
class MailingListPage extends Page{

    static url = "/lists"
    static at = {$("#main > h1:nth-child(1)").text()=="User List"}

}
