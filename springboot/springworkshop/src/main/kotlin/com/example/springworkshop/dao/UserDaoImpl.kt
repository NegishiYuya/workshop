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

	override fun selectList(): List<UserDto> {
		return userBhv.selectList { cb -> cb.query() }
			.map { UserDto(id = it.id, name = it.name, categoryId = it.categoryId) }
	}

	override fun select(userId: Int): UserDto? {

		return userBhv.selectEntity { cb -> cb.query().setId_Equal(userId) }.orElseThrow()
			.let { UserDto(id = it.id, name = it.name, categoryId = it.categoryId) }
	}

	override fun insert(userDto: UserDto) {
		userBhv.insert(User().also {
			it.id = userDto.id
			it.name = userDto.name
			it.categoryId = userDto.categoryId
		})
	}
}
