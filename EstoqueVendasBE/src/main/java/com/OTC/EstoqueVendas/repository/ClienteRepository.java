package com.OTC.EstoqueVendas.repository;


import com.OTC.EstoqueVendas.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
