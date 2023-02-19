package com.example.springworkshop.dao

import com.springworkshop.dbflute.exbhv.UserBhv
import org.springframework.beans.factory.annotation.Autowired
import com.example.springworkshop.dto.UserDto
import com.springworkshop.dbflute.exentity.User
import org.springframework.stereotype.Repository

@Repository
class UserDaoImpl : UserDao {

	@Autowired
	lateinit var userBhv: UserBhv

	private val userDtoLists: List<UserDto> = listOf(
		UserDto(
			id = 1, name = "ニャオハ", categoryId = 1
		),
		UserDto(
			id = 2, name = "ニャローテ", categoryId = 1
		),
		UserDto(
			id = 3, name = "マスカーニャ", categoryId = 1
		),
		UserDto(
			id = 4, name = "ホゲータ", categoryId = 2
		),
	)

	override fun selectList(): List<UserDto> {
		return userBhv.selectList { cb -> cb.query() }
			.map { UserDto(id = it.id, name = it.name, categoryId = it.categoryId) }
	}

	override fun select(userId: Int): UserDto? {
		return userDtoLists.find { it.id == userId }
	}

	override fun insert(userDto: UserDto) {
		userBhv.insert(User().also {
			it.id = userDto.id
			it.name = userDto.name
			it.categoryId = userDto.categoryId
		})
	}
}
