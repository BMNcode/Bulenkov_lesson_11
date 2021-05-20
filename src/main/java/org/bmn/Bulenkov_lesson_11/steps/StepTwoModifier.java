package org.bmn.Bulenkov_lesson_11.steps;

import org.springframework.stereotype.Service;

@Service
public class StepTwoModifier implements StringModifer {

    @Override
    public String modify(String source) {
        return source.substring(2) + source.substring(0, 2);
    }

    @Override
    public int getOrder() {
        return 2;
    }
}
