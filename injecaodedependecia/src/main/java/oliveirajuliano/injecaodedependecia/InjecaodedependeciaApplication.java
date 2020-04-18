package oliveirajuliano.injecaodedependecia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author Juliano Oliveira
 * @version 1.0
 * @since 4/18/2020
 */
@SpringBootApplication
public class InjecaodedependeciaApplication {

	public static void main(String[] args) {

//		Numero 3 - Criamos uma variável ApplicationContext para ter o contexto da aplicação.
		ApplicationContext applicationContext = SpringApplication.run(InjecaodedependeciaApplication.class, args);
//		SpringApplication.run(InjecaodedependeciaApllication.class, args);

		Pet pet = applicationContext.getBean(Pet.class);
		pet.execute();

//		Primeira maneira. muda o objeto dentro do método execute diretamente na classe. Muito acoplado!
//		Pet pet = new Pet();
//		pet.execute();

//		Segunda maneira, reduzimos o acoplamento.Desta forma enviamos qual objetio gostariamos de trabalhar.
//		Pet pet1 = new Pet(new Cat());
//		pet1.execute();
//
//		Pet pet2 = new Pet(new Dog());
//		pet2.execute();
//
	}
}