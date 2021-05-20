package org.bmn.Bulenkov_lesson_11.steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StepTwoModifier extends Step implements StringModifer {


    private StepOneModifer stepOneModifer;

    @Autowired
    public StepTwoModifier(StepOneModifer stepOneModifer) {
        this.stepOneModifer = stepOneModifer;
    }


    @Override
    public String modify(String stepOne) {
        String stepTwo = stepOneModifer.modify(stepOne);
        return stepTwo.substring(2) + stepTwo.substring(0, 2);
    }

    @Override
    public int getOrder() {
        return 2;
    }
}
