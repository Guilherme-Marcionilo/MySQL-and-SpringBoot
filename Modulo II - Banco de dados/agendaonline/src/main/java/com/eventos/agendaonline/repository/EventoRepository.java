package com.eventos.agendaonline.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eventos.agendaonline.models.Evento;

public interface EventoRepository extends JpaRepository<Evento, String>{

	Evento findByCodigo(long codigo);
}