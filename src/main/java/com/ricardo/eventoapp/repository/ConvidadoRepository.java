package com.ricardo.eventoapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.ricardo.eventoapp.models.Convidado;

public interface ConvidadoRepository extends CrudRepository<Convidado, String> {

}
