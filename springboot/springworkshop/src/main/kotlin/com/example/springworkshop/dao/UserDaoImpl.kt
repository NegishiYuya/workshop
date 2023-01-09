package com.example.springworkshop.dao

import com.example.springworkshop.entity.User
import org.springframework.stereotype.Repository

@Repository
class UserDaoImpl : UserDao {
	override fun selectList(): List<User> {
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
