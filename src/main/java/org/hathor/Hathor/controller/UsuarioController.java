package org.hathor.Hathor.controller;


import org.hathor.Hathor.model.Usuario;
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
	UsuarioRepository repository;
	
	@CrossOrigin
	@PostMapping(path = "/validaLogin",
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Usuario validaLogin(@RequestBody String s) {
		Gson gson = new Gson();
		Usuario usuario = gson.fromJson(s, Usuario.class);

		usuario = repository.findByEmailSenha(usuario.getEmail(), usuario.getSenha());

		return usuario;
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
	
	
}