package Automation;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.sleep;

public class method3 {
    @Test

    public void bucket(){
        Selenide.open("https://ee.ge/");
        $(".cart-count").click();
        $(byText("კალათა ცარიელია")).shouldBe(Condition.visible);
        $(byText("დახურვა")).click();
        $("#search_list").click();
        $("#search_list").setValue("კომპიუტერი");
        $(byText("კომპიუტერის ჯოისტიკი")).click();
        $(".add_to_cart",0).click();
        $(".cart-count").click();
        $(byText("წაშლა")).click();
        $(byText("კალათა ცარიელია")).shouldBe(Condition.visible);



        sleep(2000);
    }
}
