package com.example.demo.models.Repository;

import com.example.demo.models.Entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface IClientesRepository extends CrudRepository<Cliente,Long> {
}
