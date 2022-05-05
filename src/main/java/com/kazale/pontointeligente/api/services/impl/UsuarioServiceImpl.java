package com.kazale.pontointeligente.api.services.impl;

import java.util.Optional;

import com.kazale.pontointeligente.api.entities.Usuario;
import com.kazale.pontointeligente.api.repositories.UsuarioRepository;
import com.kazale.pontointeligente.api.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public Optional<Usuario> buscarPorEmail(String email) {
		return Optional.ofNullable(this.usuarioRepository.findByEmail(email));
	}
}
