
/*
	This is the Geb configuration file.

	See: http://www.gebish.org/manual/current/#configuration
*/


import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.chrome.ChromeDriver



waiting {
    timeout = 10
}
System.setProperty('webdriver.chrome.driver', 'C:\\Driver\\chromedriver.exe')
driver = { new ChromeDriver()}

/*environments {

    driver = {
        new FirefoxDriver()
    }
}*/

baseUrl = "http://gebish.org"