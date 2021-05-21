package org.bmn.Bulenkov_lesson_11.steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StepThreeModifier extends Step implements StringModifer {

    private final Step stepTwoModifier;

    @Autowired
    public StepThreeModifier(StepTwoModifier stepTwoModifier) {
        this.stepTwoModifier = stepTwoModifier;
    }

    //converting the first character to uppercase
    @Override
    public String modify(String stepTwo) {
        String stepThree = stepTwoModifier.modify(stepTwo);
        String result = stepThree.substring(0, 1).toUpperCase() + stepThree.substring(1);
        System.out.println("Третий шаг: " + result);
        return result;
    }

    @Override
    public int getOrder() {
        return 3;
    }
}
