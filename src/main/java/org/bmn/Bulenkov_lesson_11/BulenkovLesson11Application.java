package org.bmn.Bulenkov_lesson_11;

import org.bmn.Bulenkov_lesson_11.steps.StepFourModifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BulenkovLesson11Application {

	private StepFourModifier stepFourModifier;
	@Autowired
	public BulenkovLesson11Application(StepFourModifier stepFourModifier) {
		this.stepFourModifier = stepFourModifier;
		System.out.println(stepFourModifier.modify("Va%во~%оквеЙжa"));
	}

	public static void main(String[] args) {
		SpringApplication.run(BulenkovLesson11Application.class, args);
	}

}
