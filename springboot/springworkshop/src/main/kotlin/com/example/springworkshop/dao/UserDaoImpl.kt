package com.example.springworkshop.dao

import com.example.springworkshop.entity.User
import org.springframework.stereotype.Repository

@Repository
class UserDaoImpl : UserDao {

	private val userList: List<User> = listOf(
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

	override fun selectList(): List<User> {
		return userList
	}

	override fun select(userId: Int): User? {
		return userList.find { it.id == userId }
	}
}
