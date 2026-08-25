package barberbook.controller;

import barberbook.entity.Barbeiro;
import barberbook.service.BarbeiroService;
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
@RequestMapping("api/barberbook/barbeiro")
public class BarbeiroController {

    @Autowired
    private BarbeiroService service;

    @PostMapping
    public Barbeiro salvarBarbeiro(@RequestBody Barbeiro barbeiro) {
        return service.salvarBarbeiro(barbeiro);
    }

    @GetMapping
    public List<Barbeiro> verTodos() {
        return service.verTodos();
    }

    @GetMapping("/{id}")
    public Optional<Barbeiro> buscaPorId(@PathVariable Long id) {
        return service.buscaPorId(id);
    }
}
