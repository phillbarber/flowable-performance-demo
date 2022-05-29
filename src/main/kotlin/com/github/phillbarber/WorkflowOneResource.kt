package com.github.phillbarber

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class WorkflowOneResource {

    @GetMapping("/stuff")
    fun s(): String {
        return "WAHOOO"
    }


}