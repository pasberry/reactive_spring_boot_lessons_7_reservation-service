package com.example.reservationservice

import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse


@Component
class AppHandler(val reservationRepository: ReservationRepository) {

    fun handleReservation(serverRequest: ServerRequest)  =
            ServerResponse.ok()
                    .body(reservationRepository.findAll(), Reservation::class.java)


}