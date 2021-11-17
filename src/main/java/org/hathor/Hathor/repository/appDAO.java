package org.hathor.Hathor.repository;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hathor.Hathor.model.Usuario;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Component;

@Component
public class appDAO extends HibernateDaoSupport {
	@Autowired
	public appDAO(SessionFactory factory) {
		super.setSessionFactory(factory);
	}
	
	public Usuario validaLogin(Usuario usuario) {
		Session session = getSessionFactory().getCurrentSession();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Usuario> criteria = builder.createQuery(Usuario.class);
		Root<Usuario> usuarioRoot=criteria.from(Usuario.class);
		criteria.select(usuarioRoot);
		criteria.where(builder.equal(usuarioRoot.get("email"), usuario.getEmail()));
		criteria.where(builder.equal(usuarioRoot.get("senha"), usuario.getSenha()));
		usuario = session.createQuery(criteria).getSingleResult();
		return usuario;
	}
}
