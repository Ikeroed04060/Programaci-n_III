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

    @Override
    @Transactional(readOnly = true)
    public Cliente findById(Long id){
        return clientesRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public Cliente save(Cliente cliente){
        return clientesRepository.save(cliente);}

    @Override
    @Transactional(readOnly = true)
    public void delete(Long id){
        clientesRepository.deleteById(id);}
}
