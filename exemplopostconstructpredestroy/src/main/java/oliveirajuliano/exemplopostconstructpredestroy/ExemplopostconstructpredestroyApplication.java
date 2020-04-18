package oliveirajuliano.exemplopostconstructpredestroy;

import oliveirajuliano.exemplopostconstructpredestroy.dao.ClientDAO;
import oliveirajuliano.exemplopostconstructpredestroy.model.Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author Juliano Oliveira
 * @version 1.0
 * @since 4/18/2020
 */
@SpringBootApplication
public class ExemplopostconstructpredestroyApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(ExemplopostconstructpredestroyApplication.class, args);

		ClientDAO clientDAO = applicationContext.getBean(ClientDAO.class);

		clientDAO.setClient(new Client("Juliano Oliveira"));

		System.out.println("objeto ClientDAO: " + clientDAO);
		System.out.println("objeto cliente: " + clientDAO.getClient());
	}
}