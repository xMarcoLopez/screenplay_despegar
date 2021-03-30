package com.despegar.screenplay.tasks;

import com.despegar.screenplay.interactions.SwitchToNewWindow;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.despegar.screenplay.userinterface.TripPage.BUY_BUTTON;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ConfirmTheTrip implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SwitchToNewWindow.change(),
                Click.on(BUY_BUTTON)
        );
    }

    public static ConfirmTheTrip inANewTab(){
        return instrumented(ConfirmTheTrip.class);
    }
}
