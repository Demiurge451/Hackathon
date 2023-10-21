package com.undefind.hackathon.repository;


import com.undefind.hackathon.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer>  {
}
