package Automation;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.sleep;

public class FirstAutomationTest {
    @Test

    public void login(){
        Selenide.open("https://ee.ge/");
        Configuration.browserSize = "2100x1080";
        $(byText("რეგისტრაცია")).click();
        $(byText("დახურვა")).click();
        $(byText("სწრაფი რეგისტრაცია")).shouldBe(Condition.visible);
        $("#firstName").setValue("ვოვა");
        $("#firstName").shouldNotBe(Condition.empty);
        $("#lastName").click();
        $("#lastName").setValue("ბულიგინი");
        $(byText("გვარი სავალდებულოა")).shouldNotBe(Condition.visible);
        $("#email").click();
        $("#email").setValue("buligini2vova@gmail.com");
        $("#email").shouldNotBe(Condition.empty);
        $("#password").click();
        $("#password").setValue("123455vs2");
        $("#confirmPassword").setValue("123455vs2");
        $("#singup").shouldBe(Condition.enabled);




    }
}
