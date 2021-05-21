package org.bmn.Bulenkov_lesson_11.steps;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RunStep {

    private Step stepFourModifier;

    @Autowired
    public RunStep(StepFourModifier stepFourModifier) {
        this.stepFourModifier = stepFourModifier;
        System.out.println("Четвертый шаг: " + stepFourModifier.modify("Va%во~%оквеЙжa"));
    }
}
