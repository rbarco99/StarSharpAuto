package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://serenity.is/demo/")
public class StarSharpHomePage extends PageObject {

    public static final Target USERNAME_INPUT = Target.the("Where you enter the username")
            .located(By.id("StartSharp_Membership_LoginPanel0_Username"));
    public static final Target PASSWORD_INPUT = Target.the("Where you enter the password")
            .located(By.id("StartSharp_Membership_LoginPanel0_Password"));
    public static final Target SignIn_BUTTON = Target.the("Button that allows the LogIn")
            .located(By.id("StartSharp_Membership_LoginPanel0_LoginButton"));

}
