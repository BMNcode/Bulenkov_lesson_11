package org.bmn.Bulenkov_lesson_11.steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StepThreeModifier implements StringModifer {


    //converting the first character to uppercase
    @Override
    public String modify(String source) {
        System.out.println("Третий шаг: ");
        String result = source.substring(0, 1).toUpperCase() + source.substring(1);
        return result;
    }

    @Override
    public int getOrder() {
        return 3;
    }
}
