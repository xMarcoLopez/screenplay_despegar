package com.despegar.screenplay.tasks;

import com.despegar.screenplay.userinterface.PackageResultPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;

import static com.despegar.screenplay.userinterface.TripPage.BUY_BUTTON;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ConfirmTrip implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUY_BUTTON)
        );
    }

    public static ConfirmTrip with(){
        return instrumented(ConfirmTrip.class);
    }
}
