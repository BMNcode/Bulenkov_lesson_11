package org.bmn.Bulenkov_lesson_11.steps;

import org.springframework.stereotype.Service;

@Service
public class StepOneModifer implements StringModifer {

    @Override
    public String modify(String source) {
        return source.toLowerCase();
    }

    @Override
    public int getOrder() {
        return 1;
    }
}
