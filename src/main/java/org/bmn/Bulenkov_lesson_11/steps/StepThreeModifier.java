package org.bmn.Bulenkov_lesson_11.steps;

import org.springframework.stereotype.Service;

@Service
public class StepThreeModifier implements StringModifer {

    @Override
    public String modify(String source) {
        return source.substring(0, 1).toUpperCase() + source.substring(1);
    }

    @Override
    public int getOrder() {
        return 3;
    }
}
