package OliveiraJuliano.ExemploGradle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @author Juliano Oliveira
 * @version 1.0
 * @since 4/18/2020
 */
@SpringBootApplication
public class ExemploGradleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExemploGradleApplication.class, args);
		System.out.println("hello world gradle");
	}

}
