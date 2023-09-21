package runners;


import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.core.environment.SystemEnvironmentVariables;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
public class RunnerTags {
    @Before
    public void test() {
        switch (SystemEnvironmentVariables.createEnvironmentVariables().getProperty("webdriver.driver")) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
               // GUIA PARA ELABORAR UNA AUTOMATIZACION WEB
                break;
            case "ie":case "iexplorer":
                WebDriverManager.iedriver().setup();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                break;
            default:
                WebDriverManager.chromedriver().setup();
                break;
        }
    }
    @Test
    public void testRunner() {
        JUnitCore.runClasses(RunnerTags.class);
    }
    @RunWith(CucumberWithSerenity.class)
    @CucumberOptions(features = "src/test/resources/features/prueba.feature",
            tags =  "@HistoriaDeUsuario",
            glue = "co.com.choucair.certification.prueba.screenplay.stepdefinitions")
    public class Runner{
    }
}
