package com.projetoAgenda.projetoAgenda.repository;

import com.projetoAgenda.projetoAgenda.elements.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoRepository extends JpaRepository<Evento, Long> {
}
