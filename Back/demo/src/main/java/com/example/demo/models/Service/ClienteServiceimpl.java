package com.example.demo.models.Service;

import com.example.demo.models.Entity.Cliente;
import com.example.demo.models.Repository.IClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClienteServiceimpl implements IClienteService{
    @Autowired
    private IClientesRepository clientesRepository;
    @Override
    @Transactional(readOnly = true)
    public List<Cliente> findAll(){
        return (List<Cliente>) clientesRepository.findAll();
    }
}
