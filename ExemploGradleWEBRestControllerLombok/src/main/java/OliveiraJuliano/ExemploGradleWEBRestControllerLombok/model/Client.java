package OliveiraJuliano.ExemploGradleWEBRestControllerLombok.model;

import lombok.*;

/**
 * @author Juliano Oliveira
 * @version 1.0
 * @since 4/18/2020
 */
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter @Setter
public class Client {

    private String name;
    private String lastName;
    private String email;
}
