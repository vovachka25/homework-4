package Automation;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.sleep;

public class RedMed {
    @Test

    public void registration(){
        Selenide.open("https://redmed.ge/ka");
        Configuration.browserSize = "2100x1080";
        $(byText("ავტორიზაცია")).click();
        $(byText("პაციენტი")).click();
        $(byText("რეგისტრაცია")).click();
        $("#userName").setValue("ვოვა");
        $("#userName").clear();
        $("#lastName").setValue("ბულიგინი");
        $("#mobileNumber").setValue("234567766");
        $("#mobileNumber").clear();
        $("#email").setValue("buligini2vova@gmail.com");
        $("#terms").click();
        $(byText("+995")).click();
        $(byText("Afghanistan")).shouldBe(Condition.visible);
        $(byText("+995")).click();
        $(byText("ისარგებლე მოწვევის კოდით")).click();
        $("#referralCode").shouldBe(Condition.visible);
        $("#mobileNumber").shouldHave(Condition.cssClass("ng-invalid"));
        $("#user-registration-button").click();


        sleep(2000);
    }

}
