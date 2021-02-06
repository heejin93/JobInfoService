package com.jfs.cont

import com.jfs.annotation.Logger
import com.jfs.annotation.Logger.Companion.log
import org.springframework.stereotype.Controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import javax.validation.Valid


@Controller
@Logger
class TestCont {

    @RequestMapping(value = ["/khj93"], method = [RequestMethod.POST])
    fun khj93(@Valid @RequestBody map: Map<String,String>) : ResponseEntity<Any>{
        log.info(map.toString())
        val result: Map<String,String>
        result = map

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