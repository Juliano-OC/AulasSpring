package oliveirajuliano.exemplopostconstructpredestroy.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

/**
 * @author Juliano Oliveira
 * @version 1.0
 * @since 4/18/2020
 */
@Component
@Getter @Setter
@AllArgsConstructor
@ToString
public class Client {

    private String name;

    public Client() {
        System.out.println("Classe cliente");
    }
}
