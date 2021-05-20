package org.bmn.Bulenkov_lesson_11.steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StepThreeModifier extends Step implements StringModifer {

    private final StepTwoModifier stepTwoModifier;

    @Autowired
    public StepThreeModifier(StepTwoModifier stepTwoModifier) {
        this.stepTwoModifier = stepTwoModifier;
    }

    @Override
    public String modify(String stepTwo) {
        String stepThree = stepTwoModifier.modify(stepTwo);
        return stepThree.substring(0, 1).toUpperCase() + stepThree.substring(1);
    }

    @Override
    public int getOrder() {
        return 3;
    }
}
