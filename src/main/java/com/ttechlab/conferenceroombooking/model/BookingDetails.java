package com.ttechlab.conferenceroombooking.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "booking_detail")
public class BookingDetails
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private LocalDateTime startDateTime;

    @Column
    private LocalDateTime endDateTime;




}
