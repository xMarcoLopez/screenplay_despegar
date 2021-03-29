package com.despegar.screenplay.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchPackagePage {
    public static final Target DEPARTURE_FIELD = Target.the("Departure").located(By.xpath("//*[@id=\"searchbox-sbox-box-packages\"]/div/div/div[3]/div[2]/div[2]/div[1]/div/div/div/input"));
    public static final Target DEPARTURE_LIST_FIELD = Target.the("Departure list").located(By.xpath("/html/body/div[13]/div/div[1]/ul/li[1]"));
    public static final Target DESTINATION_FIELD = Target.the("Destination").located(By.xpath("//*[@id=\"searchbox-sbox-box-packages\"]/div/div/div[3]/div[2]/div[2]/div[2]/div/div/div/div/input"));
    public static final Target DESTINATION_LIST_FIELD = Target.the("Destination list").located(By.xpath("/html/body/div[13]/div/div[1]/ul/li[1]"));
    public static final Target CALENDAR = Target.the("Calendar").located(By.xpath("//*[@id=\"searchbox-sbox-box-packages\"]/div/div/div[3]/div[2]/div[9]/span/label/span[1]/span"));
    public static final Target DEPARTURE_DATE = Target.the("Departure date").locatedBy("//button[@date='{0}']");
    public static final Target RETURN_DATE = Target.the("Departure date").locatedBy("//button[@date='{0}']");
    public static final Target SEARCH_BUTTON = Target.the("Search button").located(By.xpath("//*[@id=\"searchbox-sbox-box-packages\"]/div/div/div[3]/div[2]/div[6]/div/a"));
}
