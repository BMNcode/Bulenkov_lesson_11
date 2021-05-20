package org.bmn.Bulenkov_lesson_11.steps;

import org.springframework.stereotype.Component;

@Component
public class StepOneModifer extends Step implements StringModifer {

    @Override
    public String modify(String source) {
        return source.toLowerCase();
    }

    @Override
    public int getOrder() {
        return 1;
    }
}
