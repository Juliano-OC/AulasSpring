package OliveiraJuliano.ExemploGradleWEBRestController.model;

/**
 * @author Juliano Oliveira
 * @version 1.0
 * @since 4/18/2020
 */
public class Product {

    private String descricao;

    public Product() {
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Product{" +
                "descricao='" + descricao + '\'' +
                '}';
    }
}