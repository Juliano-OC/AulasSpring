package OliveiraJuliano.ExemploGradleWEBRestController.controller;

import OliveiraJuliano.ExemploGradleWEBRestController.model.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * @author Juliano Oliveira
 * @version 1.0
 * @since 4/18/2020
 */
@RestController
public class ClientController {

    @GetMapping("/clientes")
    public Client getClient() {

        Client client = new Client();
        client.setName("Juliano");
        return client;
    }

    @GetMapping("/arrayclientes")
    public ArrayList<Client> getClients() {

        Client client1 = new Client();
        client1.setName("Juliano");

        Client client2 = new Client();
        client2.setName("Joana");

        ArrayList<Client> clientes = new ArrayList<>();
        clientes.add(client1);
        clientes.add(client2);
        return clientes;
    }
}