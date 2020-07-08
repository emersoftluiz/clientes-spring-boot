package ao.co.emersoft.clientes.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ao.co.emersoft.clientes.model.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
	
}
