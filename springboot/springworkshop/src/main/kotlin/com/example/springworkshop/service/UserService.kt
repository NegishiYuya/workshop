package com.example.springworkshop.service

import com.example.springworkshop.dto.UserDto

interface UserService {
	fun getList(): List<UserDto>
	fun getUser(userId: Int): UserDto?

	fun registerUser(userDto: UserDto)
}
