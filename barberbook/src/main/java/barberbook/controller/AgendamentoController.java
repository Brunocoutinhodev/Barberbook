package barberbook.controller;

import barberbook.entity.Agendamento;
import barberbook.service.AgendamentoService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("api/barberbook/agendamento")
public class AgendamentoController {

    @Autowired
    private AgendamentoService service;

    @PostMapping
    public Agendamento salvarAgendamento(@RequestBody Agendamento agendamento) {
        return service.salvarAgendamento(agendamento);
    }

    @GetMapping
    public List <Agendamento> verTodos() {
        return service.verTodos();
    }

    @GetMapping ("/{id}")
    public Optional<Agendamento> buscaPorId(@PathVariable Long id) {
        return service.buscaPorId(id);
    }
}
