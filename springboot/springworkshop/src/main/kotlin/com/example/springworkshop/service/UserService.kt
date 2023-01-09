package com.example.springworkshop.service

import com.example.springworkshop.entity.User

interface UserService {
	fun getList(): List<User>
  fun getUser(userId: Int): User
}
