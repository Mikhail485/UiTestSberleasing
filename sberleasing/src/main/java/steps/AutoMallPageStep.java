package steps;

import com.codeborne.selenide.SelenideElement;
import locators.AutoMallLocators;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Map;

import static com.codeborne.selenide.Selenide.*;

public class AutoMallPageStep extends SberleasingPageStep {

    AutoMallLocators selenideAutoMall;

    public AutoMallPageStep() {
        selenideAutoMall = page(AutoMallLocators.class);
    }

    public AutoMallPageStep setValueInSelectFieldById(Map<String, List<String>> map) {
        map.forEach((k, v) -> {
            SelenideElement field = $(By.id(k));
            field.scrollIntoView("{block: \"center\"}")
                    .click();
            v.forEach((val) -> selenideAutoMall.valueInDropDownMenuById(k, val)
                    .scrollTo()
                    .click());
            field.doubleClick();
        });
        return this;
    }

    public AutoMallPageStep setValueInSelectFieldByName(Map<String, List<String>> map) {
        map.forEach((k, v) -> {
            SelenideElement field = selenideAutoMall.selectFiledByName(k);
            field.scrollIntoView("{block: \"center\"}")
                    .click();
            v.forEach((val) -> selenideAutoMall.valueInDropDownMenuByName(k, val)
                    .scrollTo()
                    .click());
            field.click();
        });
        return this;
    }

    public AutoMallPageStep activateCheckbooxByName(String... names) {
        for (String name : names){
            selenideAutoMall.checkbooxByName(name)
                    .scrollIntoView("{block: \"center\"}")
                    .click();
        }
        return this;
    }

    public AutoByParamPageStep goToAutoByParam() {
        selenideAutoMall.buttonByText(" Показать все предложения ")
                .scrollIntoView("{block: \"center\"}")
                .click();
        return new AutoByParamPageStep();
    }
}
