package com.rafael.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafael.crud.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
