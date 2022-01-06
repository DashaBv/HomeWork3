package dasha.ru;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class SoftAssertionsTests {
    @Test
    void AssertionsTest(){
        //Открыть страницу
        open("https://demoqa.com/automation-practice-form");
    }
}
