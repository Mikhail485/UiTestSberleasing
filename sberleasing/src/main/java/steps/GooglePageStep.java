package steps;

import locators.GoogleLocators;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.page;

public class GooglePageStep extends BasePageStep{

    GoogleLocators selenideGoogle;
    public GooglePageStep(){selenideGoogle = page(GoogleLocators.class);}

    public GooglePageStep searchByText(String text){
        selenideGoogle.searchString().sendKeys(text, Keys.RETURN);
        return this;
    }

    public SberleasingPageStep goToSberleasingPageByUrl(){
        selenideGoogle.link("https://www.sberleasing.ru/").click();
        return new SberleasingPageStep();
    }
}
