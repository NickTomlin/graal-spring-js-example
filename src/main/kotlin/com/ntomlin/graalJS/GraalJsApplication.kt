package com.ntomlin.graalJS

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GraalJsApplication

fun main(args: Array<String>) {
	runApplication<GraalJsApplication>(*args)
}
