package com.ntomlin.graalJS

import org.springframework.web.bind.annotation.RestController

import org.graalvm.polyglot.*;
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@RestController("/")
class GraalController {
    @GetMapping("/hello/{name}")
    fun hello (@PathVariable("name") name: String): String {
        val x = "(function myFun(param){ return `Hello ${"$"}{param}` })"
        val context = Context.create()
        val value = context.eval("js", x)
        val result = value.execute(name).asString()
        return result
    }
}
