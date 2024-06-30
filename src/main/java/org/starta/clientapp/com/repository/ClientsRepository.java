package org.starta.clientapp.com.repository;

import org.starta.clientapp.com.model.Clients;

import java.util.List;

public interface ClientRepository {

    Clients create(Clients client);

    List<Clients> getAllClients();

    Clients getClientById(String id);

    void deleteClientById(String id);
}
