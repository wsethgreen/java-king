package io.github.wsethgreen.backend;

import org.springframework.boot.SpringApplication;

public class TestBackendApplication {

	public static void main(String[] args) {
		SpringApplication.from(Application::main).with(TestcontainersConfiguration.class).run(args);
	}

}
