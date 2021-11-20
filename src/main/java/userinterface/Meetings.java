package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Meetings {
    public static final Target NEW_MEETING_BUTTON = Target.the("where you click to create a new meeting")
            .located(By.xpath("//span[text()=\" New Meeting\"]"));
    public static final Target MEETING_NAME_INPUT = Target.the("where you enter the meeting name")
            .located(By.name("MeetingName"));
    public static final Target EDIT_MEETING_TYPE_BUTTON = Target.the("where you click to edit the meeting type")
            .located(By.xpath("//a[@title=\"Edit\"]"));
    public static final Target MEETING_TYPE_INPUT = Target.the("where you enter the meeting name")
            .located(By.name("Name"));
    public static final Target UPDATE_MEETING_TYPE_BUTTON = Target.the("where you click to update the meeting type")
            .located(By.xpath("//span[text()=\" Update\"]"));
    public static final Target START_DATE_INPUT = Target.the("where you enter the start date")
            .located(By.name("StartDate"));
    public static final Target START_HOUR_SELECT = Target.the("where you select the start hour")
            .located(By.xpath("//div[contains(@class, 'StartDate')]//select[@class=\"editor s-DateTimeEditor time\"]"));
    public static final Target NEW_LOCATION_BUTTON = Target.the("where you click to add a new location")
            .located(By.xpath("//div[@class='field LocationId col-sm-6']//a[@title='Define New']"));
    public static final Target MEETING_LOCATION_INPUT = Target.the("where you enter the meeting Location")
            .located(By.name("Name"));
    public static final Target MEETING_ADDRESS_INPUT = Target.the("where you enter the meeting Address")
            .located(By.name("Address"));
    public static final Target SAVE_MEETING_ADDRESS_BUTTON = Target.the("where you click to save the address information")
            .located(By.xpath("//div[@class='s-TemplatedDialog ui-dialog-content ui-widget-content']//span[text()=\" Save\"]"));
    // Organizer info
    public static final Target DEFINE_ORGANIZER_BUTTON = Target.the("where you click to enter the organizer info")
            .located(By.xpath("//div[@class='field OrganizerContactId col-sm-6']//a[@title=\"Define New\"]"));
    public static final Target ORGANIZER_FIRST_NAME_INPUT = Target.the("where you enter the organizer first name")
            .located(By.name("FirstName"));
    public static final Target ORGANIZER_LAST_NAME_INPUT = Target.the("where you enter the organizer last name")
            .located(By.name("LastName"));
    public static final Target ORGANIZER_EMAIL_INPUT = Target.the("where you enter the organizer email")
            .located(By.name("Email"));
    public static final Target ORGANIZER_DOMAIN_INPUT = Target.the("where you enter the organizer email domain")
            .located(By.className("emaildomain"));
    public static final Target SAVE_ORGANIZER_BUTTON = Target.the("where you click to save the organizer info")
            .located(By.xpath(" //div[@class='s-TemplatedDialog ui-dialog-content ui-widget-content']//span[text()=' Save']"));
    public static final Target MEETING_NUMBER_INPUT = Target.the("where you enter the meeting number")
            .located(By.name("MeetingNumber"));
    public static final Target END_DATE_INPUT = Target.the("where you enter the end date")
            .located(By.name("EndDate"));
    public static final Target END_HOUR_SELECT = Target.the("where you select the end hour")
            .located(By.xpath("//div[contains(@class, 'EndDate')]//select[@class=\"editor s-DateTimeEditor time\"]"));
    public static final Target UNIT_DIV = Target.the("where you click to add the unit")
            .located(By.xpath("//div[contains(@class, 'UnitId ')]//div[contains(@id, 'UnitId')]"));
    public static final Target UNIT_INPUT = Target.the("where you enter the unit")
            .located(By.id("s2id_autogen8_search"));
    public static final Target SAVE_MEETING_BUTTON = Target.the("where you click to save the meeting")
            .located(By.xpath("//span[text()=' Save'][1]"));
    public static final Target ORDER_BY_ID_BUTTON = Target.the("where you click to save the meeting")
            .located(By.xpath("//span[text()='ID']"));
    public static final Target CREATED_MEETING_NAME_DIV = Target.the("where you click to save the meeting")
            .located(By.xpath("//div[contains(@class,'ui-widget-content slick-row ')][last()]//div[@class='slick-cell l1 r1']//a"));
    public static final Target ERROR_MESSAGE = Target.the("where you click to save the meeting")
            .located(By.xpath("//label[@class='error']"));

}

