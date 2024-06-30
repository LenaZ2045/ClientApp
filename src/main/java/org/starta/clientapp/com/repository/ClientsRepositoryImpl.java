package org.starta.clientapp.com.repository;

import com.github.javafaker.Faker;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;
import org.starta.clientapp.com.model.Clients;

import java.util.*;

@Repository
public class ClientRepositoryImpl implements ClientRepository {

    private Map<String, Clients> clientsMap = new HashMap<>();

    @PostConstruct
    private void inti() {
        Clients clientOne = new Clients(UUID.randomUUID().toString(),
                Faker.instance().name().fullName(),
                "clientOne@yahoo.com",
                Faker.instance().phoneNumber()
        );
        Clients clientTwo = new Clients(UUID.randomUUID().toString(),
                Faker.instance().name().fullName(),
                "clientTwo@comcast.net",
                Faker.instance().phoneNumber()
        );
        clientsMap.put(UUID.randomUUID().toString(), clientOne);
        clientsMap.put(UUID.randomUUID().toString(), clientTwo);
    }
    @Override
    public Clients create(Clients client) {
        Clients clientThree = new Clients(client.getName().toString(), client.getEmail(), client.getPhone());
        clientThree.setId(UUID.randomUUID().toString());
        return clientThree;
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