package steps;

import com.codeborne.selenide.ex.ElementNotFound;
import locators.SberleasingLocators;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.page;

public class SberleasingPageStep extends BasePageStep {

    SberleasingLocators selenideSberleasing;

    public SberleasingPageStep(){selenideSberleasing = page(SberleasingLocators.class);}

    public SberleasingPageStep waitAndCloseModalQuestions(){
        try {
            selenideSberleasing.modalQuestions().shouldBe(visible, Duration.ofSeconds(10));
            selenideSberleasing.buttonCloseInModalQuestions().click();
        } catch (ElementNotFound ex){}
        return this;
    }

    public SberleasingPageStep closeCookieWarning(){
        selenideSberleasing.buttonCloseCookieWarning()
                .shouldBe(visible)
                .click();
        return this;
    }

    public AutoMallPageStep goToAutoMall(){
        selenideSberleasing.sectionOffersFromDealers()
                .buttonSelectByParam()
                .scrollIntoView("{block: \"center\"}")
                .click();
        return new AutoMallPageStep();
    }
}
