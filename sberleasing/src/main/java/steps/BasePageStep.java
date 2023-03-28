package steps;

import locators.BaseLocators;

import static com.codeborne.selenide.Selenide.page;

public class BasePageStep {

    protected BaseLocators selenidePage;

    public BasePageStep(){selenidePage = page(BaseLocators.class);}

}
