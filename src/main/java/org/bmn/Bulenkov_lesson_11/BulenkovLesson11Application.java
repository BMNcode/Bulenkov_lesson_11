package org.bmn.Bulenkov_lesson_11;

import org.bmn.Bulenkov_lesson_11.springchain.ChainTranscript;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BulenkovLesson11Application {

	private final ChainTranscript chainTranscript;

	public BulenkovLesson11Application(ChainTranscript chainTranscript) {
		this.chainTranscript = chainTranscript;
	}

	public static void main(String[] args) {
		SpringApplication.run(BulenkovLesson11Application.class, args);

	}

}
