package org.bmn.Bulenkov_lesson_11.springchain;

import org.bmn.Bulenkov_lesson_11.steps.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.AnnotationAwareOrderComparator;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Collections;
import java.util.List;

@Service
public class ChainTranscript {

    private final StepOneModifer stepOneModifer;
    private final StepTwoModifier stepTwoModifier;
    private final StepThreeModifier stepThreeModifier;
    private final StepFourModifier stepFourModifier;

    @Autowired
    public ChainTranscript(StepOneModifer stepOneModifer, StepTwoModifier stepTwoModifier, StepThreeModifier stepThreeModifier, StepFourModifier stepFourModifier) {
        this.stepOneModifer = stepOneModifer;
        this.stepTwoModifier = stepTwoModifier;
        this.stepThreeModifier = stepThreeModifier;
        this.stepFourModifier = stepFourModifier;
    }


    public void modification(String source) {

        String step1 = stepOneModifer.modify(source);
        String step2 = stepTwoModifier.modify(step1);
        String step3 = stepThreeModifier.modify(step2);
        String step4 = stepFourModifier.modify(step3);

        System.out.println(source);
    }

}
