package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class testcasesPage extends base{

    public testcasesPage(WebDriver driver) {
        super(driver);
    }

    final private By  testcase = By.xpath("//div[@class=\"col-sm-9 col-sm-offset-1\"]//b");
    public String testcases_text() {
        String TEXT=getText(testcase);
        return TEXT;

    }
}
