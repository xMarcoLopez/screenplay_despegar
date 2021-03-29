package com.despegar.screenplay.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/search_package.feature"},
        glue = "com.despegar.screenplay.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class SearchPackage {
}
