package OliveiraJuliano.ExemploGradleWEBRestController.model;

/**
 * @author Juliano Oliveira
 * @version 1.0
 * @since 4/18/2020
 */
public class Client {

    private String name;

    public Client() {
    }

    public Client(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                '}';
    }
}