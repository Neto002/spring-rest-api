package com.neto.rest.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neto.rest.api.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
