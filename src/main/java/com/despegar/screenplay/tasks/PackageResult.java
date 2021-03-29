package com.despegar.screenplay.tasks;

import com.despegar.screenplay.userinterface.PackageResultPage;
import com.despegar.screenplay.util.Util;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.Switch;

import java.util.ArrayList;
import java.util.List;

import static com.despegar.screenplay.userinterface.PackageResultPage.PACK;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PackageResult implements Task {
    private PackageResultPage packageResultPage;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(PACK),
                Click.on(PACK),
                Switch.toFrame(1)

        );
    }

    public static PackageResult with(){
        return instrumented(PackageResult.class);
    }
}
