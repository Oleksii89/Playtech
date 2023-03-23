package page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage {


    @FindBy(how = How.XPATH, using = "//*[@href = '/internship']")
    private SelenideElement internshipButton;


    public void clickInternshipButton() {internshipButton.click(); }



}
