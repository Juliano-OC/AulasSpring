package oliveirajuliano.injecaodedependecia.model;

import oliveirajuliano.injecaodedependecia.interfaces.IAnimal;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Juliano Oliveira
 * @version 1.0
 * @since 4/18/2020
 */
@Component
@Qualifier("cat")
public class Cat implements IAnimal {

    @Override
    public void comunicar() {
        System.out.println("miau");
    }
}