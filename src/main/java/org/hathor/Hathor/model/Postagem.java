package org.hathor.Hathor.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "postagem")
public class Postagem {
	@Id @GeneratedValue
	@Column(name = "id")
	private int id;
	@Column(name = "corpo")
	private String corpo;
	@Column(name = "titulo")
	private String titulo;
	@Column(name = "id_usuario")
	private int idUsuario;
	@Column(name = "dt_postagem")
	private Date dtPostagem;
	public int getId() {
		return id;
	}
	public Postagem() {
	}
	public Postagem(int id, String corpo, String titulo, int idUsuario, Date dtPostagem) {
		super();
		this.id = id;
		this.corpo = corpo;
		this.titulo = titulo;
		this.idUsuario = idUsuario;
		this.dtPostagem = dtPostagem;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCorpo() {
		return corpo;
	}
	public void setCorpo(String corpo) {
		this.corpo = corpo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public Date getDtPostagem() {
		return dtPostagem;
	}
	public void setDtPostagem(Date dtPostagem) {
		this.dtPostagem = dtPostagem;
	}
	
}
