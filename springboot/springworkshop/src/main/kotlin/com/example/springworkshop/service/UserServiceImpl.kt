package com.example.springworkshop.service

import com.example.springworkshop.entity.User
import org.springframework.stereotype.Service

@Service
class UserServiceImpl : UserService {
	override fun getList(): List<User> {
		return listOf(
			User(
				id = 1,
				name = "ニャオハ"
			),
			User(
				id = 2,
				name = "ニャローテ"
			),
			User(
				id = 3,
				name = "マスカーニャ"
			),
			User(
				id = 4,
				name = "ホゲータ"
			),
		)
	}
}
