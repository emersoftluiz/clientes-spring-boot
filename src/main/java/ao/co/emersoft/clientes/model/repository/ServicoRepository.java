package ao.co.emersoft.clientes.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ao.co.emersoft.clientes.model.entity.Servico;

public interface ServicoRepository extends JpaRepository<Servico, Integer> {

}
