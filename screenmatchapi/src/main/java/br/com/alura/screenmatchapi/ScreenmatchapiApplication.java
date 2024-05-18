package br.com.alura.screenmatchapi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchapiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchapiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello Word!");
	}
}
