package org.hathor.Hathor.repository;



import org.hathor.Hathor.model.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

	@Query("SELECT u FROM Usuario u WHERE u.email = :email and u.senha = :senha")
	public Usuario findByEmailSenha(@Param("email")String
			email, @Param("senha")String senha); 
	
	@Query("SELECT u FROM Usuario u WHERE u.email = :email")
	public Usuario findByEmail(@Param("email")String email); 
}
