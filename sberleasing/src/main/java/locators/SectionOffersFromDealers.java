package locators;

import com.codeborne.selenide.SelenideElement;

public class SectionOffersFromDealers extends SberleasingLocators{

    public final SelenideElement container;

    public SectionOffersFromDealers(SelenideElement container){this.container = container;}

    public SelenideElement buttonSelectByParam(){
        return container.$x(".//h2/following-sibling::div//*[text()='Подобрать по параметрам']");
    }
}
