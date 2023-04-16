package StepDefinitions;

import Utilities.GWD;
import io.cucumber.java.After;

public class _Hooks {
        @After
        public void after() {
            System.out.println("Senaryo Bitti!");
            GWD.quitDriver();
        }
    }

