package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class StarSharpMainPage {
    public static final Target ORGANIZATION_OPTION = Target.the("where you click to see the organization options")
            .located(By.xpath("//a[@href='javascript:;']//span[text()='Organization']"));
    public static final Target BUSINESS_UNITS_OPTION = Target.the("where you click to see the Business unit")
            .located(By.xpath("//a[@href='/demo/Organization/BusinessUnit']"));
    public static final Target MEETING_OPTIONS = Target.the("where you click to see the Meeting options")
            .located(By.xpath("//span[text()=\"Meeting\"]"));
    public static final Target MEETINGS_BUTTON = Target.the("where you click to see the Meeting options")
            .located(By.xpath("//a[@href=\"/demo/Meeting/Meeting\"]"));
}
