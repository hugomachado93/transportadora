package com.transportadora.app.controllers

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HealthCheck {

    @GetMapping("/status-check")
    fun check() : ResponseEntity<String> {

        val json = "{'teste': 'foi'}"

        return ResponseEntity.ok().body(json)
    }

}