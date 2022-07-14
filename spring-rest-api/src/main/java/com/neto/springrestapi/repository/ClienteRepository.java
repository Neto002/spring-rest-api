package com.neto.springrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neto.springrestapi.model.Cliente;


public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
