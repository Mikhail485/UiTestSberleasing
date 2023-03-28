package locators;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class AutoMallLocators extends SberleasingLocators{

    public SelenideElement valueInDropDownMenuById(String id, String value){
        return $(By.id(id)).$x(".//following-sibling::div[@role='listbox']//*[text()='" + value + "']");
    }

    public SelenideElement selectFiledByName(String fieldName){
        return $x("//div[text()='" + fieldName + "']//following-sibling::div");
    }

    public SelenideElement valueInDropDownMenuByName(String fieldName, String value){
        return selectFiledByName(fieldName).$x(".//*[text()='" + value + "']");
    }

    public SelenideElement checkbooxByName(String name){
        return $x(".//label[text()='" + name + "' or @title='" + name + "']");
    }

    public SelenideElement buttonByText(String name){
        return $x(".//*[text()='" + name + "']");
    }
}
