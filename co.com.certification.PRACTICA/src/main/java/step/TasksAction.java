package step;

import net.thucydides.core.annotations.Step;
import pageobject.URL;

public class TasksAction {
    private URL Pagina;

    @Step

    public void singIn() {

        Pagina.email.sendKeys ("johnedi77@hotmail.com");
        Pagina.pass.sendKeys ("Chelsea7711*");
        Pagina.login.click();
    }

}
