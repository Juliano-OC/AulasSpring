package oliveirajuliano.exemploescopo.DAO;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author Juliano Oliveira
 * @version 1.0
 * @since 4/18/2020
 */
@Component
//Opcao1
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//Opcao2
//@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
@Getter @Setter
public class ClassDAO {

    @Autowired
    ClassJDBC objectJDBC;
}
