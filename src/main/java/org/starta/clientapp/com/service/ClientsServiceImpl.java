package org.starta.clientapp.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.starta.clientapp.com.model.Clients;
import org.starta.clientapp.com.repository.ClientRepository;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository repository;

    @Override
    public Clients createClient(Clients client) {
        return repository.create(client);
    }

    @Override
    public List<Clients> getAllClients() {
        return repository.getAllClients();
    }

    @Override
    public Clients getClientById(String id) {
        return repository.getClientById(id);
    }

    @Override
    public void deleteClientById(String id) {
        repository.deleteClientById(id);
    }
}
