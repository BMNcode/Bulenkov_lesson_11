package org.bmn.Bulenkov_lesson_11.steps;

import org.bmn.Bulenkov_lesson_11.service.Performance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class StepFourModifier implements StringModifer {

    private final Performance performance;

    @Autowired
    public StepFourModifier(Performance performance) {
        this.performance = performance;
    }

    @Override
    public String modify(String source) {
        return source.chars()
                .filter(s -> performance.alphabet().containsKey(s))
                .mapToObj(String::valueOf)
                .map(s -> s.replace(s, performance.alphabet().get(s)))
                .collect(Collectors.joining());
    }

    @Override
    public int getOrder() {
        return 4;
    }
}
