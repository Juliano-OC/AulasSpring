package oliveira.juliano.exemploh2tarde.repository;

import oliveira.juliano.exemploh2tarde.model.ClientEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository  extends CrudRepository<ClientEntity, Long> {
}