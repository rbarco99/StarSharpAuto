package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BusinessUnits {
    public static final Target NEW_BUSINESS_UNIT_BUTTON = Target.the("where you click to create a new business unit")
            .located(By.xpath("//span[text()=\" New Business Unit\"]"));
    public static final Target BUSINESS_UNIT_NAME_INPUT = Target.the("where you enter the businnes name")
            .located(By.xpath("//input[@name=\"Name\"]"));
    public static final Target SAVE_BUSINESS_UNIT_BUTTON = Target.the("where you click to create a new business unit")
            .located(By.xpath("//span[text()=\" Save\"]"));


}
