package Test;

import Page.FlightPage;
import Page.PricePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetPriceTest extends BaseWebTest{
    @Test
    public void getPricePos(){
        FlightPage flightPage = new FlightPage(driver,explicitWait);
        PricePage pricePage = new PricePage(driver,explicitWait);

        flightPage.search();

        //Get harga termurah
        String expectedPrice = pricePage.setGetPrice();
        System.out.println(expectedPrice);
        Assert.assertEquals("₹ 5,290\n" + "per adult",expectedPrice, "Price does not match expected value");
    }

//    @Test
//    public void getPriceNeg(){
//        FlightPage flightPage = new FlightPage(driver,explicitWait);
//        PricePage pricePage = new PricePage(driver,explicitWait);
//
//        flightPage.search();
//
//        //Get harga termurah
//        String expectedPrice = pricePage.setGetPrice();
//        System.out.println(expectedPrice);
//        Assert.assertEquals("₹ 5,490\n" + "per adult",expectedPrice, "Price does not match expected value");
//    }
}
