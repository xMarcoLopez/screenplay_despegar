package com.despegar.screenplay.tasks;

import com.despegar.screenplay.userinterface.PackageResultPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.despegar.screenplay.userinterface.PackageResultPage.PACK;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectAPackage implements Task {
    private PackageResultPage packageResultPage;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(PACK),
                Click.on(PACK)

        );
    }

    public static SelectAPackage betweenTheResults(){
        return instrumented(SelectAPackage.class);
    }
}
