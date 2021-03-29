package com.despegar.screenplay.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TripPage {
    public static final Target BUY_BUTTON = Target.the("Buy button").located(By.xpath("//*[@id=\"pricebox-overlay\"]/div[1]/div/button"));

}
