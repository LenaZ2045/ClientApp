package org.starta.clientapp.com.repository;

import jakarta.annotation.PostConstruct;
import lombok.Getter;
import org.springframework.stereotype.Repository;
import org.starta.clientapp.com.model.Clients;

import java.util.*;

@Getter
@Repository
public class ClientsRepositoryImpl implements ClientsRepository {

    private final Map<String, Clients> clientsMap = new HashMap<>();

    @PostConstruct
    private void init() {
        Clients clientOne = new Clients(UUID.randomUUID().toString(),
                "Melik Igor",
                "clientOne@yahoo.com",
                "904-115-1239"
        );
        Clients clientTwo = new Clients(UUID.randomUUID().toString(),
                "Moller Brian",
                "clientTwo@comcast.net",
                "904-219-3748"
        );
        clientsMap.put(UUID.randomUUID().toString(), clientOne);
        clientsMap.put(UUID.randomUUID().toString(), clientTwo);
    }
    @Override
    public Clients createClient(Clients client) {
        Clients addNewClient = new Clients(client.getName(), client.getEmail(), client.getPhone());
        addNewClient.setId(UUID.randomUUID().toString());
        clientsMap.put(addNewClient.getId(), addNewClient);
        return addNewClient;
    }

    @Override
    public List<Clients> getAllClients() {
        return new ArrayList<>(clientsMap.values());
    }

    @Override
    public Clients getClientById(String id) {
        return clientsMap.get(id);
    }

    @Override
    public void deleteClientById(String id) {
        clientsMap.remove(id);
    }
}