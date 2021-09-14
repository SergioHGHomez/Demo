package com.TecestudioDemo.tecestudioDemo.controllers;


import com.TecestudioDemo.tecestudioDemo.models.Usuario;

import org.springframework.web.bind.annotation.*;

@RestController
public class UsuarioController {
	
	@RequestMapping(value = "user/{idUsuario}")
	public Usuario getUsuario(@PathVariable long idUsuario ){
		Usuario usuarioTemp = new Usuario();
		usuarioTemp.setIdUsuario(idUsuario);
		usuarioTemp.setNomUsuario(null);
		usuarioTemp.setUsuario("sergiohh");
		usuarioTemp.setPassword("1234");
		return usuarioTemp;
	}
	
	@RequestMapping(value = "usuario12")
	public Usuario crear(){
		Usuario usuarioTemp = new Usuario();
		usuarioTemp.setIdUsuario(0);
		usuarioTemp.setNomUsuario("");
		usuarioTemp.setUsuario("sergiohh");
		usuarioTemp.setPassword("1234");
		return usuarioTemp;
	}
	
	@RequestMapping(value = "usuario4321")
	public Usuario eliminar(){
		Usuario usuarioTemp = new Usuario();
		usuarioTemp.setIdUsuario(0);
		usuarioTemp.setNomUsuario("");
		usuarioTemp.setUsuario("sergiohh");
		usuarioTemp.setPassword("1234");
		return usuarioTemp;
	}
	
	@RequestMapping(value = "usuario1234")
	public Usuario modificar(){
		Usuario usuarioTemp = new Usuario();
		usuarioTemp.setIdUsuario(0);
		usuarioTemp.setNomUsuario("");
		usuarioTemp.setUsuario("sergiohh");
		usuarioTemp.setPassword("1234");
		return usuarioTemp;
	}

}
