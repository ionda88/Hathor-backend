package org.hathor.Hathor.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
	@Id @GeneratedValue
	@Column(name = "id")
	private int id;
	@Column(name = "nome")
	private String nome;
	@Column(name = "dt_cadastro")
	private Date dtCadastro;
	@Column(name = "email")
	private String email;
	@Column(name = "senha")
	private String senha;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Usuario(int id, String nome, Date dtCadastro, String email, String senha) {
		super();
		this.id = id;
		this.nome = nome;
		this.dtCadastro = dtCadastro;
		this.email = email;
		this.senha = senha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDtCadastro() {
		return dtCadastro;
	}
	public void setDtCadastro(Date dtCadastro) {
		this.dtCadastro = dtCadastro;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
}
