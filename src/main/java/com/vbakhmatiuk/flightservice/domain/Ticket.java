package com.vbakhmatiuk.flightservice.domain;

import javax.persistence.*;

@Entity
@Table(name = "ticket")
public class Ticket {

    @Id
    @GeneratedValue()
    private long id;

    @Column(nullable = false)
    private String credentials;

    @Column()
    private String description;

    public Ticket() {
    }

    public Ticket(String credentials, String description) {
        this.credentials = credentials;
        this.description = description;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCredentials() {
        return credentials;
    }

    public void setCredentials(String credentials) {
        this.credentials = credentials;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Hotel {" +
                "id=" + id +
                ", credentials='" + credentials + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

