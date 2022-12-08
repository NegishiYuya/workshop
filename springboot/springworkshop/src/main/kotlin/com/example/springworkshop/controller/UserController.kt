package com.example.springworkshop.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("user")
class UserController {

  @GetMapping
  fun index(model: Model): String {
    return "list"
  }
}