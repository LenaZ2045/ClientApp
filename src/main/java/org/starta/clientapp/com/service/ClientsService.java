package org.starta.clientapp.com.service;

import org.starta.clientapp.com.model.Clients;

import java.util.List;

public interface ClientsService {

    Clients createClient(Clients client);

    List<Clients> getAllClients();

    Clients getClientById(String id);

    void deleteClientById(String id);
}