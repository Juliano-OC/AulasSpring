package OliveiraJuliano.ExemploGradleWEB;

import OliveiraJuliano.ExemploGradleWEB.model.Calculadora;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Juliano Oliveira
 * @version 1.0
 * @since 4/18/2020
 */
@SpringBootApplication
public class ExemploGradleWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExemploGradleWebApplication.class, args);

		System.out.println("Hellow world SpringBOOT com WEB");

		Calculadora calculadora = new Calculadora();
		calculadora.setValor1(9.0);
		calculadora.setValor2(12.0);

		System.out.println("Soma dos valores: " + calculadora.somarValores());
		
	}
}