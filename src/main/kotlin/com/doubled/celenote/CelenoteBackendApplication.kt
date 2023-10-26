package com.doubled.celenote

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CelenoteBackendApplication

fun main(args: Array<String>) {
    println("Hello kotlin world!!")
    runApplication<CelenoteBackendApplication>(*args)
}
