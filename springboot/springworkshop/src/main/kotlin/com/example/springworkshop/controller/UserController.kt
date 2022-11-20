package com.example.springworkshop.controller

import com.example.springworkshop.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("user")
class UserController {

  @Autowired
  lateinit var userService: UserService

  @GetMapping
  fun index(model: Model): String {
    model.addAttribute("list", userService.getList())
    return "list"
  }

  @GetMapping("/{id}")
  fun detail(@PathVariable("id") id: Int, model: Model): String {
    model.addAttribute("user", userService.getUser(id))
    return "detail"
  }
}