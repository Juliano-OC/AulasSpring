package oliveirajuliano.exemploescopo;

import oliveirajuliano.exemploescopo.DAO.ClassDAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author Juliano Oliveira
 * @version 1.0
 * @since 4/18/2020
 */
@SpringBootApplication
public class ExemploescopoApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(ExemploescopoApplication.class, args);

		//Desta forma o objectDAO1 e objectDAO2 serão a mesma instância, isso devido ao fato que o Spring controla os Components com o pattern Singleton.

		//Para que isso não aconteça, devemos utilizar nas classes:
		//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)

		ClassDAO objectDAO1 = applicationContext.getBean(ClassDAO.class);
		ClassDAO objectDAO2 = applicationContext.getBean(ClassDAO.class);

		System.out.println("Objeto DAO: " + objectDAO1);
		System.out.println("Objeto JDBC: " + objectDAO1.getObjectJDBC());

		System.out.println("Objeto DAO: " + objectDAO2);
		System.out.println("Objeto JDBC: " + objectDAO2.getObjectJDBC());
	}
}