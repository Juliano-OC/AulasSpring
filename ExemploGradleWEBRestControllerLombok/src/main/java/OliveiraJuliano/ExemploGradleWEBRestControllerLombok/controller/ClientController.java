package OliveiraJuliano.ExemploGradleWEBRestControllerLombok.controller;

import OliveiraJuliano.ExemploGradleWEBRestControllerLombok.model.Client;
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
        client.setLastName("Oliveira");
        client.setEmail("julianooliveiracorrea@gmail.com");
        return client;
    }

    @GetMapping("/listaclientes")
    public ArrayList<Client> getListClient() {

        Client client1= new Client();
        client1.setName("Juliano");
        client1.setLastName("Oliveira");
        client1.setEmail("julianooliveiracorrea@gmail.com");

        Client client2 = new Client();
        client2.setName("Leonardo");
        client2.setLastName("Oliveira");
        client2.setEmail("le_o.c@gmail.com");

        ArrayList<Client> clients = new ArrayList<>();
        clients.add(client1);
        clients.add(client2);

        return clients;
    }
}
