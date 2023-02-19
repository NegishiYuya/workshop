package com.example.springworkshop.dao

import com.example.springworkshop.dto.UserDto
import org.springframework.stereotype.Repository

@Repository
class UserDaoImpl : UserDao {

	private val userDtoLists: List<UserDto> = listOf(
		UserDto(
			id = 1,
			name = "ニャオハ",
			categoryId = 1
		),
		UserDto(
			id = 2,
			name = "ニャローテ",
			categoryId = 1
		),
		UserDto(
			id = 3,
			name = "マスカーニャ",
			categoryId = 1
		),
		UserDto(
			id = 4,
			name = "ホゲータ",
			categoryId = 2
		),
	)

	override fun selectList(): List<UserDto> {
		return userDtoLists
	}

	override fun select(userId: Int): UserDto? {
		return userDtoLists.find { it.id == userId }
	}
}
