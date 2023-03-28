package locators;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class SberleasingLocators {

    public SectionOffersFromDealers sectionOffersFromDealers(){
        return new SectionOffersFromDealers($x("//h1[text()='Лизинг автомобилей и спецтехники в СберЛизинг']/.."));
    }

    public SelenideElement modalQuestions(){
        return $x("//div[@class='comagic-widget comagic-call-generator-background']");
    }

    public SelenideElement buttonCloseCookieWarning(){
        return $x("//div[@class='container cookie-warning']//button[contains(text(),'Закрыть')]");
    }

    public SelenideElement buttonCloseInModalQuestions(){
        return modalQuestions().$x(".//*[name()='svg']");
    }
}
