package org.hathor.Hathor.controller;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hathor.Hathor.model.Postagem;
import org.hathor.Hathor.model.Topico;
import org.hathor.Hathor.model.Usuario;
import org.hathor.Hathor.repository.PostagemRepository;
import org.hathor.Hathor.repository.TopicoRepository;
import org.hathor.Hathor.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

@RestController
@RequestMapping("/api")
public class UsuarioController {

	@Autowired
	UsuarioRepository repositoryUsuario;
	
	@Autowired
	TopicoRepository repositoryTopico;
	
	@Autowired
	PostagemRepository repositoryPostagem;
	
	@CrossOrigin
	@PostMapping(path = "/validaLogin",
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Usuario validaLogin(@RequestBody String s) {
		Gson gson = new Gson();
		Usuario usuario = gson.fromJson(s, Usuario.class);

		usuario = repositoryUsuario.findByEmailSenha(usuario.getEmail(), usuario.getSenha());

		return usuario;
	}
	
	@CrossOrigin
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
	
	@CrossOrigin
	@GetMapping("/getTopicos")
	public List<Topico> getTopicos() {
		List<Topico> listTopicos = new ArrayList<Topico>();
		repositoryTopico.findAll().forEach(listTopicos::add);
		return listTopicos;
	}
	
	@CrossOrigin
	@PostMapping(path = "/listaPostagensTopicos",
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<Postagem> listaPostagensTopicos(@RequestBody String s) {
		Gson gson = new Gson();
		Topico topico = gson.fromJson(s, Topico.class);
		List<Postagem> listPostagem = new ArrayList<Postagem>();
		repositoryPostagem.listaPostagensTopicos(topico.getId()).forEach(listPostagem::add);;

		return listPostagem;
	}
	
	@CrossOrigin
	@PostMapping(path = "/signUp",
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Usuario signUp(@RequestBody String s) {
		Gson gson = new Gson();
		Usuario usuario = gson.fromJson(s, Usuario.class);

		Usuario usuarioTeste = repositoryUsuario.findByEmail(usuario.getEmail());
		if(usuarioTeste != null) {
			usuario = null;
		} else {
			usuario.setDtCadastro(new Date());
			repositoryUsuario.save(usuario);
		}

		return usuario;
	}
	
	@CrossOrigin
	@PostMapping(path = "/salvarNovoTopico",
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Topico salvarNovoTopico(@RequestBody String s) {
		Gson gson = new Gson();
		Topico novoTopico = gson.fromJson(s, Topico.class);

		novoTopico = repositoryTopico.save(novoTopico);

		return novoTopico;
	}
	
	
	@CrossOrigin
	@PostMapping(path = "/salvarNovaPostagem",
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Postagem salvarNovaPostagem(@RequestBody String s) {
		Gson gson = new Gson();
		Postagem novaPostagem = gson.fromJson(s, Postagem.class);

		novaPostagem = repositoryPostagem.save(novaPostagem);

		return novaPostagem;
	}
}