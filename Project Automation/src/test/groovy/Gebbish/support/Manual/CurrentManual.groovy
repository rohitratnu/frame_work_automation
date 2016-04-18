package Gebbish.support.Manual

import geb.Page

/**
 * Created by rohit on 4/2/2016.
 */
class CurrentManual extends Page{
    static url = "/manual/current"
    static at = { title.startsWith("The Book Of Geb") }
}
