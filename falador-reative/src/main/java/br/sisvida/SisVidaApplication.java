package br.sisvida;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"br.sisvida"})
@SpringBootApplication
public class SisVidaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SisVidaApplication.class, args);
	}
}
