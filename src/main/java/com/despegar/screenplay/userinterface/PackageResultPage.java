package com.despegar.screenplay.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.util.List;

public class PackageResultPage extends PageObject {

    public static final Target PACKAGE_PRICES = Target.the("Departure").located(By.xpath("//em[@class='amount']"));
    public static final Target PACK = Target.the("Departure").located(By.xpath("/html/body/div[9]/div[3]/div[8]/div[3]/div[1]/div[1]/div[2]/div[3]/div[2]/span[2]/a/em"));

    public List<WebElementFacade> getPackagePrices(){
        return findAll("//em[@class='amount']");
    }
}
