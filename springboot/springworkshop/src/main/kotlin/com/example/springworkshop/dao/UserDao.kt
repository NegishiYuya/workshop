package com.example.springworkshop.dao

import com.example.springworkshop.entity.User

interface UserDao {
	fun selectList(): List<User>
	fun select(userId: Int): User?
}
