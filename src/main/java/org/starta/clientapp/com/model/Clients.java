package org.starta.clientapp.com.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Clients {

    private String id;

    private String name;

    private String email;

    private String phone;

    public Clients() {
        // empty constructor
    }

    public Clients(String id, String name, String email, String phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public Clients(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }
}