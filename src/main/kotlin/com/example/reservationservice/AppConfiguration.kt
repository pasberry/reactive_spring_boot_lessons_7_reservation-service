package com.example.reservationservice

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.server.router

@Configuration
class AppConfiguration(val handler: AppHandler){

    @Bean
    fun routes() = router{

        GET("/reservations" , handler::handleReservation)
    }
}