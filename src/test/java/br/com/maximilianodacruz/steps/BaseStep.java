package br.com.maximilianodacruz.steps;

import br.com.maximilianodacruz.utils.Browser;
import br.com.maximilianodacruz.utils.Utils;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseStep {

    @Before
    public void setup() {
        Browser.loadPage(Utils.getEnv());
    }

    @After
    public void tearDown() {
        Browser.close();
    }

}
