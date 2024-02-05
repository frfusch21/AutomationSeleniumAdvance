package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PricePage extends HomePage{
    public PricePage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait){
        super(driver,explicitWait);
        PageFactory.initElements(driver.get(), this);
    }

    @FindBy(xpath = "//div[@class='splitVw']//div[2]/label[@class='splitViewListing checked  ']//div[@class='makeFlex priceInfo gap-x-10 ']")
    WebElement getPrice;

    public String setGetPrice(){
        return getText(getPrice);
    }
}
