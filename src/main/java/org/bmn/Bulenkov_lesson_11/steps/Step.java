package org.bmn.Bulenkov_lesson_11.steps;

public abstract class Step implements StringModifer {

    @Override
    public String modify(String source) {
        return source;
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
