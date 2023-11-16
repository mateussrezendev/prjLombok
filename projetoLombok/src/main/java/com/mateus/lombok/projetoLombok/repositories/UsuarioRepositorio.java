package com.mateus.lombok.projetoLombok.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mateus.lombok.projetoLombok.entities.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long>{

}