
package barberbook.repository;

import barberbook.entity.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AgendamentoRepository extends JpaRepository <Agendamento, Long>{
    
}
