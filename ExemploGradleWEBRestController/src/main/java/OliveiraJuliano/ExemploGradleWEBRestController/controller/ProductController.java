package OliveiraJuliano.ExemploGradleWEBRestController.controller;

import OliveiraJuliano.ExemploGradleWEBRestController.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Juliano Oliveira
 * @version 1.0
 * @since 4/18/2020
 */
@RestController
public class ProductController {

    @GetMapping("/produtos")
    public String getProducts() {
        return "Area do produto!";
    }

    @GetMapping("/produto")
    public Product getProduct() {
        Product product = new Product();
        product.setDescricao("Lanterna");
        return product;
    }
}