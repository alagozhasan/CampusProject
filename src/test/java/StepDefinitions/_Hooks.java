package StepDefinitions;

import Utilities.GWD;
import io.cucumber.java.After;

public class _Hooks {
        @After
        public void after() {
            GWD.quitDriver();
        }
    }

