package Automation;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.sleep;

public class TestMethod2 {
    @Test
        public void negative(){
            Selenide.open("https://ee.ge/");
            $(byText("რეგისტრაცია")).click();
            $(byText("სწრაფი რეგისტრაცია")).shouldBe(Condition.visible);
            $(byText("დახურვა")).click();
            $("#singup").shouldBe(Condition.disabled);
            $("#firstName").click();
            $("#lastName").click();
            $(byText("სახელი სავალდებულოა")).shouldBe(Condition.visible);
            $("#email").click();
            $(byText("გვარი სავალდებულოა")).shouldBe(Condition.visible);
            $("#password").click();
            $(byText("ელ. ფოსტა სავალდებულოა")).shouldBe(Condition.visible);
            $("#confirmPassword").click();
            $(byText("პაროლი სავალდებულოა.")).shouldBe(Condition.visible);
            $("#password").click();
            $("#email").click();
            $("#email").setValue("test");
            $(byText("ელ. ფოსტა სავალდებულოა")).shouldBe(Condition.visible,Duration.ofMillis(5000));
            $("#email").clear();
            $("#email").click();
            $("#email").setValue("test@");
            $(byText("ელ. ფოსტა სავალდებულოა")).shouldBe(Condition.visible,Duration.ofMillis(5000));
            $("#email").click();
            $("#email").setValue("test@gmail,");
            $(byText("ელ. ფოსტა სავალდებულოა")).shouldBe(Condition.visible,Duration.ofMillis(5000));
            $("#email").click();
            $("#email").setValue("test@gmail.");
            $(byText("ელ. ფოსტა სავალდებულოა")).shouldBe(Condition.visible,Duration.ofMillis(5000));
            $("#email").click();
            $("#email").setValue("test@gmail.com");
            $(byText("ელ. ფოსტა სავალდებულოა")).shouldNotBe(Condition.visible);

            $("#password").click();
            $("#password").setValue("12345");
            $(byText("პაროლი სავალდებულოა.")).shouldBe(Condition.visible);
            $("#password").click();
            $("#password").setValue("123456");
            $(byText("პაროლი სავალდებულოა.")).shouldNotBe(Condition.visible);

            $("#confirmPassword").click();
            $("#confirmPassword").setValue("12345");
            $(byText("პაროლის გამეორება სავალდებულოა")).shouldBe(Condition.visible);





            sleep(1500);




    }

}
