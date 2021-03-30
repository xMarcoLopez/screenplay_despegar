package com.despegar.screenplay.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckoutPage {

    public static final Target TOTAL_PRICE = Target.the("Total price").located(By.xpath("//*[@id=\"chk-total-price\"]/div[2]/money/div"));

}
