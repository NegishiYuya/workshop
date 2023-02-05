package com.example.springworkshop.controller

import com.example.springworkshop.form.UserForm
import com.example.springworkshop.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.validation.BindingResult
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam

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

	@GetMapping("/detail")
	fun detail(@RequestParam(value = "userId") userId: String, model: Model): String {
		model["user"] = userService.getUser(userId.toInt())?.let {
			UserForm(
				id = it.id,
				name = it.name
			)
		} ?: UserForm(
			id = 0,
			name = "未設定"
		)
		return "detail"
	}

	@GetMapping("/input")
	fun input(model: Model, userForm: UserForm): String {
		return "input"
	}

	@PostMapping("/confirm")
	fun confirm(@Validated @ModelAttribute("userForm") userForm: UserForm, bindingResult: BindingResult): String {
		if (bindingResult.hasErrors()) {
			return "input"
		}
		return "confirm"
	}
}
