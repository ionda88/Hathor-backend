package org.hathor.Hathor.repository;



import org.hathor.Hathor.model.Postagem;
import org.hathor.Hathor.model.Topico;
import org.hathor.Hathor.model.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface PostagemRepository extends CrudRepository<Postagem, Long> {

	@Query("SELECT p FROM Postagem p WHERE p.idTopico = :idTopico")
	public Iterable<Postagem> listaPostagensTopicos(@Param("idTopico")int idTopico); 
}
