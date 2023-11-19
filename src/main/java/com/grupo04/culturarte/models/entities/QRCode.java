package com.grupo04.culturarte.models.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
@Table(name = "QRCode")
public class QRCode {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "create_date")
    private Timestamp date_create;

    @Column(name = "active")
    private Boolean active;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ticket_id")
    private Ticket ticket;

    public QRCode(Timestamp date_create, Boolean active, Ticket ticket) {
        super();
        this.date_create = date_create;
        this.active = active;
        this.ticket = ticket;
    }
}
