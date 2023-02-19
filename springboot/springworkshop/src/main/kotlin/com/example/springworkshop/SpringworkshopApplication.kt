package com.example.springworkshop

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan(value=["com.example.springworkshop","com.springworkshop"])
class SpringworkshopApplication

fun main(args: Array<String>) {
	runApplication<SpringworkshopApplication>(*args)
}
