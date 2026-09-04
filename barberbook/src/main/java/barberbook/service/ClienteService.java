package barberbook.service;

import barberbook.entity.Cliente;
import barberbook.repository.ClienteRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    public Cliente salvarCliente(Cliente cliente) {
        return repository.save(cliente);
    }

    public List <Cliente>verTodos() {
        return repository.findAll();
    }

    public Optional <Cliente> buscaPorId(Long id) {
        return repository.findById(id);

    }
    public void deleteCliente(Long id){
        repository.deleteById(id);
        
    
    }
    
}
