package org.bmn.Bulenkov_lesson_11;

import org.bmn.Bulenkov_lesson_11.steps.InitStep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RunStep {

    private InitStep initStep;

    @Autowired
    public RunStep(InitStep initStep) {
        this.initStep = initStep;
        initStep.modifier("Va%во~%оквеЙжa");
    }

    public static void main(String[] args) {
        SpringApplication.run(RunStep.class, args);
    }
}
