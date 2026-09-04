package barberbook.controller;

import barberbook.entity.Cliente;
import barberbook.service.ClienteService;
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
@RequestMapping("api/barberbook/cliente")
public class ClienteController {

    @Autowired
    private ClienteService service;

    @PostMapping
    public Cliente cadastrarCliente(@RequestBody Cliente cliente) {
        return service.salvarCliente(cliente);
    }

    @GetMapping
    public List<Cliente> verTodos() {
        return service.verTodos();
    }

    @GetMapping("/{id}")
    public Optional<Cliente> buscaPorId(@PathVariable Long id) {
        return service.buscaPorId(id);
    }
    
    @DeleteMapping ("/{id}")
    public void deleteCliente(@PathVariable Long id){
        service.deleteCliente(id);
    }
    

}
