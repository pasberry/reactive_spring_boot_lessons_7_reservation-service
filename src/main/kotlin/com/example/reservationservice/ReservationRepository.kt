package com.example.reservationservice

import org.springframework.data.repository.reactive.ReactiveCrudRepository

interface ReservationRepository : ReactiveCrudRepository<Reservation, Integer>