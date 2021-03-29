package com.despegar.screenplay.tasks;

import com.despegar.screenplay.model.Package;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.MoveMouse;
import org.openqa.selenium.Keys;

import static com.despegar.screenplay.userinterface.SearchPackagePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchPackage implements Task {

    private Package pack;

    public SearchPackage(Package pack) {
        this.pack = pack;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MoveMouse.to(DEPARTURE_FIELD),
                Enter.theValue(pack.getDeparture()).into(DEPARTURE_FIELD),
                Click.on(DEPARTURE_LIST_FIELD),
                MoveMouse.to(DESTINATION_FIELD),
                Enter.theValue(pack.getDestination()).into(DESTINATION_FIELD),
                Click.on(DESTINATION_LIST_FIELD),
                Click.on(CALENDAR),
                Click.on(SEARCH_BUTTON)
        );
    }

    public static SearchPackage with(Package pack){
        return instrumented(SearchPackage.class, pack);
    }
}
