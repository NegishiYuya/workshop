package com.example.springworkshop.dao

import com.example.springworkshop.dto.UserDto

interface UserDao {
	fun selectList(): List<UserDto>
	fun select(userId: Int): UserDto?
	fun insert(userDto: UserDto)
}
