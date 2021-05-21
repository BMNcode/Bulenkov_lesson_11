package org.bmn.Bulenkov_lesson_11.steps;

import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
public class StepOneModifer extends Step implements StringModifer {

    //source to lower case
    @Override
    public String modify(String source) {
        String result = source.toLowerCase();
        System.out.println("Первый шаг: " + result);
        return result;
    }

    @Override
    public int getOrder() {
        return 1;
    }
}
