package com.contato_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.contato_api.model.Contato;

public interface Contatos extends JpaRepository<Contato, Long>{

}
