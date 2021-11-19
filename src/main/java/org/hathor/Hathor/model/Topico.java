package org.hathor.Hathor.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "topico")
public class Topico {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	@Column(name = "id")
	private int id;
	@Column(name = "nome_topico")
	private String nomeTopico;
	@Column(name = "descricao_topico")
	private String descricaoTopico;
	@Column(name = "id_usuario")
	private int idUsuario;
	
	public int getId() {
		return id;
	}
	public Topico() {
		
	}
	public Topico(int id, String nomeTopico, String descricaoTopico,int idUsuario) {
		super();
		this.id = id;
		this.nomeTopico = nomeTopico;
		this.descricaoTopico = descricaoTopico;
		this.idUsuario = idUsuario;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomeTopico() {
		return nomeTopico;
	}
	public String getDescricaoTopico() {
		return descricaoTopico;
	}
	public void setDescricaoTopico(String descricaoTopico) {
		this.descricaoTopico = descricaoTopico;
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
