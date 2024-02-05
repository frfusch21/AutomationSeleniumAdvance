package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    public ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    public ThreadLocal<WebDriverWait> explicitWait = new ThreadLocal<>();

    //Setting Drive
    public HomePage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait){
        this.driver = driver;
        this.explicitWait = explicitWait;
    }

    //Setting Behavior
    //Click and Wait (Eksplisit Wait, tunggu sampai ada yg bisa di klik)
    protected final void clickAndWait(WebElement element){
        explicitWait.get().until(ExpectedConditions.elementToBeClickable(element)).click();
    }
    //setText
    protected final void setText(WebElement element, String text){
        explicitWait.get().until(ExpectedConditions.visibilityOf(element)).sendKeys(text);
    }

    //getText
    protected final String getText(WebElement element){
        String actualText = explicitWait.get().until(ExpectedConditions.visibilityOf(element)).getText();
        return actualText;
    }
}
