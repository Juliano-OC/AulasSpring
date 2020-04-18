package oliveirajuliano.injecaodedependecia;

import oliveirajuliano.injecaodedependecia.interfaces.IAnimal;
import oliveirajuliano.injecaodedependecia.model.Cat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Juliano Oliveira
 * @version 1.0
 * @since 4/18/2020
 */
@Component
public class Pet {

    //Numero 3 - A Annotation @Autowired faz a injeção de dependencia automaticamente, sem precisarmos declarar construtor.
    @Autowired
    @Qualifier("cat")
    private IAnimal iAnimal;

    public void execute() {
        iAnimal.comunicar();
    }

    //Numero 2 - baixo acoplamento. A aplicacao envia a classe que deve ser instanciada por construtor.
//    public Pet(IAnimal iAnimal) {
//        this.iAnimal = iAnimal;
//    }

    //Numero 1 - Classe pet fortemente acoplada com a classe Gato e Cachorro.Precisamos entrar no código e modificar a instanciação informando qual classe queremos.
//    public void execute() {
//        iAnimal = new Cat();
//        iAnimal.comunicar();
//    }
}