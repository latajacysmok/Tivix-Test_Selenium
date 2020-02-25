package com.tivixlabs.step;

import com.tivixlabs.page.RentPage;
import io.cucumber.java8.En;

public class InformationStep implements En {
    private RentPage rentPage;

    public RentPage getRentPage() {
        return rentPage;
    }

    public InformationStep(ModelSelectionStep modelSelectionStep) {
        And("Click Rent! button", () -> {
            rentPage = modelSelectionStep.getInformationPage().clickRentButton2();
        });
    }
}
