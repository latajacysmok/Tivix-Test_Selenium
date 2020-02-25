package com.tivixlabs.step;

import com.tivixlabs.page.InformationPage;
import com.tivixlabs.page.RentPage;
import io.cucumber.java8.En;

public class FinalDataStep implements En {

    public FinalDataStep(InformationStep informationStep) {
        And ("Completing the form without the Name field", () -> {
            informationStep.getRentPage().enterLastName("Kowalski");
            informationStep.getRentPage().enterCardNumber("1234");
            informationStep.getRentPage().enteremail("Kowalski@onet.pl");
        });
    }
}
