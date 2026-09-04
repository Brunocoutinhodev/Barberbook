package barberbook.service;

import barberbook.entity.Agendamento;
import barberbook.repository.AgendamentoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgendamentoService {

    @Autowired
    private AgendamentoRepository repository;

    public Agendamento salvarAgendamento(Agendamento agendamento) {
        return repository.save(agendamento);
    }

    public List <Agendamento> verTodos() {
        return repository.findAll();
    }

    public Optional<Agendamento> buscaPorId(Long id) {
        return repository.findById(id);
    }
    public void deleteAgendamento(Long id){
        repository.deleteById(id);
    }

}
