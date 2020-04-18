package oliveirajuliano.exemploescopo.DAO;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/**
 * @author Juliano Oliveira
 * @version 1.0
 * @since 4/18/2020
 */
@Component
//Opcao1
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//Opcao2
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ClassJDBC {

    public ClassJDBC() {
        System.out.println("Classe JDBC");
    }
}
