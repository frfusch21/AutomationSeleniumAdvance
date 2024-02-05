package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlightPage extends HomePage {
    public FlightPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait){
        super(driver,explicitWait);
        PageFactory.initElements(driver.get(), this);
    }

    //Dari kota mana Flightnya
    @FindBy(xpath = "//div[@class='flt_fsw_inputBox searchCity inactiveWidget ']")
    WebElement getFrom;

    //Search dari dropdown
    @FindBy(xpath = "//li[.='New Delhi, India Indira Gandhi International AirportDEL']")
    WebElement searchFrom;

    //Ke kota mana flightnya
    @FindBy(xpath = "//div[@class='flt_fsw_inputBox searchToCity inactiveWidget ']")
    WebElement getTo;

    //Search dari dropdown
    @FindBy(xpath = "//li[.='Mumbai, India Chhatrapati Shivaji International AirportBOM']")
    WebElement searchTo;

    //Return
    @FindBy(xpath = "//span[.='Return']")
    WebElement setReturn;

    //SetReturnDate
    @FindBy(xpath = "//div[@class='DayPicker-Months']/div[2]//div[1]/div[.='1']")
    WebElement chooseReturnDate;

    //Search
    @FindBy(xpath = "//a[.='Search']")
    WebElement btnSearch;

    public void search(){
        clickAndWait(getFrom);
        clickAndWait(searchFrom);
        clickAndWait(getTo);
        clickAndWait(searchTo);
        clickAndWait(setReturn);
        clickAndWait(chooseReturnDate);
        clickAndWait(btnSearch);
    }
}
