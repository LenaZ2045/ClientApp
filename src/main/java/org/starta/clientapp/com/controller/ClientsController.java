package org.starta.clientapp.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.starta.clientapp.com.model.Clients;
import org.starta.clientapp.com.service.ClientsService;

import java.util.List;

@RestController
@RequestMapping("clients")
public class ClientsController {

    @Autowired
    private ClientsService service;

    @PostMapping
    public Clients createClient(@RequestBody Clients client) {
        return service.createClient(client);
    }

    @GetMapping
    public List<Clients> getAllClients() {
        return service.getAllClients();
    }

    @GetMapping("/{id}")
    public Clients getClientById(@PathVariable String id) {
        return service.getClientById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteClientById(@PathVariable String id) {
        service.deleteClientById(id);
    }
}