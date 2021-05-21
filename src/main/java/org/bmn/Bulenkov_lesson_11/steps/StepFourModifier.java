package org.bmn.Bulenkov_lesson_11.steps;

import org.bmn.Bulenkov_lesson_11.alphabet.Performance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
public class StepFourModifier extends Step implements StringModifer {

    private final Step stepThreeModifier;
    private final Performance performance;

    @Autowired
    public StepFourModifier(StepThreeModifier stepThreeModifier, Performance performance) {
        this.stepThreeModifier = stepThreeModifier;
        this.performance = performance;
    }

    //replacing characters according to the alphabet
    @Override
    public String modify(String stepThree) {
        StringBuilder sb = new StringBuilder();
        String stepFour = stepThreeModifier.modify(stepThree);

        for (char c : stepFour.toCharArray()) {
            if (performance.alphabet().containsKey(String.valueOf(c))) {
                sb.append(performance.alphabet().get(String.valueOf(c)));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    @Override
    public int getOrder() {
        return 4;
    }
}
