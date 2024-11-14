package com.emilio.modelos;


import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "canciones")
public class Cancion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	// modificacion de caracteres minimos
	@Size(min = 5, message = "El titulo debe tener almenos 5 caracteres")
	private String titulo;
	
	@Size(min = 3, message = "El artista debe tener almenos 3 caracteres")
	private String artista;
	
	@Size(min = 3, message = "El album debe tener almenos 3 caracteres")
	private String album;
	
	@Size(min = 3, message = "El genero debe tener almenos 3 caracteres")
	private String genero;
	
	@Size(min = 3, message = "El idioma debe tener almenos 3 caracteres")
	private String idioma;
	
	@Column(name = "fecha_creacion", updatable = false)
	private Date fechaCreacion;
	
	@Column(name = "fecha_actualizacion")
	private Date fechaActualizacion;
	
	@PrePersist
	protected void onCreate() {
		fechaCreacion = new Date();
	}
	
	@PreUpdate
	protected void onUpdate() {
		fechaActualizacion = new Date();
	}

	public Cancion() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Date getFechaActualizacion() {
		return fechaActualizacion;
	}

	public void setFechaActualizacion(Date fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}
	
}
