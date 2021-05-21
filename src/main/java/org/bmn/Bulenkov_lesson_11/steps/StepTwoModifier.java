package org.bmn.Bulenkov_lesson_11.steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
public class StepTwoModifier extends Step implements StringModifer {


    private Step stepOneModifer;

    @Autowired
    public StepTwoModifier(StepOneModifer stepOneModifer) {
        this.stepOneModifer = stepOneModifer;
    }

    //shift the line to the right
    @Override
    public String modify(String stepOne) {
        String stepTwo = stepOneModifer.modify(stepOne);
        String result = stepTwo.substring(stepTwo.length() - 2) + stepTwo.substring(0, stepTwo.length() - 2);
        System.out.println("Второй шаг: " + result);
        return result;
    }

    @Override
    public int getOrder() {
        return 2;
    }
}
