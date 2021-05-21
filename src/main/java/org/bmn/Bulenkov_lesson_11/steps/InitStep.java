package org.bmn.Bulenkov_lesson_11.steps;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.annotation.AnnotationAwareOrderComparator;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Collections;
import java.util.List;

@Component
public class InitStep {

    private List<StringModifer> steps;

    @Autowired
    public InitStep(List<StringModifer> steps) {
        this.steps = steps;
    }

    @PostConstruct
    public void init() {
        Collections.sort(steps, AnnotationAwareOrderComparator.INSTANCE);
    }

    public void modifier(String source) {
        String one = steps.get(0).modify(source);
        System.out.println(one);
        String two = steps.get(1).modify(one);
        System.out.println(two);
        String three = steps.get(2).modify(two);
        System.out.println(three);
        String four = steps.get(3).modify(three);
        System.out.println(four);
    }
}
