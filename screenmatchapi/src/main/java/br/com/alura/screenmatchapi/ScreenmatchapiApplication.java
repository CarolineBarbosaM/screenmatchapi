package br.com.alura.screenmatchapi;

import br.com.alura.screenmatchapi.model.DadosSerie;
import br.com.alura.screenmatchapi.service.ConsumeApi;
import br.com.alura.screenmatchapi.service.ConvertData;
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
		ConsumeApi consumeApi = new ConsumeApi();
		var json = consumeApi.getData("https://www.omdbapi.com/?t=gilmore+girls&apikey=d3d7cb42");

		System.out.println(json);

		ConvertData conversor = new ConvertData();
		DadosSerie data = conversor.getData(json, DadosSerie.class);

		System.out.println(data);
	}
}
