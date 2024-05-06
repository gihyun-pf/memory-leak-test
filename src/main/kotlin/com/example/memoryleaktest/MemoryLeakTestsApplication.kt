package com.example.memoryleaktest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MemoryLeakTestsApplication

fun main(args: Array<String>) {
    runApplication<MemoryLeakTestsApplication>(*args)
}
