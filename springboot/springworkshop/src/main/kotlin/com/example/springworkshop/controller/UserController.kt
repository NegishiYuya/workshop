package com.example.springworkshop.controller

import com.example.springworkshop.form.UserForm
import com.example.springworkshop.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("user")
class UserController {

	@Autowired
	lateinit var userService: UserService

	@GetMapping
	fun index(model: Model): String {
		model["userList"] = userService.getList().map { UserForm(it.id, it.name) }
		return "list"
	}
}
