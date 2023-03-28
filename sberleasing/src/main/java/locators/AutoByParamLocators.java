package locators;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$x;

public class AutoByParamLocators extends SberleasingLocators{

    public ElementsCollection carOffer(){
        return $$x(".//div[@class='car-card__list car-card__list_visibility']/a");
    }
}
