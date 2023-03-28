import base.BaseTest;
import com.google.inject.internal.util.ImmutableMap;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

public class UiTest extends BaseTest {

    @Test
    public void test(){
        String brand = "Citroen";

        getGoogleListPage()
                .searchByText("СберЛизинг")
                .goToSberleasingPageByUrl()
                .waitAndCloseModalQuestions()
                .closeCookieWarning()
                .goToAutoMall()
                .setValueInSelectFieldById(ImmutableMap.of(
                        "filter-city", List.of("Москва"),
                        "filter-mark", List.of(brand),
                        "filter-model", List.of("C4 Седан")))
                .activateCheckbooxByName("механика", "автомат", "передний", "седан", "бензин")
                .setValueInSelectFieldByName(Map.of(" Цвет ", List.of("белый")))
                .goToAutoByParam()
                .checkThatAllCarsWithBrand(brand.toLowerCase());
    }
}
