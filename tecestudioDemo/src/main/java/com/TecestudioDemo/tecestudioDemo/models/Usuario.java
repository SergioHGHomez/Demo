package com.TecestudioDemo.tecestudioDemo.models;

public class Usuario {
	
	private long idUsuario;
	private String nomUsuario;
	private String usuario ;
	private String password ;
	
public Usuario(long idUsuario, String nomUsuario, String usuario, String password) {
		super();
		this.idUsuario = idUsuario;
		this.usuario = usuario;
		this.password = password;
	}

public Usuario(){}


public long getIdUsuario() {
	return idUsuario;
}

public void setIdUsuario(long idUsuario) {
	this.idUsuario = idUsuario;
}


public String getNomUsuario() {
	return nomUsuario;
}

public void setNomUsuario(String nomUsuario) {
	this.nomUsuario = nomUsuario;
}


public String getUsuario() {
	return usuario;
}

public void setUsuario(String usuario) {
	this.usuario = usuario;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}


}
