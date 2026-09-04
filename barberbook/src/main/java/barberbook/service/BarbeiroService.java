package barberbook.service;

import barberbook.entity.Barbeiro;
import barberbook.repository.BarbeiroRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service

public class BarbeiroService {

    @Autowired
    private BarbeiroRepository service;

    public Barbeiro salvarBarbeiro(Barbeiro barbeiro) {
        return service.save(barbeiro);
    }

    public List<Barbeiro> verTodos() {
        return service.findAll();
    }

    public Optional<Barbeiro> buscaPorId(@PathVariable Long id) {
        return service.findById(id);
    }
    public void deleteBarbeiro(Long id){
        service.deleteById(id);
    }

}
