package com.example.springworkshop.dao

import com.example.springworkshop.entity.User
import org.springframework.stereotype.Repository

@Repository
class UserDaoImpl : UserDao {

	private val userList: List<User> = listOf(
		User(
			id = 1,
			name = "ニャオハ",
			categoryId = 1
		),
		User(
			id = 2,
			name = "ニャローテ",
			categoryId = 1
		),
		User(
			id = 3,
			name = "マスカーニャ",
			categoryId = 1
		),
		User(
			id = 4,
			name = "ホゲータ",
			categoryId = 2
		),
	)

	override fun selectList(): List<User> {
		return userList
	}

	override fun select(userId: Int): User? {
		return userList.find { it.id == userId }
	}
}
