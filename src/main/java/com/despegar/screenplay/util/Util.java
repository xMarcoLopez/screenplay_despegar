package com.despegar.screenplay.util;

import net.serenitybdd.core.pages.WebElementFacade;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Util {

    public static List<String> getTextList(List<WebElementFacade> list) {
        List<String> textList = new ArrayList<String>();
        for (WebElementFacade webElementFacade : list) {
            textList.add(webElementFacade.getText());
        }
        return textList;
    }

    public static List<String> removeCharacter(List<String> list, String character) {
        List<String> newList = new ArrayList<String>();
        for (String text : list) {
            newList.add(text.replaceAll(character, ""));
        }
        return newList;
    }


    public static List<Integer> convertStringListToIntegerList(List<String> list) {
        List<Integer> newList = new ArrayList<Integer>();
        for (String text : list) {
            if (text.length() > 0) {
                newList.add(Integer.parseInt(text));
            }
        }
        return newList;
    }

    public static WebElementFacade getCheapestPackage(List<WebElementFacade> packagePrices) {
        String character = ".";
        List<Integer> packagePricesCOP = null;
        Integer cheapestPackage = null;
        WebElementFacade cheapestFlightElement;
        List<String> textPackagePrices = getTextList(packagePrices);
        textPackagePrices = removeCharacter(textPackagePrices, character);
        packagePricesCOP = convertStringListToIntegerList(textPackagePrices);
        cheapestPackage = Collections.min(packagePricesCOP);
        cheapestFlightElement = packagePrices.get(packagePricesCOP.indexOf(cheapestPackage));
        return cheapestFlightElement;
    }
}
