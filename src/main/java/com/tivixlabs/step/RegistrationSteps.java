package com.tivixlabs.step;

import com.tivixlabs.page.ModelSelectionPage;
import io.cucumber.java8.En;

public class RegistrationSteps implements En {
    private ModelSelectionPage modelSelectionPage;
    private String country = "France";
    private String city = "Paris";
    private String pickup = "2020-02-14";
    private String dropoff = "2020-02-23";
    private String model = "Mazda 3";

    public RegistrationSteps(CommonSteps commonSteps) {
        When("Filling out the application form.", () -> {
            commonSteps.getHomePage().selectCountry(country);
            commonSteps.getHomePage().selectCity(city);
            commonSteps.getHomePage().selectModel(model);
            commonSteps.getHomePage().selectPickup(pickup);
            commonSteps.getHomePage().selectDropoff(dropoff);
            modelSelectionPage = commonSteps.getHomePage().clicksearchButton();//,country,city,pickup,dropoff
        });
    }

    public ModelSelectionPage getModelSelectionPage() {
        return modelSelectionPage;
    }
    public String getDropoff() {
        return dropoff;
    }

    public String getPickup() {
        return pickup;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getModel() {return model;}
}
