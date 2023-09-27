package runners;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class RunnerTags {

    private WebDriver driver;

    @BeforeClass
    public static void setupWebdriverChromeDriver() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/chromedriver.exe");
    }

    @Before
    public void setup() {
        driver = new ChromeDriver();
    }

    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void testRunner() {
        JUnitCore.runClasses(RunnerTags.class);
    }
    @RunWith(CucumberWithSerenity.class)
    @CucumberOptions(features = "src/test/resources/features/prueba.feature",
            tags = "@HistoriaDeUsuario",
            glue = "co.com.choucair.certification.prueba.screenplay.stepdefinitions")
    public class Runner{
    }

}
