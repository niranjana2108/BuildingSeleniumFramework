package sample;

import driverManager.WebDriverFactoryManager;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.testng.annotations.Test;

public class FirstTest {


    @Test
    public void myfirstTestCase() {
        WebDriverFactoryManager webDriverFactoryManager = new WebDriverFactoryManager();
    }
}
