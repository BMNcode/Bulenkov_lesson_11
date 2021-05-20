package org.bmn.Bulenkov_lesson_11.steps;

import org.springframework.core.Ordered;

public interface StringModifer extends Ordered {

    String modify(String source);

}
