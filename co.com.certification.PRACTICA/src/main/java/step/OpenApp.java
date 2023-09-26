package step;

import net.thucydides.core.annotations.Step;
import pageobject.URL;

public class OpenApp {

    private URL pagina;
    @Step
    public void appUrl(){

        pagina.open();
    }

}
