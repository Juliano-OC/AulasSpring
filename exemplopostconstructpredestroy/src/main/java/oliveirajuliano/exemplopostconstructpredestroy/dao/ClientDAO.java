package oliveirajuliano.exemplopostconstructpredestroy.dao;

import lombok.Getter;
import lombok.Setter;
import oliveirajuliano.exemplopostconstructpredestroy.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Juliano Oliveira
 * @version 1.0
 * @since 4/18/2020
 */
@Component
@Getter @Setter
public class ClientDAO {

    @Autowired
    private Client client;

    @PostConstruct
    public void postConstructor() {
        System.out.println("objeto criado");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("objeto finalizado");
    }
}
