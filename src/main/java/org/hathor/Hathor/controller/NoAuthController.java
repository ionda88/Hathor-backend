package org.hathor.Hathor.controller;


import java.util.Date;

import org.hathor.Hathor.model.Usuario;
import org.hathor.Hathor.service.AppService;
import org.jboss.jandex.TypeTarget.Usage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

@RestController
@RequestMapping("/noAuth/rest")
public class NoAuthController {
	
	@Autowired
	private AppService appService;
	
	@PostMapping(path = "/validaLogin",
			consumes = MediaType.APPLICATION_JSON_VALUE, 
	        produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Usuario validaLogin(@RequestBody String s) {
		Gson gson = new Gson();
		Usuario usuario = gson.fromJson(s, Usuario.class);
		
		usuario = appService.getAppDAO().validaLogin(usuario);
		
		return usuario;
	}
}
