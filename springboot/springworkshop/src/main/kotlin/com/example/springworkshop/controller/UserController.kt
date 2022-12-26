package com.example.springworkshop.controller

import com.example.springworkshop.form.UserForm
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("user")
class UserController {

    @GetMapping
    fun index(model: Model): String {
        model["userList"] = getList()
        return "list"
    }

    fun getList(): List<UserForm> {
        return listOf(
            UserForm(
                id = 1,
                name = "ニャオハ"
            ),
            UserForm(
                id = 2,
                name = "ニャローテ"
            ),
            UserForm(
                id = 3,
                name = "マスカーニャ"
            ),
            UserForm(
                id = 4,
                name = "ホゲータ"
            ),
        )
    }
}