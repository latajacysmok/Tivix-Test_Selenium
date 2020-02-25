package com.tivixlabs.step;

import com.tivixlabs.page.InformationPage;
import io.cucumber.java8.En;

public class ModelSelectionStep implements En {
    private InformationPage informationPage;

    public InformationPage getInformationPage() {
        return informationPage;
    }

    public ModelSelectionStep(RegistrationSteps registrationSteps) {
        And("Choice of car model", () -> {
            informationPage = registrationSteps.getModelSelectionPage().clickRentButton(registrationSteps.getDropoff(), registrationSteps.getPickup(), registrationSteps.getCity(), registrationSteps.getCountry(), registrationSteps.getModel());

        });
    }
}
