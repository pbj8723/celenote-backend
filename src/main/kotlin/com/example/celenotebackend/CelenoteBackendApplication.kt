package com.example.celenotebackend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CelenoteBackendApplication

fun main(args: Array<String>) {
    println("Hello kotlin world!!")
    runApplication<CelenoteBackendApplication>(*args)
}
