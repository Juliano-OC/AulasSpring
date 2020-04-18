package externalclasses;

import org.springframework.stereotype.Component;

/**
 * @author Juliano Oliveira
 * @version 1.0
 * @since 4/18/2020
 */
@Component
public class ClassJDBC {

    public ClassJDBC() {
        System.out.println("Conexão JDBC");
    }
}