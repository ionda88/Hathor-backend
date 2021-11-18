package org.hathor.Hathor.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "topico")
public class Topico {
	@Id @GeneratedValue
	@Column(name = "id")
	private int id;
	@Column(name = "nome_topico")
	private String nomeTopico;
	@Column(name = "id_usuario")
	private int idUsuario;
	
	public int getId() {
		return id;
	}
	public Topico() {
		
	}
	public Topico(int id, String nomeTopico, int idUsuario) {
		super();
		this.id = id;
		this.nomeTopico = nomeTopico;
		this.idUsuario = idUsuario;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomeTopico() {
		return nomeTopico;
	}
	public void setNomeTopico(String nomeTopico) {
		this.nomeTopico = nomeTopico;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
}
