package com.emilio.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emilio.modelos.Cancion;
import com.emilio.repositorios.RepositorioCanciones;

@Service
public class ServicioCanciones {

	@Autowired
	private RepositorioCanciones repositorio;
	
	public List<Cancion> obtenerTodasLasCanciones(){
		return repositorio.findAll();
	}
	
	public Cancion obtenerCancionPorId(long id) {
		return repositorio.findById(id).orElse(null);
	}
	
	public Cancion agregarCancion(Cancion cancion) {
		return repositorio.save(cancion);
	}
}
