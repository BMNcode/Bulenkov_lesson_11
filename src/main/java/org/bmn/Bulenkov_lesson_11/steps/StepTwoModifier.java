package org.bmn.Bulenkov_lesson_11.steps;

import org.springframework.stereotype.Component;

@Component
public class StepTwoModifier implements StringModifer {

    //shift the line to the right
    @Override
    public String modify(String source) {
        System.out.println("Второй шаг: ");
        String result = source.substring(source.length() - 2) + source.substring(0, source.length() - 2);
        return result;
    }

    @Override
    public int getOrder() {
        return 2;
    }
}
