package barberbook.controller;

import barberbook.entity.Servico;
import barberbook.service.ServicoService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("api/barberbook/servico")
public class ServicoController {

    @Autowired
    private ServicoService service;

    @PostMapping
    public Servico salvarServico(@RequestBody Servico servico) {
        return service.salvarServico(servico);
    }

    @GetMapping
    public List <Servico> verTodos() {
        return service.verTodos();
    }

    @GetMapping ("/{id}")
    public Optional<Servico> buscaPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }
    
    @DeleteMapping ("/{id}")
    public void deleteServico(@PathVariable Long id){
        service.deleteServico(id);
    }
    

}
