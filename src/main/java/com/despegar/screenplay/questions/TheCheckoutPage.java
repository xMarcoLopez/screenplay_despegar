package com.despegar.screenplay.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static com.despegar.screenplay.userinterface.CheckoutPage.TOTAL_PRICE;

public class TheCheckoutPage implements Question<Boolean>{

    public static Question<Boolean> isVisible(){
        return new TheCheckoutPage();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return TOTAL_PRICE.resolveFor(actor).isVisible();
    }

    @Override
    public String getSubject(){
        return "the checkout page is visible";
    }
}
