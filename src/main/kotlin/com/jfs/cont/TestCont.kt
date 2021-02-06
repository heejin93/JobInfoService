package com.jfs.cont

import org.springframework.stereotype.Controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import java.util.*
import javax.validation.Valid

@Controller
class TestCont {
    val log: Logger = LoggerFactory.getLogger(this.javaClass)

    @RequestMapping(value = ["/khj93"], method = [RequestMethod.POST])
    fun khj93(@Valid @RequestBody map: Map<String,String>) : ResponseEntity<Any>{
        log.info(map.toString())
        val result: Map<String,String>
        result = map
        result
        return ResponseEntity
            .ok()
            .body(result)
    }

    @PostMapping("/customer")
    fun createCustomer(@RequestBody map:Map<String,String>): ResponseEntity<Any> {
        log.info(map.toString())
        return ResponseEntity
            .ok()
            .body(map)
    }
}