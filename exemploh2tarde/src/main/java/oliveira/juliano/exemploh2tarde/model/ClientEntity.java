package oliveira.juliano.exemploh2tarde.model;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;

//SpringBoot
@Component

//Lombok
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@ToString

//JPA - Java persistence API
@Entity
@Table(name = "cliente")
public class ClientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;

    @Column(name = "nome")
    private String name;

    @Column(name = "renda")
    private double income;
}