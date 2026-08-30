package barberbook.service;

import barberbook.entity.Servico;
import barberbook.repository.ServicoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicoService {

    @Autowired
    private ServicoRepository repository;

    public Servico salvarServico(Servico servico) {
        return repository.save(servico);
    }

    public List <Servico> verTodos() {
        return repository.findAll();
    }

    public Optional<Servico> buscarPorId(Long id) {
        return repository.findById(id);
    }
}
