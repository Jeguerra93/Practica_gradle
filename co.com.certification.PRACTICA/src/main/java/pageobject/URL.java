package pageobject;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.facebook.com/")
public class URL extends PageObject {

    @FindBy(xpath = "//input[@placeholder='Username']")
    public WebElementFacade email;
    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElementFacade pass;
    @FindBy(xpath = "//input[@placeholder='SignIn']")
    public WebElementFacade login;
}
