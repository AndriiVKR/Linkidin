package linkidin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class SingInPage extends BasePage {

    public SingInPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input")
    private List<WebElement> singInPageFields;

    public void EmailOrPhoneFields(String email) {
        wait.until(ExpectedConditions.elementToBeClickable(singInPageFields.get(1));
        singInPageFields.get(1).sendKeys(email);
    }

    public void passwordField(String password) {
        wait.until(ExpectedConditions.elementToBeClickable(singInPageFields.get(13)));
        singInPageFields.get(13).sendKeys(password);
    }

    @FindBy(css = ".login__form_action_container")
    private WebElement singInButton1;

    public ProfileHomePage clickSingInButton1() {
        wait.until(ExpectedConditions.elementToBeClickable(singInButton1));
        singInButton1.click();
        return new ProfileHomePage(driver);
    }

}
