package oliveirajuliano.injecaodedependecia.model;

import oliveirajuliano.injecaodedependecia.interfaces.IAnimal;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author Juliano Oliveira
 * @version 1.0
 * @since 4/18/2020
 */
@Component
@Primary
@Qualifier("dog")
public class Dog implements IAnimal {

    @Override
    public void comunicar() {
        System.out.println("auau");
    }
}