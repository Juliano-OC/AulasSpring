package externalclasses;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Juliano Oliveira
 * @version 1.0
 * @since 4/18/2020
 */
@Component
@Getter @Setter
public class ClassDAO {

    @Autowired
    ClassJDBC objectJDBC;
}