package org.bmn.Bulenkov_lesson_11.steps;

import org.bmn.Bulenkov_lesson_11.service.Performance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class StepFourModifier extends Step implements StringModifer {

//    private final Performance performance;
    private final StepThreeModifier stepThreeModifier;

    @Autowired
    public StepFourModifier(StepThreeModifier stepThreeModifier) {
        this.stepThreeModifier = stepThreeModifier;
    }

    @Override
    public String modify(String stepThree) {
        StringBuilder sb = new StringBuilder();
        String stepFour = stepThreeModifier.modify(stepThree);

        for (char c : stepFour.toCharArray()) {
            if (alphabet().containsKey(String.valueOf(c))) {
                sb.append(alphabet().get(String.valueOf(c)));
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

    public Map<String, String> alphabet() {
        Map<String, String> result = new HashMap<>();
        result.put("в", "д");
        result.put("о", "л");
        result.put("к", "ю");
        result.put("%", " ");
        result.put("~", "я");
        result.put("Ж", "j");
        result.put("п", "v");
        return result;
    }
}
