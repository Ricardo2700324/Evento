package com.ricardo.eventoapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.ricardo.eventoapp.models.Convidado;
import com.ricardo.eventoapp.models.Evento;

public interface ConvidadoRepository extends CrudRepository<Convidado, String> {

	Iterable<Convidado> findByEvento(Evento evento);
}
