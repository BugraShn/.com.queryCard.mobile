package stepdefinitions;

import utilities.Pages;

public abstract class BaseStep {

    protected static Pages PAGES;

    public BaseStep() {

        PAGES = new Pages();
    }
}
