package org.bmn.Bulenkov_lesson_11.steps;

import org.springframework.stereotype.Component;

@Component
public class StepOneModifer implements StringModifer {

    //source to lower case
    @Override
    public String modify(String source) {
        System.out.println("Первый Шаг");
        String result = source.toLowerCase();
        return result;
    }

    @Override
    public int getOrder() {
        return 1;
    }
}
