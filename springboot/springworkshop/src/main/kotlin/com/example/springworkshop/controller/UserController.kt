package com.example.springworkshop.controller

import com.example.springworkshop.dto.UserDto
import com.example.springworkshop.form.UserForm
import com.example.springworkshop.service.CategoryMasterService
import com.example.springworkshop.service.UserService
import com.example.springworkshop.viewdto.UserViewDto
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

	@Autowired
	lateinit var categoryMasterService: CategoryMasterService

	@GetMapping
	fun index(model: Model): String {
		model.addAttribute("userList", userService.getList().map {
			UserViewDto(
				id = it.id,
				name = it.name,
				categoryName = categoryMasterService.getList()
					.find { categoryMaster -> categoryMaster.id == it.categoryId }?.label
			)
		})
		return "list"
	}

	@GetMapping("/detail")
	fun detail(@RequestParam(value = "userId") userId: String, model: Model): String {
		model.addAttribute("user", userService.getUser(userId.toInt())?.let {
			UserViewDto(
				id = it.id,
				name = it.name,
				categoryName = categoryMasterService.getList()
					.find { categoryMaster -> categoryMaster.id == it.categoryId }?.label
			)
		} ?: UserViewDto(
			id = 0, name = "未設定", categoryName = "なし"
		))
		return "detail"
	}

	@GetMapping("/input")
	fun input(model: Model, userForm: UserForm): String {
		model.addAttribute("categoryMasterList", categoryMasterService.getList())
		return "input"
	}

	@PostMapping("/register")
	fun register(
		model: Model,
		@Validated @ModelAttribute("userForm") userForm: UserForm,
		bindingResult: BindingResult,
	): String {
		if (bindingResult.hasErrors()) {
			return input(model, userForm)
		}
		userService.registerUser(userForm.let { UserDto(id = it.id, name = it.name, categoryId = it.categoryId) })
		return index(model)
	}
}
