package com.projetoAgenda.projetoAgenda.controller;

import com.projetoAgenda.projetoAgenda.repository.EventoRepository;
import com.projetoAgenda.projetoAgenda.elements.Evento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/eventos")
public class AgendaController {

    @Autowired
    private EventoRepository eventoRepository;

    // Listar eventos
    @GetMapping
    public List<Evento> listarEventos() {
        return eventoRepository.findAll();
    }

    // Adicionar evento
    @PostMapping
    public Evento adicionarEvento(@RequestBody Evento evento) {
        return eventoRepository.save(evento);
    }

    // Atualizar evento
    @PutMapping("/{id}")
    public Evento atualizarEvento(@PathVariable Long id, @RequestBody Evento eventoAtualizado) {
        eventoAtualizado.setId(id);
        return eventoRepository.save(eventoAtualizado);
    }

    // Deletar evento
    @DeleteMapping("/{id}")
    public void deletarEvento(@PathVariable Long id) {
        eventoRepository.deleteById(id);
    }
}
