package base;

import steps.GooglePageStep;

import static com.codeborne.selenide.Selenide.open;

public class AbstractTest {

    public static GooglePageStep getGoogleListPage(){
        open("https://www.google.com/");
        return new GooglePageStep();
    }
}
