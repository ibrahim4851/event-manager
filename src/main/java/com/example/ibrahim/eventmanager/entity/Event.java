package com.example.ibrahim.eventmanager.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "event")
public class Event {

    @Id
    @GeneratedValue
    private Long id;

    private String description;
    private Date startDate;
    private Date endingDate;
    private int quota;
    private int participant;

}
