package com.example.reservationservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Configuration
import org.springframework.data.annotation.Id
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse

@SpringBootApplication
class ReservationServiceApplication

fun main(args: Array<String>) {
    runApplication<ReservationServiceApplication>(*args)
}

data class Reservation(@Id val id:Int , val name:String )



