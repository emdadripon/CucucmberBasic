package Steps;

import Base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hook extends BaseUtil {

    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void initializeTest(){

        System.out.println("Opening the browser : MOCK");
        System.setProperty("webdriver.firefox.marionette", "C:\\Users\\eripo\\IdeaProjects\\CucumberBasic\\driver\\geckodriver.exe");
        base.Driver = new FirefoxDriver();

    }

    @After
    public void tearDownTest(Scenario scenario){
        if(scenario.isFailed())
            //Take screenshot
        System.out.println(scenario.getName());
    }
}
