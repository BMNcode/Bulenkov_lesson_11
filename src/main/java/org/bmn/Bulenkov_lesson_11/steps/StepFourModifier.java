package org.bmn.Bulenkov_lesson_11.steps;

import org.bmn.Bulenkov_lesson_11.alphabet.Alphabet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StepFourModifier implements StringModifer {

    private final Alphabet alphabet;

    @Autowired
    public StepFourModifier(StepThreeModifier stepThreeModifier, Alphabet alphabet) {
        this.alphabet = alphabet;
    }

    //replacing characters according to the alphabet
    @Override
    public String modify(String source) {

        System.out.println("Четвертый шаг: ");
        StringBuilder sb = new StringBuilder();

        for (char c : source.toCharArray()) {
            if (alphabet.alphabet().containsKey(String.valueOf(c))) {
                sb.append(alphabet.alphabet().get(String.valueOf(c)));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    @Override
    public int getOrder() {
        return 4;
    }
}
