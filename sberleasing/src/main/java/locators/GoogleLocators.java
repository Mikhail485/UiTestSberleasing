package locators;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class GoogleLocators extends BaseLocators {

    public SelenideElement searchString(){
        return $x("//div[@data-mnr]//input");
    }

    public SelenideElement link(String url){
        return $x("//a[@href='" + url + "']//h3");
    }
}
