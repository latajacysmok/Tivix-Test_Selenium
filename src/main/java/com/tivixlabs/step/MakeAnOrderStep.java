package com.tivixlabs.step;

import io.cucumber.java8.En;

public class MakeAnOrderStep implements En {
    public MakeAnOrderStep(InformationStep informationStep) {
        Then("After clicking Rent, a warning appears regarding the blank Name field", () -> {
            informationStep.getRentPage().clickRentButton3();
        });
    }
}
