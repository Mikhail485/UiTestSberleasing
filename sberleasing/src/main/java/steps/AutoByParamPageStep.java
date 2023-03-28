package steps;

import locators.AutoByParamLocators;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.page;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AutoByParamPageStep extends AutoMallPageStep {

    AutoByParamLocators selenideAutoByParam;

    public AutoByParamPageStep() {
        selenideAutoByParam = page(AutoByParamLocators.class);
    }

    public AutoByParamPageStep checkThatAllCarsWithBrand(String brand) {
        selenideAutoByParam.carOffer()
                .should(sizeGreaterThan(0))
                .asDynamicIterable()
                .forEach(elem -> assertTrue(elem.scrollIntoView("{block: \"center\"}")
                                .getAttribute("href").contains(brand),
                        "Отображаемая марка автомобиля отличается от заданной фильтром"));
        return this;
    }
}
