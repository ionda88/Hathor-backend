package org.hathor.Hathor.repository;



import org.hathor.Hathor.model.Topico;
import org.hathor.Hathor.model.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface TopicoRepository extends CrudRepository<Topico, Long> {

}
